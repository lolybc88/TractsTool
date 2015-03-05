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

// $Id: ASTNewObjectStatement.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.parser.soil.ast;

import java.io.PrintWriter;

import org.tzi.use.parser.ocl.ASTExpression;
import org.tzi.use.parser.ocl.ASTSimpleType;
import org.tzi.use.parser.ocl.ASTStringLiteral;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.sys.soil.MNewObjectStatement;
import org.tzi.use.uml.sys.soil.MStatement;
import org.tzi.use.util.soil.exceptions.compilation.CompilationFailedException;


/**
 * 
 * @author Daniel Gent
 *
 */
public class ASTNewObjectStatement extends ASTStatement {
	/** TODO */
	private ASTSimpleType fObjectType;
	/** TODO */
	private ASTExpression fObjectName;
	
	
	/**
	 * TODO
	 * @param objectType
	 * @param objectName
	 */
	public ASTNewObjectStatement(
			ASTSimpleType objectType, 
			ASTExpression objectName) {
		
		fObjectType = objectType;
		fObjectName = objectName;
	}
	
	
	/**
	 * TODO
	 * @param objectType
	 * @param objectName
	 */
	public ASTNewObjectStatement(
			ASTSimpleType objectType,
			String objectName) {
		
		this(objectType, new ASTStringLiteral(objectName));
	}
	
	
	/**
	 * TODO
	 * @param objectType
	 */
	public ASTNewObjectStatement(
			ASTSimpleType objectType) {
		
		fObjectType = objectType;
		fObjectName = null;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public ASTSimpleType getObjectType() {
		return fObjectType;
	}
	
	
	/**
	 * TODO
	 * @return
	 */
	public ASTExpression getObjectName() {
		return fObjectName;
	}


	@Override
	protected MStatement generateStatement() throws CompilationFailedException {
		
		MClass objectClass = generateClass(fObjectType, false);
		
		Expression objectName = 
			(fObjectName == null ? 
					null : generateStringExpression(fObjectName));
		
		return new MNewObjectStatement(objectClass, objectName);
	}


	@Override
	protected void printTree(StringBuilder prelude, PrintWriter target) {
		target.println(prelude + "[OBJECT CREATION]");
	}
	
	
	@Override
	public String toString() {
		return 
		"new " + 
		fObjectType + 
		(fObjectName == null ? "" : " " + fObjectName.getStringRep());
	}
}
