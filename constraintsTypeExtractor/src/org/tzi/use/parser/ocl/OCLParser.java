// $ANTLR 3.3 Nov 30, 2010 12:45:30 OCL.g 2011-09-27 13:30:29
 
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

package org.tzi.use.parser.ocl; 

// ------------------------------------
//  USE OCL parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class OCLParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "COLON", "EQUAL", "LPAREN", "COMMA", "RPAREN", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "ARROW", "DOT", "AT", "BAR", "SEMI", "LBRACK", "RBRACK", "INT", "REAL", "STRING", "HASH", "LBRACE", "RBRACE", "DOTDOT", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "COLON_COLON", "COLON_EQUAL", "RANGE_OR_INT", "ESC", "NON_OCL_STRING", "HEX_DIGIT", "VOCAB", "'let'", "'in'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'pre'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'"
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
    public static final int IDENT=4;
    public static final int COLON=5;
    public static final int EQUAL=6;
    public static final int LPAREN=7;
    public static final int COMMA=8;
    public static final int RPAREN=9;
    public static final int NOT_EQUAL=10;
    public static final int LESS=11;
    public static final int GREATER=12;
    public static final int LESS_EQUAL=13;
    public static final int GREATER_EQUAL=14;
    public static final int PLUS=15;
    public static final int MINUS=16;
    public static final int STAR=17;
    public static final int SLASH=18;
    public static final int ARROW=19;
    public static final int DOT=20;
    public static final int AT=21;
    public static final int BAR=22;
    public static final int SEMI=23;
    public static final int LBRACK=24;
    public static final int RBRACK=25;
    public static final int INT=26;
    public static final int REAL=27;
    public static final int STRING=28;
    public static final int HASH=29;
    public static final int LBRACE=30;
    public static final int RBRACE=31;
    public static final int DOTDOT=32;
    public static final int NEWLINE=33;
    public static final int WS=34;
    public static final int SL_COMMENT=35;
    public static final int ML_COMMENT=36;
    public static final int COLON_COLON=37;
    public static final int COLON_EQUAL=38;
    public static final int RANGE_OR_INT=39;
    public static final int ESC=40;
    public static final int NON_OCL_STRING=41;
    public static final int HEX_DIGIT=42;
    public static final int VOCAB=43;

    // delegates
    // delegators


        public OCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OCLParser.tokenNames; }
    public String getGrammarFileName() { return "OCL.g"; }



    // $ANTLR start "expressionOnly"
    // OCL.g:96:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExp = null;


        try {
            // OCL.g:97:1: (nExp= expression EOF )
            // OCL.g:98:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly69);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly71); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nExp;
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


    // $ANTLR start "expression"
    // OCL.g:105:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ASTExpression expression() throws RecognitionException {
        ASTExpression n = null;

        Token name=null;
        ASTType t = null;

        ASTExpression e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // OCL.g:111:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // OCL.g:112:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // OCL.g:113:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==44) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // OCL.g:114:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,44,FOLLOW_44_in_expression119); if (state.failed) return n;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression123); if (state.failed) return n;
            	    // OCL.g:114:24: ( COLON t= type )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==COLON) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // OCL.g:114:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression127); if (state.failed) return n;
            	            pushFollow(FOLLOW_type_in_expression131);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression136); if (state.failed) return n;
            	    pushFollow(FOLLOW_expression_in_expression140);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    match(input,45,FOLLOW_45_in_expression142); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       ASTLetExpression nextLet = new ASTLetExpression(name, t, e1);
            	               if ( firstLet == null ) 
            	                   firstLet = nextLet;
            	               if ( prevLet != null ) 
            	                   prevLet.setInExpr(nextLet);
            	               prevLet = nextLet;
            	             
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression167);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if ( nCndImplies != null ) {
                  	 n = nCndImplies;
                       n.setStartToken(tok);
                    }
                    
                    if ( prevLet != null ) { 
                       prevLet.setInExpr(n);
                       n = firstLet;
                       n.setStartToken(tok);
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
    // $ANTLR end "expression"


    // $ANTLR start "paramList"
    // OCL.g:142:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // OCL.g:144:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // OCL.g:145:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList200); if (state.failed) return paramList;
            // OCL.g:146:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // OCL.g:147:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList217);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // OCL.g:148:7: ( COMMA v= variableDeclaration )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // OCL.g:148:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList229); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList233);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList253); if (state.failed) return paramList;

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
    // OCL.g:156:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // OCL.g:158:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // OCL.g:159:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList282); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // OCL.g:160:5: ( COMMA idn= IDENT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // OCL.g:160:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList292); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList296); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // OCL.g:168:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // OCL.g:169:1: (name= IDENT COLON t= type )
            // OCL.g:170:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration327); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration329); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration333);
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
    // OCL.g:178:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // OCL.g:179:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // OCL.g:180:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression369);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // OCL.g:181:5: (op= 'implies' n1= conditionalOrExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==46) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // OCL.g:181:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,46,FOLLOW_46_in_conditionalImpliesExpression382); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression386);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"


    // $ANTLR start "conditionalOrExpression"
    // OCL.g:190:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // OCL.g:191:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // OCL.g:192:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression431);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // OCL.g:193:5: (op= 'or' n1= conditionalXOrExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // OCL.g:193:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,47,FOLLOW_47_in_conditionalOrExpression444); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression448);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // OCL.g:202:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // OCL.g:203:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // OCL.g:204:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression492);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // OCL.g:205:5: (op= 'xor' n1= conditionalAndExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // OCL.g:205:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,48,FOLLOW_48_in_conditionalXOrExpression505); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression509);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // OCL.g:214:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // OCL.g:215:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // OCL.g:216:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression553);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // OCL.g:217:5: (op= 'and' n1= equalityExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // OCL.g:217:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,49,FOLLOW_49_in_conditionalAndExpression566); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression570);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // OCL.g:226:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // OCL.g:228:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // OCL.g:229:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression618);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // OCL.g:230:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EQUAL||LA10_0==NOT_EQUAL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // OCL.g:230:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression647);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // OCL.g:240:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // OCL.g:242:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // OCL.g:243:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression696);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // OCL.g:244:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=LESS && LA11_0<=GREATER_EQUAL)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // OCL.g:244:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression732);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // OCL.g:254:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // OCL.g:256:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // OCL.g:257:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression782);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // OCL.g:258:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=PLUS && LA12_0<=MINUS)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // OCL.g:258:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression810);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // OCL.g:269:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // OCL.g:271:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // OCL.g:272:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression860);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // OCL.g:273:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=STAR && LA13_0<=SLASH)||LA13_0==50) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // OCL.g:273:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==50 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression892);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // OCL.g:285:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // OCL.g:287:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=PLUS && LA14_0<=MINUS)||LA14_0==51) ) {
                alt14=1;
            }
            else if ( (LA14_0==IDENT||LA14_0==LPAREN||LA14_0==AT||(LA14_0>=INT && LA14_0<=HASH)||(LA14_0>=54 && LA14_0<=58)||(LA14_0>=62 && LA14_0<=74)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // OCL.g:288:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // OCL.g:288:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // OCL.g:288:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==51 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression978);
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
                    // OCL.g:292:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression998);
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
    // OCL.g:300:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // OCL.g:302:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // OCL.g:303:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1031);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // OCL.g:304:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=ARROW && LA16_0<=DOT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // OCL.g:305:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // OCL.g:305:6: ( ARROW | DOT )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==ARROW) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==DOT) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // OCL.g:305:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1049); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // OCL.g:305:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1055); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1066);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // OCL.g:321:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        ASTExpression nExp = null;

        ASTExpression nIfExp = null;


        try {
            // OCL.g:322:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt19=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt19=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt19=1;
                    }
                    break;
                case EOF:
                case EQUAL:
                case LPAREN:
                case COMMA:
                case RPAREN:
                case NOT_EQUAL:
                case LESS:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case PLUS:
                case MINUS:
                case STAR:
                case SLASH:
                case ARROW:
                case AT:
                case BAR:
                case LBRACK:
                case RBRACK:
                case RBRACE:
                case DOTDOT:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 59:
                case 60:
                case 61:
                    {
                    alt19=3;
                    }
                    break;
                case DOT:
                    {
                    int LA19_7 = input.LA(3);

                    if ( (LA19_7==52) ) {
                        alt19=6;
                    }
                    else if ( (LA19_7==IDENT||(LA19_7>=54 && LA19_7<=57)) ) {
                        alt19=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt19=2;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt19=3;
                }
                break;
            case LPAREN:
                {
                alt19=4;
                }
                break;
            case 58:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // OCL.g:323:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1106);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:324:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1120);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // OCL.g:325:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1132);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // OCL.g:326:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1143); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression1147);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1149); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExp; 
                    }

                    }
                    break;
                case 5 :
                    // OCL.g:327:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1161);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // OCL.g:328:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1173); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1175); if (state.failed) return n;
                    match(input,52,FOLLOW_52_in_primaryExpression1177); if (state.failed) return n;
                    // OCL.g:328:36: ( LPAREN RPAREN )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LPAREN) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // OCL.g:328:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1181); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1183); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // OCL.g:330:7: ( AT 'pre' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==AT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // OCL.g:330:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression1204); if (state.failed) return n;
                            match(input,53,FOLLOW_53_in_primaryExpression1206); if (state.failed) return n;
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
    // OCL.g:334:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // OCL.g:335:1: ( AT objectName= IDENT )
            // OCL.g:336:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference1233); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference1241); if (state.failed) return n;
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
    // OCL.g:350:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        OCLParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // OCL.g:351:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt20=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA20_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 55:
            case 56:
            case 57:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // OCL.g:355:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall1306);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:358:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall1319);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // OCL.g:359:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall1332);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // OCL.g:360:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall1345);
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
    // OCL.g:369:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        ASTExpression nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // OCL.g:370:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // OCL.g:371:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression1380); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression1387); if (state.failed) return n;
            // OCL.g:373:5: (decls= elemVarsDeclaration BAR )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==COLON||LA21_1==COMMA||LA21_1==BAR) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // OCL.g:373:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression1398);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression1402); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression1413);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression1419); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTQueryExpression(op, range, decl, nExp); 
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
    // OCL.g:387:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        ASTExpression nExp = null;


        try {
            // OCL.g:387:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // OCL.g:388:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,54,FOLLOW_54_in_iterateExpression1451); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression1457); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression1465);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression1467); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression1475);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression1477); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression1485);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression1491); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIterateExpression(i, range, decls, init, nExp); 
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
    // OCL.g:409:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final OCLParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        OCLParser.operationExpression_return retval = new OCLParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTExpression rolename = null;

        ASTExpression e = null;


        try {
            // OCL.g:411:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // OCL.g:412:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression1535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // OCL.g:418:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LBRACK) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // OCL.g:418:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1557); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression1570);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier(rolename); 
                    }
                    // OCL.g:420:9: ( COMMA rolename= expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // OCL.g:420:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression1583); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression1587);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier(rolename); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1599); if (state.failed) return retval;
                    // OCL.g:423:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==LBRACK) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // OCL.g:423:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression1616); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression1631);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier(rolename); 
                            }
                            // OCL.g:425:11: ( COMMA rolename= expression )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // OCL.g:425:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression1646); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression1650);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier(rolename); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression1664); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // OCL.g:430:5: ( AT 'pre' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==AT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // OCL.g:430:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression1689); if (state.failed) return retval;
                    match(input,53,FOLLOW_53_in_operationExpression1691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // OCL.g:431:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LPAREN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // OCL.g:432:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression1711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // OCL.g:433:7: (e= expression ( COMMA e= expression )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT||LA28_0==LPAREN||(LA28_0>=PLUS && LA28_0<=MINUS)||LA28_0==AT||(LA28_0>=INT && LA28_0<=HASH)||LA28_0==44||LA28_0==51||(LA28_0>=54 && LA28_0<=58)||(LA28_0>=62 && LA28_0<=74)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // OCL.g:434:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression1732);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg(e); 
                            }
                            // OCL.g:435:7: ( COMMA e= expression )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==COMMA) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // OCL.g:435:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression1744); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression1748);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg(e); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression1768); if (state.failed) return retval;

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
    // OCL.g:448:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // OCL.g:451:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // OCL.g:452:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=55 && input.LA(1)<=57) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression1833); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression1837);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression1839); if (state.failed) return n;
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
    // OCL.g:463:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : idListRes= idList ( COLON t= type )? ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        List idListRes = null;

        ASTType t = null;


         List idList; 
        try {
            // OCL.g:465:1: (idListRes= idList ( COLON t= type )? )
            // OCL.g:466:5: idListRes= idList ( COLON t= type )?
            {
            pushFollow(FOLLOW_idList_in_elemVarsDeclaration1878);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            // OCL.g:467:5: ( COLON t= type )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COLON) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // OCL.g:467:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration1886); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration1890);
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
    // OCL.g:476:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        ASTExpression e = null;


        try {
            // OCL.g:477:1: (name= IDENT COLON t= type EQUAL e= expression )
            // OCL.g:478:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization1925); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization1927); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization1931);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization1933); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization1937);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableInitialization(name, t, e); 
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
    // OCL.g:487:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTExpression cond = null;

        ASTExpression t = null;

        ASTExpression e = null;


        try {
            // OCL.g:488:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // OCL.g:489:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,58,FOLLOW_58_in_ifExpression1969); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression1973);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,59,FOLLOW_59_in_ifExpression1975); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression1979);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,60,FOLLOW_60_in_ifExpression1981); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression1985);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,61,FOLLOW_61_in_ifExpression1987); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTIfExpression(i, cond, t, e); 
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
    // OCL.g:509:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
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
            // OCL.g:510:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt31=12;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // OCL.g:511:7: t= 'true'
                    {
                    t=(Token)match(input,62,FOLLOW_62_in_literal2026); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:512:7: f= 'false'
                    {
                    f=(Token)match(input,63,FOLLOW_63_in_literal2040); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // OCL.g:513:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2053); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // OCL.g:514:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2068); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // OCL.g:515:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2082); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // OCL.g:516:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2092); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2096); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // OCL.g:517:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2108); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2110); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2114); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // OCL.g:518:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2126);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // OCL.g:519:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2138);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // OCL.g:520:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2150);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // OCL.g:521:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2162);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // OCL.g:522:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal2174);
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
    // OCL.g:530:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // OCL.g:532:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // OCL.g:533:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=64 && input.LA(1)<=67) ) {
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
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral2241); if (state.failed) return n;
            // OCL.g:537:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT||LA33_0==LPAREN||(LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==AT||(LA33_0>=INT && LA33_0<=HASH)||LA33_0==44||LA33_0==51||(LA33_0>=54 && LA33_0<=58)||(LA33_0>=62 && LA33_0<=74)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // OCL.g:538:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2258);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // OCL.g:539:7: ( COMMA ci= collectionItem )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==COMMA) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // OCL.g:539:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral2271); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral2275);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral2294); if (state.failed) return n;

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
    // OCL.g:548:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        ASTExpression e = null;


         n = new ASTCollectionItem(); 
        try {
            // OCL.g:550:1: (e= expression ( DOTDOT e= expression )? )
            // OCL.g:551:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem2323);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst(e); 
            }
            // OCL.g:552:5: ( DOTDOT e= expression )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==DOTDOT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // OCL.g:552:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem2334); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem2338);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setSecond(e); 
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
    // OCL.g:562:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // OCL.g:563:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==68) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=64 && LA35_0<=67)||LA35_0==74) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // OCL.g:564:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,68,FOLLOW_68_in_emptyCollectionLiteral2367); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral2369); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2373);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral2375); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:567:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral2391);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral2393); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral2395); if (state.failed) return n;
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
    // OCL.g:578:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // OCL.g:579:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt36=1;
                }
                break;
            case 70:
                {
                alt36=2;
                }
                break;
            case 71:
                {
                int LA36_3 = input.LA(2);

                if ( (LA36_3==LPAREN) ) {
                    alt36=3;
                }
                else if ( (LA36_3==EOF||LA36_3==EQUAL||(LA36_3>=COMMA && LA36_3<=DOT)||LA36_3==BAR||LA36_3==RBRACK||(LA36_3>=RBRACE && LA36_3<=DOTDOT)||(LA36_3>=45 && LA36_3<=50)||(LA36_3>=59 && LA36_3<=61)) ) {
                    alt36=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // OCL.g:580:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,69,FOLLOW_69_in_undefinedLiteral2425); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2427); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral2431);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2433); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:583:5: 'Undefined'
                    {
                    match(input,70,FOLLOW_70_in_undefinedLiteral2447); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // OCL.g:586:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,71,FOLLOW_71_in_undefinedLiteral2461); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral2463); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral2467);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral2469); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // OCL.g:589:5: 'null'
                    {
                    match(input,71,FOLLOW_71_in_undefinedLiteral2483); if (state.failed) return n;
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
    // OCL.g:599:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // OCL.g:601:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // OCL.g:602:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,72,FOLLOW_72_in_tupleLiteral2522); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral2528); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral2536);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // OCL.g:605:5: ( COMMA ti= tupleItem )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // OCL.g:605:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral2547); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral2551);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral2562); if (state.failed) return n;
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
    // OCL.g:613:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        ASTExpression e = null;


        try {
            // OCL.g:614:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // OCL.g:615:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem2593); if (state.failed) return n;
            // OCL.g:616:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred1_OCL()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==EQUAL) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // OCL.g:619:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem2632); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem2636);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem2638); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem2642);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, e); 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:622:7: ( COLON | EQUAL ) e= expression
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

                    pushFollow(FOLLOW_expression_in_tupleItem2674);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, e); 
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
    // OCL.g:631:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // OCL.g:632:1: ( 'Date' LBRACE v= STRING RBRACE )
            // OCL.g:633:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,73,FOLLOW_73_in_dateLiteral2719); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral2721); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral2725); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral2727); if (state.failed) return n;
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
    // OCL.g:643:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // OCL.g:645:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // OCL.g:646:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // OCL.g:647:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt39=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
            case 74:
                {
                alt39=2;
                }
                break;
            case 72:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // OCL.g:648:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type2777);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // OCL.g:649:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type2789);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // OCL.g:650:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type2801);
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
    // OCL.g:655:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // OCL.g:656:1: (nT= type EOF )
            // OCL.g:657:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly2833);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly2835); if (state.failed) return n;
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
    // OCL.g:667:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // OCL.g:668:1: (name= IDENT )
            // OCL.g:669:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType2863); if (state.failed) return n;
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
    // OCL.g:677:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // OCL.g:679:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // OCL.g:680:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=64 && input.LA(1)<=67)||input.LA(1)==74 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType2928); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType2932);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType2934); if (state.failed) return n;
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
    // OCL.g:690:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // OCL.g:692:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // OCL.g:693:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,72,FOLLOW_72_in_tupleType2968); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType2970); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType2979);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // OCL.g:695:5: ( COMMA tp= tuplePart )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // OCL.g:695:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType2990); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType2994);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3006); if (state.failed) return n;
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
    // OCL.g:704:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // OCL.g:705:1: (name= IDENT COLON t= type )
            // OCL.g:706:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3038); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart3040); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart3044);
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

    // $ANTLR start synpred1_OCL
    public final void synpred1_OCL_fragment() throws RecognitionException {   
        // OCL.g:619:7: ( COLON type EQUAL )
        // OCL.g:619:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_OCL2623); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_OCL2625);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_OCL2627); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_OCL

    // Delegated rules

    public final boolean synpred1_OCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_OCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\7\uffff\1\7\5\uffff";
    static final String DFA31_maxS =
        "\1\112\7\uffff\1\36\5\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\7\25\uffff\1\3\1\4\1\5\1\6\40\uffff\1\1\1\2\4\10\1\11\3\12"+
            "\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\26\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "509:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_expression_in_expressionOnly69 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_expression119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_expression123 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_COLON_in_expression127 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_expression131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_expression136 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_expression140 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_expression142 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList200 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList217 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_paramList229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList233 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_paramList253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList282 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMMA_in_idList292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_idList296 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration327 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration329 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_variableDeclaration333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression369 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_conditionalImpliesExpression382 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression386 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression431 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_conditionalOrExpression444 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression448 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression492 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_conditionalXOrExpression505 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression509 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression553 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_conditionalAndExpression566 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression570 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression618 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_set_in_equalityExpression637 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression647 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression696 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_set_in_relationalExpression714 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression732 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression782 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_set_in_additiveExpression800 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression810 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression860 = new BitSet(new long[]{0x0004000000060002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression878 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression892 = new BitSet(new long[]{0x0004000000060002L});
    public static final BitSet FOLLOW_set_in_unaryExpression954 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1031 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1049 = new BitSet(new long[]{0x03C0000000000010L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1055 = new BitSet(new long[]{0x03C0000000000010L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1066 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1143 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_primaryExpression1147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1173 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1175 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primaryExpression1177 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1183 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression1204 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_primaryExpression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_objectReference1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression1380 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression1387 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression1398 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression1402 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_queryExpression1413 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_iterateExpression1451 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression1457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression1465 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression1475 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression1477 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_iterateExpression1485 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression1535 = new BitSet(new long[]{0x0000000001200082L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression1557 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1570 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression1583 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1587 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression1599 = new BitSet(new long[]{0x0000000001200082L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression1616 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1631 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression1646 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1650 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression1664 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_AT_in_operationExpression1689 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_operationExpression1691 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression1711 = new BitSet(new long[]{0xC7C810003C218290L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1732 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression1744 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_operationExpression1748 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression1817 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression1833 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_typeExpression1837 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_elemVarsDeclaration1878 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration1886 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization1925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization1927 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_variableInitialization1931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization1933 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_variableInitialization1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ifExpression1969 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression1973 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifExpression1975 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression1979 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifExpression1981 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_ifExpression1985 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_literal2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_literal2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2108 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral2212 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral2241 = new BitSet(new long[]{0xC7C81000BC218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2258 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral2271 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral2275 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem2323 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem2334 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_collectionItem2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_emptyCollectionLiteral2367 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral2369 = new BitSet(new long[]{0x0000000000000000L,0x000000000000040FL});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2373 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral2391 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral2393 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_undefinedLiteral2425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2427 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_undefinedLiteral2431 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_undefinedLiteral2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_undefinedLiteral2461 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral2463 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_undefinedLiteral2467 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_undefinedLiteral2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_tupleLiteral2522 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral2528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2536 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral2547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral2551 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem2593 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_COLON_in_tupleItem2632 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_tupleItem2636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem2638 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_tupleItem2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem2664 = new BitSet(new long[]{0xC7C810003C218090L,0x00000000000007FFL});
    public static final BitSet FOLLOW_expression_in_tupleItem2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_dateLiteral2719 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral2721 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral2725 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly2833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType2901 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType2928 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_collectionType2932 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_tupleType2968 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType2970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType2979 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_tupleType2990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType2994 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3040 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_tuplePart3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_OCL2623 = new BitSet(new long[]{0x0000000000000010L,0x000000000000050FL});
    public static final BitSet FOLLOW_type_in_synpred1_OCL2625 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_OCL2627 = new BitSet(new long[]{0x0000000000000002L});

}