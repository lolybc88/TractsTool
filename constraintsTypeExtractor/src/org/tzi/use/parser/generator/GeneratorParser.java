// $ANTLR 3.3 Nov 30, 2010 12:45:30 Generator.g 2011-09-27 13:30:36
 
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

package org.tzi.use.parser.generator;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class GeneratorParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LPAREN", "RPAREN", "SEMI", "COMMA", "COLON_EQUAL", "DOT", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LESS", "COLON", "EQUAL", "DOTDOT", "INT", "STAR", "COLON_COLON", "AT", "NON_OCL_STRING", "NOT_EQUAL", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "SLASH", "ARROW", "BAR", "REAL", "STRING", "HASH", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "RANGE_OR_INT", "ESC", "HEX_DIGIT", "VOCAB", "'procedure'", "'var'", "'begin'", "'end'", "'for'", "'in'", "'if'", "'then'", "'else'", "'ASSLCall'", "'OpEnter'", "'OpExit'", "'model'", "'constraints'", "'enum'", "'abstract'", "'attributes'", "'operations'", "'associationClass'", "'associationclass'", "'between'", "'ordered'", "'subsets'", "'redefines'", "'context'", "'inv'", "'existential'", "'pre'", "'post'", "'let'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'", "'new'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'do'", "'while'"
    };
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int IDENT=4;
    public static final int LPAREN=5;
    public static final int RPAREN=6;
    public static final int SEMI=7;
    public static final int COMMA=8;
    public static final int COLON_EQUAL=9;
    public static final int DOT=10;
    public static final int LBRACK=11;
    public static final int RBRACK=12;
    public static final int LBRACE=13;
    public static final int RBRACE=14;
    public static final int LESS=15;
    public static final int COLON=16;
    public static final int EQUAL=17;
    public static final int DOTDOT=18;
    public static final int INT=19;
    public static final int STAR=20;
    public static final int COLON_COLON=21;
    public static final int AT=22;
    public static final int NON_OCL_STRING=23;
    public static final int NOT_EQUAL=24;
    public static final int GREATER=25;
    public static final int LESS_EQUAL=26;
    public static final int GREATER_EQUAL=27;
    public static final int PLUS=28;
    public static final int MINUS=29;
    public static final int SLASH=30;
    public static final int ARROW=31;
    public static final int BAR=32;
    public static final int REAL=33;
    public static final int STRING=34;
    public static final int HASH=35;
    public static final int NEWLINE=36;
    public static final int WS=37;
    public static final int SL_COMMENT=38;
    public static final int ML_COMMENT=39;
    public static final int RANGE_OR_INT=40;
    public static final int ESC=41;
    public static final int HEX_DIGIT=42;
    public static final int VOCAB=43;

    // delegates
    // delegators


        public GeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "Generator.g"; }



    // $ANTLR start "invariantListOnly"
    // Generator.g:78:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;

        ASTConstraintDefinition def = null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:80:1: ( (def= invariant )* EOF )
            // Generator.g:81:5: (def= invariant )* EOF
            {
            // Generator.g:81:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==68) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:81:7: def= invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_invariantListOnly80);
            	    def=invariant();

            	    state._fsp--;
            	    if (state.failed) return invariantList;
            	    if ( state.backtracking==0 ) {
            	       invariantList.add(def); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_invariantListOnly91); if (state.failed) return invariantList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return invariantList;
    }
    // $ANTLR end "invariantListOnly"


    // $ANTLR start "procedureListOnly"
    // Generator.g:133:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;

        ASTGProcedure proc = null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:135:1: ( (proc= procedure )* EOF )
            // Generator.g:136:5: (proc= procedure )* EOF
            {
            // Generator.g:136:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:137:7: proc= procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureListOnly136);
            	    proc=procedure();

            	    state._fsp--;
            	    if (state.failed) return procedureList;
            	    if ( state.backtracking==0 ) {
            	       procedureList.add(proc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_procedureListOnly151); if (state.failed) return procedureList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return procedureList;
    }
    // $ANTLR end "procedureListOnly"


    // $ANTLR start "procedure"
    // Generator.g:148:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;

        Token name=null;
        List parameterDecls = null;

        List localDecls = null;

        List instructions = null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:150:1: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:151:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,44,FOLLOW_44_in_procedure179); if (state.failed) return proc;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;
            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;
            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;
            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;
            // Generator.g:152:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:152:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,45,FOLLOW_45_in_procedure199); if (state.failed) return proc;
                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;
                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_procedure214); if (state.failed) return proc;
            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;
            match(input,47,FOLLOW_47_in_procedure220); if (state.failed) return proc;
            match(input,SEMI,FOLLOW_SEMI_in_procedure222); if (state.failed) return proc;
            if ( state.backtracking==0 ) {
               proc = new ASTGProcedure(name, parameterDecls, localDecls, instructions ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return proc;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "variableDeclarationList"
    // Generator.g:161:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;

        ASTVariableDeclaration decl = null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:163:1: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:164:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:164:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:164:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;
                    if ( state.backtracking==0 ) {
                      varDecls.add(decl);
                    }
                    // Generator.g:165:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:165:8: COMMA decl= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList271); if (state.failed) return varDecls;
                    	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList275);
                    	    decl=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return varDecls;
                    	    if ( state.backtracking==0 ) {
                    	      varDecls.add(decl);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return varDecls;
    }
    // $ANTLR end "variableDeclarationList"


    // $ANTLR start "instructionList"
    // Generator.g:173:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;

        ASTGInstruction instr = null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:175:1: ( (instr= instruction SEMI )* )
            // Generator.g:176:5: (instr= instruction SEMI )*
            {
            // Generator.g:176:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==48||LA6_0==50||(LA6_0>=53 && LA6_0<=55)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:176:7: instr= instruction SEMI
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructionList319);
            	    instr=instruction();

            	    state._fsp--;
            	    if (state.failed) return instructions;
            	    match(input,SEMI,FOLLOW_SEMI_in_instructionList321); if (state.failed) return instructions;
            	    if ( state.backtracking==0 ) {
            	      instructions.add(instr);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instructions;
    }
    // $ANTLR end "instructionList"


    // $ANTLR start "instruction"
    // Generator.g:190:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit );
    public final ASTGInstruction instruction() throws RecognitionException {
        ASTGInstruction instr = null;

        ASTGVariableAssignment instrVA = null;

        ASTGAttributeAssignment instrAA = null;

        ASTGLoop instrLO = null;

        ASTGAtomicInstruction instrAI = null;

        ASTGIfThenElse instrIT = null;

        ASTGAsslCall instrAC = null;

        ASTGOpEnter instrOE = null;

        ASTGOpExit instrOX = null;


        try {
            // Generator.g:191:1: (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit )
            int alt7=8;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Generator.g:192:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrVA;
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:193:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAA;
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:194:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrLO;
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:195:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAI;
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:196:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrIT;
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:197:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrAC;
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:198:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrOE;
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:199:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                      instr = instrOX;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "variableAssignment"
    // Generator.g:206:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;

        Token target=null;
        ASTGValueInstruction source = null;


        try {
            // Generator.g:207:1: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:208:5: target= IDENT COLON_EQUAL source= valueInstruction
            {
            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableAssignment496); if (state.failed) return assignment;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_variableAssignment498); if (state.failed) return assignment;
            pushFollow(FOLLOW_valueInstruction_in_variableAssignment502);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;
            if ( state.backtracking==0 ) {
               assignment = new ASTGVariableAssignment( target, source ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assignment;
    }
    // $ANTLR end "variableAssignment"


    // $ANTLR start "attributeAssignment"
    // Generator.g:216:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;

        Token attributeName=null;
        ASTGocl targetObject = null;

        ASTGValueInstruction source = null;


        try {
            // Generator.g:217:1: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:218:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
            {
            pushFollow(FOLLOW_oclExpression_in_attributeAssignment534);
            targetObject=oclExpression();

            state._fsp--;
            if (state.failed) return assignment;
            match(input,DOT,FOLLOW_DOT_in_attributeAssignment536); if (state.failed) return assignment;
            attributeName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeAssignment540); if (state.failed) return assignment;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attributeAssignment548); if (state.failed) return assignment;
            pushFollow(FOLLOW_valueInstruction_in_attributeAssignment552);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;
            if ( state.backtracking==0 ) {
               assignment = new ASTGAttributeAssignment(
              			 targetObject, attributeName, source ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assignment;
    }
    // $ANTLR end "attributeAssignment"


    // $ANTLR start "loop"
    // Generator.g:228:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;

        Token t=null;
        ASTVariableDeclaration decl = null;

        ASTGocl sequence = null;

        List instructions = null;


        try {
            // Generator.g:229:1: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:230:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,48,FOLLOW_48_in_loop584); if (state.failed) return loop;
            pushFollow(FOLLOW_variableDeclaration_in_loop588);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;
            match(input,49,FOLLOW_49_in_loop590); if (state.failed) return loop;
            pushFollow(FOLLOW_oclExpression_in_loop594);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;
            match(input,46,FOLLOW_46_in_loop596); if (state.failed) return loop;
            pushFollow(FOLLOW_instructionList_in_loop607);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;
            match(input,47,FOLLOW_47_in_loop609); if (state.failed) return loop;
            if ( state.backtracking==0 ) {
               loop = new ASTGLoop( decl, sequence, instructions, t ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return loop;
    }
    // $ANTLR end "loop"


    // $ANTLR start "ifThenElse"
    // Generator.g:241:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;

        Token token=null;
        ASTGocl sequence = null;

        List thenInstructions = null;

        List elseInstructions = null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:243:1: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:244:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,50,FOLLOW_50_in_ifThenElse645); if (state.failed) return ifThenElse;
            pushFollow(FOLLOW_oclExpression_in_ifThenElse649);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;
            match(input,51,FOLLOW_51_in_ifThenElse660); if (state.failed) return ifThenElse;
            match(input,46,FOLLOW_46_in_ifThenElse662); if (state.failed) return ifThenElse;
            pushFollow(FOLLOW_instructionList_in_ifThenElse666);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;
            match(input,47,FOLLOW_47_in_ifThenElse668); if (state.failed) return ifThenElse;
            // Generator.g:246:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:246:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,52,FOLLOW_52_in_ifThenElse679); if (state.failed) return ifThenElse;
                    match(input,46,FOLLOW_46_in_ifThenElse681); if (state.failed) return ifThenElse;
                    pushFollow(FOLLOW_instructionList_in_ifThenElse685);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;
                    match(input,47,FOLLOW_47_in_ifThenElse687); if (state.failed) return ifThenElse;
                    if ( state.backtracking==0 ) {
                       elseInstructionsList=elseInstructions; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               ifThenElse = new ASTGIfThenElse( sequence, thenInstructions,
                              elseInstructionsList, token ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ifThenElse;
    }
    // $ANTLR end "ifThenElse"


    // $ANTLR start "valueInstruction"
    // Generator.g:255:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction | oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;

        ASTGAtomicInstruction atmoicInstr = null;

        ASTGocl oclExpr = null;


        try {
            // Generator.g:256:1: (atmoicInstr= atomicInstruction | oclExpr= oclExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==LBRACK) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return valueinstr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // Generator.g:257:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction727);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;
                    if ( state.backtracking==0 ) {
                      valueinstr = atmoicInstr; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:258:7: oclExpr= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_valueInstruction741);
                    oclExpr=oclExpression();

                    state._fsp--;
                    if (state.failed) return valueinstr;
                    if ( state.backtracking==0 ) {
                      valueinstr = oclExpr; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return valueinstr;
    }
    // $ANTLR end "valueInstruction"


    // $ANTLR start "atomicInstruction"
    // Generator.g:266:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;

        Token name=null;
        Object parameter = null;


        try {
            // Generator.g:267:1: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:268:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction771); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGAtomicInstruction(name); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction775); if (state.failed) return instr;
            // Generator.g:269:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:269:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction789);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:270:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:270:15: COMMA parameter= instructionParameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_atomicInstruction807); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction811);
                    	    parameter=instructionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_atomicInstruction859); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "atomicInstruction"


    // $ANTLR start "asslCall"
    // Generator.g:281:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;

        Token name=null;
        ASTGocl parameter = null;


        try {
            // Generator.g:282:1: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:283:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,53,FOLLOW_53_in_asslCall882); if (state.failed) return instr;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall886); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGAsslCall(name); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall890); if (state.failed) return instr;
            // Generator.g:284:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:284:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall904);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:285:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:285:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_asslCall922); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_oclExpression_in_asslCall926);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_asslCall974); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "asslCall"


    // $ANTLR start "opEnter"
    // Generator.g:296:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;

        Token opname=null;
        ASTGocl oid = null;

        ASTGocl parameter = null;


        try {
            // Generator.g:297:1: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:298:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,54,FOLLOW_54_in_opEnter997); if (state.failed) return instr;
            pushFollow(FOLLOW_oclExpression_in_opEnter1001);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;
            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1005); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGOpEnter(oid, opname); 
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1009); if (state.failed) return instr;
            // Generator.g:299:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:299:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1024);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;
                    if ( state.backtracking==0 ) {
                       instr.addParameter(parameter); 
                    }
                    // Generator.g:300:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:300:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_opEnter1042); if (state.failed) return instr;
                    	    pushFollow(FOLLOW_oclExpression_in_opEnter1046);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;
                    	    if ( state.backtracking==0 ) {
                    	       instr.addParameter(parameter); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_opEnter1094); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "opEnter"


    // $ANTLR start "opExit"
    // Generator.g:310:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;

        try {
            // Generator.g:311:1: ( 'OpExit' )
            // Generator.g:312:5: 'OpExit'
            {
            match(input,55,FOLLOW_55_in_opExit1117); if (state.failed) return instr;
            if ( state.backtracking==0 ) {
               instr = new ASTGOpExit(); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return instr;
    }
    // $ANTLR end "opExit"


    // $ANTLR start "instructionParameter"
    // Generator.g:318:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression | parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;

        ASTGocl parameterOcl = null;

        Token parameterIdent = null;


        try {
            // Generator.g:319:1: (parameterOcl= oclExpression | parameterIdent= instrParameterIdent )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACK) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Generator.g:320:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1146);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;
                    if ( state.backtracking==0 ) {
                      parameter = parameterOcl; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:321:7: parameterIdent= instrParameterIdent
                    {
                    pushFollow(FOLLOW_instrParameterIdent_in_instructionParameter1158);
                    parameterIdent=instrParameterIdent();

                    state._fsp--;
                    if (state.failed) return parameter;
                    if ( state.backtracking==0 ) {
                      parameter = parameterIdent; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return parameter;
    }
    // $ANTLR end "instructionParameter"


    // $ANTLR start "instrParameterIdent"
    // Generator.g:328:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;

        Token i=null;

        try {
            // Generator.g:329:1: (i= IDENT )
            // Generator.g:330:5: i= IDENT
            {
            i=(Token)match(input,IDENT,FOLLOW_IDENT_in_instrParameterIdent1186); if (state.failed) return t;
            if ( state.backtracking==0 ) {
               t = i; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "instrParameterIdent"


    // $ANTLR start "oclExpression"
    // Generator.g:337:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;

        Token i=null;
        GeneratorParser.expression_return ocl = null;


        try {
            // Generator.g:338:1: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:339:5: i= LBRACK ocl= expression RBRACK
            {
            i=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_oclExpression1214); if (state.failed) return encapOcl;
            pushFollow(FOLLOW_expression_in_oclExpression1218);
            ocl=expression();

            state._fsp--;
            if (state.failed) return encapOcl;
            match(input,RBRACK,FOLLOW_RBRACK_in_oclExpression1220); if (state.failed) return encapOcl;
            if ( state.backtracking==0 ) {
               encapOcl = new ASTGocl((ocl!=null?ocl.n:null), i); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return encapOcl;
    }
    // $ANTLR end "oclExpression"


    // $ANTLR start "procedureCallOnly"
    // Generator.g:352:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;

        Token name=null;
        GeneratorParser.expression_return ocl = null;


        try {
            // Generator.g:353:1: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:354:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1255); if (state.failed) return call;
            if ( state.backtracking==0 ) {
              call = new ASTGProcedureCall(name);
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1263); if (state.failed) return call;
            // Generator.g:355:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=IDENT && LA18_0<=LPAREN)||LA18_0==INT||LA18_0==AT||(LA18_0>=PLUS && LA18_0<=MINUS)||(LA18_0>=REAL && LA18_0<=HASH)||LA18_0==50||LA18_0==73||LA18_0==79||(LA18_0>=81 && LA18_0<=84)||(LA18_0>=86 && LA18_0<=98)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Generator.g:356:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1274);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;
                    if ( state.backtracking==0 ) {
                      call.addParameter((ocl!=null?ocl.n:null));
                    }
                    // Generator.g:357:5: ( COMMA ocl= expression )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Generator.g:357:7: COMMA ocl= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_procedureCallOnly1284); if (state.failed) return call;
                    	    pushFollow(FOLLOW_expression_in_procedureCallOnly1288);
                    	    ocl=expression();

                    	    state._fsp--;
                    	    if (state.failed) return call;
                    	    if ( state.backtracking==0 ) {
                    	      call.addParameter((ocl!=null?ocl.n:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_procedureCallOnly1302); if (state.failed) return call;
            match(input,EOF,FOLLOW_EOF_in_procedureCallOnly1308); if (state.failed) return call;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return call;
    }
    // $ANTLR end "procedureCallOnly"


    // $ANTLR start "model"
    // Generator.g:376:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;

        Token modelName=null;
        Set<ASTAnnotation> as = null;

        ASTEnumTypeDefinition e = null;

        ASTAssociation a = null;

        ASTConstraintDefinition cons = null;

        ASTPrePost ppc = null;


        try {
            // Generator.g:377:1: (as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF )
            // Generator.g:378:2: as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1336);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,56,FOLLOW_56_in_model1342); if (state.failed) return n;
            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1346); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTModel(modelName); n.setAnnotations(as); 
            }
            // Generator.g:380:5: (e= enumTypeDefinition )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // Generator.g:380:7: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model1358);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnumTypeDef(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // Generator.g:381:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*
            loop21:
            do {
                int alt21=4;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Generator.g:381:9: ( generalClassDefinition[$n] )
            	    {
            	    // Generator.g:381:9: ( generalClassDefinition[$n] )
            	    // Generator.g:381:11: generalClassDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassDefinition_in_model1375);
            	    generalClassDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Generator.g:382:9: (a= associationDefinition )
            	    {
            	    // Generator.g:382:9: (a= associationDefinition )
            	    // Generator.g:382:11: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model1392);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addAssociation(a); 
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Generator.g:383:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    {
            	    // Generator.g:383:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    // Generator.g:383:11: 'constraints' (cons= invariant | ppc= prePost )*
            	    {
            	    match(input,57,FOLLOW_57_in_model1408); if (state.failed) return n;
            	    // Generator.g:384:11: (cons= invariant | ppc= prePost )*
            	    loop20:
            	    do {
            	        int alt20=3;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==68) ) {
            	            int LA20_2 = input.LA(2);

            	            if ( (LA20_2==IDENT) ) {
            	                int LA20_3 = input.LA(3);

            	                if ( (LA20_3==COLON_COLON) ) {
            	                    alt20=2;
            	                }
            	                else if ( (LA20_3==EOF||LA20_3==IDENT||LA20_3==COMMA||LA20_3==COLON||LA20_3==AT||LA20_3==57||LA20_3==59||(LA20_3>=62 && LA20_3<=63)||(LA20_3>=68 && LA20_3<=70)) ) {
            	                    alt20=1;
            	                }


            	            }


            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // Generator.g:384:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model1426);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addConstraint(cons); 
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // Generator.g:385:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model1447);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addPrePost(ppc); 
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_model1488); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "model"


    // $ANTLR start "enumTypeDefinition"
    // Generator.g:396:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List idListRes = null;


        try {
            // Generator.g:397:1: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // Generator.g:398:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1516);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,58,FOLLOW_58_in_enumTypeDefinition1522); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1526); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1528); if (state.failed) return n;
            pushFollow(FOLLOW_idList_in_enumTypeDefinition1532);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1534); if (state.failed) return n;
            // Generator.g:399:54: ( SEMI )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SEMI) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Generator.g:399:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1538); if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "enumTypeDefinition"


    // $ANTLR start "generalClassDefinition"
    // Generator.g:408:1: generalClassDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) ;
    public final void generalClassDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as = null;

        ASTClass c = null;

        ASTAssociationClass ac = null;


         
          boolean isAbstract = false;

        try {
            // Generator.g:412:1: (as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) )
            // Generator.g:413:2: as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassDefinition1576);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;
            // Generator.g:414:5: ( 'abstract' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==59) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:414:7: 'abstract'
                    {
                    match(input,59,FOLLOW_59_in_generalClassDefinition1584); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       isAbstract = true; 
                    }

                    }
                    break;

            }

            // Generator.g:415:5: ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=62 && LA24_0<=63)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // Generator.g:415:7: (c= classDefinition[isAbstract] )
                    {
                    // Generator.g:415:7: (c= classDefinition[isAbstract] )
                    // Generator.g:415:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassDefinition1602);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       n.addClass(c); c.setAnnotations(as); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:416:7: (ac= associationClassDefinition[isAbstract] )
                    {
                    // Generator.g:416:7: (ac= associationClassDefinition[isAbstract] )
                    // Generator.g:416:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassDefinition1622);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       n.addAssociationClass(ac); ac.setAnnotations(as); 
                    }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "generalClassDefinition"


    // $ANTLR start "classDefinition"
    // Generator.g:433:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;

        Token name=null;
        List idListRes = null;

        ASTAttribute a = null;

        ASTOperation op = null;

        ASTInvariantClause inv = null;


         List idList; 
        try {
            // Generator.g:435:1: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:436:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition1661);
            keyClass();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1665); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTClass(name, isAbstract); 
            }
            // Generator.g:437:5: ( LESS idListRes= idList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LESS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Generator.g:437:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1675); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_classDefinition1679);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // Generator.g:438:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==60) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Generator.g:438:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,60,FOLLOW_60_in_classDefinition1692); if (state.failed) return n;
                    // Generator.g:439:7: (a= attributeDefinition )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==IDENT||LA26_0==AT||LA26_0==56||(LA26_0>=58 && LA26_0<=59)||(LA26_0>=62 && LA26_0<=63)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Generator.g:439:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1705);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:441:5: ( 'operations' (op= operationDefinition )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Generator.g:441:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,61,FOLLOW_61_in_classDefinition1726); if (state.failed) return n;
                    // Generator.g:442:7: (op= operationDefinition )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==IDENT||LA28_0==AT||LA28_0==56||(LA28_0>=58 && LA28_0<=59)||(LA28_0>=62 && LA28_0<=63)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Generator.g:442:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1739);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:444:5: ( 'constraints' (inv= invariantClause )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Generator.g:444:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,57,FOLLOW_57_in_classDefinition1760); if (state.failed) return n;
                    // Generator.g:445:7: (inv= invariantClause )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=69 && LA30_0<=70)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Generator.g:446:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1780);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_classDefinition1804); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "classDefinition"


    // $ANTLR start "associationClassDefinition"
    // Generator.g:467:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
    public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
        ASTAssociationClass n = null;

        Token classKW=null;
        Token name=null;
        List idListRes = null;

        ASTAssociationEnd ae = null;

        ASTAttribute a = null;

        ASTOperation op = null;

        ASTInvariantClause inv = null;


        List idList; Token t = null;
        try {
            // Generator.g:469:1: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // Generator.g:470:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               
                  	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
                             reportWarning("the 'associationClass' keyword is deprecated and will " +
                                           "not be supported in the future, use 'associationclass' instead");
                          }  
                  
            }
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition1863); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationClass(name, isAbstract); 
            }
            // Generator.g:479:5: ( LESS idListRes= idList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LESS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Generator.g:479:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition1873); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_associationClassDefinition1877);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // Generator.g:480:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==64) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Generator.g:480:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,64,FOLLOW_64_in_associationClassDefinition1889); if (state.failed) return n;
                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1897);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addEnd(ae); 
                    }
                    // Generator.g:482:5: (ae= associationEnd )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==IDENT) ) {
                            int LA33_2 = input.LA(2);

                            if ( (LA33_2==LBRACK) ) {
                                alt33=1;
                            }


                        }
                        else if ( (LA33_0==AT) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Generator.g:482:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition1909);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addEnd(ae); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;

            }

            // Generator.g:484:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Generator.g:484:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,60,FOLLOW_60_in_associationClassDefinition1929); if (state.failed) return n;
                    // Generator.g:485:7: (a= attributeDefinition )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==IDENT) ) {
                            int LA35_2 = input.LA(2);

                            if ( (LA35_2==COLON) ) {
                                alt35=1;
                            }


                        }
                        else if ( (LA35_0==AT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Generator.g:485:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition1942);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:487:5: ( 'operations' (op= operationDefinition )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Generator.g:487:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,61,FOLLOW_61_in_associationClassDefinition1963); if (state.failed) return n;
                    // Generator.g:488:7: (op= operationDefinition )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==IDENT) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==LPAREN) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==AT) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Generator.g:488:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition1976);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:490:5: ( 'constraints' (inv= invariantClause )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Generator.g:490:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,57,FOLLOW_57_in_associationClassDefinition1997); if (state.failed) return n;
                    // Generator.g:491:7: (inv= invariantClause )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>=69 && LA39_0<=70)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Generator.g:492:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2017);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // Generator.g:495:5: ( ( keyAggregation | keyComposition ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==IDENT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Generator.g:495:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) {
                       t = input.LT(1); 
                    }
                    // Generator.g:496:7: ( keyAggregation | keyComposition )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==IDENT) ) {
                        int LA41_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt41=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt41=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // Generator.g:496:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2053);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:496:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2057);
                            keyComposition();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n.setKind(t); 
                    }

                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_associationClassDefinition2080); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "associationClassDefinition"


    // $ANTLR start "attributeDefinition"
    // Generator.g:506:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTType t = null;


        try {
            // Generator.g:507:1: (as= annotationSet name= IDENT COLON t= type ( SEMI )? )
            // Generator.g:508:2: as= annotationSet name= IDENT COLON t= type ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2108);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2116); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2118); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_attributeDefinition2122);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:509:29: ( SEMI )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SEMI) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Generator.g:509:31: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2126); if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTAttribute(name, t); n.setAnnotations(as); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "attributeDefinition"


    // $ANTLR start "operationDefinition"
    // Generator.g:518:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List<ASTVariableDeclaration> pl = null;

        ASTType t = null;

        GeneratorParser.expression_return e = null;

        GeneratorParser.stat_return s = null;

        ASTPrePostClause ppc = null;


        try {
            // Generator.g:519:1: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? )
            // Generator.g:520:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2163);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2173); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_operationDefinition2183);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:526:5: ( COLON t= type )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COLON) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Generator.g:526:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2197); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_operationDefinition2203);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTOperation(name, pl, t); n.setAnnotations(as); 
            }
            // Generator.g:528:5: ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==EQUAL) ) {
                alt45=1;
            }
            else if ( (LA45_0==46) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // Generator.g:529:9: ( EQUAL e= expression )
                    {
                    // Generator.g:529:9: ( EQUAL e= expression )
                    // Generator.g:529:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2231); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_operationDefinition2237);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setExpression((e!=null?e.n:null)); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:530:9: ( 'begin' s= stat 'end' )
                    {
                    // Generator.g:530:9: ( 'begin' s= stat 'end' )
                    // Generator.g:530:11: 'begin' s= stat 'end'
                    {
                    match(input,46,FOLLOW_46_in_operationDefinition2255); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_operationDefinition2261);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,47,FOLLOW_47_in_operationDefinition2263); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setStatement((s!=null?s.n:null));  
                    }

                    }


                    }
                    break;

            }

            // Generator.g:532:5: (ppc= prePostClause )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=71 && LA46_0<=72)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Generator.g:532:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2284);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // Generator.g:533:5: ( SEMI )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SEMI) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Generator.g:533:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2297); if (state.failed) return n;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "operationDefinition"


    // $ANTLR start "associationDefinition"
    // Generator.g:543:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTAssociationEnd ae = null;


         Token t = null; 
        try {
            // Generator.g:545:1: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // Generator.g:546:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2328);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            // Generator.g:548:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                int LA48_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt48=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt48=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt48=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // Generator.g:548:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2342);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:548:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2346);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:548:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2350);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2360); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociation(t, name); n.setAnnotations(as); 
            }
            match(input,64,FOLLOW_64_in_associationDefinition2368); if (state.failed) return n;
            pushFollow(FOLLOW_associationEnd_in_associationDefinition2376);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addEnd(ae); 
            }
            // Generator.g:552:5: (ae= associationEnd )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==IDENT||LA49_0==AT||LA49_0==56||(LA49_0>=58 && LA49_0<=59)||(LA49_0>=62 && LA49_0<=63)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Generator.g:552:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2388);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnd(ae); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            match(input,47,FOLLOW_47_in_associationDefinition2399); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "associationDefinition"


    // $ANTLR start "associationEnd"
    // Generator.g:561:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;

        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as = null;

        ASTMultiplicity m = null;

        GeneratorParser.expression_return exp = null;

        List<ASTVariableDeclaration> qualifiers = null;


        try {
            // Generator.g:562:1: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // Generator.g:563:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd2424);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2432); if (state.failed) return n;
            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2434); if (state.failed) return n;
            pushFollow(FOLLOW_multiplicity_in_associationEnd2438);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2440); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationEnd(name, m); n.setAnnotations(as); 
            }
            // Generator.g:565:5: ( keyRole rn= IDENT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==IDENT) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==IDENT) ) {
                    int LA50_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt50=1;
                    }
                }
            }
            switch (alt50) {
                case 1 :
                    // Generator.g:565:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2451);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;
                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2455); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setRolename(rn); 
                    }

                    }
                    break;

            }

            // Generator.g:566:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop51:
            do {
                int alt51=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==EQUAL) ) {
                        alt51=5;
                    }
                    else if ( (LA51_2==LPAREN) ) {
                        alt51=6;
                    }
                    else if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt51=3;
                    }


                    }
                    break;
                case 65:
                    {
                    alt51=1;
                    }
                    break;
                case 66:
                    {
                    alt51=2;
                    }
                    break;
                case 67:
                    {
                    alt51=4;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // Generator.g:567:9: 'ordered'
            	    {
            	    match(input,65,FOLLOW_65_in_associationEnd2476); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setOrdered(); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:568:9: 'subsets' sr= IDENT
            	    {
            	    match(input,66,FOLLOW_66_in_associationEnd2488); if (state.failed) return n;
            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2492); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addSubsetsRolename(sr); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:569:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2504);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setUnion(true); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:570:9: 'redefines' rd= IDENT
            	    {
            	    match(input,67,FOLLOW_67_in_associationEnd2516); if (state.failed) return n;
            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2520); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRedefinesRolename(rd); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:571:9: keyDerived EQUAL exp= expression
            	    {
            	    pushFollow(FOLLOW_keyDerived_in_associationEnd2532);
            	    keyDerived();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2534); if (state.failed) return n;
            	    pushFollow(FOLLOW_expression_in_associationEnd2538);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setDerived((exp!=null?exp.n:null)); 
            	    }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:572:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2550);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    pushFollow(FOLLOW_paramList_in_associationEnd2556);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	      n.setQualifiers(qualifiers); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // Generator.g:574:5: ( SEMI )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==SEMI) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Generator.g:574:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2573); if (state.failed) return n;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "associationEnd"


    // $ANTLR start "multiplicity"
    // Generator.g:588:1: multiplicity returns [ASTMultiplicity n] : mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;

        ASTMultiplicityRange mr = null;


        try {
            // Generator.g:589:1: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // Generator.g:590:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) {
               
              	Token t = input.LT(1); // remember start position of expression
              	n = new ASTMultiplicity(t);
                  
            }
            pushFollow(FOLLOW_multiplicityRange_in_multiplicity2608);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addRange(mr); 
            }
            // Generator.g:595:5: ( COMMA mr= multiplicityRange )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Generator.g:595:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity2618); if (state.failed) return n;
            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity2622);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRange(mr); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "multiplicity"


    // $ANTLR start "multiplicityRange"
    // Generator.g:598:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;

        int ms1 = 0;

        int ms2 = 0;


        try {
            // Generator.g:599:1: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // Generator.g:600:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2651);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTMultiplicityRange(ms1); 
            }
            // Generator.g:601:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DOTDOT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // Generator.g:601:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange2661); if (state.failed) return n;
                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange2665);
                    ms2=multiplicitySpec();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setHigh(ms2); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "multiplicityRange"


    // $ANTLR start "multiplicitySpec"
    // Generator.g:604:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;

        Token i=null;

         m = -1; 
        try {
            // Generator.g:606:1: (i= INT | STAR )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==INT) ) {
                alt55=1;
            }
            else if ( (LA55_0==STAR) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // Generator.g:607:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec2699); if (state.failed) return m;
                    if ( state.backtracking==0 ) {
                       m = Integer.parseInt((i!=null?i.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:608:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec2709); if (state.failed) return m;
                    if ( state.backtracking==0 ) {
                       m = -1; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return m;
    }
    // $ANTLR end "multiplicitySpec"


    // $ANTLR start "invariant"
    // Generator.g:629:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;

        Token v=null;
        ASTSimpleType t = null;

        ASTInvariantClause inv = null;


        try {
            // Generator.g:630:1: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:631:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) {
               n = new ASTConstraintDefinition(); 
            }
            match(input,68,FOLLOW_68_in_invariant2750); if (state.failed) return n;
            // Generator.g:633:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENT) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==COMMA||LA57_1==COLON) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // Generator.g:633:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2760); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addVarName(v); 
                    }
                    // Generator.g:634:8: ( ',' v= IDENT )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // Generator.g:634:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant2773); if (state.failed) return n;
                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant2777); if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addVarName(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    match(input,COLON,FOLLOW_COLON_in_invariant2785); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_simpleType_in_invariant2797);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setType(t); 
            }
            // Generator.g:636:5: (inv= invariantClause )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=69 && LA58_0<=70)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // Generator.g:636:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant2809);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addInvariantClause(inv); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "invariant"


    // $ANTLR start "invariantClause"
    // Generator.g:643:1: invariantClause returns [ASTInvariantClause n] : ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;

        Token name=null;
        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:644:1: ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            else if ( (LA61_0==70) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // Generator.g:645:7: 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,69,FOLLOW_69_in_invariantClause2840); if (state.failed) return n;
                    // Generator.g:645:13: (name= IDENT )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==IDENT) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // Generator.g:645:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2846); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause2851); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause2855);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTInvariantClause(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:646:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,70,FOLLOW_70_in_invariantClause2865); if (state.failed) return n;
                    match(input,69,FOLLOW_69_in_invariantClause2867); if (state.failed) return n;
                    // Generator.g:646:27: (name= IDENT )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==IDENT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // Generator.g:646:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause2873); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause2878); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause2882);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTExistentialInvariantClause(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "invariantClause"


    // $ANTLR start "prePost"
    // Generator.g:657:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;

        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl = null;

        ASTType rt = null;

        ASTPrePostClause ppc = null;


        try {
            // Generator.g:658:1: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:659:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,68,FOLLOW_68_in_prePost2908); if (state.failed) return n;
            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2912); if (state.failed) return n;
            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost2914); if (state.failed) return n;
            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost2918); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_prePost2922);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:659:69: ( COLON rt= type )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==COLON) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // Generator.g:659:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost2926); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_prePost2930);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTPrePost(classname, opname, pl, rt); 
            }
            // Generator.g:661:5: (ppc= prePostClause )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=71 && LA63_0<=72)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // Generator.g:661:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost2949);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "prePost"


    // $ANTLR start "prePostClause"
    // Generator.g:668:1: prePostClause returns [ASTPrePostClause n] : ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;

        Token name=null;
        GeneratorParser.expression_return e = null;


         Token t = null; 
        try {
            // Generator.g:670:1: ( ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:671:5: ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            if ( (input.LA(1)>=71 && input.LA(1)<=72) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // Generator.g:672:25: (name= IDENT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==IDENT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Generator.g:672:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3003); if (state.failed) return n;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_prePostClause3008); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_prePostClause3012);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTPrePostClause(t, name, (e!=null?e.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "prePostClause"


    // $ANTLR start "annotationSet"
    // Generator.g:676:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;

        ASTAnnotation an = null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:678:1: ( (an= annotation )* )
            // Generator.g:679:2: (an= annotation )*
            {
            // Generator.g:679:2: (an= annotation )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AT) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // Generator.g:679:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3039);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;
            	    if ( state.backtracking==0 ) {
            	       annotations.add(an); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return annotations;
    }
    // $ANTLR end "annotationSet"


    // $ANTLR start "annotation"
    // Generator.g:682:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;

        Token name=null;
        Map<Token, Token> values = null;


        try {
            // Generator.g:682:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:683:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3058); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3062); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = new ASTAnnotation(name);
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3068); if (state.failed) return n;
            pushFollow(FOLLOW_annotationValues_in_annotation3077);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setValues(values); 
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3082); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "annotationValues"
    // Generator.g:689:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;

        GeneratorParser.annotationValue_return firstVal = null;

        GeneratorParser.annotationValue_return val = null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:691:1: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:692:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:692:2: (firstVal= annotationValue )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENT) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // Generator.g:692:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3105);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;
                    if ( state.backtracking==0 ) {
                       values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); 
                    }

                    }
                    break;

            }

            // Generator.g:693:2: ( COMMA val= annotationValue )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // Generator.g:693:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3113); if (state.failed) return values;
            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3117);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;
            	    if ( state.backtracking==0 ) {
            	       values.put((val!=null?val.name:null), (val!=null?val.value:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return values;
    }
    // $ANTLR end "annotationValues"

    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };

    // $ANTLR start "annotationValue"
    // Generator.g:696:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);

        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:696:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:697:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3136); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = aName; 
            }
            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3141); if (state.failed) return retval;
            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.value = aValue; 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "annotationValue"


    // $ANTLR start "keyUnion"
    // Generator.g:702:1: keyUnion : {...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:702:9: ({...}? IDENT )
            // Generator.g:703:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyUnion3161); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyUnion"


    // $ANTLR start "keyAssociation"
    // Generator.g:705:1: keyAssociation : {...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:705:15: ({...}? IDENT )
            // Generator.g:706:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation3175); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyAssociation"


    // $ANTLR start "keyRole"
    // Generator.g:708:1: keyRole : {...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:708:8: ({...}? IDENT )
            // Generator.g:709:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyRole3189); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyRole"


    // $ANTLR start "keyComposition"
    // Generator.g:711:1: keyComposition : {...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:711:15: ({...}? IDENT )
            // Generator.g:712:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyComposition3201); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyComposition"


    // $ANTLR start "keyAggregation"
    // Generator.g:714:1: keyAggregation : {...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:714:15: ({...}? IDENT )
            // Generator.g:715:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation3213); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyAggregation"


    // $ANTLR start "keyClass"
    // Generator.g:717:1: keyClass : {...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:717:9: ({...}? IDENT )
            // Generator.g:718:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyClass3227); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyClass"


    // $ANTLR start "keyDerived"
    // Generator.g:720:1: keyDerived : {...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:720:11: ({...}? IDENT )
            // Generator.g:721:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyDerived3239); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyDerived"


    // $ANTLR start "keyQualifier"
    // Generator.g:723:1: keyQualifier : {...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:723:13: ({...}? IDENT )
            // Generator.g:724:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier3253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "keyQualifier"


    // $ANTLR start "expressionOnly"
    // Generator.g:754:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        GeneratorParser.expression_return nExp = null;


        try {
            // Generator.g:755:1: (nExp= expression EOF )
            // Generator.g:756:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly3283);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly3285); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = (nExp!=null?nExp.n:null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "expressionOnly"

    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };

    // $ANTLR start "expression"
    // Generator.g:763:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final GeneratorParser.expression_return expression() throws RecognitionException {
        GeneratorParser.expression_return retval = new GeneratorParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Generator.g:769:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:770:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // Generator.g:771:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==73) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // Generator.g:772:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,73,FOLLOW_73_in_expression3333); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression3337); if (state.failed) return retval;
            	    // Generator.g:772:24: ( COLON t= type )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==COLON) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // Generator.g:772:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression3341); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression3345);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression3350); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression3354);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,49,FOLLOW_49_in_expression3356); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	               if ( firstLet == null ) 
            	                   firstLet = nextLet;
            	               if ( prevLet != null ) 
            	                   prevLet.setInExpr(nextLet);
            	               prevLet = nextLet;
            	             
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3381);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               if ( nCndImplies != null ) {
                  	 retval.n = nCndImplies;
                       retval.n.setStartToken(tok);
                    }
                    
                    if ( prevLet != null ) { 
                       prevLet.setInExpr(retval.n);
                       retval.n = firstLet;
                       retval.n.setStartToken(tok);
                    }
                  
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "paramList"
    // Generator.g:800:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:802:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:803:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList3414); if (state.failed) return paramList;
            // Generator.g:804:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IDENT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // Generator.g:805:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList3431);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // Generator.g:806:7: ( COMMA v= variableDeclaration )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // Generator.g:806:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList3443); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList3447);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList3467); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return paramList;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "idList"
    // Generator.g:814:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:816:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:817:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3496); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // Generator.g:818:5: ( COMMA idn= IDENT )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // Generator.g:818:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList3506); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3510); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return idList;
    }
    // $ANTLR end "idList"


    // $ANTLR start "variableDeclaration"
    // Generator.g:826:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Generator.g:827:1: (name= IDENT COLON t= type )
            // Generator.g:828:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3541); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration3543); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration3547);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableDeclaration(name, t); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"


    // $ANTLR start "conditionalImpliesExpression"
    // Generator.g:836:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:837:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:838:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3583);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // Generator.g:839:5: (op= 'implies' n1= conditionalOrExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==74) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Generator.g:839:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,74,FOLLOW_74_in_conditionalImpliesExpression3596); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3600);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"


    // $ANTLR start "conditionalOrExpression"
    // Generator.g:848:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:849:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:850:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3645);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // Generator.g:851:5: (op= 'or' n1= conditionalXOrExpression )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==75) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // Generator.g:851:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,75,FOLLOW_75_in_conditionalOrExpression3658); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3662);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"


    // $ANTLR start "conditionalXOrExpression"
    // Generator.g:860:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:861:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:862:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3706);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // Generator.g:863:5: (op= 'xor' n1= conditionalAndExpression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==76) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // Generator.g:863:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,76,FOLLOW_76_in_conditionalXOrExpression3719); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3723);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // Generator.g:872:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // Generator.g:873:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:874:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3767);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // Generator.g:875:5: (op= 'and' n1= equalityExpression )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==77) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Generator.g:875:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,77,FOLLOW_77_in_conditionalAndExpression3780); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3784);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "equalityExpression"
    // Generator.g:884:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:886:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:887:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3832);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // Generator.g:888:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==EQUAL||LA77_0==NOT_EQUAL) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Generator.g:888:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3861);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "equalityExpression"


    // $ANTLR start "relationalExpression"
    // Generator.g:898:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:900:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:901:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3910);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // Generator.g:902:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==LESS||(LA78_0>=GREATER && LA78_0<=GREATER_EQUAL)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Generator.g:902:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==LESS||(input.LA(1)>=GREATER && input.LA(1)<=GREATER_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression3946);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "additiveExpression"
    // Generator.g:912:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:914:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:915:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3996);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // Generator.g:916:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=PLUS && LA79_0<=MINUS)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // Generator.g:916:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4024);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // Generator.g:927:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Generator.g:929:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:930:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4074);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // Generator.g:931:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==STAR||LA80_0==SLASH||LA80_0==78) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // Generator.g:931:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==STAR||input.LA(1)==SLASH||input.LA(1)==78 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4106);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // Generator.g:943:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // Generator.g:945:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=PLUS && LA81_0<=MINUS)||LA81_0==79) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=IDENT && LA81_0<=LPAREN)||LA81_0==INT||LA81_0==AT||(LA81_0>=REAL && LA81_0<=HASH)||LA81_0==50||(LA81_0>=81 && LA81_0<=84)||(LA81_0>=86 && LA81_0<=98)) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // Generator.g:946:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:946:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:946:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==79 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4192);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUnaryExpression(op, nUnExp); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:950:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4212);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPosExp; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "postfixExpression"
    // Generator.g:958:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // Generator.g:960:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:961:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression4245);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // Generator.g:962:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DOT) ) {
                    int LA83_2 = input.LA(2);

                    if ( (LA83_2==IDENT) ) {
                        int LA83_4 = input.LA(3);

                        if ( (LA83_4==EOF||(LA83_4>=IDENT && LA83_4<=COMMA)||(LA83_4>=DOT && LA83_4<=LESS)||(LA83_4>=EQUAL && LA83_4<=DOTDOT)||LA83_4==STAR||LA83_4==AT||(LA83_4>=NOT_EQUAL && LA83_4<=BAR)||LA83_4==47||LA83_4==49||(LA83_4>=51 && LA83_4<=52)||LA83_4==57||(LA83_4>=59 && LA83_4<=63)||(LA83_4>=65 && LA83_4<=72)||(LA83_4>=74 && LA83_4<=78)||LA83_4==85||LA83_4==105) ) {
                            alt83=1;
                        }


                    }
                    else if ( ((LA83_2>=81 && LA83_2<=84)) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==ARROW) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Generator.g:963:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:963:6: ( ARROW | DOT )
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==ARROW) ) {
            	        alt82=1;
            	    }
            	    else if ( (LA82_0==DOT) ) {
            	        alt82=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 82, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // Generator.g:963:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression4263); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:963:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression4269); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression4280);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "postfixExpression"


    // $ANTLR start "primaryExpression"
    // Generator.g:979:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        GeneratorParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // Generator.g:980:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt86=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
                {
                alt86=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt86=1;
                    }
                    break;
                case EOF:
                case IDENT:
                case LPAREN:
                case RPAREN:
                case SEMI:
                case COMMA:
                case LBRACK:
                case RBRACK:
                case LBRACE:
                case RBRACE:
                case LESS:
                case EQUAL:
                case DOTDOT:
                case STAR:
                case AT:
                case NOT_EQUAL:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case PLUS:
                case MINUS:
                case SLASH:
                case ARROW:
                case BAR:
                case 47:
                case 49:
                case 51:
                case 52:
                case 57:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 85:
                case 105:
                    {
                    alt86=3;
                    }
                    break;
                case DOT:
                    {
                    int LA86_7 = input.LA(3);

                    if ( (LA86_7==80) ) {
                        alt86=6;
                    }
                    else if ( (LA86_7==IDENT||(LA86_7>=81 && LA86_7<=84)) ) {
                        alt86=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt86=2;
                }
                break;
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt86=3;
                }
                break;
            case LPAREN:
                {
                alt86=4;
                }
                break;
            case 50:
                {
                alt86=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // Generator.g:981:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4320);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:982:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression4334);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:983:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression4346);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:984:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4357); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression4361);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4363); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:985:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression4375);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:986:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4387); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4389); if (state.failed) return n;
                    match(input,80,FOLLOW_80_in_primaryExpression4391); if (state.failed) return n;
                    // Generator.g:986:36: ( LPAREN RPAREN )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==LPAREN) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // Generator.g:986:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4395); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4397); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // Generator.g:988:7: ( AT 'pre' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==AT) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==71) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // Generator.g:988:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4418); if (state.failed) return n;
                            match(input,71,FOLLOW_71_in_primaryExpression4420); if (state.failed) return n;
                            if ( state.backtracking==0 ) {
                               n.setIsPre(); 
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "objectReference"
    // Generator.g:992:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // Generator.g:993:1: ( AT objectName= IDENT )
            // Generator.g:994:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference4447); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4455); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTObjectReferenceExpression(objectName); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "objectReference"


    // $ANTLR start "propertyCall"
    // Generator.g:1008:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        GeneratorParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // Generator.g:1009:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt87=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA87_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
                }
                break;
            case 81:
                {
                alt87=2;
                }
                break;
            case 82:
            case 83:
            case 84:
                {
                alt87=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // Generator.g:1013:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall4520);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1016:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall4533);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1017:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall4546);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1018:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall4559);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpType; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "propertyCall"


    // $ANTLR start "queryExpression"
    // Generator.g:1027:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        GeneratorParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1028:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1029:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression4594); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression4601); if (state.failed) return n;
            // Generator.g:1031:5: (decls= elemVarsDeclaration BAR )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==IDENT) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==COMMA||LA88_1==COLON||LA88_1==BAR) ) {
                    alt88=1;
                }
            }
            switch (alt88) {
                case 1 :
                    // Generator.g:1031:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression4612);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression4616); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression4627);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4633); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "queryExpression"


    // $ANTLR start "iterateExpression"
    // Generator.g:1045:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        GeneratorParser.expression_return nExp = null;


        try {
            // Generator.g:1045:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1046:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,81,FOLLOW_81_in_iterateExpression4665); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4671); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4679);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4681); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4689);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression4691); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression4699);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4705); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "iterateExpression"

    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };

    // $ANTLR start "operationExpression"
    // Generator.g:1067:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        GeneratorParser.expression_return rolename = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1069:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1070:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // Generator.g:1076:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==LBRACK) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Generator.g:1076:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4771); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression4784);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // Generator.g:1078:9: ( COMMA rolename= expression )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==COMMA) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // Generator.g:1078:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4797); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression4801);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4813); if (state.failed) return retval;
                    // Generator.g:1081:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==LBRACK) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Generator.g:1081:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4830); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression4845);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // Generator.g:1083:11: ( COMMA rolename= expression )*
                            loop90:
                            do {
                                int alt90=2;
                                int LA90_0 = input.LA(1);

                                if ( (LA90_0==COMMA) ) {
                                    alt90=1;
                                }


                                switch (alt90) {
                            	case 1 :
                            	    // Generator.g:1083:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4860); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression4864);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop90;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4878); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // Generator.g:1088:5: ( AT 'pre' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==AT) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==71) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // Generator.g:1088:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression4903); if (state.failed) return retval;
                    match(input,71,FOLLOW_71_in_operationExpression4905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // Generator.g:1089:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LPAREN) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Generator.g:1090:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression4925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // Generator.g:1091:7: (e= expression ( COMMA e= expression )* )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=IDENT && LA95_0<=LPAREN)||LA95_0==INT||LA95_0==AT||(LA95_0>=PLUS && LA95_0<=MINUS)||(LA95_0>=REAL && LA95_0<=HASH)||LA95_0==50||LA95_0==73||LA95_0==79||(LA95_0>=81 && LA95_0<=84)||(LA95_0>=86 && LA95_0<=98)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Generator.g:1092:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression4946);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // Generator.g:1093:7: ( COMMA e= expression )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // Generator.g:1093:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4958); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression4962);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression4982); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               retval.n.setStartToken(((Token)retval.start)); 
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operationExpression"


    // $ANTLR start "typeExpression"
    // Generator.g:1106:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // Generator.g:1109:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // Generator.g:1110:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=82 && input.LA(1)<=84) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression5047); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression5051);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression5053); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTypeArgExpression(opToken, source, t, followsArrow); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "typeExpression"


    // $ANTLR start "elemVarsDeclaration"
    // Generator.g:1121:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : idListRes= idList ( COLON t= type )? ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        List idListRes = null;

        ASTType t = null;


         List idList; 
        try {
            // Generator.g:1123:1: (idListRes= idList ( COLON t= type )? )
            // Generator.g:1124:5: idListRes= idList ( COLON t= type )?
            {
            pushFollow(FOLLOW_idList_in_elemVarsDeclaration5092);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1125:5: ( COLON t= type )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==COLON) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Generator.g:1125:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration5100); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration5104);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTElemVarsDeclaration(idListRes, t); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"


    // $ANTLR start "variableInitialization"
    // Generator.g:1134:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1135:1: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1136:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization5139); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization5141); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization5145);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization5147); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization5151);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "variableInitialization"


    // $ANTLR start "ifExpression"
    // Generator.g:1145:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        GeneratorParser.expression_return cond = null;

        GeneratorParser.expression_return t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1146:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1147:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,50,FOLLOW_50_in_ifExpression5183); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5187);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,51,FOLLOW_51_in_ifExpression5189); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5193);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,52,FOLLOW_52_in_ifExpression5195); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression5199);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,85,FOLLOW_85_in_ifExpression5201); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "ifExpression"


    // $ANTLR start "literal"
    // Generator.g:1167:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;

        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        ASTCollectionLiteral nColIt = null;

        ASTEmptyCollectionLiteral nEColIt = null;

        ASTUndefinedLiteral nUndLit = null;

        ASTTupleLiteral nTupleLit = null;

        ASTDateLiteral nDateLit = null;


        try {
            // Generator.g:1168:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt98=12;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // Generator.g:1169:7: t= 'true'
                    {
                    t=(Token)match(input,86,FOLLOW_86_in_literal5240); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1170:7: f= 'false'
                    {
                    f=(Token)match(input,87,FOLLOW_87_in_literal5254); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1171:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal5267); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1172:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5282); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:1173:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5296); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:1174:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal5306); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5310); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:1175:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5322); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5324); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5328); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:1176:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal5340);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // Generator.g:1177:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5352);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // Generator.g:1178:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal5364);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // Generator.g:1179:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal5376);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // Generator.g:1180:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal5388);
                    nDateLit=dateLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nDateLit; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "literal"


    // $ANTLR start "collectionLiteral"
    // Generator.g:1188:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // Generator.g:1190:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1191:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=88 && input.LA(1)<=91) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               n = new ASTCollectionLiteral(op); 
            }
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral5455); if (state.failed) return n;
            // Generator.g:1195:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=IDENT && LA100_0<=LPAREN)||LA100_0==INT||LA100_0==AT||(LA100_0>=PLUS && LA100_0<=MINUS)||(LA100_0>=REAL && LA100_0<=HASH)||LA100_0==50||LA100_0==73||LA100_0==79||(LA100_0>=81 && LA100_0<=84)||(LA100_0>=86 && LA100_0<=98)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Generator.g:1196:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5472);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // Generator.g:1197:7: ( COMMA ci= collectionItem )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==COMMA) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // Generator.g:1197:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral5485); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5489);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral5508); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"


    // $ANTLR start "collectionItem"
    // Generator.g:1206:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        GeneratorParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1208:1: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1209:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem5537);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // Generator.g:1210:5: ( DOTDOT e= expression )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==DOTDOT) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Generator.g:1210:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem5548); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem5552);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setSecond((e!=null?e.n:null)); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionItem"


    // $ANTLR start "emptyCollectionLiteral"
    // Generator.g:1220:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // Generator.g:1221:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==92) ) {
                alt102=1;
            }
            else if ( ((LA102_0>=88 && LA102_0<=91)||LA102_0==98) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // Generator.g:1222:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,92,FOLLOW_92_in_emptyCollectionLiteral5581); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral5583); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5587);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral5589); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1225:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5605);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral5607); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral5609); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"


    // $ANTLR start "undefinedLiteral"
    // Generator.g:1236:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // Generator.g:1237:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt103=1;
                }
                break;
            case 94:
                {
                alt103=2;
                }
                break;
            case 95:
                {
                int LA103_3 = input.LA(2);

                if ( (LA103_3==LPAREN) ) {
                    alt103=3;
                }
                else if ( (LA103_3==EOF||LA103_3==IDENT||(LA103_3>=RPAREN && LA103_3<=COMMA)||LA103_3==DOT||(LA103_3>=RBRACK && LA103_3<=LESS)||(LA103_3>=EQUAL && LA103_3<=DOTDOT)||LA103_3==STAR||LA103_3==AT||(LA103_3>=NOT_EQUAL && LA103_3<=BAR)||LA103_3==47||LA103_3==49||(LA103_3>=51 && LA103_3<=52)||LA103_3==57||(LA103_3>=59 && LA103_3<=63)||(LA103_3>=65 && LA103_3<=72)||(LA103_3>=74 && LA103_3<=78)||LA103_3==85||LA103_3==105) ) {
                    alt103=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // Generator.g:1238:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,93,FOLLOW_93_in_undefinedLiteral5639); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5641); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral5645);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5647); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1241:5: 'Undefined'
                    {
                    match(input,94,FOLLOW_94_in_undefinedLiteral5661); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1244:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,95,FOLLOW_95_in_undefinedLiteral5675); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5677); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral5681);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5683); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1247:5: 'null'
                    {
                    match(input,95,FOLLOW_95_in_undefinedLiteral5697); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"


    // $ANTLR start "tupleLiteral"
    // Generator.g:1257:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1259:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1260:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,96,FOLLOW_96_in_tupleLiteral5736); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5742); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5750);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // Generator.g:1263:5: ( COMMA ti= tupleItem )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Generator.g:1263:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5761); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5765);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5776); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTupleLiteral(tiList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"


    // $ANTLR start "tupleItem"
    // Generator.g:1271:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1272:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1273:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5807); if (state.failed) return n;
            // Generator.g:1274:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==COLON) ) {
                int LA105_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt105=1;
                }
                else if ( (true) ) {
                    alt105=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 105, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA105_0==EQUAL) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // Generator.g:1277:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem5846); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem5850);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem5852); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem5856);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1280:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( (input.LA(1)>=COLON && input.LA(1)<=EQUAL) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_tupleItem5888);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleItem"


    // $ANTLR start "dateLiteral"
    // Generator.g:1289:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // Generator.g:1290:1: ( 'Date' LBRACE v= STRING RBRACE )
            // Generator.g:1291:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,97,FOLLOW_97_in_dateLiteral5933); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral5935); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral5939); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral5941); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTDateLiteral( v ); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "dateLiteral"


    // $ANTLR start "type"
    // Generator.g:1301:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // Generator.g:1303:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // Generator.g:1304:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // Generator.g:1305:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt106=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt106=1;
                }
                break;
            case 88:
            case 89:
            case 90:
            case 91:
            case 98:
                {
                alt106=2;
                }
                break;
            case 96:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // Generator.g:1306:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type5991);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1307:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type6003);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1308:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type6015);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTTuple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeOnly"
    // Generator.g:1313:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // Generator.g:1314:1: (nT= type EOF )
            // Generator.g:1315:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly6047);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly6049); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nT; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "typeOnly"


    // $ANTLR start "simpleType"
    // Generator.g:1325:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // Generator.g:1326:1: (name= IDENT )
            // Generator.g:1327:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType6077); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTSimpleType(name); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "simpleType"


    // $ANTLR start "collectionType"
    // Generator.g:1335:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // Generator.g:1337:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1338:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=88 && input.LA(1)<=91)||input.LA(1)==98 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType6142); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType6146);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType6148); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTCollectionType(op, elemType); if (n != null) n.setStartToken(op);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "collectionType"


    // $ANTLR start "tupleType"
    // Generator.g:1348:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1350:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1351:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,96,FOLLOW_96_in_tupleType6182); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType6184); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType6193);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // Generator.g:1353:5: ( COMMA tp= tuplePart )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==COMMA) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // Generator.g:1353:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType6204); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType6208);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType6220); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTupleType(tpList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tupleType"


    // $ANTLR start "tuplePart"
    // Generator.g:1362:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Generator.g:1363:1: (name= IDENT COLON t= type )
            // Generator.g:1364:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6252); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart6254); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart6258);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTTuplePart(name, t); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "tuplePart"


    // $ANTLR start "statOnly"
    // Generator.g:1403:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1404:1: (s= stat EOF )
            // Generator.g:1405:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly6307);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly6311); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = (s!=null?s.n:null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "statOnly"

    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "stat"
    // Generator.g:1415:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // Generator.g:1419:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // Generator.g:1420:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat6342);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // Generator.g:1421:3: ( SEMI nextStat[seq] )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==SEMI) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // Generator.g:1422:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat6353); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat6359);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                  retval.n = seq.simplify();
                  if ((retval.n != null) && (!retval.n.isEmptyStatement())) {
                    retval.n.setSourcePosition(((Token)retval.start));
                  }
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class nextStat_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nextStat"
    // Generator.g:1438:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final GeneratorParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        GeneratorParser.nextStat_return retval = new GeneratorParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // Generator.g:1439:1: (s= singleStat )
            // Generator.g:1440:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat6393);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  if ((s != null) && (!s.isEmptyStatement())) {
                    seq.addStatement(s, ((Token)retval.start), input.toString(retval.start,input.LT(-1)));
                  }
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nextStat"


    // $ANTLR start "singleStat"
    // Generator.g:1452:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        GeneratorParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // Generator.g:1456:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt109=10;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // Generator.g:1457:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat6430);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1459:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6456);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // Generator.g:1460:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat6468);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // Generator.g:1461:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat6482);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // Generator.g:1462:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat6496);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // Generator.g:1463:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat6509);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // Generator.g:1464:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat6526);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // Generator.g:1465:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat6543);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // Generator.g:1466:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat6560);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // Generator.g:1468:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat6582);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = whs; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "singleStat"


    // $ANTLR start "emptyStat"
    // Generator.g:1475:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // Generator.g:1476:1: ( nothing )
            // Generator.g:1477:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat6609);
            nothing();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTEmptyStatement(); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "emptyStat"


    // $ANTLR start "statStartingWithExpr"
    // Generator.g:1482:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // Generator.g:1483:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1484:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6635);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1485:3: (aas= attAssignStat[$expr.n] )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==DOT) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Generator.g:1486:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6649);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = aas; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if (aas == null) {
                    n = new ASTOperationCallStatement(expr); 
                  }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "statStartingWithExpr"


    // $ANTLR start "varAssignStat"
    // Generator.g:1498:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        GeneratorParser.rValue_return rVal = null;


        try {
            // Generator.g:1499:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1500:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6687); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6691); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat6699);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {

                  n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), (rVal!=null?rVal.n:null));
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "varAssignStat"


    // $ANTLR start "attAssignStat"
    // Generator.g:1568:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        GeneratorParser.rValue_return r = null;


        try {
            // Generator.g:1569:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1570:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6730); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6739); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6743); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat6751);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAttributeAssignmentStatement(exp, (attName!=null?attName.getText():null), (r!=null?r.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "attAssignStat"


    // $ANTLR start "objCreateStat"
    // Generator.g:1582:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1583:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1584:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,99,FOLLOW_99_in_objCreateStat6777); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat6785);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1586:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==LPAREN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Generator.g:1587:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6795); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6807);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6813); if (state.failed) return n;

                    }
                    break;

            }

            // Generator.g:1592:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==64) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // Generator.g:1593:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,64,FOLLOW_64_in_objCreateStat6831); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6839); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6853);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6861); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       
                          n = new ASTNewLinkObjectStatement(ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if (n == null) {
                    n = new ASTNewObjectStatement(ident, objName);
                  }
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "objCreateStat"

    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "objDestroyStat"
    // Generator.g:1612:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // Generator.g:1613:1: ( 'destroy' el= exprListMin1 )
            // Generator.g:1614:3: 'destroy' el= exprListMin1
            {
            match(input,100,FOLLOW_100_in_objDestroyStat6897); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat6905);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (ASTExpression expression : el) {
                    seq.addStatement(
                      new ASTObjectDestructionStatement(expression),
                      ((Token)retval.start),
                      input.toString(retval.start,input.LT(-1)));
                  }
                  
                  retval.n = seq.simplify();
                
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objDestroyStat"


    // $ANTLR start "lnkInsStat"
    // Generator.g:1635:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1636:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1637:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,101,FOLLOW_101_in_lnkInsStat6931); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat6935); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6945);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat6949); if (state.failed) return n;
            match(input,102,FOLLOW_102_in_lnkInsStat6953); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat6961); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTLinkInsertionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "lnkInsStat"

    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };

    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // Generator.g:1647:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        GeneratorParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1653:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1654:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6990);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Generator.g:1655:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==LBRACE) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // Generator.g:1656:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7001); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7010);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7017); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7033); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7044);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Generator.g:1668:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==LBRACE) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // Generator.g:1669:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7055); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7064);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7071); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // Generator.g:1678:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Generator.g:1679:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7093); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7108);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // Generator.g:1683:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==LBRACE) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // Generator.g:1684:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7128); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7139);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7148); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            retval.qualifiers.add(currentQualifiers);
            	            currentQualifiers = Collections.emptyList();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rValListMin2WithOptionalQualifiers"


    // $ANTLR start "lnkDelStat"
    // Generator.g:1699:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Generator.g:1700:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1701:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,103,FOLLOW_103_in_lnkDelStat7189); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat7193); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7203);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat7207); if (state.failed) return n;
            match(input,104,FOLLOW_104_in_lnkDelStat7211); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat7220); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTLinkDeletionStatement((ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "lnkDelStat"


    // $ANTLR start "condExStat"
    // Generator.g:1715:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        GeneratorParser.stat_return ts = null;

        GeneratorParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1719:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // Generator.g:1720:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,50,FOLLOW_50_in_condExStat7251); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat7260);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,51,FOLLOW_51_in_condExStat7264); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat7273);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // Generator.g:1724:3: ( 'else' es= stat )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==52) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Generator.g:1725:5: 'else' es= stat
                    {
                    match(input,52,FOLLOW_52_in_condExStat7284); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat7296);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,47,FOLLOW_47_in_condExStat7307); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTConditionalExecutionStatement(con, (ts!=null?ts.n:null), elseStat); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "condExStat"


    // $ANTLR start "iterStat"
    // Generator.g:1736:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1737:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // Generator.g:1738:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,48,FOLLOW_48_in_iterStat7332); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7340); if (state.failed) return n;
            match(input,49,FOLLOW_49_in_iterStat7344); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat7352);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,105,FOLLOW_105_in_iterStat7356); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat7364);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,47,FOLLOW_47_in_iterStat7368); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIterationStatement((var!=null?var.getText():null), set, (s!=null?s.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "iterStat"


    // $ANTLR start "whileStat"
    // Generator.g:1753:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        GeneratorParser.stat_return s = null;


        try {
            // Generator.g:1754:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // Generator.g:1755:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,106,FOLLOW_106_in_whileStat7394); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat7402);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,105,FOLLOW_105_in_whileStat7406); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat7414);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,47,FOLLOW_47_in_whileStat7418); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTWhileStatement(cond, (s!=null?s.n:null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "whileStat"


    // $ANTLR start "nothing"
    // Generator.g:1778:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:1779:1: ()
            // Generator.g:1780:1: 
            {
            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nothing"

    public static class rValue_return extends ParserRuleReturnScope {
        public ASTRValue n;
    };

    // $ANTLR start "rValue"
    // Generator.g:1786:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final GeneratorParser.rValue_return rValue() throws RecognitionException {
        GeneratorParser.rValue_return retval = new GeneratorParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // Generator.g:1787:1: (e= inSoilExpression | oc= objCreateStat )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=IDENT && LA118_0<=LPAREN)||LA118_0==INT||LA118_0==AT||(LA118_0>=PLUS && LA118_0<=MINUS)||(LA118_0>=REAL && LA118_0<=HASH)||LA118_0==50||LA118_0==73||LA118_0==79||(LA118_0>=81 && LA118_0<=84)||(LA118_0>=86 && LA118_0<=98)) ) {
                alt118=1;
            }
            else if ( (LA118_0==99) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // Generator.g:1788:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7471);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1789:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7483);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          oc.setSourcePosition(((Token)retval.start));
                          if (oc instanceof ASTNewLinkObjectStatement)
                          	retval.n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)oc);
                          else
                          	retval.n = new ASTRValueNewObject((ASTNewObjectStatement)oc);
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rValue"


    // $ANTLR start "rValList"
    // Generator.g:1803:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // Generator.g:1804:1: ( nothing | rl= rValListMin1 )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RBRACE) ) {
                alt119=1;
            }
            else if ( ((LA119_0>=IDENT && LA119_0<=LPAREN)||LA119_0==INT||LA119_0==AT||(LA119_0>=PLUS && LA119_0<=MINUS)||(LA119_0>=REAL && LA119_0<=HASH)||LA119_0==50||LA119_0==73||LA119_0==79||(LA119_0>=81 && LA119_0<=84)||(LA119_0>=86 && LA119_0<=99)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // Generator.g:1805:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7506);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1808:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7533);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = rl; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValList"


    // $ANTLR start "rValListMin1"
    // Generator.g:1816:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        GeneratorParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1820:1: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:1821:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17566);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Generator.g:1823:3: ( COMMA r= rValue )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMMA) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // Generator.g:1824:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17580); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin17590);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValListMin1"


    // $ANTLR start "rValListMin2"
    // Generator.g:1834:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        GeneratorParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1838:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:1839:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27629);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27637); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin27645);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Generator.g:1844:3: ( COMMA r= rValue )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // Generator.g:1845:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27659); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin27669);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "rValListMin2"


    // $ANTLR start "inSoilExpression"
    // Generator.g:1855:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        GeneratorParser.expression_return e = null;


        try {
            // Generator.g:1856:1: (e= expression )
            // Generator.g:1857:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression7703);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); 
            }
            if ( state.backtracking==0 ) {
               n = (e!=null?e.n:null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "inSoilExpression"


    // $ANTLR start "exprList"
    // Generator.g:1866:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // Generator.g:1867:1: ( nothing | el= exprListMin1 )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==EOF) ) {
                alt122=1;
            }
            else if ( ((LA122_0>=IDENT && LA122_0<=LPAREN)||LA122_0==INT||LA122_0==AT||(LA122_0>=PLUS && LA122_0<=MINUS)||(LA122_0>=REAL && LA122_0<=HASH)||LA122_0==50||LA122_0==73||LA122_0==79||(LA122_0>=81 && LA122_0<=84)||(LA122_0>=86 && LA122_0<=98)) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // Generator.g:1868:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList7732);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1871:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList7750);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = el; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "exprListMin1"
    // Generator.g:1879:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1883:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1884:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin17783);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Generator.g:1886:3: ( COMMA e= inSoilExpression )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==COMMA) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // Generator.g:1887:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin17798); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin17808);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprListMin1"


    // $ANTLR start "exprListMin2"
    // Generator.g:1897:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1901:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1902:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27848);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin27856); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27864);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Generator.g:1907:3: ( COMMA e= inSoilExpression )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // Generator.g:1908:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin27878); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin27888);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "exprListMin2"


    // $ANTLR start "identList"
    // Generator.g:1918:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // Generator.g:1919:1: ( nothing | il= identListMin1 )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==EOF||LA125_0==SEMI||LA125_0==RBRACE||LA125_0==47||LA125_0==52) ) {
                alt125=1;
            }
            else if ( (LA125_0==IDENT) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // Generator.g:1920:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList7918);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // Generator.g:1923:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList7935);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = il; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "identList"


    // $ANTLR start "identListMin1"
    // Generator.g:1931:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:1935:1: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:1936:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17969); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // Generator.g:1938:3: ( COMMA id= IDENT )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==COMMA) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // Generator.g:1939:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin17983); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17993); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_Generator
    public final void synpred1_Generator_fragment() throws RecognitionException {   
        // Generator.g:1277:7: ( COLON type EQUAL )
        // Generator.g:1277:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator5837); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_Generator5839);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator5841); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {   
        // Generator.g:1459:5: ( statStartingWithExpr )
        // Generator.g:1459:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator6448);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Generator

    // Delegated rules

    public final boolean synpred2_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\1\5\10\uffff";
    static final String DFA7_maxS =
        "\1\67\1\11\10\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\1\1\4";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\6\uffff\1\2\44\uffff\1\3\1\uffff\1\4\2\uffff\1\5\1\6\1"+
            "\7",
            "\1\11\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "190:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment | instrAA= attributeAssignment | instrLO= loop | instrAI= atomicInstruction | instrIT= ifThenElse | instrAC= asslCall | instrOE= opEnter | instrOX= opExit );";
        }
    }
    static final String DFA19_eotS =
        "\16\uffff";
    static final String DFA19_eofS =
        "\1\2\15\uffff";
    static final String DFA19_minS =
        "\2\4\2\uffff\1\5\1\4\1\21\2\4\1\27\1\21\1\6\1\27\1\6";
    static final String DFA19_maxS =
        "\1\77\1\4\2\uffff\1\5\1\10\1\21\1\4\1\77\1\27\1\21\1\10\1\27\1\10";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\1\12\uffff";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\21\uffff\1\1\42\uffff\1\2\1\3\1\2\2\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6\1\uffff\1\10\1\uffff\1\7",
            "\1\11",
            "\1\12",
            "\1\2\21\uffff\1\1\43\uffff\1\3\1\2\2\uffff\2\2",
            "\1\13",
            "\1\14",
            "\1\10\1\uffff\1\7",
            "\1\15",
            "\1\10\1\uffff\1\7"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 380:5: (e= enumTypeDefinition )*";
        }
    }
    static final String DFA21_eotS =
        "\24\uffff";
    static final String DFA21_eofS =
        "\1\1\23\uffff";
    static final String DFA21_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\1\17\1\4\1\uffff\1\21\2"+
        "\4\1\27\1\21\1\4\1\6\1\27\1\17\1\6";
    static final String DFA21_maxS =
        "\1\77\1\uffff\1\4\1\uffff\1\4\1\uffff\1\5\1\100\1\10\1\uffff\1\21"+
        "\1\4\1\77\1\27\1\21\1\4\1\10\1\27\1\100\1\10";
    static final String DFA21_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\12\uffff";
    static final String DFA21_specialS =
        "\24\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\4\21\uffff\1\2\42\uffff\1\5\1\uffff\1\3\2\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\3\37\uffff\1\3\11\uffff\1\3\2\uffff\2\3\2\uffff\1\11",
            "\1\12\1\uffff\1\14\1\uffff\1\13",
            "",
            "\1\15",
            "\1\16",
            "\1\17\21\uffff\1\2\44\uffff\1\3\2\uffff\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\14\1\uffff\1\13",
            "\1\23",
            "\1\3\37\uffff\1\3\11\uffff\1\3\2\uffff\2\3\2\uffff\1\11",
            "\1\14\1\uffff\1\13"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 381:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*";
        }
    }
    static final String DFA98_eotS =
        "\16\uffff";
    static final String DFA98_eofS =
        "\16\uffff";
    static final String DFA98_minS =
        "\1\4\7\uffff\1\5\5\uffff";
    static final String DFA98_maxS =
        "\1\142\7\uffff\1\15\5\uffff";
    static final String DFA98_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA98_specialS =
        "\16\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\7\16\uffff\1\3\15\uffff\1\4\1\5\1\6\62\uffff\1\1\1\2\4\10"+
            "\1\11\3\12\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\7\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "1167:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
    static final String DFA109_eotS =
        "\43\uffff";
    static final String DFA109_eofS =
        "\1\1\42\uffff";
    static final String DFA109_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA109_maxS =
        "\1\152\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA109_acceptS =
        "\1\uffff\1\1\3\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA109_specialS =
        "\1\0\14\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA109_transitionS = {
            "\1\15\1\31\1\uffff\1\1\13\uffff\1\11\2\uffff\1\26\5\uffff\2"+
            "\6\3\uffff\1\12\1\13\1\14\13\uffff\1\1\1\37\1\uffff\1\32\1\uffff"+
            "\1\1\24\uffff\1\5\5\uffff\1\6\1\uffff\1\27\3\30\1\uffff\1\7"+
            "\1\10\4\16\1\17\1\21\1\22\1\23\1\24\1\25\1\20\1\33\1\34\1\35"+
            "\1\uffff\1\36\2\uffff\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "1452:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_0 = input.LA(1);

                         
                        int index109_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA109_0==EOF||LA109_0==SEMI||LA109_0==47||LA109_0==52) ) {s = 1;}

                        else if ( (LA109_0==73) && (synpred2_Generator())) {s = 5;}

                        else if ( ((LA109_0>=PLUS && LA109_0<=MINUS)||LA109_0==79) && (synpred2_Generator())) {s = 6;}

                        else if ( (LA109_0==86) && (synpred2_Generator())) {s = 7;}

                        else if ( (LA109_0==87) && (synpred2_Generator())) {s = 8;}

                        else if ( (LA109_0==INT) && (synpred2_Generator())) {s = 9;}

                        else if ( (LA109_0==REAL) && (synpred2_Generator())) {s = 10;}

                        else if ( (LA109_0==STRING) && (synpred2_Generator())) {s = 11;}

                        else if ( (LA109_0==HASH) && (synpred2_Generator())) {s = 12;}

                        else if ( (LA109_0==IDENT) ) {s = 13;}

                        else if ( ((LA109_0>=88 && LA109_0<=91)) && (synpred2_Generator())) {s = 14;}

                        else if ( (LA109_0==92) && (synpred2_Generator())) {s = 15;}

                        else if ( (LA109_0==98) && (synpred2_Generator())) {s = 16;}

                        else if ( (LA109_0==93) && (synpred2_Generator())) {s = 17;}

                        else if ( (LA109_0==94) && (synpred2_Generator())) {s = 18;}

                        else if ( (LA109_0==95) && (synpred2_Generator())) {s = 19;}

                        else if ( (LA109_0==96) && (synpred2_Generator())) {s = 20;}

                        else if ( (LA109_0==97) && (synpred2_Generator())) {s = 21;}

                        else if ( (LA109_0==AT) && (synpred2_Generator())) {s = 22;}

                        else if ( (LA109_0==81) && (synpred2_Generator())) {s = 23;}

                        else if ( ((LA109_0>=82 && LA109_0<=84)) && (synpred2_Generator())) {s = 24;}

                        else if ( (LA109_0==LPAREN) && (synpred2_Generator())) {s = 25;}

                        else if ( (LA109_0==50) ) {s = 26;}

                        else if ( (LA109_0==99) ) {s = 27;}

                        else if ( (LA109_0==100) ) {s = 28;}

                        else if ( (LA109_0==101) ) {s = 29;}

                        else if ( (LA109_0==103) ) {s = 30;}

                        else if ( (LA109_0==48) ) {s = 31;}

                        else if ( (LA109_0==106) ) {s = 32;}

                         
                        input.seek(index109_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_13 = input.LA(1);

                         
                        int index109_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Generator()) ) {s = 25;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index109_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA109_26 = input.LA(1);

                         
                        int index109_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Generator()) ) {s = 25;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index109_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_procedure179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_procedure199 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure214 = new BitSet(new long[]{0x00E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure220 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x00E5000000000812L});
    public static final BitSet FOLLOW_variableAssignment_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeAssignment_in_instruction371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifThenElse_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asslCall_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opEnter_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opExit_in_instruction465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableAssignment496 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_variableAssignment498 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_valueInstruction_in_variableAssignment502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_attributeAssignment534 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_attributeAssignment536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attributeAssignment540 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attributeAssignment548 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_valueInstruction_in_attributeAssignment552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_loop584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop588 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_loop590 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_loop594 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_loop596 = new BitSet(new long[]{0x00E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_loop607 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_loop609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ifThenElse645 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse649 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifThenElse660 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ifThenElse662 = new BitSet(new long[]{0x00E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse666 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifThenElse668 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ifThenElse679 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ifThenElse681 = new BitSet(new long[]{0x00E5800000000810L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse685 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ifThenElse687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_valueInstruction741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomicInstruction771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_atomicInstruction775 = new BitSet(new long[]{0x0000000000000850L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction789 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_atomicInstruction807 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction811 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_atomicInstruction859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_asslCall882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_asslCall886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_asslCall890 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall904 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_asslCall922 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall926 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_asslCall974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_opEnter997 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_opEnter1005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_opEnter1009 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1024 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_opEnter1042 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1046 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_opEnter1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_opExit1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_instructionParameter1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1214 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_oclExpression1218 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RBRACK_in_oclExpression1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1263 = new BitSet(new long[]{0x0004000E30480070L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1274 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1284 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1288 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1336 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_model1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_model1346 = new BitSet(new long[]{0xCE00000000400010L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1358 = new BitSet(new long[]{0xCE00000000400010L});
    public static final BitSet FOLLOW_generalClassDefinition_in_model1375 = new BitSet(new long[]{0xCA00000000400010L});
    public static final BitSet FOLLOW_associationDefinition_in_model1392 = new BitSet(new long[]{0xCA00000000400010L});
    public static final BitSet FOLLOW_57_in_model1408 = new BitSet(new long[]{0xCA00000000400010L,0x0000000000000010L});
    public static final BitSet FOLLOW_invariant_in_model1426 = new BitSet(new long[]{0xCA00000000400010L,0x0000000000000010L});
    public static final BitSet FOLLOW_prePost_in_model1447 = new BitSet(new long[]{0xCA00000000400010L,0x0000000000000010L});
    public static final BitSet FOLLOW_EOF_in_model1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1516 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_enumTypeDefinition1522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1526 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1532 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1534 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassDefinition1576 = new BitSet(new long[]{0xC800000000400010L});
    public static final BitSet FOLLOW_59_in_generalClassDefinition1584 = new BitSet(new long[]{0xC800000000400010L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassDefinition1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassDefinition1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1665 = new BitSet(new long[]{0x3200800000008000L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_classDefinition1679 = new BitSet(new long[]{0x3200800000000000L});
    public static final BitSet FOLLOW_60_in_classDefinition1692 = new BitSet(new long[]{0x2200800000400010L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1705 = new BitSet(new long[]{0x2200800000400010L});
    public static final BitSet FOLLOW_61_in_classDefinition1726 = new BitSet(new long[]{0x0200800000400010L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1739 = new BitSet(new long[]{0x0200800000400010L});
    public static final BitSet FOLLOW_57_in_classDefinition1760 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1780 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_47_in_classDefinition1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition1837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition1863 = new BitSet(new long[]{0x3200800000408010L,0x0000000000000001L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition1873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition1877 = new BitSet(new long[]{0x3200800000400010L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_associationClassDefinition1889 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1897 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition1909 = new BitSet(new long[]{0x3200800000400010L});
    public static final BitSet FOLLOW_60_in_associationClassDefinition1929 = new BitSet(new long[]{0x2200800000400010L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition1942 = new BitSet(new long[]{0x2200800000400010L});
    public static final BitSet FOLLOW_61_in_associationClassDefinition1963 = new BitSet(new long[]{0x0200800000400010L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition1976 = new BitSet(new long[]{0x0200800000400010L});
    public static final BitSet FOLLOW_57_in_associationClassDefinition1997 = new BitSet(new long[]{0x0000800000400010L,0x0000000000000060L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2017 = new BitSet(new long[]{0x0000800000400010L,0x0000000000000060L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2053 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2057 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_associationClassDefinition2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2116 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2118 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2122 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2183 = new BitSet(new long[]{0x0000400000030082L,0x0000000000000180L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2197 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2203 = new BitSet(new long[]{0x0000400000020082L,0x0000000000000180L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2231 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2237 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000180L});
    public static final BitSet FOLLOW_46_in_operationDefinition2255 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_stat_in_operationDefinition2261 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_operationDefinition2263 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000180L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2284 = new BitSet(new long[]{0x0000000000000082L,0x0000000000000180L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2328 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_associationDefinition2368 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2376 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2388 = new BitSet(new long[]{0x0000800000400010L});
    public static final BitSet FOLLOW_47_in_associationDefinition2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2432 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2434 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2440 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2455 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_65_in_associationEnd2476 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_66_in_associationEnd2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2492 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2504 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_67_in_associationEnd2516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2520 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2534 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_associationEnd2538 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2556 = new BitSet(new long[]{0x0000000000000092L,0x000000000000000EL});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2608 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity2618 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2622 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2651 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange2661 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_invariant2750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant2760 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_COMMA_in_invariant2773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant2777 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_COLON_in_invariant2785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_invariant2797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_invariantClause_in_invariant2809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_invariantClause2840 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2851 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_invariantClause2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_invariantClause2865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_invariantClause2867 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause2873 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_invariantClause2878 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_invariantClause2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_prePost2908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost2912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost2914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost2918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_paramList_in_prePost2922 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000180L});
    public static final BitSet FOLLOW_COLON_in_prePost2926 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_prePost2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_prePostClause_in_prePost2949 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_set_in_prePostClause2988 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3008 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_prePostClause3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3039 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_annotation3058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_annotation3062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3068 = new BitSet(new long[]{0x0000000000000150L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3077 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3105 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3117 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3141 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly3283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_expression3333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_expression3337 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_COLON_in_expression3341 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_expression3345 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_expression3350 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_expression3354 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expression3356 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList3414 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3431 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_paramList3443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3447 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_paramList3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList3496 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_idList3506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_idList3510 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration3541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration3543 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_conditionalImpliesExpression3596 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_conditionalOrExpression3658 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3662 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3706 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_conditionalXOrExpression3719 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionalAndExpression3780 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3784 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3832 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3851 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3861 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3910 = new BitSet(new long[]{0x000000000E008002L});
    public static final BitSet FOLLOW_set_in_relationalExpression3928 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3946 = new BitSet(new long[]{0x000000000E008002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3996 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression4014 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4024 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4074 = new BitSet(new long[]{0x0000000040100002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression4092 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4106 = new BitSet(new long[]{0x0000000040100002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_unaryExpression4168 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression4245 = new BitSet(new long[]{0x0000000080000402L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression4263 = new BitSet(new long[]{0x0000000000000010L,0x00000000001E0000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression4269 = new BitSet(new long[]{0x0000000000000010L,0x00000000001E0000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression4280 = new BitSet(new long[]{0x0000000080000402L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4357 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4387 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_primaryExpression4391 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4395 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4397 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_primaryExpression4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference4447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_objectReference4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression4594 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression4601 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression4612 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression4616 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_queryExpression4627 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_iterateExpression4665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4679 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4689 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4691 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4749 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4771 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4784 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4797 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4801 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4813 = new BitSet(new long[]{0x0000000000400822L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4830 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4845 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4860 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4864 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4878 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_AT_in_operationExpression4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_operationExpression4905 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression4925 = new BitSet(new long[]{0x0004000E30480070L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4946 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4958 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4962 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression5031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression5047 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_typeExpression5051 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_elemVarsDeclaration5092 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration5100 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization5139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization5141 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_variableInitialization5145 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization5147 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_variableInitialization5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ifExpression5183 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_ifExpression5187 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifExpression5189 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_ifExpression5193 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ifExpression5195 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_ifExpression5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ifExpression5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_literal5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_literal5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal5306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal5322 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal5324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral5426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral5455 = new BitSet(new long[]{0x0004000E30484030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5472 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral5485 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5489 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem5537 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem5548 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_collectionItem5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_emptyCollectionLiteral5581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral5583 = new BitSet(new long[]{0x0000000000000000L,0x000000041F000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5605 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral5607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_undefinedLiteral5639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5641 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5645 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_undefinedLiteral5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_undefinedLiteral5675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5677 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_undefinedLiteral5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_tupleLiteral5736 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5750 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5765 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5807 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_COLON_in_tupleItem5846 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_tupleItem5850 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem5852 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_tupleItem5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem5878 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_expression_in_tupleItem5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_dateLiteral5933 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral5935 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral5939 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly6047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType6115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType6142 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_collectionType6146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_tupleType6182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType6184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6193 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_tupleType6204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType6208 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart6252 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_tuplePart6254 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_tuplePart6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly6307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat6342 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_stat6353 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_nextStat_in_stat6359 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_singleStat_in_nextStat6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6635 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6687 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6691 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6739 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6743 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_objCreateStat6777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6785 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6795 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6807 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_objCreateStat6831 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6839 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_objDestroyStat6897 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_lnkInsStat6931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat6935 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6945 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat6949 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_lnkInsStat6953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6990 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7001 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7010 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7017 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7033 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7044 = new BitSet(new long[]{0x0000000000002102L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7055 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7064 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7071 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers7093 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers7108 = new BitSet(new long[]{0x0000000000002102L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers7128 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers7139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers7148 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_103_in_lnkDelStat7189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat7193 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat7203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat7207 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_lnkDelStat7211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_condExStat7251 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat7260 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_condExStat7264 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_stat_in_condExStat7273 = new BitSet(new long[]{0x0010800000000000L});
    public static final BitSet FOLLOW_52_in_condExStat7284 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_stat_in_condExStat7296 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_condExStat7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_iterStat7332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_iterStat7340 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iterStat7344 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat7352 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_iterStat7356 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_stat_in_iterStat7364 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_iterStat7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_whileStat7394 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat7402 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_whileStat7406 = new BitSet(new long[]{0x0005000E30480030L,0x000004BFFFDE8200L});
    public static final BitSet FOLLOW_stat_in_whileStat7414 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_whileStat7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17566 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17580 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17590 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27629 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27637 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27645 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27659 = new BitSet(new long[]{0x0004000E30480030L,0x0000000FFFDE8200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27669 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17783 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin17798 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17808 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27848 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27856 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27864 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27878 = new BitSet(new long[]{0x0004000E30480030L,0x00000007FFDE8200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27888 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_nothing_in_identList7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17969 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_identListMin17983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17993 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator5837 = new BitSet(new long[]{0x0000000000000010L,0x000000051F000000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator5839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator6448 = new BitSet(new long[]{0x0000000000000002L});

}