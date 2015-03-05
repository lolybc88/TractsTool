// $ANTLR 3.3 Nov 30, 2010 12:45:30 Soil.g 2011-09-27 13:30:30

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
 
package org.tzi.use.parser.soil;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all") public class SoilParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMI", "IDENT", "COLON_EQUAL", "DOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "COLON", "EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "STAR", "SLASH", "ARROW", "AT", "BAR", "LBRACK", "RBRACK", "INT", "REAL", "STRING", "HASH", "DOTDOT", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "COLON_COLON", "RANGE_OR_INT", "ESC", "NON_OCL_STRING", "HEX_DIGIT", "VOCAB", "'new'", "'between'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'if'", "'then'", "'else'", "'end'", "'for'", "'in'", "'do'", "'while'", "'let'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'pre'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'"
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
    public static final int SEMI=4;
    public static final int IDENT=5;
    public static final int COLON_EQUAL=6;
    public static final int DOT=7;
    public static final int LPAREN=8;
    public static final int RPAREN=9;
    public static final int LBRACE=10;
    public static final int RBRACE=11;
    public static final int COMMA=12;
    public static final int COLON=13;
    public static final int EQUAL=14;
    public static final int NOT_EQUAL=15;
    public static final int LESS=16;
    public static final int GREATER=17;
    public static final int LESS_EQUAL=18;
    public static final int GREATER_EQUAL=19;
    public static final int PLUS=20;
    public static final int MINUS=21;
    public static final int STAR=22;
    public static final int SLASH=23;
    public static final int ARROW=24;
    public static final int AT=25;
    public static final int BAR=26;
    public static final int LBRACK=27;
    public static final int RBRACK=28;
    public static final int INT=29;
    public static final int REAL=30;
    public static final int STRING=31;
    public static final int HASH=32;
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


        public SoilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SoilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return SoilParser.tokenNames; }
    public String getGrammarFileName() { return "Soil.g"; }



    // $ANTLR start "statOnly"
    // Soil.g:116:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        SoilParser.stat_return s = null;


        try {
            // Soil.g:117:1: (s= stat EOF )
            // Soil.g:118:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly76);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly80); if (state.failed) return n;
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
    // Soil.g:128:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final SoilParser.stat_return stat() throws RecognitionException {
        SoilParser.stat_return retval = new SoilParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // Soil.g:132:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // Soil.g:133:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat111);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // Soil.g:134:3: ( SEMI nextStat[seq] )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMI) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Soil.g:135:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat122); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat128);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // Soil.g:151:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final SoilParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        SoilParser.nextStat_return retval = new SoilParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // Soil.g:152:1: (s= singleStat )
            // Soil.g:153:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat162);
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
    // Soil.g:165:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        SoilParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // Soil.g:169:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // Soil.g:170:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat199);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:172:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat225);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:173:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat237);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // Soil.g:174:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat251);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // Soil.g:175:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat265);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // Soil.g:176:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat278);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // Soil.g:177:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat295);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // Soil.g:178:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat312);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // Soil.g:179:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat329);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // Soil.g:181:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat351);
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
    // Soil.g:188:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // Soil.g:189:1: ( nothing )
            // Soil.g:190:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat378);
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
    // Soil.g:195:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // Soil.g:196:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Soil.g:197:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr404);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // Soil.g:198:3: (aas= attAssignStat[$expr.n] )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DOT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Soil.g:199:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr418);
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
    // Soil.g:211:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        SoilParser.rValue_return rVal = null;


        try {
            // Soil.g:212:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Soil.g:213:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat456); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat460); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat468);
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
    // Soil.g:281:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        SoilParser.rValue_return r = null;


        try {
            // Soil.g:282:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Soil.g:283:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat499); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat508); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat512); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat520);
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
    // Soil.g:295:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        SoilParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Soil.g:296:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Soil.g:297:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,44,FOLLOW_44_in_objCreateStat546); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat554);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // Soil.g:299:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Soil.g:300:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat564); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat576);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat582); if (state.failed) return n;

                    }
                    break;

            }

            // Soil.g:305:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Soil.g:306:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,45,FOLLOW_45_in_objCreateStat600); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat608); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat622);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat630); if (state.failed) return n;
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
    // Soil.g:325:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final SoilParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        SoilParser.objDestroyStat_return retval = new SoilParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // Soil.g:326:1: ( 'destroy' el= exprListMin1 )
            // Soil.g:327:3: 'destroy' el= exprListMin1
            {
            match(input,46,FOLLOW_46_in_objDestroyStat666); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat674);
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
    // Soil.g:348:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Soil.g:349:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Soil.g:350:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,47,FOLLOW_47_in_lnkInsStat700); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat704); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat714);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat718); if (state.failed) return n;
            match(input,48,FOLLOW_48_in_lnkInsStat722); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat730); if (state.failed) return n;
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
    // Soil.g:360:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final SoilParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        SoilParser.rValListMin2WithOptionalQualifiers_return retval = new SoilParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        SoilParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Soil.g:366:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Soil.g:367:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers759);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Soil.g:368:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LBRACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Soil.g:369:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers770); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers779);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers786); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers802); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers813);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // Soil.g:381:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LBRACE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Soil.g:382:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers824); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers833);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers840); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // Soil.g:391:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Soil.g:392:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers862); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers877);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // Soil.g:396:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==LBRACE) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // Soil.g:397:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers897); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers908);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers917); if (state.failed) return retval;

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
            	    break loop9;
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
    // Soil.g:412:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        SoilParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // Soil.g:413:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Soil.g:414:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,49,FOLLOW_49_in_lnkDelStat958); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat962); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat972);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat976); if (state.failed) return n;
            match(input,50,FOLLOW_50_in_lnkDelStat980); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat989); if (state.failed) return n;
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
    // Soil.g:428:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        SoilParser.stat_return ts = null;

        SoilParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Soil.g:432:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // Soil.g:433:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,51,FOLLOW_51_in_condExStat1020); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat1029);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,52,FOLLOW_52_in_condExStat1033); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat1042);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // Soil.g:437:3: ( 'else' es= stat )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==53) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Soil.g:438:5: 'else' es= stat
                    {
                    match(input,53,FOLLOW_53_in_condExStat1053); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat1065);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,54,FOLLOW_54_in_condExStat1076); if (state.failed) return n;
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
    // Soil.g:449:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        SoilParser.stat_return s = null;


        try {
            // Soil.g:450:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // Soil.g:451:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,55,FOLLOW_55_in_iterStat1101); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat1109); if (state.failed) return n;
            match(input,56,FOLLOW_56_in_iterStat1113); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat1121);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,57,FOLLOW_57_in_iterStat1125); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat1133);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,54,FOLLOW_54_in_iterStat1137); if (state.failed) return n;
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
    // Soil.g:466:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        SoilParser.stat_return s = null;


        try {
            // Soil.g:467:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // Soil.g:468:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,58,FOLLOW_58_in_whileStat1163); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat1171);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,57,FOLLOW_57_in_whileStat1175); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat1183);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,54,FOLLOW_54_in_whileStat1187); if (state.failed) return n;
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
    // Soil.g:491:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // Soil.g:492:1: ()
            // Soil.g:493:1: 
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
    // Soil.g:499:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final SoilParser.rValue_return rValue() throws RecognitionException {
        SoilParser.rValue_return retval = new SoilParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // Soil.g:500:1: (e= inSoilExpression | oc= objCreateStat )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LPAREN||(LA11_0>=PLUS && LA11_0<=MINUS)||LA11_0==AT||(LA11_0>=INT && LA11_0<=HASH)||LA11_0==51||LA11_0==59||LA11_0==65||(LA11_0>=68 && LA11_0<=71)||(LA11_0>=73 && LA11_0<=85)) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // Soil.g:501:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue1240);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:502:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue1252);
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
    // Soil.g:516:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // Soil.g:517:1: ( nothing | rl= rValListMin1 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RBRACE) ) {
                alt12=1;
            }
            else if ( (LA12_0==IDENT||LA12_0==LPAREN||(LA12_0>=PLUS && LA12_0<=MINUS)||LA12_0==AT||(LA12_0>=INT && LA12_0<=HASH)||LA12_0==44||LA12_0==51||LA12_0==59||LA12_0==65||(LA12_0>=68 && LA12_0<=71)||(LA12_0>=73 && LA12_0<=85)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Soil.g:518:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList1275);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:521:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList1302);
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
    // Soil.g:529:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        SoilParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:533:1: (r= rValue ( COMMA r= rValue )* )
            // Soil.g:534:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin11335);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Soil.g:536:3: ( COMMA r= rValue )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Soil.g:537:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin11349); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin11359);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
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
    // $ANTLR end "rValListMin1"


    // $ANTLR start "rValListMin2"
    // Soil.g:547:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        SoilParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // Soil.g:551:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Soil.g:552:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin21398);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin21406); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin21414);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // Soil.g:557:3: ( COMMA r= rValue )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Soil.g:558:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin21428); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin21438);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
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
    // $ANTLR end "rValListMin2"


    // $ANTLR start "inSoilExpression"
    // Soil.g:568:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        SoilParser.expression_return e = null;


        try {
            // Soil.g:569:1: (e= expression )
            // Soil.g:570:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression1472);
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
    // Soil.g:579:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // Soil.g:580:1: ( nothing | el= exprListMin1 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF) ) {
                alt15=1;
            }
            else if ( (LA15_0==IDENT||LA15_0==LPAREN||(LA15_0>=PLUS && LA15_0<=MINUS)||LA15_0==AT||(LA15_0>=INT && LA15_0<=HASH)||LA15_0==51||LA15_0==59||LA15_0==65||(LA15_0>=68 && LA15_0<=71)||(LA15_0>=73 && LA15_0<=85)) ) {
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
                    // Soil.g:581:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList1501);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:584:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList1519);
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
    // Soil.g:592:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:596:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:597:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin11552);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Soil.g:599:3: ( COMMA e= inSoilExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Soil.g:600:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin11567); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin11577);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
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
    // $ANTLR end "exprListMin1"


    // $ANTLR start "exprListMin2"
    // Soil.g:610:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // Soil.g:614:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Soil.g:615:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21617);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin21625); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin21633);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // Soil.g:620:3: ( COMMA e= inSoilExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Soil.g:621:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin21647); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin21657);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
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
    // $ANTLR end "exprListMin2"


    // $ANTLR start "identList"
    // Soil.g:631:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // Soil.g:632:1: ( nothing | il= identListMin1 )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||LA18_0==SEMI||LA18_0==RBRACE||(LA18_0>=53 && LA18_0<=54)) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENT) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Soil.g:633:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList1687);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:636:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList1704);
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
    // Soil.g:644:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // Soil.g:648:1: (id= IDENT ( COMMA id= IDENT )* )
            // Soil.g:649:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11738); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // Soil.g:651:3: ( COMMA id= IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Soil.g:652:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin11752); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin11762); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
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
    // $ANTLR end "identListMin1"


    // $ANTLR start "expressionOnly"
    // Soil.g:691:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        SoilParser.expression_return nExp = null;


        try {
            // Soil.g:692:1: (nExp= expression EOF )
            // Soil.g:693:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly1803);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly1805); if (state.failed) return n;
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
    // Soil.g:700:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final SoilParser.expression_return expression() throws RecognitionException {
        SoilParser.expression_return retval = new SoilParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        SoilParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Soil.g:706:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // Soil.g:707:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // Soil.g:708:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Soil.g:709:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,59,FOLLOW_59_in_expression1853); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression1857); if (state.failed) return retval;
            	    // Soil.g:709:24: ( COLON t= type )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==COLON) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // Soil.g:709:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression1861); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression1865);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression1870); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression1874);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,56,FOLLOW_56_in_expression1876); if (state.failed) return retval;
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
            	    break loop21;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression1901);
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
    // Soil.g:737:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Soil.g:739:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Soil.g:740:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList1934); if (state.failed) return paramList;
            // Soil.g:741:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Soil.g:742:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList1951);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // Soil.g:743:7: ( COMMA v= variableDeclaration )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Soil.g:743:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList1963); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList1967);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList1987); if (state.failed) return paramList;

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
    // Soil.g:751:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Soil.g:753:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // Soil.g:754:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2016); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // Soil.g:755:5: ( COMMA idn= IDENT )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Soil.g:755:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList2026); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2030); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
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
        return idList;
    }
    // $ANTLR end "idList"


    // $ANTLR start "variableDeclaration"
    // Soil.g:763:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Soil.g:764:1: (name= IDENT COLON t= type )
            // Soil.g:765:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2061); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration2063); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration2067);
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
    // Soil.g:773:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // Soil.g:774:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Soil.g:775:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2103);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // Soil.g:776:5: (op= 'implies' n1= conditionalOrExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==60) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Soil.g:776:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,60,FOLLOW_60_in_conditionalImpliesExpression2116); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2120);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // Soil.g:785:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // Soil.g:786:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Soil.g:787:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2165);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // Soil.g:788:5: (op= 'or' n1= conditionalXOrExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Soil.g:788:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,61,FOLLOW_61_in_conditionalOrExpression2178); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2182);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // Soil.g:797:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // Soil.g:798:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Soil.g:799:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2226);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // Soil.g:800:5: (op= 'xor' n1= conditionalAndExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==62) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Soil.g:800:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,62,FOLLOW_62_in_conditionalXOrExpression2239); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2243);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // Soil.g:809:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // Soil.g:810:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Soil.g:811:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2287);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // Soil.g:812:5: (op= 'and' n1= equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==63) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Soil.g:812:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,63,FOLLOW_63_in_conditionalAndExpression2300); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2304);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // Soil.g:821:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Soil.g:823:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Soil.g:824:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2352);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // Soil.g:825:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=EQUAL && LA29_0<=NOT_EQUAL)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Soil.g:825:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=EQUAL && input.LA(1)<=NOT_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2381);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // Soil.g:835:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Soil.g:837:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Soil.g:838:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2430);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // Soil.g:839:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=LESS && LA30_0<=GREATER_EQUAL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Soil.g:839:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2466);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // Soil.g:849:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Soil.g:851:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Soil.g:852:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2516);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // Soil.g:853:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=PLUS && LA31_0<=MINUS)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Soil.g:853:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2544);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // Soil.g:864:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // Soil.g:866:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Soil.g:867:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2594);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // Soil.g:868:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=STAR && LA32_0<=SLASH)||LA32_0==64) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Soil.g:868:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=SLASH)||input.LA(1)==64 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2626);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Soil.g:880:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // Soil.g:882:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==65) ) {
                alt33=1;
            }
            else if ( (LA33_0==IDENT||LA33_0==LPAREN||LA33_0==AT||(LA33_0>=INT && LA33_0<=HASH)||LA33_0==51||(LA33_0>=68 && LA33_0<=71)||(LA33_0>=73 && LA33_0<=85)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // Soil.g:883:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Soil.g:883:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Soil.g:883:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==65 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2712);
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
                    // Soil.g:887:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2732);
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
    // Soil.g:895:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // Soil.g:897:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Soil.g:898:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2765);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // Soil.g:899:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DOT) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==IDENT) ) {
                        int LA35_4 = input.LA(3);

                        if ( (LA35_4==EOF||LA35_4==SEMI||(LA35_4>=DOT && LA35_4<=COMMA)||(LA35_4>=EQUAL && LA35_4<=RBRACK)||LA35_4==DOTDOT||(LA35_4>=52 && LA35_4<=54)||(LA35_4>=56 && LA35_4<=57)||(LA35_4>=60 && LA35_4<=64)||LA35_4==72) ) {
                            alt35=1;
                        }


                    }
                    else if ( ((LA35_2>=68 && LA35_2<=71)) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==ARROW) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Soil.g:900:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Soil.g:900:6: ( ARROW | DOT )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==ARROW) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==DOT) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // Soil.g:900:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression2783); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Soil.g:900:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression2789); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression2800);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // Soil.g:916:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        SoilParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // Soil.g:917:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt38=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt38=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt38=1;
                    }
                    break;
                case EOF:
                case SEMI:
                case LPAREN:
                case RPAREN:
                case LBRACE:
                case RBRACE:
                case COMMA:
                case EQUAL:
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
                case DOTDOT:
                case 52:
                case 53:
                case 54:
                case 56:
                case 57:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 72:
                    {
                    alt38=3;
                    }
                    break;
                case DOT:
                    {
                    int LA38_7 = input.LA(3);

                    if ( (LA38_7==66) ) {
                        alt38=6;
                    }
                    else if ( (LA38_7==IDENT||(LA38_7>=68 && LA38_7<=71)) ) {
                        alt38=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt38=2;
                }
                break;
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt38=3;
                }
                break;
            case LPAREN:
                {
                alt38=4;
                }
                break;
            case 51:
                {
                alt38=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // Soil.g:918:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2840);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:919:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression2854);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:920:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression2866);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // Soil.g:921:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2877); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression2881);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2883); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // Soil.g:922:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression2895);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // Soil.g:923:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2907); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2909); if (state.failed) return n;
                    match(input,66,FOLLOW_66_in_primaryExpression2911); if (state.failed) return n;
                    // Soil.g:923:36: ( LPAREN RPAREN )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==LPAREN) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Soil.g:923:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2915); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2917); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // Soil.g:925:7: ( AT 'pre' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==AT) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Soil.g:925:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression2938); if (state.failed) return n;
                            match(input,67,FOLLOW_67_in_primaryExpression2940); if (state.failed) return n;
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
    // Soil.g:929:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // Soil.g:930:1: ( AT objectName= IDENT )
            // Soil.g:931:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference2967); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference2975); if (state.failed) return n;
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
    // Soil.g:945:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        SoilParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // Soil.g:946:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt39=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA39_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                alt39=2;
                }
                break;
            case 69:
            case 70:
            case 71:
                {
                alt39=4;
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
                    // Soil.g:950:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall3040);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:953:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall3053);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:954:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall3066);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // Soil.g:955:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall3079);
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
    // Soil.g:964:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        SoilParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Soil.g:965:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Soil.g:966:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3114); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3121); if (state.failed) return n;
            // Soil.g:968:5: (decls= elemVarsDeclaration BAR )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==IDENT) ) {
                int LA40_1 = input.LA(2);

                if ( ((LA40_1>=COMMA && LA40_1<=COLON)||LA40_1==BAR) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // Soil.g:968:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3132);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression3136); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression3147);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression3153); if (state.failed) return n;
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
    // Soil.g:982:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        SoilParser.expression_return nExp = null;


        try {
            // Soil.g:982:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Soil.g:983:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,68,FOLLOW_68_in_iterateExpression3185); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression3191); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression3199);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression3201); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression3209);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression3211); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression3219);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression3225); if (state.failed) return n;
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
    // Soil.g:1004:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final SoilParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        SoilParser.operationExpression_return retval = new SoilParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        SoilParser.expression_return rolename = null;

        SoilParser.expression_return e = null;


        try {
            // Soil.g:1006:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Soil.g:1007:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression3269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // Soil.g:1013:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LBRACK) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Soil.g:1013:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3291); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression3304);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // Soil.g:1015:9: ( COMMA rolename= expression )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==COMMA) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Soil.g:1015:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3317); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression3321);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3333); if (state.failed) return retval;
                    // Soil.g:1018:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LBRACK) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Soil.g:1018:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3350); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression3365);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // Soil.g:1020:11: ( COMMA rolename= expression )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==COMMA) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // Soil.g:1020:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3380); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression3384);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3398); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // Soil.g:1025:5: ( AT 'pre' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Soil.g:1025:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression3423); if (state.failed) return retval;
                    match(input,67,FOLLOW_67_in_operationExpression3425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // Soil.g:1026:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LPAREN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Soil.g:1027:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression3445); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // Soil.g:1028:7: (e= expression ( COMMA e= expression )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==IDENT||LA47_0==LPAREN||(LA47_0>=PLUS && LA47_0<=MINUS)||LA47_0==AT||(LA47_0>=INT && LA47_0<=HASH)||LA47_0==51||LA47_0==59||LA47_0==65||(LA47_0>=68 && LA47_0<=71)||(LA47_0>=73 && LA47_0<=85)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Soil.g:1029:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression3466);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // Soil.g:1030:7: ( COMMA e= expression )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==COMMA) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // Soil.g:1030:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3478); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression3482);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression3502); if (state.failed) return retval;

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
    // Soil.g:1043:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // Soil.g:1046:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // Soil.g:1047:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=69 && input.LA(1)<=71) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3567); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression3571);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3573); if (state.failed) return n;
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
    // Soil.g:1058:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : idListRes= idList ( COLON t= type )? ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        List idListRes = null;

        ASTType t = null;


         List idList; 
        try {
            // Soil.g:1060:1: (idListRes= idList ( COLON t= type )? )
            // Soil.g:1061:5: idListRes= idList ( COLON t= type )?
            {
            pushFollow(FOLLOW_idList_in_elemVarsDeclaration3612);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            // Soil.g:1062:5: ( COLON t= type )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==COLON) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Soil.g:1062:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3620); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3624);
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
    // Soil.g:1071:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        SoilParser.expression_return e = null;


        try {
            // Soil.g:1072:1: (name= IDENT COLON t= type EQUAL e= expression )
            // Soil.g:1073:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3659); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization3661); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization3665);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3667); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization3671);
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
    // Soil.g:1082:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        SoilParser.expression_return cond = null;

        SoilParser.expression_return t = null;

        SoilParser.expression_return e = null;


        try {
            // Soil.g:1083:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Soil.g:1084:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,51,FOLLOW_51_in_ifExpression3703); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3707);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,52,FOLLOW_52_in_ifExpression3709); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3713);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,53,FOLLOW_53_in_ifExpression3715); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3719);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,72,FOLLOW_72_in_ifExpression3721); if (state.failed) return n;
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
    // Soil.g:1104:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
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
            // Soil.g:1105:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt50=12;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // Soil.g:1106:7: t= 'true'
                    {
                    t=(Token)match(input,73,FOLLOW_73_in_literal3760); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:1107:7: f= 'false'
                    {
                    f=(Token)match(input,74,FOLLOW_74_in_literal3774); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:1108:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal3787); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // Soil.g:1109:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal3802); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // Soil.g:1110:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal3816); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // Soil.g:1111:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal3826); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3830); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // Soil.g:1112:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3842); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal3844); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal3848); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // Soil.g:1113:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal3860);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // Soil.g:1114:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal3872);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // Soil.g:1115:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal3884);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // Soil.g:1116:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal3896);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // Soil.g:1117:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal3908);
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
    // Soil.g:1125:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // Soil.g:1127:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Soil.g:1128:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=75 && input.LA(1)<=78) ) {
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
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral3975); if (state.failed) return n;
            // Soil.g:1132:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENT||LA52_0==LPAREN||(LA52_0>=PLUS && LA52_0<=MINUS)||LA52_0==AT||(LA52_0>=INT && LA52_0<=HASH)||LA52_0==51||LA52_0==59||LA52_0==65||(LA52_0>=68 && LA52_0<=71)||(LA52_0>=73 && LA52_0<=85)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Soil.g:1133:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral3992);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // Soil.g:1134:7: ( COMMA ci= collectionItem )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==COMMA) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // Soil.g:1134:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4005); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4009);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4028); if (state.failed) return n;

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
    // Soil.g:1143:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        SoilParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // Soil.g:1145:1: (e= expression ( DOTDOT e= expression )? )
            // Soil.g:1146:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem4057);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // Soil.g:1147:5: ( DOTDOT e= expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DOTDOT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Soil.g:1147:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4068); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem4072);
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
    // Soil.g:1157:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // Soil.g:1158:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==79) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=75 && LA54_0<=78)||LA54_0==85) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // Soil.g:1159:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,79,FOLLOW_79_in_emptyCollectionLiteral4101); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4103); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4107);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4109); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:1162:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4125);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4127); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4129); if (state.failed) return n;
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
    // Soil.g:1173:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // Soil.g:1174:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt55=1;
                }
                break;
            case 81:
                {
                alt55=2;
                }
                break;
            case 82:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==LPAREN) ) {
                    alt55=3;
                }
                else if ( (LA55_3==EOF||LA55_3==SEMI||LA55_3==DOT||(LA55_3>=RPAREN && LA55_3<=COMMA)||(LA55_3>=EQUAL && LA55_3<=ARROW)||LA55_3==BAR||LA55_3==RBRACK||LA55_3==DOTDOT||(LA55_3>=52 && LA55_3<=54)||(LA55_3>=56 && LA55_3<=57)||(LA55_3>=60 && LA55_3<=64)||LA55_3==72) ) {
                    alt55=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // Soil.g:1175:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,80,FOLLOW_80_in_undefinedLiteral4159); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4161); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral4165);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4167); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:1178:5: 'Undefined'
                    {
                    match(input,81,FOLLOW_81_in_undefinedLiteral4181); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:1181:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,82,FOLLOW_82_in_undefinedLiteral4195); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4197); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral4201);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4203); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // Soil.g:1184:5: 'null'
                    {
                    match(input,82,FOLLOW_82_in_undefinedLiteral4217); if (state.failed) return n;
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
    // Soil.g:1194:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // Soil.g:1196:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Soil.g:1197:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,83,FOLLOW_83_in_tupleLiteral4256); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral4262); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral4270);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // Soil.g:1200:5: ( COMMA ti= tupleItem )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // Soil.g:1200:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral4281); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral4285);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral4296); if (state.failed) return n;
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
    // Soil.g:1208:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        SoilParser.expression_return e = null;


        try {
            // Soil.g:1209:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Soil.g:1210:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem4327); if (state.failed) return n;
            // Soil.g:1211:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLON) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred2_Soil()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==EQUAL) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // Soil.g:1214:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem4366); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem4370);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem4372); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem4376);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:1217:7: ( COLON | EQUAL ) e= expression
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

                    pushFollow(FOLLOW_expression_in_tupleItem4408);
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
    // Soil.g:1226:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // Soil.g:1227:1: ( 'Date' LBRACE v= STRING RBRACE )
            // Soil.g:1228:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,84,FOLLOW_84_in_dateLiteral4453); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral4455); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral4459); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral4461); if (state.failed) return n;
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
    // Soil.g:1238:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // Soil.g:1240:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // Soil.g:1241:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // Soil.g:1242:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt58=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt58=1;
                }
                break;
            case 75:
            case 76:
            case 77:
            case 78:
            case 85:
                {
                alt58=2;
                }
                break;
            case 83:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // Soil.g:1243:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type4511);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // Soil.g:1244:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type4523);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // Soil.g:1245:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4535);
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
    // Soil.g:1250:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // Soil.g:1251:1: (nT= type EOF )
            // Soil.g:1252:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4567);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly4569); if (state.failed) return n;
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
    // Soil.g:1262:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // Soil.g:1263:1: (name= IDENT )
            // Soil.g:1264:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4597); if (state.failed) return n;
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
    // Soil.g:1272:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // Soil.g:1274:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Soil.g:1275:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=75 && input.LA(1)<=78)||input.LA(1)==85 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4662); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType4666);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4668); if (state.failed) return n;
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
    // Soil.g:1285:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // Soil.g:1287:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Soil.g:1288:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,83,FOLLOW_83_in_tupleType4702); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4704); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType4713);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // Soil.g:1290:5: ( COMMA tp= tuplePart )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Soil.g:1290:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4724); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType4728);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4740); if (state.failed) return n;
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
    // Soil.g:1299:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // Soil.g:1300:1: (name= IDENT COLON t= type )
            // Soil.g:1301:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4772); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart4774); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart4778);
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

    // $ANTLR start synpred1_Soil
    public final void synpred1_Soil_fragment() throws RecognitionException {   
        // Soil.g:172:5: ( statStartingWithExpr )
        // Soil.g:172:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred1_Soil217);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Soil

    // $ANTLR start synpred2_Soil
    public final void synpred2_Soil_fragment() throws RecognitionException {   
        // Soil.g:1214:7: ( COLON type EQUAL )
        // Soil.g:1214:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred2_Soil4357); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred2_Soil4359);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred2_Soil4361); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Soil

    // Delegated rules

    public final boolean synpred1_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Soil() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Soil_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA2_eotS =
        "\43\uffff";
    static final String DFA2_eofS =
        "\1\1\42\uffff";
    static final String DFA2_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA2_maxS =
        "\1\125\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\3\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA2_specialS =
        "\1\0\14\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\15\2\uffff\1\31\13\uffff\2\6\3\uffff\1\26\3\uffff\1\11"+
            "\1\12\1\13\1\14\13\uffff\1\33\1\uffff\1\34\1\35\1\uffff\1\36"+
            "\1\uffff\1\32\1\uffff\2\1\1\37\2\uffff\1\40\1\5\5\uffff\1\6"+
            "\2\uffff\1\27\3\30\1\uffff\1\7\1\10\4\16\1\17\1\21\1\22\1\23"+
            "\1\24\1\25\1\20",
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
            return "165:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
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
                        if ( (LA2_0==EOF||LA2_0==SEMI||(LA2_0>=53 && LA2_0<=54)) ) {s = 1;}

                        else if ( (LA2_0==59) && (synpred1_Soil())) {s = 5;}

                        else if ( ((LA2_0>=PLUS && LA2_0<=MINUS)||LA2_0==65) && (synpred1_Soil())) {s = 6;}

                        else if ( (LA2_0==73) && (synpred1_Soil())) {s = 7;}

                        else if ( (LA2_0==74) && (synpred1_Soil())) {s = 8;}

                        else if ( (LA2_0==INT) && (synpred1_Soil())) {s = 9;}

                        else if ( (LA2_0==REAL) && (synpred1_Soil())) {s = 10;}

                        else if ( (LA2_0==STRING) && (synpred1_Soil())) {s = 11;}

                        else if ( (LA2_0==HASH) && (synpred1_Soil())) {s = 12;}

                        else if ( (LA2_0==IDENT) ) {s = 13;}

                        else if ( ((LA2_0>=75 && LA2_0<=78)) && (synpred1_Soil())) {s = 14;}

                        else if ( (LA2_0==79) && (synpred1_Soil())) {s = 15;}

                        else if ( (LA2_0==85) && (synpred1_Soil())) {s = 16;}

                        else if ( (LA2_0==80) && (synpred1_Soil())) {s = 17;}

                        else if ( (LA2_0==81) && (synpred1_Soil())) {s = 18;}

                        else if ( (LA2_0==82) && (synpred1_Soil())) {s = 19;}

                        else if ( (LA2_0==83) && (synpred1_Soil())) {s = 20;}

                        else if ( (LA2_0==84) && (synpred1_Soil())) {s = 21;}

                        else if ( (LA2_0==AT) && (synpred1_Soil())) {s = 22;}

                        else if ( (LA2_0==68) && (synpred1_Soil())) {s = 23;}

                        else if ( ((LA2_0>=69 && LA2_0<=71)) && (synpred1_Soil())) {s = 24;}

                        else if ( (LA2_0==LPAREN) && (synpred1_Soil())) {s = 25;}

                        else if ( (LA2_0==51) ) {s = 26;}

                        else if ( (LA2_0==44) ) {s = 27;}

                        else if ( (LA2_0==46) ) {s = 28;}

                        else if ( (LA2_0==47) ) {s = 29;}

                        else if ( (LA2_0==49) ) {s = 30;}

                        else if ( (LA2_0==55) ) {s = 31;}

                        else if ( (LA2_0==58) ) {s = 32;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Soil()) ) {s = 25;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_26 = input.LA(1);

                         
                        int index2_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Soil()) ) {s = 25;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index2_26);
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
    static final String DFA50_eotS =
        "\16\uffff";
    static final String DFA50_eofS =
        "\16\uffff";
    static final String DFA50_minS =
        "\1\5\7\uffff\1\10\5\uffff";
    static final String DFA50_maxS =
        "\1\125\7\uffff\1\12\5\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA50_specialS =
        "\16\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\7\27\uffff\1\3\1\4\1\5\1\6\50\uffff\1\1\1\2\4\10\1\11\3\12"+
            "\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\15",
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
            return "1104:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
 

    public static final BitSet FOLLOW_stat_in_statOnly76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat111 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_SEMI_in_stat122 = new BitSet(new long[]{0x0C8AD001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_nextStat_in_stat128 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_singleStat_in_nextStat162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr404 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat456 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat460 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat512 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_objCreateStat546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat554 = new BitSet(new long[]{0x0000200000000102L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat564 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat576 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat582 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_objCreateStat600 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat608 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat622 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_objDestroyStat666 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_lnkInsStat700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat704 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat714 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat718 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_lnkInsStat722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers759 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers770 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers779 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers786 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers802 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers813 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers824 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers833 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers840 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers862 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers877 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers897 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers908 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers917 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_49_in_lnkDelStat958 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat962 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat972 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat976 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_lnkDelStat980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_condExStat1020 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat1029 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_condExStat1033 = new BitSet(new long[]{0x0C8AD001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_stat_in_condExStat1042 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_condExStat1053 = new BitSet(new long[]{0x0C8AD001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_stat_in_condExStat1065 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_condExStat1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_iterStat1101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_iterStat1109 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_iterStat1113 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat1121 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_iterStat1125 = new BitSet(new long[]{0x0C8AD001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_stat_in_iterStat1133 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_iterStat1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_whileStat1163 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat1171 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whileStat1175 = new BitSet(new long[]{0x0C8AD001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_stat_in_whileStat1183 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whileStat1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11335 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin11349 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_rValListMin11359 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21398 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21406 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21414 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin21428 = new BitSet(new long[]{0x08081001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_rValue_in_rValListMin21438 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11552 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin11567 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin11577 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21625 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21633 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin21647 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin21657 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_nothing_in_identList1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11738 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_identListMin11752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identListMin11762 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_expression1853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_expression1857 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COLON_in_expression1861 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_expression1865 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_expression1870 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_expression1874 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression1876 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList1934 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1951 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_COMMA_in_paramList1963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList1967 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RPAREN_in_paramList1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList2016 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_idList2026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_idList2030 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration2061 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration2063 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_variableDeclaration2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2103 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_conditionalImpliesExpression2116 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2120 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2165 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_conditionalOrExpression2178 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2182 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2226 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_conditionalXOrExpression2239 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2243 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2287 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_conditionalAndExpression2300 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2304 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2352 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_set_in_equalityExpression2371 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2381 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2430 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_set_in_relationalExpression2448 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2466 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2516 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_set_in_additiveExpression2534 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2544 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2594 = new BitSet(new long[]{0x0000000000C00002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2612 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2626 = new BitSet(new long[]{0x0000000000C00002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_unaryExpression2688 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2765 = new BitSet(new long[]{0x0000000001000082L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression2783 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000F0L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression2789 = new BitSet(new long[]{0x0000000000000020L,0x00000000000000F0L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression2800 = new BitSet(new long[]{0x0000000001000082L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2877 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2881 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2907 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_primaryExpression2911 = new BitSet(new long[]{0x0000000002000102L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2915 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2917 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_primaryExpression2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference2967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_objectReference2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression3114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression3121 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3132 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression3136 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_queryExpression3147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_iterateExpression3185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression3191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression3199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression3201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression3209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression3211 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_iterateExpression3219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression3269 = new BitSet(new long[]{0x000000000A000102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3291 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3304 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3317 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3321 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3333 = new BitSet(new long[]{0x000000000A000102L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3350 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3365 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3380 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3384 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3398 = new BitSet(new long[]{0x0000000002000102L});
    public static final BitSet FOLLOW_AT_in_operationExpression3423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_operationExpression3425 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression3445 = new BitSet(new long[]{0x08080001E2300320L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3466 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3478 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_operationExpression3482 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3551 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3567 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_typeExpression3571 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_elemVarsDeclaration3612 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3620 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3659 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3661 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_variableInitialization3665 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3667 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ifExpression3703 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_ifExpression3707 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ifExpression3709 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_ifExpression3713 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ifExpression3715 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_ifExpression3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifExpression3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_literal3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_literal3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal3826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_literal3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal3842 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal3844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_literal3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral3946 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral3975 = new BitSet(new long[]{0x08080001E2300920L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral3992 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral4005 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4009 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem4057 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem4068 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_collectionItem4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_emptyCollectionLiteral4101 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4103 = new BitSet(new long[]{0x0000000000000000L,0x000000000020F800L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4107 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4125 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4127 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_undefinedLiteral4159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4161 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_undefinedLiteral4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_undefinedLiteral4195 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4197 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4201 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_undefinedLiteral4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_tupleLiteral4256 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral4262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4270 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral4281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4285 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem4327 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COLON_in_tupleItem4366 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_tupleItem4370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem4372 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_tupleItem4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem4398 = new BitSet(new long[]{0x08080001E2300120L,0x00000000003FFEF2L});
    public static final BitSet FOLLOW_expression_in_tupleItem4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_dateLiteral4453 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral4455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral4459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4635 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4662 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_collectionType4666 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_tupleType4702 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4713 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4728 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4772 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4774 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_tuplePart4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred1_Soil217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_synpred2_Soil4357 = new BitSet(new long[]{0x0000000000000020L,0x000000000028F800L});
    public static final BitSet FOLLOW_type_in_synpred2_Soil4359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred2_Soil4361 = new BitSet(new long[]{0x0000000000000002L});

}