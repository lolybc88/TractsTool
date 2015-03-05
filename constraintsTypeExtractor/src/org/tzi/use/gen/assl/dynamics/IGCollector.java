/*
 * This is source code of the Snapshot Generator, an extension for USE
 * to generate (valid) system states of UML models.
 * Copyright (C) 2001 Joern Bohling, University of Bremen
 *
 * About USE:
 *   USE - UML based specification environment
 *   Copyright (C) 1999,2000,2001 Mark Richters, University of Bremen
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

/**
 * March 22th 2001 
 * @author  Joern Bohling
 */

package org.tzi.use.gen.assl.dynamics;

import java.io.PrintWriter;

import org.tzi.use.uml.sys.soil.MStatement;

public interface IGCollector {
    public boolean canStop();
    
    public void setValidStateFound();
    
    public void subsequentlyPrependStatement(MStatement statement);
    
    public boolean expectSubsequentReporting();
    
    public void leaf();
    
    public void setPrePostViolation();
    
    public boolean getPrePostViolation();
    
    public PrintWriter basicPrintWriter();
    public boolean doBasicPrinting();
    
    public PrintWriter detailPrintWriter();
    public boolean doDetailPrinting();

    public void invalid( String str );
    public void invalid( Exception e );
    
    /**
     * Increments the "cut-counter" by one.
     */
    public void addCut();

	/**
	 * Adds <code>ignoredStates</code> to the overall ignored states
	 * @param ignoredStates
	 */
	public void addIgnoredStates(long ignoredStates);
    
    
}
