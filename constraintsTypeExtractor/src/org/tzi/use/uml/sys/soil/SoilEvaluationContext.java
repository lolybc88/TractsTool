/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
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

// $Id: SoilEvaluationContext.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.uml.sys.soil;

import java.util.ArrayDeque;
import java.util.Deque;

import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.uml.sys.MSystemState;
import org.tzi.use.util.soil.VariableEnvironment;

/**
 * TODO
 * @author Daniel Gent
 *
 */
public class SoilEvaluationContext {
	/** TODO */
	private MSystem fSystem;
	/** TODO */
	private MSystemState fState;
	/** TODO */
	private VariableEnvironment fVarEnv;
	/** TODO */
	private Deque<Expression> fExpressionStack = new ArrayDeque<Expression>();
	/** TODO */
	private boolean fIsUndo = false;
	/** TODO */
	private boolean fIsRedo = false;
	
	
	/**
	 * TODO
	 * @param system
	 * @param state
	 * @param varEnv
	 */
	public SoilEvaluationContext(
			MSystem system, 
			MSystemState state, 
			VariableEnvironment varEnv) {
		
		fSystem = system;
		fState = state;
		fVarEnv = varEnv;
	}
	
	
	/**
	 * TODO
	 * @param system
	 */
	public SoilEvaluationContext(MSystem system) {
	
		this(
				system, 
				system.state(), 
				system.getVariableEnvironment());
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MSystem getSystem() {
		return fSystem;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public MSystemState getState() {
		return fState;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public VariableEnvironment getVarEnv() {
		return fVarEnv;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public boolean isUndo() {
		return fIsUndo;
	}
	
	
	/**
	 * TODO
	 * @param isUndo
	 */
	public void setIsUndo(boolean isUndo) {
		fIsUndo = isUndo;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public boolean isRedo() {
		return fIsRedo;
	}
	
	
	/**
	 * TODO
	 * @param isRedo
	 */
	public void setIsRedo(boolean isRedo) {
		fIsRedo = isRedo;
	}
	
	
	/**
	 * TODO
	 * @param expression
	 */
	public void enterExpression(Expression expression) {
		fExpressionStack.push(expression);
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public Expression exitExpression() {
		return fExpressionStack.pop();
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public boolean isInExpression() {
		return !fExpressionStack.isEmpty();
	}
}
