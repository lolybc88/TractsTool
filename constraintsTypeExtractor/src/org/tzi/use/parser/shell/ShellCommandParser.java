// $ANTLR 3.3 Nov 30, 2010 12:45:30 ShellCommand.g 2011-09-27 13:30:34

/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 University of Bremen
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
 
 
package org.tzi.use.parser.shell;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class ShellCommandParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMI", "COLON", "COLON_EQUAL", "IDENT", "LPAREN", "RPAREN", "EQUAL", "COMMA", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "ARROW", "DOT", "AT", "BAR", "LBRACK", "RBRACK", "INT", "REAL", "STRING", "HASH", "LBRACE", "RBRACE", "DOTDOT", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "COLON_COLON", "RANGE_OR_INT", "ESC", "NON_OCL_STRING", "HEX_DIGIT", "VOCAB", "'set'", "'create'", "'assign'", "'between'", "'let'", "'openter'", "'opexit'", "'execute'", "'in'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'pre'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'", "'new'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'end'", "'for'", "'do'", "'while'"
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
    public static final int SEMI=4;
    public static final int COLON=5;
    public static final int COLON_EQUAL=6;
    public static final int IDENT=7;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int EQUAL=10;
    public static final int COMMA=11;
    public static final int NOT_EQUAL=12;
    public static final int LESS=13;
    public static final int GREATER=14;
    public static final int LESS_EQUAL=15;
    public static final int GREATER_EQUAL=16;
    public static final int PLUS=17;
    public static final int MINUS=18;
    public static final int STAR=19;
    public static final int SLASH=20;
    public static final int ARROW=21;
    public static final int DOT=22;
    public static final int AT=23;
    public static final int BAR=24;
    public static final int LBRACK=25;
    public static final int RBRACK=26;
    public static final int INT=27;
    public static final int REAL=28;
    public static final int STRING=29;
    public static final int HASH=30;
    public static final int LBRACE=31;
    public static final int RBRACE=32;
    public static final int DOTDOT=33;
    public static final int NEWLINE=34;
    public static final int WS=35;
    public static final int SL_COMMENT=36;
    public static final int ML_COMMENT=37;
    public static final int COLON_COLON=38;
    public static final int RANGE_OR_INT=39;
    public static final int ESC=40;
    public static final int NON_OCL_STRING=41;
    public static final int HEX_DIGIT=42;
    public static final int VOCAB=43;

    // delegates
    // delegators


        public ShellCommandParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ShellCommandParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ShellCommandParser.tokenNames; }
    public String getGrammarFileName() { return "ShellCommand.g"; }



    // $ANTLR start "shellCommandOnly"
    // ShellCommand.g:85:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | l= legacyStat );
    public final ASTStatement shellCommandOnly() throws RecognitionException {
        ASTStatement n = null;

        ShellCommandParser.stat_return s = null;

        ShellCommandParser.legacyStat_return l = null;


        try {
            // ShellCommand.g:86:1: ( ( stat )=>s= stat | l= legacyStat )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ShellCommand.g:87:3: ( stat )=>s= stat
                    {
                    pushFollow(FOLLOW_stat_in_shellCommandOnly65);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (s!=null?s.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:90:3: l= legacyStat
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommandOnly81);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (l!=null?l.n:null); 
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
    // $ANTLR end "shellCommandOnly"


    // $ANTLR start "shellCommand"
    // ShellCommand.g:98:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF );
    public final ASTStatement shellCommand() throws RecognitionException {
        ASTStatement n = null;

        ShellCommandParser.legacyStat_return l = null;

        ShellCommandParser.stat_return s = null;


        try {
            // ShellCommand.g:99:1: ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ShellCommand.g:100:3: ( legacyStat )=>l= legacyStat EOF
                    {
                    pushFollow(FOLLOW_legacyStat_in_shellCommand113);
                    l=legacyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EOF,FOLLOW_EOF_in_shellCommand115); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (l!=null?l.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:103:3: s= stat EOF
                    {
                    pushFollow(FOLLOW_stat_in_shellCommand131);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EOF,FOLLOW_EOF_in_shellCommand133); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (s!=null?s.n:null); 
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
    // $ANTLR end "shellCommand"

    public static class legacyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyStat"
    // ShellCommand.g:113:1: legacyStat returns [ASTStatement n] : (loe= legacyOpEnter | lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* );
    public final ShellCommandParser.legacyStat_return legacyStat() throws RecognitionException {
        ShellCommandParser.legacyStat_return retval = new ShellCommandParser.legacyStat_return();
        retval.start = input.LT(1);

        ASTEnterOperationStatement loe = null;

        ASTStatement lox = null;



          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:117:1: (loe= legacyOpEnter | lox= legacyOpExit | nextLegacyStat[seq] ( nextLegacyStat[seq] )* )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case 50:
                {
                alt4=2;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 48:
            case 51:
            case 83:
            case 84:
            case 86:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ShellCommand.g:118:3: loe= legacyOpEnter
                    {
                    pushFollow(FOLLOW_legacyOpEnter_in_legacyStat167);
                    loe=legacyOpEnter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          retval.n = loe;
                          if (retval.n != null) {
                            retval.n.setSourcePosition(((Token)retval.start));
                          }
                        
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:126:3: lox= legacyOpExit
                    {
                    pushFollow(FOLLOW_legacyOpExit_in_legacyStat183);
                    lox=legacyOpExit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       
                          retval.n = lox; 
                          if (retval.n != null) {
                            retval.n.setSourcePosition(((Token)retval.start));
                          }
                        
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:134:3: nextLegacyStat[seq] ( nextLegacyStat[seq] )*
                    {
                    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat196);
                    nextLegacyStat(seq);

                    state._fsp--;
                    if (state.failed) return retval;
                    // ShellCommand.g:135:3: ( nextLegacyStat[seq] )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=44 && LA3_0<=46)||LA3_0==48||LA3_0==51||(LA3_0>=83 && LA3_0<=84)||LA3_0==86) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ShellCommand.g:136:5: nextLegacyStat[seq]
                    	    {
                    	    pushFollow(FOLLOW_nextLegacyStat_in_legacyStat207);
                    	    nextLegacyStat(seq);

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                          retval.n = seq.simplify();
                          retval.n.setSourcePosition(((Token)retval.start));
                        
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
    // $ANTLR end "legacyStat"

    public static class nextLegacyStat_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nextLegacyStat"
    // ShellCommand.g:149:1: nextLegacyStat[ASTSequenceStatement seq] : s= singleLegacyStat ( SEMI )? ;
    public final ShellCommandParser.nextLegacyStat_return nextLegacyStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextLegacyStat_return retval = new ShellCommandParser.nextLegacyStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // ShellCommand.g:150:1: (s= singleLegacyStat ( SEMI )? )
            // ShellCommand.g:151:3: s= singleLegacyStat ( SEMI )?
            {
            pushFollow(FOLLOW_singleLegacyStat_in_nextLegacyStat241);
            s=singleLegacyStat();

            state._fsp--;
            if (state.failed) return retval;
            // ShellCommand.g:152:3: ( SEMI )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEMI) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ShellCommand.g:152:3: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_nextLegacyStat245); if (state.failed) return retval;

                    }
                    break;

            }

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
    // $ANTLR end "nextLegacyStat"


    // $ANTLR start "singleLegacyStat"
    // ShellCommand.g:165:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat );
    public final ASTStatement singleLegacyStat() throws RecognitionException {
        ASTStatement n = null;

        ShellCommandParser.legacyCreate_return lcr = null;

        ShellCommandParser.legacyCreateAssign_return lca = null;

        ShellCommandParser.legacyCreateInsert_return lci = null;

        ASTVariableAssignmentStatement llt = null;

        ASTStatement lex = null;

        ShellCommandParser.objDestroyStat_return ods = null;

        ShellCommandParser.expression_return e = null;

        ASTAttributeAssignmentStatement aas = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;


        try {
            // ShellCommand.g:166:1: (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat )
            int alt6=9;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ShellCommand.g:167:5: lcr= legacyCreate
                    {
                    pushFollow(FOLLOW_legacyCreate_in_singleLegacyStat278);
                    lcr=legacyCreate();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lcr!=null?lcr.n:null); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:168:5: lca= legacyCreateAssign
                    {
                    pushFollow(FOLLOW_legacyCreateAssign_in_singleLegacyStat297);
                    lca=legacyCreateAssign();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lca!=null?lca.n:null); 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:169:5: lci= legacyCreateInsert
                    {
                    pushFollow(FOLLOW_legacyCreateInsert_in_singleLegacyStat310);
                    lci=legacyCreateInsert();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (lci!=null?lci.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:170:5: llt= legacyLet
                    {
                    pushFollow(FOLLOW_legacyLet_in_singleLegacyStat323);
                    llt=legacyLet();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = llt; 
                    }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:173:5: lex= legacyExecute
                    {
                    pushFollow(FOLLOW_legacyExecute_in_singleLegacyStat351);
                    lex=legacyExecute();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lex; 
                    }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:174:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleLegacyStat369);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:175:5: 'set' e= expression aas= attAssignStat[$e.n]
                    {
                    match(input,44,FOLLOW_44_in_singleLegacyStat382); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_singleLegacyStat386);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    pushFollow(FOLLOW_attAssignStat_in_singleLegacyStat392);
                    aas=attAssignStat((e!=null?e.n:null));

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = aas; 
                    }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleLegacyStat405);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleLegacyStat426);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
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
    // $ANTLR end "singleLegacyStat"

    public static class legacyCreate_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyCreate"
    // ShellCommand.g:190:1: legacyCreate returns [ASTStatement n] : 'create' objNames= identListMin1 COLON objType= simpleType ;
    public final ShellCommandParser.legacyCreate_return legacyCreate() throws RecognitionException {
        ShellCommandParser.legacyCreate_return retval = new ShellCommandParser.legacyCreate_return();
        retval.start = input.LT(1);

        List<String> objNames = null;

        ASTSimpleType objType = null;


        try {
            // ShellCommand.g:191:1: ( 'create' objNames= identListMin1 COLON objType= simpleType )
            // ShellCommand.g:192:3: 'create' objNames= identListMin1 COLON objType= simpleType
            {
            match(input,45,FOLLOW_45_in_legacyCreate462); if (state.failed) return retval;
            pushFollow(FOLLOW_identListMin1_in_legacyCreate470);
            objNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;
            match(input,COLON,FOLLOW_COLON_in_legacyCreate474); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreate482);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               
                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (String objName : objNames) {
                    seq.addStatement(
                      new ASTNewObjectStatement(
                        objType, 
                        new ASTStringLiteral(objName)), 
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
    // $ANTLR end "legacyCreate"

    public static class legacyCreateAssign_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };

    // $ANTLR start "legacyCreateAssign"
    // ShellCommand.g:224:1: legacyCreateAssign returns [ASTStatement n] : 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType ;
    public final ShellCommandParser.legacyCreateAssign_return legacyCreateAssign() throws RecognitionException {
        ShellCommandParser.legacyCreateAssign_return retval = new ShellCommandParser.legacyCreateAssign_return();
        retval.start = input.LT(1);

        List<String> varNames = null;

        ASTSimpleType objType = null;


        try {
            // ShellCommand.g:225:1: ( 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType )
            // ShellCommand.g:226:3: 'assign' varNames= identListMin1 COLON_EQUAL 'create' objType= simpleType
            {
            match(input,46,FOLLOW_46_in_legacyCreateAssign519); if (state.failed) return retval;
            pushFollow(FOLLOW_identListMin1_in_legacyCreateAssign527);
            varNames=identListMin1();

            state._fsp--;
            if (state.failed) return retval;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_legacyCreateAssign531); if (state.failed) return retval;
            match(input,45,FOLLOW_45_in_legacyCreateAssign535); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreateAssign543);
            objType=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTSequenceStatement seq = new ASTSequenceStatement();
                  
                  for (String varName : varNames) {
                    seq.addStatement(
                      new ASTVariableAssignmentStatement(
                        varName, 
                        new ASTRValueNewObject(objType)),
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
    // $ANTLR end "legacyCreateAssign"

    public static class legacyCreateInsert_return extends ParserRuleReturnScope {
        public ASTVariableAssignmentStatement n;
    };

    // $ANTLR start "legacyCreateInsert"
    // ShellCommand.g:260:1: legacyCreateInsert returns [ASTVariableAssignmentStatement n] : 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN ;
    public final ShellCommandParser.legacyCreateInsert_return legacyCreateInsert() throws RecognitionException {
        ShellCommandParser.legacyCreateInsert_return retval = new ShellCommandParser.legacyCreateInsert_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTSimpleType asClassName = null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return participants = null;


        try {
            // ShellCommand.g:261:1: ( 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN )
            // ShellCommand.g:262:3: 'create' name= IDENT COLON asClassName= simpleType 'between' LPAREN participants= rValListMin2WithOptionalQualifiers RPAREN
            {
            match(input,45,FOLLOW_45_in_legacyCreateInsert577); if (state.failed) return retval;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyCreateInsert585); if (state.failed) return retval;
            match(input,COLON,FOLLOW_COLON_in_legacyCreateInsert589); if (state.failed) return retval;
            pushFollow(FOLLOW_simpleType_in_legacyCreateInsert597);
            asClassName=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            match(input,47,FOLLOW_47_in_legacyCreateInsert601); if (state.failed) return retval;
            match(input,LPAREN,FOLLOW_LPAREN_in_legacyCreateInsert605); if (state.failed) return retval;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert615);
            participants=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;
            match(input,RPAREN,FOLLOW_RPAREN_in_legacyCreateInsert619); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                  ASTNewLinkObjectStatement nlo = 
                    new ASTNewLinkObjectStatement(
                      asClassName, 
                      (participants!=null?participants.participans:null),
                      (participants!=null?participants.qualifiers:null),
                      new ASTStringLiteral(name));
                      
                  nlo.setSourcePosition(((Token)retval.start));
                
                  retval.n = new ASTVariableAssignmentStatement(
                    (name!=null?name.getText():null),
                    new ASTRValueNewLinkObject(nlo));
                
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
    // $ANTLR end "legacyCreateInsert"


    // $ANTLR start "legacyLet"
    // ShellCommand.g:298:1: legacyLet returns [ASTVariableAssignmentStatement n] : 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression ;
    public final ASTVariableAssignmentStatement legacyLet() throws RecognitionException {
        ASTVariableAssignmentStatement n = null;

        Token varName=null;
        ASTType varType = null;

        ASTExpression e = null;


        try {
            // ShellCommand.g:299:1: ( 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression )
            // ShellCommand.g:300:3: 'let' varName= IDENT ( COLON varType= type )? EQUAL e= inSoilExpression
            {
            match(input,48,FOLLOW_48_in_legacyLet652); if (state.failed) return n;
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyLet660); if (state.failed) return n;
            // ShellCommand.g:302:3: ( COLON varType= type )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ShellCommand.g:303:5: COLON varType= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_legacyLet670); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_legacyLet680);
                    varType=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            match(input,EQUAL,FOLLOW_EQUAL_in_legacyLet689); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_legacyLet697);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTVariableAssignmentStatement((varName!=null?varName.getText():null), e, varType); 
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
    // $ANTLR end "legacyLet"


    // $ANTLR start "legacyOpEnter"
    // ShellCommand.g:324:1: legacyOpEnter returns [ASTEnterOperationStatement n] : 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN ;
    public final ASTEnterOperationStatement legacyOpEnter() throws RecognitionException {
        ASTEnterOperationStatement n = null;

        Token op=null;
        ASTExpression obj = null;

        List<ASTExpression> args = null;


        try {
            // ShellCommand.g:325:1: ( 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN )
            // ShellCommand.g:326:3: 'openter' obj= inSoilExpression op= IDENT LPAREN args= exprList RPAREN
            {
            match(input,49,FOLLOW_49_in_legacyOpEnter730); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_legacyOpEnter738);
            obj=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_legacyOpEnter746); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_legacyOpEnter750); if (state.failed) return n;
            pushFollow(FOLLOW_exprList_in_legacyOpEnter760);
            args=exprList();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_legacyOpEnter764); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTEnterOperationStatement(obj, (op!=null?op.getText():null), args); 
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
    // $ANTLR end "legacyOpEnter"


    // $ANTLR start "legacyOpExit"
    // ShellCommand.g:349:1: legacyOpExit returns [ASTStatement n] : 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) ;
    public final ASTStatement legacyOpExit() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression retVal = null;


        try {
            // ShellCommand.g:350:1: ( 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing ) )
            // ShellCommand.g:351:3: 'opexit' ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            {
            match(input,50,FOLLOW_50_in_legacyOpExit799); if (state.failed) return n;
            // ShellCommand.g:351:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ShellCommand.g:351:13: ( inSoilExpression )=>retVal= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_legacyOpExit811);
                    retVal=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // ShellCommand.g:351:62: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_legacyOpExit815);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTExitOperationStatement(retVal); 
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
    // $ANTLR end "legacyOpExit"


    // $ANTLR start "legacyExecute"
    // ShellCommand.g:366:1: legacyExecute returns [ASTStatement n] : 'execute' expression ;
    public final ASTStatement legacyExecute() throws RecognitionException {
        ASTStatement n = null;

        try {
            // ShellCommand.g:367:1: ( 'execute' expression )
            // ShellCommand.g:368:3: 'execute' expression
            {
            match(input,51,FOLLOW_51_in_legacyExecute848); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_legacyExecute852);
            expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               
                  reportWarning("the execute command is not supported in this version"); 
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
    // $ANTLR end "legacyExecute"


    // $ANTLR start "expressionOnly"
    // ShellCommand.g:406:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        ShellCommandParser.expression_return nExp = null;


        try {
            // ShellCommand.g:407:1: (nExp= expression EOF )
            // ShellCommand.g:408:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly890);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly892); if (state.failed) return n;
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
    // ShellCommand.g:415:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final ShellCommandParser.expression_return expression() throws RecognitionException {
        ShellCommandParser.expression_return retval = new ShellCommandParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        ShellCommandParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // ShellCommand.g:421:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // ShellCommand.g:422:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // ShellCommand.g:423:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ShellCommand.g:424:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,48,FOLLOW_48_in_expression940); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression944); if (state.failed) return retval;
            	    // ShellCommand.g:424:24: ( COLON t= type )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COLON) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ShellCommand.g:424:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression948); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression952);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression957); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression961);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,52,FOLLOW_52_in_expression963); if (state.failed) return retval;
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
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression988);
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
    // ShellCommand.g:452:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // ShellCommand.g:454:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // ShellCommand.g:455:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1021); if (state.failed) return paramList;
            // ShellCommand.g:456:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ShellCommand.g:457:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1038);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // ShellCommand.g:458:7: ( COMMA v= variableDeclaration )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ShellCommand.g:458:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1050); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1054);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1074); if (state.failed) return paramList;

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
    // ShellCommand.g:466:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // ShellCommand.g:468:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // ShellCommand.g:469:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1103); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // ShellCommand.g:470:5: ( COMMA idn= IDENT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ShellCommand.g:470:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList1113); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList1117); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
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
        return idList;
    }
    // $ANTLR end "idList"


    // $ANTLR start "variableDeclaration"
    // ShellCommand.g:478:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // ShellCommand.g:479:1: (name= IDENT COLON t= type )
            // ShellCommand.g:480:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration1148); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration1150); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration1154);
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
    // ShellCommand.g:488:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // ShellCommand.g:489:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // ShellCommand.g:490:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1190);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // ShellCommand.g:491:5: (op= 'implies' n1= conditionalOrExpression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==53) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ShellCommand.g:491:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,53,FOLLOW_53_in_conditionalImpliesExpression1203); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1207);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ShellCommand.g:500:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // ShellCommand.g:501:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // ShellCommand.g:502:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1252);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // ShellCommand.g:503:5: (op= 'or' n1= conditionalXOrExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==54) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ShellCommand.g:503:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,54,FOLLOW_54_in_conditionalOrExpression1265); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1269);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ShellCommand.g:512:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // ShellCommand.g:513:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // ShellCommand.g:514:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1313);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // ShellCommand.g:515:5: (op= 'xor' n1= conditionalAndExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ShellCommand.g:515:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,55,FOLLOW_55_in_conditionalXOrExpression1326); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1330);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "conditionalXOrExpression"


    // $ANTLR start "conditionalAndExpression"
    // ShellCommand.g:524:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // ShellCommand.g:525:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // ShellCommand.g:526:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1374);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // ShellCommand.g:527:5: (op= 'and' n1= equalityExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ShellCommand.g:527:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,56,FOLLOW_56_in_conditionalAndExpression1387); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression1391);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ShellCommand.g:536:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // ShellCommand.g:538:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // ShellCommand.g:539:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1439);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // ShellCommand.g:540:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EQUAL||LA18_0==NOT_EQUAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ShellCommand.g:540:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression1468);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ShellCommand.g:550:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // ShellCommand.g:552:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // ShellCommand.g:553:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1517);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // ShellCommand.g:554:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=LESS && LA19_0<=GREATER_EQUAL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ShellCommand.g:554:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1553);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ShellCommand.g:564:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // ShellCommand.g:566:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // ShellCommand.g:567:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1603);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // ShellCommand.g:568:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=PLUS && LA20_0<=MINUS)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ShellCommand.g:568:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1631);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ShellCommand.g:579:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // ShellCommand.g:581:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // ShellCommand.g:582:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1681);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // ShellCommand.g:583:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=STAR && LA21_0<=SLASH)||LA21_0==57) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ShellCommand.g:583:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==57 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1713);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ShellCommand.g:595:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // ShellCommand.g:597:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=PLUS && LA22_0<=MINUS)||LA22_0==58) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=IDENT && LA22_0<=LPAREN)||LA22_0==AT||(LA22_0>=INT && LA22_0<=HASH)||(LA22_0>=61 && LA22_0<=65)||(LA22_0>=69 && LA22_0<=81)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ShellCommand.g:598:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // ShellCommand.g:598:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // ShellCommand.g:598:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==58 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1799);
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
                    // ShellCommand.g:602:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1819);
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
    // ShellCommand.g:610:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // ShellCommand.g:612:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // ShellCommand.g:613:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression1852);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // ShellCommand.g:614:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==IDENT) ) {
                        int LA24_4 = input.LA(3);

                        if ( (LA24_4==EOF||LA24_4==SEMI||(LA24_4>=IDENT && LA24_4<=RBRACK)||(LA24_4>=LBRACE && LA24_4<=DOTDOT)||(LA24_4>=44 && LA24_4<=46)||LA24_4==48||(LA24_4>=51 && LA24_4<=57)||(LA24_4>=66 && LA24_4<=68)||(LA24_4>=83 && LA24_4<=84)||LA24_4==86||LA24_4==88||LA24_4==90) ) {
                            alt24=1;
                        }


                    }
                    else if ( ((LA24_2>=61 && LA24_2<=64)) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==ARROW) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ShellCommand.g:615:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // ShellCommand.g:615:6: ( ARROW | DOT )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==ARROW) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==DOT) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ShellCommand.g:615:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression1870); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ShellCommand.g:615:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression1876); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression1887);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ShellCommand.g:631:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        ShellCommandParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // ShellCommand.g:632:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt27=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt27=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt27=1;
                    }
                    break;
                case EOF:
                case SEMI:
                case IDENT:
                case LPAREN:
                case RPAREN:
                case EQUAL:
                case COMMA:
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
                case LBRACE:
                case RBRACE:
                case DOTDOT:
                case 44:
                case 45:
                case 46:
                case 48:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 66:
                case 67:
                case 68:
                case 83:
                case 84:
                case 86:
                case 88:
                case 90:
                    {
                    alt27=3;
                    }
                    break;
                case DOT:
                    {
                    int LA27_7 = input.LA(3);

                    if ( (LA27_7==59) ) {
                        alt27=6;
                    }
                    else if ( (LA27_7==IDENT||(LA27_7>=61 && LA27_7<=64)) ) {
                        alt27=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt27=2;
                }
                break;
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt27=3;
                }
                break;
            case LPAREN:
                {
                alt27=4;
                }
                break;
            case 65:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ShellCommand.g:633:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1927);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:634:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression1941);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:635:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression1953);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:636:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1964); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression1968);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1970); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:637:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression1982);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:638:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1994); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1996); if (state.failed) return n;
                    match(input,59,FOLLOW_59_in_primaryExpression1998); if (state.failed) return n;
                    // ShellCommand.g:638:36: ( LPAREN RPAREN )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==LPAREN) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ShellCommand.g:638:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2002); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2004); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // ShellCommand.g:640:7: ( AT 'pre' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==AT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ShellCommand.g:640:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2025); if (state.failed) return n;
                            match(input,60,FOLLOW_60_in_primaryExpression2027); if (state.failed) return n;
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
    // ShellCommand.g:644:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // ShellCommand.g:645:1: ( AT objectName= IDENT )
            // ShellCommand.g:646:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2054); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2062); if (state.failed) return n;
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
    // ShellCommand.g:660:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        ShellCommandParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // ShellCommand.g:661:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt28=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA28_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt28=2;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ShellCommand.g:665:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall2127);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:668:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall2140);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:669:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall2153);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:670:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall2166);
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
    // ShellCommand.g:679:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        ShellCommandParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // ShellCommand.g:680:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // ShellCommand.g:681:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression2201); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression2208); if (state.failed) return n;
            // ShellCommand.g:683:5: (decls= elemVarsDeclaration BAR )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==COLON||LA29_1==COMMA||LA29_1==BAR) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ShellCommand.g:683:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression2219);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression2223); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression2234);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression2240); if (state.failed) return n;
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
    // ShellCommand.g:697:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        ShellCommandParser.expression_return nExp = null;


        try {
            // ShellCommand.g:697:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // ShellCommand.g:698:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,61,FOLLOW_61_in_iterateExpression2272); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression2278); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression2286);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression2288); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression2296);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression2298); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression2306);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression2312); if (state.failed) return n;
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
    // ShellCommand.g:719:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final ShellCommandParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ShellCommandParser.operationExpression_return retval = new ShellCommandParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        ShellCommandParser.expression_return rolename = null;

        ShellCommandParser.expression_return e = null;


        try {
            // ShellCommand.g:721:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // ShellCommand.g:722:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression2356); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // ShellCommand.g:728:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LBRACK) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ShellCommand.g:728:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2378); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression2391);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // ShellCommand.g:730:9: ( COMMA rolename= expression )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==COMMA) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ShellCommand.g:730:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2404); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression2408);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2420); if (state.failed) return retval;
                    // ShellCommand.g:733:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==LBRACK) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ShellCommand.g:733:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression2437); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression2452);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // ShellCommand.g:735:11: ( COMMA rolename= expression )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==COMMA) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ShellCommand.g:735:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2467); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression2471);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression2485); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // ShellCommand.g:740:5: ( AT 'pre' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==AT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ShellCommand.g:740:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression2510); if (state.failed) return retval;
                    match(input,60,FOLLOW_60_in_operationExpression2512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // ShellCommand.g:741:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LPAREN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ShellCommand.g:742:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression2532); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // ShellCommand.g:743:7: (e= expression ( COMMA e= expression )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=IDENT && LA36_0<=LPAREN)||(LA36_0>=PLUS && LA36_0<=MINUS)||LA36_0==AT||(LA36_0>=INT && LA36_0<=HASH)||LA36_0==48||LA36_0==58||(LA36_0>=61 && LA36_0<=65)||(LA36_0>=69 && LA36_0<=81)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ShellCommand.g:744:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression2553);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // ShellCommand.g:745:7: ( COMMA e= expression )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==COMMA) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ShellCommand.g:745:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression2565); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression2569);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
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

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression2589); if (state.failed) return retval;

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
    // ShellCommand.g:758:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // ShellCommand.g:761:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // ShellCommand.g:762:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=62 && input.LA(1)<=64) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression2654); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression2658);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression2660); if (state.failed) return n;
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
    // ShellCommand.g:773:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : idListRes= idList ( COLON t= type )? ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        List idListRes = null;

        ASTType t = null;


         List idList; 
        try {
            // ShellCommand.g:775:1: (idListRes= idList ( COLON t= type )? )
            // ShellCommand.g:776:5: idListRes= idList ( COLON t= type )?
            {
            pushFollow(FOLLOW_idList_in_elemVarsDeclaration2699);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            // ShellCommand.g:777:5: ( COLON t= type )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLON) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ShellCommand.g:777:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration2707); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration2711);
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
    // ShellCommand.g:786:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        ShellCommandParser.expression_return e = null;


        try {
            // ShellCommand.g:787:1: (name= IDENT COLON t= type EQUAL e= expression )
            // ShellCommand.g:788:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization2746); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization2748); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization2752);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization2754); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization2758);
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
    // ShellCommand.g:797:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ShellCommandParser.expression_return cond = null;

        ShellCommandParser.expression_return t = null;

        ShellCommandParser.expression_return e = null;


        try {
            // ShellCommand.g:798:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // ShellCommand.g:799:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,65,FOLLOW_65_in_ifExpression2790); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2794);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,66,FOLLOW_66_in_ifExpression2796); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2800);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,67,FOLLOW_67_in_ifExpression2802); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression2806);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,68,FOLLOW_68_in_ifExpression2808); if (state.failed) return n;
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
    // ShellCommand.g:819:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
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
            // ShellCommand.g:820:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt39=12;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ShellCommand.g:821:7: t= 'true'
                    {
                    t=(Token)match(input,69,FOLLOW_69_in_literal2847); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:822:7: f= 'false'
                    {
                    f=(Token)match(input,70,FOLLOW_70_in_literal2861); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:823:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal2874); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:824:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal2889); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:825:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal2903); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:826:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal2913); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2917); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:827:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2929); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal2931); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal2935); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:828:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal2947);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:829:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal2959);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:830:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal2971);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // ShellCommand.g:831:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal2983);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // ShellCommand.g:832:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal2995);
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
    // ShellCommand.g:840:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // ShellCommand.g:842:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // ShellCommand.g:843:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=71 && input.LA(1)<=74) ) {
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
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3062); if (state.failed) return n;
            // ShellCommand.g:847:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=IDENT && LA41_0<=LPAREN)||(LA41_0>=PLUS && LA41_0<=MINUS)||LA41_0==AT||(LA41_0>=INT && LA41_0<=HASH)||LA41_0==48||LA41_0==58||(LA41_0>=61 && LA41_0<=65)||(LA41_0>=69 && LA41_0<=81)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ShellCommand.g:848:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3079);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // ShellCommand.g:849:7: ( COMMA ci= collectionItem )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==COMMA) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ShellCommand.g:849:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral3092); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3096);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral3115); if (state.failed) return n;

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
    // ShellCommand.g:858:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        ShellCommandParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // ShellCommand.g:860:1: (e= expression ( DOTDOT e= expression )? )
            // ShellCommand.g:861:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem3144);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // ShellCommand.g:862:5: ( DOTDOT e= expression )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DOTDOT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ShellCommand.g:862:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem3155); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem3159);
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
    // ShellCommand.g:872:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // ShellCommand.g:873:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==75) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=71 && LA43_0<=74)||LA43_0==81) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ShellCommand.g:874:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,75,FOLLOW_75_in_emptyCollectionLiteral3188); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral3190); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3194);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral3196); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:877:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral3212);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral3214); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral3216); if (state.failed) return n;
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
    // ShellCommand.g:888:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // ShellCommand.g:889:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt44=1;
                }
                break;
            case 77:
                {
                alt44=2;
                }
                break;
            case 78:
                {
                int LA44_3 = input.LA(2);

                if ( (LA44_3==LPAREN) ) {
                    alt44=3;
                }
                else if ( (LA44_3==EOF||LA44_3==SEMI||LA44_3==IDENT||(LA44_3>=RPAREN && LA44_3<=DOT)||LA44_3==BAR||LA44_3==RBRACK||(LA44_3>=LBRACE && LA44_3<=DOTDOT)||(LA44_3>=44 && LA44_3<=46)||LA44_3==48||(LA44_3>=51 && LA44_3<=57)||(LA44_3>=66 && LA44_3<=68)||(LA44_3>=83 && LA44_3<=84)||LA44_3==86||LA44_3==88||LA44_3==90) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ShellCommand.g:890:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,76,FOLLOW_76_in_undefinedLiteral3246); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3248); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral3252);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3254); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:893:5: 'Undefined'
                    {
                    match(input,77,FOLLOW_77_in_undefinedLiteral3268); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:896:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3282); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral3284); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral3288);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral3290); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:899:5: 'null'
                    {
                    match(input,78,FOLLOW_78_in_undefinedLiteral3304); if (state.failed) return n;
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
    // ShellCommand.g:909:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // ShellCommand.g:911:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // ShellCommand.g:912:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,79,FOLLOW_79_in_tupleLiteral3343); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral3349); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral3357);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // ShellCommand.g:915:5: ( COMMA ti= tupleItem )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ShellCommand.g:915:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral3368); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral3372);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral3383); if (state.failed) return n;
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
    // ShellCommand.g:923:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        ShellCommandParser.expression_return e = null;


        try {
            // ShellCommand.g:924:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // ShellCommand.g:925:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem3414); if (state.failed) return n;
            // ShellCommand.g:926:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==COLON) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred4_ShellCommand()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA46_0==EQUAL) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ShellCommand.g:929:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem3453); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem3457);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem3459); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem3463);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:932:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_tupleItem3495);
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
    // ShellCommand.g:941:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // ShellCommand.g:942:1: ( 'Date' LBRACE v= STRING RBRACE )
            // ShellCommand.g:943:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,80,FOLLOW_80_in_dateLiteral3540); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral3542); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral3546); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral3548); if (state.failed) return n;
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
    // ShellCommand.g:953:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // ShellCommand.g:955:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // ShellCommand.g:956:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // ShellCommand.g:957:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt47=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt47=1;
                }
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 81:
                {
                alt47=2;
                }
                break;
            case 79:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ShellCommand.g:958:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type3598);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:959:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type3610);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:960:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type3622);
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
    // ShellCommand.g:965:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // ShellCommand.g:966:1: (nT= type EOF )
            // ShellCommand.g:967:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly3654);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly3656); if (state.failed) return n;
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
    // ShellCommand.g:977:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // ShellCommand.g:978:1: (name= IDENT )
            // ShellCommand.g:979:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType3684); if (state.failed) return n;
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
    // ShellCommand.g:987:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // ShellCommand.g:989:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // ShellCommand.g:990:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=71 && input.LA(1)<=74)||input.LA(1)==81 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType3749); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType3753);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType3755); if (state.failed) return n;
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
    // ShellCommand.g:1000:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // ShellCommand.g:1002:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // ShellCommand.g:1003:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,79,FOLLOW_79_in_tupleType3789); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType3791); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType3800);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // ShellCommand.g:1005:5: ( COMMA tp= tuplePart )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ShellCommand.g:1005:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType3811); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType3815);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType3827); if (state.failed) return n;
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
    // ShellCommand.g:1014:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // ShellCommand.g:1015:1: (name= IDENT COLON t= type )
            // ShellCommand.g:1016:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart3859); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart3861); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart3865);
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
    // ShellCommand.g:1055:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        ShellCommandParser.stat_return s = null;


        try {
            // ShellCommand.g:1056:1: (s= stat EOF )
            // ShellCommand.g:1057:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly3914);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly3918); if (state.failed) return n;
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
    // ShellCommand.g:1067:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final ShellCommandParser.stat_return stat() throws RecognitionException {
        ShellCommandParser.stat_return retval = new ShellCommandParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // ShellCommand.g:1071:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // ShellCommand.g:1072:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat3949);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // ShellCommand.g:1073:3: ( SEMI nextStat[seq] )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==SEMI) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ShellCommand.g:1074:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat3960); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat3966);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ShellCommand.g:1090:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final ShellCommandParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        ShellCommandParser.nextStat_return retval = new ShellCommandParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // ShellCommand.g:1091:1: (s= singleStat )
            // ShellCommand.g:1092:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat4000);
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
    // ShellCommand.g:1104:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        ShellCommandParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // ShellCommand.g:1108:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt50=10;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ShellCommand.g:1109:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat4037);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1111:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat4063);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // ShellCommand.g:1112:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat4075);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // ShellCommand.g:1113:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat4089);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // ShellCommand.g:1114:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat4103);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // ShellCommand.g:1115:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat4116);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // ShellCommand.g:1116:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat4133);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // ShellCommand.g:1117:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat4150);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // ShellCommand.g:1118:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat4167);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // ShellCommand.g:1120:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat4189);
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
    // ShellCommand.g:1127:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // ShellCommand.g:1128:1: ( nothing )
            // ShellCommand.g:1129:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat4216);
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
    // ShellCommand.g:1134:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // ShellCommand.g:1135:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // ShellCommand.g:1136:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr4242);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // ShellCommand.g:1137:3: (aas= attAssignStat[$expr.n] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DOT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ShellCommand.g:1138:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr4256);
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
    // ShellCommand.g:1150:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        ShellCommandParser.rValue_return rVal = null;


        try {
            // ShellCommand.g:1151:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // ShellCommand.g:1152:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat4294); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat4298); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat4306);
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
    // ShellCommand.g:1220:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        ShellCommandParser.rValue_return r = null;


        try {
            // ShellCommand.g:1221:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // ShellCommand.g:1222:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat4337); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat4346); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat4350); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat4358);
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
    // ShellCommand.g:1234:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // ShellCommand.g:1235:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // ShellCommand.g:1236:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,82,FOLLOW_82_in_objCreateStat4384); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat4392);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // ShellCommand.g:1238:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LPAREN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ShellCommand.g:1239:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4402); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat4414);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4420); if (state.failed) return n;

                    }
                    break;

            }

            // ShellCommand.g:1244:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ShellCommand.g:1245:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,47,FOLLOW_47_in_objCreateStat4438); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat4446); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4460);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat4468); if (state.failed) return n;
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
    // ShellCommand.g:1264:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final ShellCommandParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        ShellCommandParser.objDestroyStat_return retval = new ShellCommandParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // ShellCommand.g:1265:1: ( 'destroy' el= exprListMin1 )
            // ShellCommand.g:1266:3: 'destroy' el= exprListMin1
            {
            match(input,83,FOLLOW_83_in_objDestroyStat4504); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat4512);
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
    // ShellCommand.g:1287:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // ShellCommand.g:1288:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // ShellCommand.g:1289:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,84,FOLLOW_84_in_lnkInsStat4538); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat4542); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4552);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat4556); if (state.failed) return n;
            match(input,85,FOLLOW_85_in_lnkInsStat4560); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat4568); if (state.failed) return n;
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
    // ShellCommand.g:1299:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final ShellCommandParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return retval = new ShellCommandParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        ShellCommandParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // ShellCommand.g:1305:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // ShellCommand.g:1306:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4597);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // ShellCommand.g:1307:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LBRACE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ShellCommand.g:1308:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4608); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4617);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4624); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4640); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4651);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // ShellCommand.g:1320:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LBRACE) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ShellCommand.g:1321:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4662); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4671);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4678); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // ShellCommand.g:1330:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==COMMA) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ShellCommand.g:1331:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4700); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4715);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // ShellCommand.g:1335:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==LBRACE) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ShellCommand.g:1336:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4735); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4746);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4755); if (state.failed) return retval;

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
            	    break loop57;
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
    // ShellCommand.g:1351:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        ShellCommandParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // ShellCommand.g:1352:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // ShellCommand.g:1353:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,86,FOLLOW_86_in_lnkDelStat4796); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat4800); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4810);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat4814); if (state.failed) return n;
            match(input,87,FOLLOW_87_in_lnkDelStat4818); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat4827); if (state.failed) return n;
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
    // ShellCommand.g:1367:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        ShellCommandParser.stat_return ts = null;

        ShellCommandParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // ShellCommand.g:1371:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // ShellCommand.g:1372:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,65,FOLLOW_65_in_condExStat4858); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat4867);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,66,FOLLOW_66_in_condExStat4871); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat4880);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // ShellCommand.g:1376:3: ( 'else' es= stat )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==67) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ShellCommand.g:1377:5: 'else' es= stat
                    {
                    match(input,67,FOLLOW_67_in_condExStat4891); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat4903);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,88,FOLLOW_88_in_condExStat4914); if (state.failed) return n;
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
    // ShellCommand.g:1388:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        ShellCommandParser.stat_return s = null;


        try {
            // ShellCommand.g:1389:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // ShellCommand.g:1390:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,89,FOLLOW_89_in_iterStat4939); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat4947); if (state.failed) return n;
            match(input,52,FOLLOW_52_in_iterStat4951); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat4959);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,90,FOLLOW_90_in_iterStat4963); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat4971);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,88,FOLLOW_88_in_iterStat4975); if (state.failed) return n;
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
    // ShellCommand.g:1405:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        ShellCommandParser.stat_return s = null;


        try {
            // ShellCommand.g:1406:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // ShellCommand.g:1407:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,91,FOLLOW_91_in_whileStat5001); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat5009);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,90,FOLLOW_90_in_whileStat5013); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat5021);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,88,FOLLOW_88_in_whileStat5025); if (state.failed) return n;
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
    // ShellCommand.g:1430:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // ShellCommand.g:1431:1: ()
            // ShellCommand.g:1432:1: 
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
    // ShellCommand.g:1438:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final ShellCommandParser.rValue_return rValue() throws RecognitionException {
        ShellCommandParser.rValue_return retval = new ShellCommandParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // ShellCommand.g:1439:1: (e= inSoilExpression | oc= objCreateStat )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=IDENT && LA59_0<=LPAREN)||(LA59_0>=PLUS && LA59_0<=MINUS)||LA59_0==AT||(LA59_0>=INT && LA59_0<=HASH)||LA59_0==48||LA59_0==58||(LA59_0>=61 && LA59_0<=65)||(LA59_0>=69 && LA59_0<=81)) ) {
                alt59=1;
            }
            else if ( (LA59_0==82) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ShellCommand.g:1440:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue5078);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1441:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue5090);
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
    // ShellCommand.g:1455:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // ShellCommand.g:1456:1: ( nothing | rl= rValListMin1 )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RBRACE) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=IDENT && LA60_0<=LPAREN)||(LA60_0>=PLUS && LA60_0<=MINUS)||LA60_0==AT||(LA60_0>=INT && LA60_0<=HASH)||LA60_0==48||LA60_0==58||(LA60_0>=61 && LA60_0<=65)||(LA60_0>=69 && LA60_0<=82)) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ShellCommand.g:1457:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList5113);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1460:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList5140);
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
    // ShellCommand.g:1468:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        ShellCommandParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1472:1: (r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1473:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin15173);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // ShellCommand.g:1475:3: ( COMMA r= rValue )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ShellCommand.g:1476:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin15187); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin15197);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // ShellCommand.g:1486:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        ShellCommandParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // ShellCommand.g:1490:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // ShellCommand.g:1491:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin25236);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin25244); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin25252);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // ShellCommand.g:1496:3: ( COMMA r= rValue )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ShellCommand.g:1497:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin25266); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin25276);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ShellCommand.g:1507:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        ShellCommandParser.expression_return e = null;


        try {
            // ShellCommand.g:1508:1: (e= expression )
            // ShellCommand.g:1509:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression5310);
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
    // ShellCommand.g:1518:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // ShellCommand.g:1519:1: ( nothing | el= exprListMin1 )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RPAREN) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=IDENT && LA63_0<=LPAREN)||(LA63_0>=PLUS && LA63_0<=MINUS)||LA63_0==AT||(LA63_0>=INT && LA63_0<=HASH)||LA63_0==48||LA63_0==58||(LA63_0>=61 && LA63_0<=65)||(LA63_0>=69 && LA63_0<=81)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ShellCommand.g:1520:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList5339);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1523:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList5357);
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
    // ShellCommand.g:1531:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1535:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1536:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin15390);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // ShellCommand.g:1538:3: ( COMMA e= inSoilExpression )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ShellCommand.g:1539:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin15405); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin15415);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ShellCommand.g:1549:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // ShellCommand.g:1553:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // ShellCommand.g:1554:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25455);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin25463); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin25471);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // ShellCommand.g:1559:3: ( COMMA e= inSoilExpression )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ShellCommand.g:1560:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin25485); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin25495);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
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
        return n;
    }
    // $ANTLR end "exprListMin2"


    // $ANTLR start "identList"
    // ShellCommand.g:1570:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // ShellCommand.g:1571:1: ( nothing | il= identListMin1 )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==EOF||LA66_0==SEMI||LA66_0==RPAREN||LA66_0==RBRACE||LA66_0==67||LA66_0==88) ) {
                alt66=1;
            }
            else if ( (LA66_0==IDENT) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ShellCommand.g:1572:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList5525);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // ShellCommand.g:1575:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList5542);
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
    // ShellCommand.g:1583:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // ShellCommand.g:1587:1: (id= IDENT ( COMMA id= IDENT )* )
            // ShellCommand.g:1588:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15576); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // ShellCommand.g:1590:3: ( COMMA id= IDENT )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ShellCommand.g:1591:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin15590); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin15600); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
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
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_ShellCommand
    public final void synpred1_ShellCommand_fragment() throws RecognitionException {   
        // ShellCommand.g:87:3: ( stat )
        // ShellCommand.g:87:4: stat
        {
        pushFollow(FOLLOW_stat_in_synpred1_ShellCommand57);
        stat();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_ShellCommand

    // $ANTLR start synpred2_ShellCommand
    public final void synpred2_ShellCommand_fragment() throws RecognitionException {   
        // ShellCommand.g:100:3: ( legacyStat )
        // ShellCommand.g:100:4: legacyStat
        {
        pushFollow(FOLLOW_legacyStat_in_synpred2_ShellCommand105);
        legacyStat();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_ShellCommand

    // $ANTLR start synpred3_ShellCommand
    public final void synpred3_ShellCommand_fragment() throws RecognitionException {   
        // ShellCommand.g:351:13: ( inSoilExpression )
        // ShellCommand.g:351:14: inSoilExpression
        {
        pushFollow(FOLLOW_inSoilExpression_in_synpred3_ShellCommand803);
        inSoilExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_ShellCommand

    // $ANTLR start synpred4_ShellCommand
    public final void synpred4_ShellCommand_fragment() throws RecognitionException {   
        // ShellCommand.g:929:7: ( COLON type EQUAL )
        // ShellCommand.g:929:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred4_ShellCommand3444); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred4_ShellCommand3446);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred4_ShellCommand3448); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_ShellCommand

    // $ANTLR start synpred5_ShellCommand
    public final void synpred5_ShellCommand_fragment() throws RecognitionException {   
        // ShellCommand.g:1111:5: ( statStartingWithExpr )
        // ShellCommand.g:1111:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred5_ShellCommand4055);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_ShellCommand

    // Delegated rules

    public final boolean synpred2_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_ShellCommand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_ShellCommand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA1_eotS =
        "\45\uffff";
    static final String DFA1_eofS =
        "\1\2\44\uffff";
    static final String DFA1_minS =
        "\1\4\2\uffff\1\0\26\uffff\3\0\10\uffff";
    static final String DFA1_maxS =
        "\1\133\2\uffff\1\0\26\uffff\3\0\10\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\2\1\1\uffff\26\1\3\uffff\2\1\1\2\5\uffff";
    static final String DFA1_specialS =
        "\1\0\2\uffff\1\1\26\uffff\1\2\1\3\1\4\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\2\uffff\1\13\1\27\10\uffff\2\4\4\uffff\1\24\3\uffff\1\7"+
            "\1\10\1\11\1\12\15\uffff\3\37\1\uffff\1\3\3\37\6\uffff\1\4\2"+
            "\uffff\1\25\3\26\1\30\3\uffff\1\5\1\6\4\14\1\15\1\17\1\20\1"+
            "\21\1\22\1\23\1\16\1\31\1\32\1\33\1\uffff\1\34\2\uffff\1\35"+
            "\1\uffff\1\36",
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
            "\1\uffff",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "85:1: shellCommandOnly returns [ASTStatement n] : ( ( stat )=>s= stat | l= legacyStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==SEMI) && (synpred1_ShellCommand())) {s = 1;}

                        else if ( (LA1_0==EOF) && (synpred1_ShellCommand())) {s = 2;}

                        else if ( (LA1_0==48) ) {s = 3;}

                        else if ( ((LA1_0>=PLUS && LA1_0<=MINUS)||LA1_0==58) && (synpred1_ShellCommand())) {s = 4;}

                        else if ( (LA1_0==69) && (synpred1_ShellCommand())) {s = 5;}

                        else if ( (LA1_0==70) && (synpred1_ShellCommand())) {s = 6;}

                        else if ( (LA1_0==INT) && (synpred1_ShellCommand())) {s = 7;}

                        else if ( (LA1_0==REAL) && (synpred1_ShellCommand())) {s = 8;}

                        else if ( (LA1_0==STRING) && (synpred1_ShellCommand())) {s = 9;}

                        else if ( (LA1_0==HASH) && (synpred1_ShellCommand())) {s = 10;}

                        else if ( (LA1_0==IDENT) && (synpred1_ShellCommand())) {s = 11;}

                        else if ( ((LA1_0>=71 && LA1_0<=74)) && (synpred1_ShellCommand())) {s = 12;}

                        else if ( (LA1_0==75) && (synpred1_ShellCommand())) {s = 13;}

                        else if ( (LA1_0==81) && (synpred1_ShellCommand())) {s = 14;}

                        else if ( (LA1_0==76) && (synpred1_ShellCommand())) {s = 15;}

                        else if ( (LA1_0==77) && (synpred1_ShellCommand())) {s = 16;}

                        else if ( (LA1_0==78) && (synpred1_ShellCommand())) {s = 17;}

                        else if ( (LA1_0==79) && (synpred1_ShellCommand())) {s = 18;}

                        else if ( (LA1_0==80) && (synpred1_ShellCommand())) {s = 19;}

                        else if ( (LA1_0==AT) && (synpred1_ShellCommand())) {s = 20;}

                        else if ( (LA1_0==61) && (synpred1_ShellCommand())) {s = 21;}

                        else if ( ((LA1_0>=62 && LA1_0<=64)) && (synpred1_ShellCommand())) {s = 22;}

                        else if ( (LA1_0==LPAREN) && (synpred1_ShellCommand())) {s = 23;}

                        else if ( (LA1_0==65) && (synpred1_ShellCommand())) {s = 24;}

                        else if ( (LA1_0==82) && (synpred1_ShellCommand())) {s = 25;}

                        else if ( (LA1_0==83) ) {s = 26;}

                        else if ( (LA1_0==84) ) {s = 27;}

                        else if ( (LA1_0==86) ) {s = 28;}

                        else if ( (LA1_0==89) && (synpred1_ShellCommand())) {s = 29;}

                        else if ( (LA1_0==91) && (synpred1_ShellCommand())) {s = 30;}

                        else if ( ((LA1_0>=44 && LA1_0<=46)||(LA1_0>=49 && LA1_0<=51)) ) {s = 31;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ShellCommand()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_26 = input.LA(1);

                         
                        int index1_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ShellCommand()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index1_26);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_27 = input.LA(1);

                         
                        int index1_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ShellCommand()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index1_27);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_28 = input.LA(1);

                         
                        int index1_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_ShellCommand()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index1_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA2_eotS =
        "\45\uffff";
    static final String DFA2_eofS =
        "\1\13\44\uffff";
    static final String DFA2_minS =
        "\1\4\4\uffff\1\0\1\uffff\1\0\1\uffff\2\0\32\uffff";
    static final String DFA2_maxS =
        "\1\133\4\uffff\1\0\1\uffff\1\0\1\uffff\2\0\32\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\4\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\2\31\uffff";
    static final String DFA2_specialS =
        "\1\0\4\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\32\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\13\2\uffff\2\13\10\uffff\2\13\4\uffff\1\13\3\uffff\4\13\15"+
            "\uffff\1\10\1\3\1\4\1\uffff\1\5\1\1\1\2\1\6\6\uffff\1\13\2\uffff"+
            "\5\13\3\uffff\16\13\1\7\1\11\1\uffff\1\12\2\uffff\1\13\1\uffff"+
            "\1\13",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "98:1: shellCommand returns [ASTStatement n] : ( ( legacyStat )=>l= legacyStat EOF | s= stat EOF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==49) && (synpred2_ShellCommand())) {s = 1;}

                        else if ( (LA2_0==50) && (synpred2_ShellCommand())) {s = 2;}

                        else if ( (LA2_0==45) && (synpred2_ShellCommand())) {s = 3;}

                        else if ( (LA2_0==46) && (synpred2_ShellCommand())) {s = 4;}

                        else if ( (LA2_0==48) ) {s = 5;}

                        else if ( (LA2_0==51) && (synpred2_ShellCommand())) {s = 6;}

                        else if ( (LA2_0==83) ) {s = 7;}

                        else if ( (LA2_0==44) && (synpred2_ShellCommand())) {s = 8;}

                        else if ( (LA2_0==84) ) {s = 9;}

                        else if ( (LA2_0==86) ) {s = 10;}

                        else if ( (LA2_0==EOF||LA2_0==SEMI||(LA2_0>=IDENT && LA2_0<=LPAREN)||(LA2_0>=PLUS && LA2_0<=MINUS)||LA2_0==AT||(LA2_0>=INT && LA2_0<=HASH)||LA2_0==58||(LA2_0>=61 && LA2_0<=65)||(LA2_0>=69 && LA2_0<=82)||LA2_0==89||LA2_0==91) ) {s = 11;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ShellCommand()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ShellCommand()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ShellCommand()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_ShellCommand()) ) {s = 8;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\14\uffff\1\13\1\uffff";
    static final String DFA6_minS =
        "\1\54\1\7\7\uffff\1\5\1\7\1\uffff\1\4\1\uffff";
    static final String DFA6_maxS =
        "\1\126\1\7\7\uffff\1\13\1\7\1\uffff\1\126\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\1\1\uffff\1\3";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\6\1\1\1\2\1\uffff\1\3\2\uffff\1\4\37\uffff\1\5\1\7\1\uffff"+
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\5\uffff\1\13",
            "\1\14",
            "",
            "\1\13\47\uffff\3\13\1\15\1\13\2\uffff\1\13\37\uffff\2\13\1"+
            "\uffff\1\13",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "165:1: singleLegacyStat returns [ASTStatement n] : (lcr= legacyCreate | lca= legacyCreateAssign | lci= legacyCreateInsert | llt= legacyLet | lex= legacyExecute | ods= objDestroyStat | 'set' e= expression aas= attAssignStat[$e.n] | lis= lnkInsStat | lds= lnkDelStat );";
        }
    }
    static final String DFA8_eotS =
        "\30\uffff";
    static final String DFA8_eofS =
        "\1\27\27\uffff";
    static final String DFA8_minS =
        "\1\7\27\uffff";
    static final String DFA8_maxS =
        "\1\121\27\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\26\1\1\2";
    static final String DFA8_specialS =
        "\1\0\27\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\11\1\25\10\uffff\2\2\4\uffff\1\22\3\uffff\1\5\1\6\1\7\1\10"+
            "\21\uffff\1\1\11\uffff\1\2\2\uffff\1\23\3\24\1\26\3\uffff\1"+
            "\3\1\4\4\12\1\13\1\15\1\16\1\17\1\20\1\21\1\14",
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
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "351:12: ( ( inSoilExpression )=>retVal= inSoilExpression | nothing )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==48) && (synpred3_ShellCommand())) {s = 1;}

                        else if ( ((LA8_0>=PLUS && LA8_0<=MINUS)||LA8_0==58) && (synpred3_ShellCommand())) {s = 2;}

                        else if ( (LA8_0==69) && (synpred3_ShellCommand())) {s = 3;}

                        else if ( (LA8_0==70) && (synpred3_ShellCommand())) {s = 4;}

                        else if ( (LA8_0==INT) && (synpred3_ShellCommand())) {s = 5;}

                        else if ( (LA8_0==REAL) && (synpred3_ShellCommand())) {s = 6;}

                        else if ( (LA8_0==STRING) && (synpred3_ShellCommand())) {s = 7;}

                        else if ( (LA8_0==HASH) && (synpred3_ShellCommand())) {s = 8;}

                        else if ( (LA8_0==IDENT) && (synpred3_ShellCommand())) {s = 9;}

                        else if ( ((LA8_0>=71 && LA8_0<=74)) && (synpred3_ShellCommand())) {s = 10;}

                        else if ( (LA8_0==75) && (synpred3_ShellCommand())) {s = 11;}

                        else if ( (LA8_0==81) && (synpred3_ShellCommand())) {s = 12;}

                        else if ( (LA8_0==76) && (synpred3_ShellCommand())) {s = 13;}

                        else if ( (LA8_0==77) && (synpred3_ShellCommand())) {s = 14;}

                        else if ( (LA8_0==78) && (synpred3_ShellCommand())) {s = 15;}

                        else if ( (LA8_0==79) && (synpred3_ShellCommand())) {s = 16;}

                        else if ( (LA8_0==80) && (synpred3_ShellCommand())) {s = 17;}

                        else if ( (LA8_0==AT) && (synpred3_ShellCommand())) {s = 18;}

                        else if ( (LA8_0==61) && (synpred3_ShellCommand())) {s = 19;}

                        else if ( ((LA8_0>=62 && LA8_0<=64)) && (synpred3_ShellCommand())) {s = 20;}

                        else if ( (LA8_0==LPAREN) && (synpred3_ShellCommand())) {s = 21;}

                        else if ( (LA8_0==65) && (synpred3_ShellCommand())) {s = 22;}

                        else if ( (LA8_0==EOF) ) {s = 23;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\16\uffff";
    static final String DFA39_eofS =
        "\16\uffff";
    static final String DFA39_minS =
        "\1\7\7\uffff\1\10\5\uffff";
    static final String DFA39_maxS =
        "\1\121\7\uffff\1\37\5\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA39_specialS =
        "\16\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\7\23\uffff\1\3\1\4\1\5\1\6\46\uffff\1\1\1\2\4\10\1\11\3\12"+
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "819:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
    static final String DFA50_eotS =
        "\43\uffff";
    static final String DFA50_eofS =
        "\1\1\42\uffff";
    static final String DFA50_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA50_maxS =
        "\1\133\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\3\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA50_specialS =
        "\1\0\14\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\2\uffff\1\15\1\31\10\uffff\2\6\4\uffff\1\26\3\uffff\1\11"+
            "\1\12\1\13\1\14\21\uffff\1\5\11\uffff\1\6\2\uffff\1\27\3\30"+
            "\1\32\1\uffff\1\1\1\uffff\1\7\1\10\4\16\1\17\1\21\1\22\1\23"+
            "\1\24\1\25\1\20\1\33\1\34\1\35\1\uffff\1\36\1\uffff\1\1\1\37"+
            "\1\uffff\1\40",
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "1104:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==EOF||LA50_0==SEMI||LA50_0==67||LA50_0==88) ) {s = 1;}

                        else if ( (LA50_0==48) && (synpred5_ShellCommand())) {s = 5;}

                        else if ( ((LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==58) && (synpred5_ShellCommand())) {s = 6;}

                        else if ( (LA50_0==69) && (synpred5_ShellCommand())) {s = 7;}

                        else if ( (LA50_0==70) && (synpred5_ShellCommand())) {s = 8;}

                        else if ( (LA50_0==INT) && (synpred5_ShellCommand())) {s = 9;}

                        else if ( (LA50_0==REAL) && (synpred5_ShellCommand())) {s = 10;}

                        else if ( (LA50_0==STRING) && (synpred5_ShellCommand())) {s = 11;}

                        else if ( (LA50_0==HASH) && (synpred5_ShellCommand())) {s = 12;}

                        else if ( (LA50_0==IDENT) ) {s = 13;}

                        else if ( ((LA50_0>=71 && LA50_0<=74)) && (synpred5_ShellCommand())) {s = 14;}

                        else if ( (LA50_0==75) && (synpred5_ShellCommand())) {s = 15;}

                        else if ( (LA50_0==81) && (synpred5_ShellCommand())) {s = 16;}

                        else if ( (LA50_0==76) && (synpred5_ShellCommand())) {s = 17;}

                        else if ( (LA50_0==77) && (synpred5_ShellCommand())) {s = 18;}

                        else if ( (LA50_0==78) && (synpred5_ShellCommand())) {s = 19;}

                        else if ( (LA50_0==79) && (synpred5_ShellCommand())) {s = 20;}

                        else if ( (LA50_0==80) && (synpred5_ShellCommand())) {s = 21;}

                        else if ( (LA50_0==AT) && (synpred5_ShellCommand())) {s = 22;}

                        else if ( (LA50_0==61) && (synpred5_ShellCommand())) {s = 23;}

                        else if ( ((LA50_0>=62 && LA50_0<=64)) && (synpred5_ShellCommand())) {s = 24;}

                        else if ( (LA50_0==LPAREN) && (synpred5_ShellCommand())) {s = 25;}

                        else if ( (LA50_0==65) ) {s = 26;}

                        else if ( (LA50_0==82) ) {s = 27;}

                        else if ( (LA50_0==83) ) {s = 28;}

                        else if ( (LA50_0==84) ) {s = 29;}

                        else if ( (LA50_0==86) ) {s = 30;}

                        else if ( (LA50_0==89) ) {s = 31;}

                        else if ( (LA50_0==91) ) {s = 32;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ShellCommand()) ) {s = 25;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_26 = input.LA(1);

                         
                        int index50_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_ShellCommand()) ) {s = 25;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index50_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_stat_in_shellCommandOnly65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommandOnly81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_shellCommand113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_shellCommand131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_shellCommand133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpEnter_in_legacyStat167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyOpExit_in_legacyStat183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat196 = new BitSet(new long[]{0x0009700000000002L,0x0000000000580000L});
    public static final BitSet FOLLOW_nextLegacyStat_in_legacyStat207 = new BitSet(new long[]{0x0009700000000002L,0x0000000000580000L});
    public static final BitSet FOLLOW_singleLegacyStat_in_nextLegacyStat241 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SEMI_in_nextLegacyStat245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreate_in_singleLegacyStat278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateAssign_in_singleLegacyStat297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyCreateInsert_in_singleLegacyStat310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyLet_in_singleLegacyStat323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyExecute_in_singleLegacyStat351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleLegacyStat369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_singleLegacyStat382 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_singleLegacyStat386 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_attAssignStat_in_singleLegacyStat392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleLegacyStat405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleLegacyStat426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_legacyCreate462 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreate470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_legacyCreate474 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreate482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_legacyCreateAssign519 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_identListMin1_in_legacyCreateAssign527 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_legacyCreateAssign531 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_legacyCreateAssign535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateAssign543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_legacyCreateInsert577 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_legacyCreateInsert585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_legacyCreateInsert589 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_simpleType_in_legacyCreateInsert597 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_legacyCreateInsert601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_legacyCreateInsert605 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_legacyCreateInsert615 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_legacyCreateInsert619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_legacyLet652 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_legacyLet660 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_COLON_in_legacyLet670 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_legacyLet680 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_legacyLet689 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyLet697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_legacyOpEnter730 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpEnter738 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_legacyOpEnter746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_legacyOpEnter750 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_exprList_in_legacyOpEnter760 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_legacyOpEnter764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_legacyOpExit799 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_legacyOpExit811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_legacyOpExit815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_legacyExecute848 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_legacyExecute852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_expression940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_expression944 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_COLON_in_expression948 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_expression952 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_expression957 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_expression961 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expression963 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1021 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1038 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_paramList1050 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1054 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList1103 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_idList1113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_idList1117 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration1148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1150 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1190 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalImpliesExpression1203 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression1207 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1252 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_conditionalOrExpression1265 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression1269 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1313 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_conditionalXOrExpression1326 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression1330 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1374 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_conditionalAndExpression1387 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression1391 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1439 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_set_in_equalityExpression1458 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1468 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1517 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1535 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1553 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1603 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_additiveExpression1621 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1631 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1681 = new BitSet(new long[]{0x0200000000180002L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1699 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1713 = new BitSet(new long[]{0x0200000000180002L});
    public static final BitSet FOLLOW_set_in_unaryExpression1775 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1852 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression1870 = new BitSet(new long[]{0xE000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression1876 = new BitSet(new long[]{0xE000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression1887 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression1964 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1968 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1994 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1996 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_primaryExpression1998 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2002 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2004 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2025 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_primaryExpression2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2054 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression2201 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression2208 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression2219 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression2223 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_queryExpression2234 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_iterateExpression2272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression2278 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression2286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression2288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression2296 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression2298 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_iterateExpression2306 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression2356 = new BitSet(new long[]{0x0000000002800102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2378 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2391 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2404 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2408 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2420 = new BitSet(new long[]{0x0000000002800102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression2437 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2452 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2467 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2471 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression2485 = new BitSet(new long[]{0x0000000000800102L});
    public static final BitSet FOLLOW_AT_in_operationExpression2510 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_operationExpression2512 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression2532 = new BitSet(new long[]{0xE401000078860380L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2553 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression2565 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_operationExpression2569 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression2638 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression2654 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_typeExpression2658 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_elemVarsDeclaration2699 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration2707 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization2746 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization2748 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_variableInitialization2752 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization2754 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_variableInitialization2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifExpression2790 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_ifExpression2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ifExpression2796 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_ifExpression2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifExpression2802 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_ifExpression2806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ifExpression2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_literal2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_literal2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal2913 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_literal2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal2929 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal2931 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_literal2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3033 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3062 = new BitSet(new long[]{0xE401000178860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3079 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral3092 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3096 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem3144 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem3155 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_collectionItem3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_emptyCollectionLiteral3188 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral3190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020F80L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral3212 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral3214 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_undefinedLiteral3246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3248 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_undefinedLiteral3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral3284 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral3288 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_undefinedLiteral3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_tupleLiteral3343 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral3349 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3357 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral3368 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral3372 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem3414 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_COLON_in_tupleItem3453 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_tupleItem3457 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem3459 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_tupleItem3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem3485 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_expression_in_tupleItem3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_dateLiteral3540 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral3542 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral3546 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly3654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType3722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType3749 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_collectionType3753 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_tupleType3789 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType3791 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3800 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_tupleType3811 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType3815 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart3859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_COLON_in_tuplePart3861 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_tuplePart3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat3949 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SEMI_in_stat3960 = new BitSet(new long[]{0xE409700078860180L,0x000000000A5FFFE3L});
    public static final BitSet FOLLOW_nextStat_in_stat3966 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_singleStat_in_nextStat4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr4242 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat4294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat4298 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat4337 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat4346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat4350 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_objCreateStat4384 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat4392 = new BitSet(new long[]{0x0000800000000102L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4402 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat4414 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4420 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_objCreateStat4438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat4446 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat4460 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_objDestroyStat4504 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_lnkInsStat4538 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat4542 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat4552 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_lnkInsStat4560 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4597 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4608 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4617 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4640 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4651 = new BitSet(new long[]{0x0000000080000802L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4662 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4671 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4678 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers4700 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers4715 = new BitSet(new long[]{0x0000000080000802L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers4735 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers4746 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers4755 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_86_in_lnkDelStat4796 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat4800 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat4810 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat4814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_lnkDelStat4818 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_condExStat4858 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat4867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_condExStat4871 = new BitSet(new long[]{0xE409700078860180L,0x000000000A5FFFE3L});
    public static final BitSet FOLLOW_stat_in_condExStat4880 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000008L});
    public static final BitSet FOLLOW_67_in_condExStat4891 = new BitSet(new long[]{0xE409700078860180L,0x000000000A5FFFE3L});
    public static final BitSet FOLLOW_stat_in_condExStat4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_condExStat4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_iterStat4939 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_iterStat4947 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_iterStat4951 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_iterStat4963 = new BitSet(new long[]{0xE409700078860180L,0x000000000A5FFFE3L});
    public static final BitSet FOLLOW_stat_in_iterStat4971 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_iterStat4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_whileStat5001 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat5009 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_whileStat5013 = new BitSet(new long[]{0xE409700078860180L,0x000000000A5FFFE3L});
    public static final BitSet FOLLOW_stat_in_whileStat5021 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_whileStat5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15173 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin15187 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_rValListMin15197 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25236 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25244 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25252 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin25266 = new BitSet(new long[]{0xE401000078860180L,0x000000000007FFE3L});
    public static final BitSet FOLLOW_rValue_in_rValListMin25276 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15390 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin15405 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin15415 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25455 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25463 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25471 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin25485 = new BitSet(new long[]{0xE401000078860180L,0x000000000003FFE3L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin25495 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_nothing_in_identList5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15576 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_identListMin15590 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_IDENT_in_identListMin15600 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_stat_in_synpred1_ShellCommand57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_legacyStat_in_synpred2_ShellCommand105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_synpred3_ShellCommand803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred4_ShellCommand3444 = new BitSet(new long[]{0x0000000000000080L,0x0000000000028F80L});
    public static final BitSet FOLLOW_type_in_synpred4_ShellCommand3446 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_synpred4_ShellCommand3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred5_ShellCommand4055 = new BitSet(new long[]{0x0000000000000002L});

}