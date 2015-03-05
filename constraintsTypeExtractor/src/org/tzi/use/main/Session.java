/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: Session.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.main;

import java.util.EventListener;
import java.util.EventObject;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;

import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.soil.MStatement;

/**
 * A session manages a system and its model. System and model may
 * change during a session. Interested listeners are then notified.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author      Mark Richters 
 */
public class Session {
    private MSystem fSystem;
    private EventListenerList fListenerList;

    public class EvaluatedStatement extends EventObject {
		private static final long serialVersionUID = 1L;

		public EvaluatedStatement(Object source) {
			super(source);

		}    	
    }
    
    public interface EvaluatedStatementListener extends EventListener {
    	void evaluatedStatement(EvaluatedStatement event);
    }
    
    
    
    public Session() {
        fListenerList = new EventListenerList();
    }

    /** 
     * Set application state for new system. The system parameter may
     * be null.
     */
    public void setSystem(MSystem system) {
        fSystem = system;
        fireStateChanged();
    }

    /** 
     * Returns true if we have a system.
     */
    public boolean hasSystem() {
        return fSystem != null;
    }

    public void evaluatedStatement(MStatement statement) {
    	fireEvaluatedStatement(statement);
    }

    /**
     * Resets the system to its initial state.
     */
    public void reset() {
        if (fSystem != null ) {
            fSystem.reset();
            fireStateChanged();
        }
    }

    /** 
     * Returns the current system. 
     *
     * @throws IllegalStateException if no system available
     */
    public MSystem system() {
        if (fSystem == null )
            throw new IllegalStateException("no system");
        return fSystem;
    }

    public void addChangeListener(ChangeListener l) {
        fListenerList.add(ChangeListener.class, l);
    }
    
    public void removeChangeListener(ChangeListener l) {
        fListenerList.remove(ChangeListener.class, l);
    }

    public void addEvaluatedStatementListener(EvaluatedStatementListener l) {
    	fListenerList.add(EvaluatedStatementListener.class, l);
    }
    
    public void removeEvaluatedStatementListener(EvaluatedStatementListener l) {
    	fListenerList.remove(EvaluatedStatementListener.class, l);
    }
    
    /**
     * Notify all listeners that have registered interest for
     * notification on this event type.  
     */
    private void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = fListenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = null;
        for (int i = listeners.length-2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class ) {
                if (event == null )
                    event = new ChangeEvent(this);
                ((ChangeListener) listeners[i+1]).stateChanged(event);

                // System.out.println("Notifying: " + ((ChangeListener) listeners[i+1]).getClass());
            }          
        }
    } 
    
    /**
     * TODO
     * @param statement
     */
    private void fireEvaluatedStatement(MStatement statement) {
    	Object[] listeners = fListenerList.getListenerList();
    	EvaluatedStatement event = null;

    	for (int i = (listeners.length - 2); i >= 0; i -= 2) {
            if (listeners[i] == EvaluatedStatementListener.class) {
            	if (event == null) {
            		event = new EvaluatedStatement(this);
            	}
            	
            	EvaluatedStatementListener listener = 
            		(EvaluatedStatementListener)listeners[i + 1];
            	
            	listener.evaluatedStatement(event);
            }          
        }
    }
}


