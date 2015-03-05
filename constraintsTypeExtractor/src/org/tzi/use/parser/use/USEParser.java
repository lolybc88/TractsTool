// $ANTLR 3.3 Nov 30, 2010 12:45:30 USE.g 2011-09-27 13:30:32
 
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

package org.tzi.use.parser.use; 

// ------------------------------------
//  USE parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;
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
@SuppressWarnings("all") public class USEParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "LBRACE", "RBRACE", "SEMI", "LESS", "COLON", "EQUAL", "LBRACK", "RBRACK", "COMMA", "DOTDOT", "INT", "STAR", "COLON_COLON", "AT", "LPAREN", "RPAREN", "NON_OCL_STRING", "NOT_EQUAL", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "PLUS", "MINUS", "SLASH", "ARROW", "DOT", "BAR", "REAL", "STRING", "HASH", "COLON_EQUAL", "NEWLINE", "WS", "SL_COMMENT", "ML_COMMENT", "RANGE_OR_INT", "ESC", "HEX_DIGIT", "VOCAB", "'model'", "'constraints'", "'enum'", "'abstract'", "'attributes'", "'operations'", "'end'", "'associationClass'", "'associationclass'", "'between'", "'begin'", "'ordered'", "'subsets'", "'redefines'", "'context'", "'inv'", "'existential'", "'pre'", "'post'", "'let'", "'in'", "'implies'", "'or'", "'xor'", "'and'", "'div'", "'not'", "'allInstances'", "'iterate'", "'oclAsType'", "'oclIsKindOf'", "'oclIsTypeOf'", "'if'", "'then'", "'else'", "'endif'", "'true'", "'false'", "'Set'", "'Sequence'", "'Bag'", "'OrderedSet'", "'oclEmpty'", "'oclUndefined'", "'Undefined'", "'null'", "'Tuple'", "'Date'", "'Collection'", "'new'", "'destroy'", "'insert'", "'into'", "'delete'", "'from'", "'for'", "'do'", "'while'"
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
    public static final int IDENT=4;
    public static final int LBRACE=5;
    public static final int RBRACE=6;
    public static final int SEMI=7;
    public static final int LESS=8;
    public static final int COLON=9;
    public static final int EQUAL=10;
    public static final int LBRACK=11;
    public static final int RBRACK=12;
    public static final int COMMA=13;
    public static final int DOTDOT=14;
    public static final int INT=15;
    public static final int STAR=16;
    public static final int COLON_COLON=17;
    public static final int AT=18;
    public static final int LPAREN=19;
    public static final int RPAREN=20;
    public static final int NON_OCL_STRING=21;
    public static final int NOT_EQUAL=22;
    public static final int GREATER=23;
    public static final int LESS_EQUAL=24;
    public static final int GREATER_EQUAL=25;
    public static final int PLUS=26;
    public static final int MINUS=27;
    public static final int SLASH=28;
    public static final int ARROW=29;
    public static final int DOT=30;
    public static final int BAR=31;
    public static final int REAL=32;
    public static final int STRING=33;
    public static final int HASH=34;
    public static final int COLON_EQUAL=35;
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


        public USEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public USEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return USEParser.tokenNames; }
    public String getGrammarFileName() { return "USE.g"; }



    // $ANTLR start "model"
    // USE.g:125:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;

        Token modelName=null;
        Set<ASTAnnotation> as = null;

        ASTEnumTypeDefinition e = null;

        ASTAssociation a = null;

        ASTConstraintDefinition cons = null;

        ASTPrePost ppc = null;


        try {
            // USE.g:126:1: (as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF )
            // USE.g:127:2: as= annotationSet 'model' modelName= IDENT (e= enumTypeDefinition )* ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model70);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,44,FOLLOW_44_in_model76); if (state.failed) return n;
            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model80); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTModel(modelName); n.setAnnotations(as); 
            }
            // USE.g:129:5: (e= enumTypeDefinition )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // USE.g:129:7: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model92);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnumTypeDef(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // USE.g:130:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*
            loop3:
            do {
                int alt3=4;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // USE.g:130:9: ( generalClassDefinition[$n] )
            	    {
            	    // USE.g:130:9: ( generalClassDefinition[$n] )
            	    // USE.g:130:11: generalClassDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassDefinition_in_model109);
            	    generalClassDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // USE.g:131:9: (a= associationDefinition )
            	    {
            	    // USE.g:131:9: (a= associationDefinition )
            	    // USE.g:131:11: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model126);
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
            	    // USE.g:132:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    {
            	    // USE.g:132:9: ( 'constraints' (cons= invariant | ppc= prePost )* )
            	    // USE.g:132:11: 'constraints' (cons= invariant | ppc= prePost )*
            	    {
            	    match(input,45,FOLLOW_45_in_model142); if (state.failed) return n;
            	    // USE.g:133:11: (cons= invariant | ppc= prePost )*
            	    loop2:
            	    do {
            	        int alt2=3;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==58) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( (LA2_2==IDENT) ) {
            	                int LA2_3 = input.LA(3);

            	                if ( (LA2_3==COLON_COLON) ) {
            	                    alt2=2;
            	                }
            	                else if ( (LA2_3==EOF||LA2_3==IDENT||LA2_3==COLON||LA2_3==COMMA||LA2_3==AT||LA2_3==45||LA2_3==47||(LA2_3>=51 && LA2_3<=52)||(LA2_3>=58 && LA2_3<=60)) ) {
            	                    alt2=1;
            	                }


            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // USE.g:133:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model160);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addConstraint(cons); 
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // USE.g:134:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model181);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;
            	    	    if ( state.backtracking==0 ) {
            	    	       n.addPrePost(ppc); 
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_model222); if (state.failed) return n;

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
    // USE.g:145:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List idListRes = null;


        try {
            // USE.g:146:1: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // USE.g:147:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition250);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            match(input,46,FOLLOW_46_in_enumTypeDefinition256); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition260); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition262); if (state.failed) return n;
            pushFollow(FOLLOW_idList_in_enumTypeDefinition266);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition268); if (state.failed) return n;
            // USE.g:148:54: ( SEMI )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SEMI) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // USE.g:148:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition272); if (state.failed) return n;

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
    // USE.g:157:1: generalClassDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) ;
    public final void generalClassDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as = null;

        ASTClass c = null;

        ASTAssociationClass ac = null;


         
          boolean isAbstract = false;

        try {
            // USE.g:161:1: (as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) ) )
            // USE.g:162:2: as= annotationSet ( 'abstract' )? ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassDefinition310);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;
            // USE.g:163:5: ( 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // USE.g:163:7: 'abstract'
                    {
                    match(input,47,FOLLOW_47_in_generalClassDefinition318); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       isAbstract = true; 
                    }

                    }
                    break;

            }

            // USE.g:164:5: ( (c= classDefinition[isAbstract] ) | (ac= associationClassDefinition[isAbstract] ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=51 && LA6_0<=52)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // USE.g:164:7: (c= classDefinition[isAbstract] )
                    {
                    // USE.g:164:7: (c= classDefinition[isAbstract] )
                    // USE.g:164:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassDefinition336);
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
                    // USE.g:165:7: (ac= associationClassDefinition[isAbstract] )
                    {
                    // USE.g:165:7: (ac= associationClassDefinition[isAbstract] )
                    // USE.g:165:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassDefinition356);
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
    // USE.g:182:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;

        Token name=null;
        List idListRes = null;

        ASTAttribute a = null;

        ASTOperation op = null;

        ASTInvariantClause inv = null;


         List idList; 
        try {
            // USE.g:184:1: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // USE.g:185:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition395);
            keyClass();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition399); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTClass(name, isAbstract); 
            }
            // USE.g:186:5: ( LESS idListRes= idList )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LESS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // USE.g:186:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition409); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_classDefinition413);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // USE.g:187:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // USE.g:187:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,48,FOLLOW_48_in_classDefinition426); if (state.failed) return n;
                    // USE.g:188:7: (a= attributeDefinition )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==IDENT||LA8_0==AT||LA8_0==44||(LA8_0>=46 && LA8_0<=47)||(LA8_0>=51 && LA8_0<=52)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // USE.g:188:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition439);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // USE.g:190:5: ( 'operations' (op= operationDefinition )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // USE.g:190:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,49,FOLLOW_49_in_classDefinition460); if (state.failed) return n;
                    // USE.g:191:7: (op= operationDefinition )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==IDENT||LA10_0==AT||LA10_0==44||(LA10_0>=46 && LA10_0<=47)||(LA10_0>=51 && LA10_0<=52)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // USE.g:191:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition473);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
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

            // USE.g:193:5: ( 'constraints' (inv= invariantClause )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // USE.g:193:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,45,FOLLOW_45_in_classDefinition494); if (state.failed) return n;
                    // USE.g:194:7: (inv= invariantClause )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=59 && LA12_0<=60)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // USE.g:195:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition514);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
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

            match(input,50,FOLLOW_50_in_classDefinition538); if (state.failed) return n;

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
    // USE.g:216:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
            // USE.g:218:1: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // USE.g:219:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
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
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition597); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationClass(name, isAbstract); 
            }
            // USE.g:228:5: ( LESS idListRes= idList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LESS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // USE.g:228:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition607); if (state.failed) return n;
                    pushFollow(FOLLOW_idList_in_associationClassDefinition611);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addSuperClasses(idListRes); 
                    }

                    }
                    break;

            }

            // USE.g:229:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // USE.g:229:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,53,FOLLOW_53_in_associationClassDefinition623); if (state.failed) return n;
                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition631);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addEnd(ae); 
                    }
                    // USE.g:231:5: (ae= associationEnd )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IDENT) ) {
                            int LA15_2 = input.LA(2);

                            if ( (LA15_2==LBRACK) ) {
                                alt15=1;
                            }


                        }
                        else if ( (LA15_0==AT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // USE.g:231:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition643);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addEnd(ae); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            // USE.g:233:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // USE.g:233:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,48,FOLLOW_48_in_associationClassDefinition663); if (state.failed) return n;
                    // USE.g:234:7: (a= attributeDefinition )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==IDENT) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==COLON) ) {
                                alt17=1;
                            }


                        }
                        else if ( (LA17_0==AT) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // USE.g:234:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition676);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addAttribute(a); 
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

            // USE.g:236:5: ( 'operations' (op= operationDefinition )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // USE.g:236:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,49,FOLLOW_49_in_associationClassDefinition697); if (state.failed) return n;
                    // USE.g:237:7: (op= operationDefinition )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==IDENT) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==LPAREN) ) {
                                alt19=1;
                            }


                        }
                        else if ( (LA19_0==AT) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // USE.g:237:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition710);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addOperation(op); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // USE.g:239:5: ( 'constraints' (inv= invariantClause )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // USE.g:239:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,45,FOLLOW_45_in_associationClassDefinition731); if (state.failed) return n;
                    // USE.g:240:7: (inv= invariantClause )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=59 && LA21_0<=60)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // USE.g:241:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition751);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addInvariantClause(inv); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // USE.g:244:5: ( ( keyAggregation | keyComposition ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // USE.g:244:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) {
                       t = input.LT(1); 
                    }
                    // USE.g:245:7: ( keyAggregation | keyComposition )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==IDENT) ) {
                        int LA23_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt23=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // USE.g:245:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition787);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:245:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition791);
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

            match(input,50,FOLLOW_50_in_associationClassDefinition814); if (state.failed) return n;

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
    // USE.g:255:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTType t = null;


        try {
            // USE.g:256:1: (as= annotationSet name= IDENT COLON t= type ( SEMI )? )
            // USE.g:257:2: as= annotationSet name= IDENT COLON t= type ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition842);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition850); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_attributeDefinition852); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_attributeDefinition856);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:258:29: ( SEMI )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SEMI) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // USE.g:258:31: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition860); if (state.failed) return n;

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
    // USE.g:267:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        List<ASTVariableDeclaration> pl = null;

        ASTType t = null;

        USEParser.expression_return e = null;

        USEParser.stat_return s = null;

        ASTPrePostClause ppc = null;


        try {
            // USE.g:268:1: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )? )
            // USE.g:269:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition897);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition907); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_operationDefinition917);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:275:5: ( COLON t= type )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // USE.g:275:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition931); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_operationDefinition937);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTOperation(name, pl, t); n.setAnnotations(as); 
            }
            // USE.g:277:5: ( ( EQUAL e= expression ) | ( 'begin' s= stat 'end' ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQUAL) ) {
                alt27=1;
            }
            else if ( (LA27_0==54) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // USE.g:278:9: ( EQUAL e= expression )
                    {
                    // USE.g:278:9: ( EQUAL e= expression )
                    // USE.g:278:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition965); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_operationDefinition971);
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
                    // USE.g:279:9: ( 'begin' s= stat 'end' )
                    {
                    // USE.g:279:9: ( 'begin' s= stat 'end' )
                    // USE.g:279:11: 'begin' s= stat 'end'
                    {
                    match(input,54,FOLLOW_54_in_operationDefinition989); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_operationDefinition995);
                    s=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,50,FOLLOW_50_in_operationDefinition997); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setStatement((s!=null?s.n:null));  
                    }

                    }


                    }
                    break;

            }

            // USE.g:281:5: (ppc= prePostClause )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=61 && LA28_0<=62)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // USE.g:281:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1018);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // USE.g:282:5: ( SEMI )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SEMI) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // USE.g:282:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1031); if (state.failed) return n;

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
    // USE.g:292:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;

        Token name=null;
        Set<ASTAnnotation> as = null;

        ASTAssociationEnd ae = null;


         Token t = null; 
        try {
            // USE.g:294:1: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // USE.g:295:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1062);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            // USE.g:297:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENT) ) {
                int LA30_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt30=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt30=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // USE.g:297:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1076);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:297:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1080);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // USE.g:297:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1084);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1094); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociation(t, name); n.setAnnotations(as); 
            }
            match(input,53,FOLLOW_53_in_associationDefinition1102); if (state.failed) return n;
            pushFollow(FOLLOW_associationEnd_in_associationDefinition1110);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addEnd(ae); 
            }
            // USE.g:301:5: (ae= associationEnd )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==IDENT||LA31_0==AT||LA31_0==44||(LA31_0>=46 && LA31_0<=47)||(LA31_0>=51 && LA31_0<=52)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // USE.g:301:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1122);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addEnd(ae); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            match(input,50,FOLLOW_50_in_associationDefinition1133); if (state.failed) return n;

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
    // USE.g:310:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;

        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as = null;

        ASTMultiplicity m = null;

        USEParser.expression_return exp = null;

        List<ASTVariableDeclaration> qualifiers = null;


        try {
            // USE.g:311:1: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // USE.g:312:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1158);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1166); if (state.failed) return n;
            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1168); if (state.failed) return n;
            pushFollow(FOLLOW_multiplicity_in_associationEnd1172);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;
            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1174); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTAssociationEnd(name, m); n.setAnnotations(as); 
            }
            // USE.g:314:5: ( keyRole rn= IDENT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==IDENT) ) {
                    int LA32_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt32=1;
                    }
                }
            }
            switch (alt32) {
                case 1 :
                    // USE.g:314:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1185);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;
                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1189); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.setRolename(rn); 
                    }

                    }
                    break;

            }

            // USE.g:315:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | keyDerived EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop33:
            do {
                int alt33=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==EQUAL) ) {
                        alt33=5;
                    }
                    else if ( (LA33_2==LPAREN) ) {
                        alt33=6;
                    }
                    else if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt33=3;
                    }


                    }
                    break;
                case 55:
                    {
                    alt33=1;
                    }
                    break;
                case 56:
                    {
                    alt33=2;
                    }
                    break;
                case 57:
                    {
                    alt33=4;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // USE.g:316:9: 'ordered'
            	    {
            	    match(input,55,FOLLOW_55_in_associationEnd1210); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setOrdered(); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // USE.g:317:9: 'subsets' sr= IDENT
            	    {
            	    match(input,56,FOLLOW_56_in_associationEnd1222); if (state.failed) return n;
            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1226); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addSubsetsRolename(sr); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:318:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1238);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setUnion(true); 
            	    }

            	    }
            	    break;
            	case 4 :
            	    // USE.g:319:9: 'redefines' rd= IDENT
            	    {
            	    match(input,57,FOLLOW_57_in_associationEnd1250); if (state.failed) return n;
            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1254); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRedefinesRolename(rd); 
            	    }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:320:9: keyDerived EQUAL exp= expression
            	    {
            	    pushFollow(FOLLOW_keyDerived_in_associationEnd1266);
            	    keyDerived();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1268); if (state.failed) return n;
            	    pushFollow(FOLLOW_expression_in_associationEnd1272);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.setDerived((exp!=null?exp.n:null)); 
            	    }

            	    }
            	    break;
            	case 6 :
            	    // USE.g:321:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1284);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    pushFollow(FOLLOW_paramList_in_associationEnd1290);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	      n.setQualifiers(qualifiers); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // USE.g:323:5: ( SEMI )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SEMI) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // USE.g:323:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1307); if (state.failed) return n;

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
    // USE.g:337:1: multiplicity returns [ASTMultiplicity n] : mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;

        ASTMultiplicityRange mr = null;


        try {
            // USE.g:338:1: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // USE.g:339:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) {
               
              	Token t = input.LT(1); // remember start position of expression
              	n = new ASTMultiplicity(t);
                  
            }
            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1342);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.addRange(mr); 
            }
            // USE.g:344:5: ( COMMA mr= multiplicityRange )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // USE.g:344:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1352); if (state.failed) return n;
            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1356);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addRange(mr); 
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
    // $ANTLR end "multiplicity"


    // $ANTLR start "multiplicityRange"
    // USE.g:347:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;

        int ms1 = 0;

        int ms2 = 0;


        try {
            // USE.g:348:1: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // USE.g:349:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1385);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = new ASTMultiplicityRange(ms1); 
            }
            // USE.g:350:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DOTDOT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // USE.g:350:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1395); if (state.failed) return n;
                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1399);
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
    // USE.g:353:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;

        Token i=null;

         m = -1; 
        try {
            // USE.g:355:1: (i= INT | STAR )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==STAR) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // USE.g:356:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec1433); if (state.failed) return m;
                    if ( state.backtracking==0 ) {
                       m = Integer.parseInt((i!=null?i.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:357:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec1443); if (state.failed) return m;
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
    // USE.g:378:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;

        Token v=null;
        ASTSimpleType t = null;

        ASTInvariantClause inv = null;


        try {
            // USE.g:379:1: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // USE.g:380:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) {
               n = new ASTConstraintDefinition(); 
            }
            match(input,58,FOLLOW_58_in_invariant1484); if (state.failed) return n;
            // USE.g:382:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==COLON||LA39_1==COMMA) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // USE.g:382:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant1494); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addVarName(v); 
                    }
                    // USE.g:383:8: ( ',' v= IDENT )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==COMMA) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // USE.g:383:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant1507); if (state.failed) return n;
                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant1511); if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addVarName(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,COLON,FOLLOW_COLON_in_invariant1519); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_simpleType_in_invariant1531);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setType(t); 
            }
            // USE.g:385:5: (inv= invariantClause )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=59 && LA40_0<=60)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // USE.g:385:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant1543);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addInvariantClause(inv); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // USE.g:392:1: invariantClause returns [ASTInvariantClause n] : ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;

        Token name=null;
        USEParser.expression_return e = null;


        try {
            // USE.g:393:1: ( 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==59) ) {
                alt43=1;
            }
            else if ( (LA43_0==60) ) {
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
                    // USE.g:394:7: 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,59,FOLLOW_59_in_invariantClause1574); if (state.failed) return n;
                    // USE.g:394:13: (name= IDENT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==IDENT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // USE.g:394:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause1580); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause1585); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause1589);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTInvariantClause(name, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:395:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,60,FOLLOW_60_in_invariantClause1599); if (state.failed) return n;
                    match(input,59,FOLLOW_59_in_invariantClause1601); if (state.failed) return n;
                    // USE.g:395:27: (name= IDENT )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==IDENT) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // USE.g:395:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause1607); if (state.failed) return n;

                            }
                            break;

                    }

                    match(input,COLON,FOLLOW_COLON_in_invariantClause1612); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_invariantClause1616);
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
    // USE.g:406:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;

        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl = null;

        ASTType rt = null;

        ASTPrePostClause ppc = null;


        try {
            // USE.g:407:1: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // USE.g:408:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,58,FOLLOW_58_in_prePost1642); if (state.failed) return n;
            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost1646); if (state.failed) return n;
            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost1648); if (state.failed) return n;
            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost1652); if (state.failed) return n;
            pushFollow(FOLLOW_paramList_in_prePost1656);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:408:69: ( COLON rt= type )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COLON) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // USE.g:408:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost1660); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_prePost1664);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               n = new ASTPrePost(classname, opname, pl, rt); 
            }
            // USE.g:410:5: (ppc= prePostClause )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=61 && LA45_0<=62)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // USE.g:410:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost1683);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.addPrePostClause(ppc); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // USE.g:417:1: prePostClause returns [ASTPrePostClause n] : ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;

        Token name=null;
        USEParser.expression_return e = null;


         Token t = null; 
        try {
            // USE.g:419:1: ( ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // USE.g:420:5: ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            if ( state.backtracking==0 ) {
               t = input.LT(1); 
            }
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // USE.g:421:25: (name= IDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // USE.g:421:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause1737); if (state.failed) return n;

                    }
                    break;

            }

            match(input,COLON,FOLLOW_COLON_in_prePostClause1742); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_prePostClause1746);
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
    // USE.g:425:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;

        ASTAnnotation an = null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // USE.g:427:1: ( (an= annotation )* )
            // USE.g:428:2: (an= annotation )*
            {
            // USE.g:428:2: (an= annotation )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==AT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // USE.g:428:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet1773);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;
            	    if ( state.backtracking==0 ) {
            	       annotations.add(an); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // USE.g:431:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;

        Token name=null;
        Map<Token, Token> values = null;


        try {
            // USE.g:431:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // USE.g:432:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation1792); if (state.failed) return n;
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation1796); if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = new ASTAnnotation(name);
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_annotation1802); if (state.failed) return n;
            pushFollow(FOLLOW_annotationValues_in_annotation1811);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setValues(values); 
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_annotation1816); if (state.failed) return n;

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
    // USE.g:438:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;

        USEParser.annotationValue_return firstVal = null;

        USEParser.annotationValue_return val = null;


         values = new HashMap<Token, Token>(); 
        try {
            // USE.g:440:1: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // USE.g:441:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // USE.g:441:2: (firstVal= annotationValue )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // USE.g:441:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues1839);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;
                    if ( state.backtracking==0 ) {
                       values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); 
                    }

                    }
                    break;

            }

            // USE.g:442:2: ( COMMA val= annotationValue )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // USE.g:442:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues1847); if (state.failed) return values;
            	    pushFollow(FOLLOW_annotationValue_in_annotationValues1851);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;
            	    if ( state.backtracking==0 ) {
            	       values.put((val!=null?val.name:null), (val!=null?val.value:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // USE.g:445:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
        USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
        retval.start = input.LT(1);

        Token aName=null;
        Token aValue=null;

        try {
            // USE.g:445:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // USE.g:446:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue1870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.name = aName; 
            }
            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue1875); if (state.failed) return retval;
            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue1881); if (state.failed) return retval;
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
    // USE.g:451:1: keyUnion : {...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // USE.g:451:9: ({...}? IDENT )
            // USE.g:452:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyUnion1895); if (state.failed) return ;

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
    // USE.g:454:1: keyAssociation : {...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // USE.g:454:15: ({...}? IDENT )
            // USE.g:455:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation1909); if (state.failed) return ;

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
    // USE.g:457:1: keyRole : {...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // USE.g:457:8: ({...}? IDENT )
            // USE.g:458:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyRole1923); if (state.failed) return ;

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
    // USE.g:460:1: keyComposition : {...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // USE.g:460:15: ({...}? IDENT )
            // USE.g:461:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyComposition1935); if (state.failed) return ;

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
    // USE.g:463:1: keyAggregation : {...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // USE.g:463:15: ({...}? IDENT )
            // USE.g:464:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation1947); if (state.failed) return ;

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
    // USE.g:466:1: keyClass : {...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // USE.g:466:9: ({...}? IDENT )
            // USE.g:467:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyClass1961); if (state.failed) return ;

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
    // USE.g:469:1: keyDerived : {...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // USE.g:469:11: ({...}? IDENT )
            // USE.g:470:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyDerived1973); if (state.failed) return ;

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
    // USE.g:472:1: keyQualifier : {...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // USE.g:472:13: ({...}? IDENT )
            // USE.g:473:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }
            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier1987); if (state.failed) return ;

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
    // USE.g:503:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;

        USEParser.expression_return nExp = null;


        try {
            // USE.g:504:1: (nExp= expression EOF )
            // USE.g:505:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly2017);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_expressionOnly2019); if (state.failed) return n;
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
    // USE.g:512:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final USEParser.expression_return expression() throws RecognitionException {
        USEParser.expression_return retval = new USEParser.expression_return();
        retval.start = input.LT(1);

        Token name=null;
        ASTType t = null;

        USEParser.expression_return e1 = null;

        ASTExpression nCndImplies = null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // USE.g:518:1: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression )
            // USE.g:519:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of expression */ 
            }
            // USE.g:520:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==63) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // USE.g:521:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression 'in'
            	    {
            	    match(input,63,FOLLOW_63_in_expression2067); if (state.failed) return retval;
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2071); if (state.failed) return retval;
            	    // USE.g:521:24: ( COLON t= type )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==COLON) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // USE.g:521:26: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression2075); if (state.failed) return retval;
            	            pushFollow(FOLLOW_type_in_expression2079);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2084); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_expression2088);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    match(input,64,FOLLOW_64_in_expression2090); if (state.failed) return retval;
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
            	    break loop51;
                }
            } while (true);

            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression2115);
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
    // USE.g:549:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;

        ASTVariableDeclaration v = null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // USE.g:551:1: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // USE.g:552:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList2148); if (state.failed) return paramList;
            // USE.g:553:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==IDENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // USE.g:554:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList2165);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;
                    if ( state.backtracking==0 ) {
                       paramList.add(v); 
                    }
                    // USE.g:555:7: ( COMMA v= variableDeclaration )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // USE.g:555:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList2177); if (state.failed) return paramList;
                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList2181);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;
                    	    if ( state.backtracking==0 ) {
                    	       paramList.add(v); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_paramList2201); if (state.failed) return paramList;

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
    // USE.g:563:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;

        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // USE.g:565:1: (id0= IDENT ( COMMA idn= IDENT )* )
            // USE.g:566:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2230); if (state.failed) return idList;
            if ( state.backtracking==0 ) {
               idList.add(id0); 
            }
            // USE.g:567:5: ( COMMA idn= IDENT )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // USE.g:567:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList2240); if (state.failed) return idList;
            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList2244); if (state.failed) return idList;
            	    if ( state.backtracking==0 ) {
            	       idList.add(idn); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // USE.g:575:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;

        Token name=null;
        ASTType t = null;


        try {
            // USE.g:576:1: (name= IDENT COLON t= type )
            // USE.g:577:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration2275); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableDeclaration2277); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableDeclaration2281);
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
    // USE.g:585:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndOrExp = null;

        ASTExpression n1 = null;


        try {
            // USE.g:586:1: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // USE.g:587:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2317);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndOrExp;
            }
            // USE.g:588:5: (op= 'implies' n1= conditionalOrExpression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==65) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // USE.g:588:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,65,FOLLOW_65_in_conditionalImpliesExpression2330); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2334);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // USE.g:597:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndXorExp = null;

        ASTExpression n1 = null;


        try {
            // USE.g:598:1: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // USE.g:599:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2379);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndXorExp;
            }
            // USE.g:600:5: (op= 'or' n1= conditionalXOrExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==66) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // USE.g:600:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,66,FOLLOW_66_in_conditionalOrExpression2392); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2396);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // USE.g:609:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nCndAndExp = null;

        ASTExpression n1 = null;


        try {
            // USE.g:610:1: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // USE.g:611:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2440);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nCndAndExp;
            }
            // USE.g:612:5: (op= 'xor' n1= conditionalAndExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==67) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // USE.g:612:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,67,FOLLOW_67_in_conditionalXOrExpression2453); if (state.failed) return n;
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2457);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // USE.g:621:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTExpression nEqExp = null;

        ASTExpression n1 = null;


        try {
            // USE.g:622:1: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // USE.g:623:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2501);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nEqExp;
            }
            // USE.g:624:5: (op= 'and' n1= equalityExpression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==68) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // USE.g:624:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,68,FOLLOW_68_in_conditionalAndExpression2514); if (state.failed) return n;
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression2518);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "conditionalAndExpression"


    // $ANTLR start "equalityExpression"
    // USE.g:633:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nRelExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // USE.g:635:1: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // USE.g:636:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression2566);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nRelExp;
            }
            // USE.g:637:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==EQUAL||LA59_0==NOT_EQUAL) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // USE.g:637:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2595);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // USE.g:647:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nAddiExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // USE.g:649:1: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // USE.g:650:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression2644);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nAddiExp;
            }
            // USE.g:651:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==LESS||(LA60_0>=GREATER && LA60_0<=GREATER_EQUAL)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // USE.g:651:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression2680);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // USE.g:661:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nMulExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // USE.g:663:1: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // USE.g:664:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2730);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
              n = nMulExp;
            }
            // USE.g:665:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=PLUS && LA61_0<=MINUS)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // USE.g:665:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2758);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // USE.g:676:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression n1 = null;


         Token op = null; 
        try {
            // USE.g:678:1: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // USE.g:679:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2808);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nUnExp;
            }
            // USE.g:680:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==STAR||LA62_0==SLASH||LA62_0==69) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // USE.g:680:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       op = input.LT(1); 
            	    }
            	    if ( input.LA(1)==STAR||input.LA(1)==SLASH||input.LA(1)==69 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2840);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = new ASTBinaryExpression(op, n, n1); 
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
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // USE.g:692:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nUnExp = null;

        ASTExpression nPosExp = null;


         Token op = null; 
        try {
            // USE.g:694:1: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) | nPosExp= postfixExpression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=PLUS && LA63_0<=MINUS)||LA63_0==70) ) {
                alt63=1;
            }
            else if ( (LA63_0==IDENT||LA63_0==INT||(LA63_0>=AT && LA63_0<=LPAREN)||(LA63_0>=REAL && LA63_0<=HASH)||(LA63_0>=72 && LA63_0<=76)||(LA63_0>=80 && LA63_0<=92)) ) {
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
                    // USE.g:695:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // USE.g:695:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // USE.g:695:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       op = input.LT(1); 
                    }
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS)||input.LA(1)==70 ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2926);
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
                    // USE.g:699:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2946);
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
    // USE.g:707:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nPrimExp = null;

        ASTExpression nPc = null;


         boolean arrow = false; 
        try {
            // USE.g:709:1: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // USE.g:710:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2979);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n = nPrimExp; 
            }
            // USE.g:711:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==DOT) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==IDENT) ) {
                        int LA65_4 = input.LA(3);

                        if ( (LA65_4==EOF||(LA65_4>=IDENT && LA65_4<=LESS)||(LA65_4>=EQUAL && LA65_4<=DOTDOT)||LA65_4==STAR||(LA65_4>=AT && LA65_4<=RPAREN)||(LA65_4>=NOT_EQUAL && LA65_4<=BAR)||LA65_4==45||(LA65_4>=47 && LA65_4<=52)||(LA65_4>=55 && LA65_4<=62)||(LA65_4>=64 && LA65_4<=69)||(LA65_4>=77 && LA65_4<=79)||LA65_4==100) ) {
                            alt65=1;
                        }


                    }
                    else if ( ((LA65_2>=72 && LA65_2<=75)) ) {
                        alt65=1;
                    }


                }
                else if ( (LA65_0==ARROW) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // USE.g:712:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // USE.g:712:6: ( ARROW | DOT )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==ARROW) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==DOT) ) {
            	        alt64=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // USE.g:712:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression2997); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = true; 
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:712:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression3003); if (state.failed) return n;
            	            if ( state.backtracking==0 ) {
            	               arrow = false; 
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression3014);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n = nPc; 
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
    // $ANTLR end "postfixExpression"


    // $ANTLR start "primaryExpression"
    // USE.g:728:1: primaryExpression returns [ASTExpression n] : (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;

        Token id1=null;
        ASTExpression nLit = null;

        ASTExpression nOr = null;

        ASTExpression nPc = null;

        USEParser.expression_return nExp = null;

        ASTExpression nIfExp = null;


        try {
            // USE.g:729:1: (nLit= literal | nOr= objectReference | nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN | nIfExp= ifExpression | id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )? )
            int alt68=6;
            switch ( input.LA(1) ) {
            case INT:
            case REAL:
            case STRING:
            case HASH:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                {
                alt68=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt68=1;
                    }
                    break;
                case EOF:
                case IDENT:
                case LBRACE:
                case RBRACE:
                case SEMI:
                case LESS:
                case EQUAL:
                case LBRACK:
                case RBRACK:
                case COMMA:
                case DOTDOT:
                case STAR:
                case AT:
                case LPAREN:
                case RPAREN:
                case NOT_EQUAL:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                case PLUS:
                case MINUS:
                case SLASH:
                case ARROW:
                case BAR:
                case 45:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 77:
                case 78:
                case 79:
                case 100:
                    {
                    alt68=3;
                    }
                    break;
                case DOT:
                    {
                    int LA68_7 = input.LA(3);

                    if ( (LA68_7==71) ) {
                        alt68=6;
                    }
                    else if ( (LA68_7==IDENT||(LA68_7>=72 && LA68_7<=75)) ) {
                        alt68=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }

                }
                break;
            case AT:
                {
                alt68=2;
                }
                break;
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt68=3;
                }
                break;
            case LPAREN:
                {
                alt68=4;
                }
                break;
            case 76:
                {
                alt68=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // USE.g:730:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3054);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nLit; 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:731:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression3068);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nOr; 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:732:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression3080);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nPc; 
                    }

                    }
                    break;
                case 4 :
                    // USE.g:733:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3091); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_primaryExpression3095);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3097); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExp!=null?nExp.n:null); 
                    }

                    }
                    break;
                case 5 :
                    // USE.g:734:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression3109);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nIfExp; 
                    }

                    }
                    break;
                case 6 :
                    // USE.g:735:7: id1= IDENT DOT 'allInstances' ( LPAREN RPAREN )? ( AT 'pre' )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3121); if (state.failed) return n;
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3123); if (state.failed) return n;
                    match(input,71,FOLLOW_71_in_primaryExpression3125); if (state.failed) return n;
                    // USE.g:735:36: ( LPAREN RPAREN )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==LPAREN) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // USE.g:735:38: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3129); if (state.failed) return n;
                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3131); if (state.failed) return n;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       n = new ASTAllInstancesExpression(id1); 
                    }
                    // USE.g:737:7: ( AT 'pre' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==AT) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==61) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // USE.g:737:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression3152); if (state.failed) return n;
                            match(input,61,FOLLOW_61_in_primaryExpression3154); if (state.failed) return n;
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
    // USE.g:741:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;

        Token objectName=null;

        try {
            // USE.g:742:1: ( AT objectName= IDENT )
            // USE.g:743:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference3181); if (state.failed) return n;
            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference3189); if (state.failed) return n;
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
    // USE.g:757:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;

        ASTExpression nExpQuery = null;

        ASTExpression nExpIterate = null;

        USEParser.operationExpression_return nExpOperation = null;

        ASTTypeArgExpression nExpType = null;


        try {
            // USE.g:758:1: ({...}?{...}?nExpQuery= queryExpression[source] | nExpIterate= iterateExpression[source] | nExpOperation= operationExpression[source, followsArrow] | nExpType= typeExpression[source, followsArrow] )
            int alt69=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA69_1 = input.LA(2);

                if ( ((( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )&&( input.LA(2) == LPAREN ))) ) {
                    alt69=1;
                }
                else if ( (true) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                alt69=2;
                }
                break;
            case 73:
            case 74:
            case 75:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // USE.g:762:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }
                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }
                    pushFollow(FOLLOW_queryExpression_in_propertyCall3254);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpQuery; 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:765:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall3267);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nExpIterate; 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:766:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall3280);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (nExpOperation!=null?nExpOperation.n:null); 
                    }

                    }
                    break;
                case 4 :
                    // USE.g:767:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall3293);
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
    // USE.g:776:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token op=null;
        ASTElemVarsDeclaration decls = null;

        USEParser.expression_return nExp = null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // USE.g:777:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // USE.g:778:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression3328); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression3335); if (state.failed) return n;
            // USE.g:780:5: (decls= elemVarsDeclaration BAR )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENT) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==COLON||LA70_1==COMMA||LA70_1==BAR) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // USE.g:780:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression3346);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      decl = decls;
                    }
                    match(input,BAR,FOLLOW_BAR_in_queryExpression3350); if (state.failed) return n;

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_queryExpression3361);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression3367); if (state.failed) return n;
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
    // USE.g:794:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        ASTElemVarsDeclaration decls = null;

        ASTVariableInitialization init = null;

        USEParser.expression_return nExp = null;


        try {
            // USE.g:794:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // USE.g:795:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,72,FOLLOW_72_in_iterateExpression3399); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression3405); if (state.failed) return n;
            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression3413);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;
            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression3415); if (state.failed) return n;
            pushFollow(FOLLOW_variableInitialization_in_iterateExpression3423);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;
            match(input,BAR,FOLLOW_BAR_in_iterateExpression3425); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_iterateExpression3433);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression3439); if (state.failed) return n;
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
    // USE.g:816:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
        retval.start = input.LT(1);

        Token name=null;
        USEParser.expression_return rolename = null;

        USEParser.expression_return e = null;


        try {
            // USE.g:818:1: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // USE.g:819:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression3483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.n = new ASTOperationExpression(name, source, followsArrow); 
            }
            // USE.g:825:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LBRACK) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // USE.g:825:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3505); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_operationExpression3518);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    }
                    // USE.g:827:9: ( COMMA rolename= expression )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==COMMA) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // USE.g:827:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3531); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_expression_in_operationExpression3535);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	       retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3547); if (state.failed) return retval;
                    // USE.g:830:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LBRACK) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // USE.g:830:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression3564); if (state.failed) return retval;
                            pushFollow(FOLLOW_expression_in_operationExpression3579);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            }
                            // USE.g:832:11: ( COMMA rolename= expression )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==COMMA) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // USE.g:832:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3594); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression3598);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addQualifier((rolename!=null?rolename.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop72;
                                }
                            } while (true);

                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression3612); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            // USE.g:837:5: ( AT 'pre' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==AT) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==61) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // USE.g:837:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression3637); if (state.failed) return retval;
                    match(input,61,FOLLOW_61_in_operationExpression3639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.setIsPre(); 
                    }

                    }
                    break;

            }

            // USE.g:838:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==LPAREN) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // USE.g:839:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression3659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n.hasParentheses(); 
                    }
                    // USE.g:840:7: (e= expression ( COMMA e= expression )* )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==IDENT||LA77_0==INT||(LA77_0>=AT && LA77_0<=LPAREN)||(LA77_0>=PLUS && LA77_0<=MINUS)||(LA77_0>=REAL && LA77_0<=HASH)||LA77_0==63||LA77_0==70||(LA77_0>=72 && LA77_0<=76)||(LA77_0>=80 && LA77_0<=92)) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // USE.g:841:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression3680);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                               retval.n.addArg((e!=null?e.n:null)); 
                            }
                            // USE.g:842:7: ( COMMA e= expression )*
                            loop76:
                            do {
                                int alt76=2;
                                int LA76_0 = input.LA(1);

                                if ( (LA76_0==COMMA) ) {
                                    alt76=1;
                                }


                                switch (alt76) {
                            	case 1 :
                            	    // USE.g:842:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression3692); if (state.failed) return retval;
                            	    pushFollow(FOLLOW_expression_in_operationExpression3696);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	       retval.n.addArg((e!=null?e.n:null)); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop76;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression3716); if (state.failed) return retval;

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
    // USE.g:855:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;

        ASTType t = null;


         Token opToken = null; 
        try {
            // USE.g:858:1: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN )
            // USE.g:859:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) {
               opToken = input.LT(1); 
            }
            if ( (input.LA(1)>=73 && input.LA(1)<=75) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression3781); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_typeExpression3785);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression3787); if (state.failed) return n;
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
    // USE.g:870:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] : idListRes= idList ( COLON t= type )? ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;

        List idListRes = null;

        ASTType t = null;


         List idList; 
        try {
            // USE.g:872:1: (idListRes= idList ( COLON t= type )? )
            // USE.g:873:5: idListRes= idList ( COLON t= type )?
            {
            pushFollow(FOLLOW_idList_in_elemVarsDeclaration3826);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:874:5: ( COLON t= type )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==COLON) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // USE.g:874:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration3834); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_elemVarsDeclaration3838);
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
    // USE.g:883:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;

        Token name=null;
        ASTType t = null;

        USEParser.expression_return e = null;


        try {
            // USE.g:884:1: (name= IDENT COLON t= type EQUAL e= expression )
            // USE.g:885:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization3873); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_variableInitialization3875); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_variableInitialization3879);
            t=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization3881); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_variableInitialization3885);
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
    // USE.g:894:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;

        Token i=null;
        USEParser.expression_return cond = null;

        USEParser.expression_return t = null;

        USEParser.expression_return e = null;


        try {
            // USE.g:895:1: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // USE.g:896:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,76,FOLLOW_76_in_ifExpression3917); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3921);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,77,FOLLOW_77_in_ifExpression3923); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3927);
            t=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,78,FOLLOW_78_in_ifExpression3929); if (state.failed) return n;
            pushFollow(FOLLOW_expression_in_ifExpression3933);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            match(input,79,FOLLOW_79_in_ifExpression3935); if (state.failed) return n;
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
    // USE.g:916:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );
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
            // USE.g:917:1: (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral )
            int alt80=12;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // USE.g:918:7: t= 'true'
                    {
                    t=(Token)match(input,80,FOLLOW_80_in_literal3974); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(true); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:919:7: f= 'false'
                    {
                    f=(Token)match(input,81,FOLLOW_81_in_literal3988); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTBooleanLiteral(false); 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:920:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal4001); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTIntegerLiteral(i); 
                    }

                    }
                    break;
                case 4 :
                    // USE.g:921:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal4016); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTRealLiteral(r); 
                    }

                    }
                    break;
                case 5 :
                    // USE.g:922:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal4030); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTStringLiteral(s); 
                    }

                    }
                    break;
                case 6 :
                    // USE.g:923:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal4040); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4044); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumLit);
                    }

                    }
                    break;
                case 7 :
                    // USE.g:924:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4056); if (state.failed) return n;
                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal4058); if (state.failed) return n;
                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal4062); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEnumLiteral(enumName, enumLit); 
                    }

                    }
                    break;
                case 8 :
                    // USE.g:925:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal4074);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nColIt; 
                    }

                    }
                    break;
                case 9 :
                    // USE.g:926:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal4086);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nEColIt; 
                    }

                    }
                    break;
                case 10 :
                    // USE.g:927:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal4098);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nUndLit; 
                    }

                    }
                    break;
                case 11 :
                    // USE.g:928:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal4110);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                      n = nTupleLit; 
                    }

                    }
                    break;
                case 12 :
                    // USE.g:929:7: nDateLit= dateLiteral
                    {
                    pushFollow(FOLLOW_dateLiteral_in_literal4122);
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
    // USE.g:937:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;

        ASTCollectionItem ci = null;


         Token op = null; 
        try {
            // USE.g:939:1: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // USE.g:940:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=82 && input.LA(1)<=85) ) {
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
            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral4189); if (state.failed) return n;
            // USE.g:944:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IDENT||LA82_0==INT||(LA82_0>=AT && LA82_0<=LPAREN)||(LA82_0>=PLUS && LA82_0<=MINUS)||(LA82_0>=REAL && LA82_0<=HASH)||LA82_0==63||LA82_0==70||(LA82_0>=72 && LA82_0<=76)||(LA82_0>=80 && LA82_0<=92)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // USE.g:945:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4206);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n.addItem(ci); 
                    }
                    // USE.g:946:7: ( COMMA ci= collectionItem )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==COMMA) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // USE.g:946:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral4219); if (state.failed) return n;
                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral4223);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;
                    	    if ( state.backtracking==0 ) {
                    	       n.addItem(ci); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral4242); if (state.failed) return n;

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
    // USE.g:955:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;

        USEParser.expression_return e = null;


         n = new ASTCollectionItem(); 
        try {
            // USE.g:957:1: (e= expression ( DOTDOT e= expression )? )
            // USE.g:958:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem4271);
            e=expression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.setFirst((e!=null?e.n:null)); 
            }
            // USE.g:959:5: ( DOTDOT e= expression )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==DOTDOT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // USE.g:959:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem4282); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_collectionItem4286);
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
    // USE.g:969:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;

        ASTCollectionType t = null;


        try {
            // USE.g:970:1: ( 'oclEmpty' LPAREN t= collectionType RPAREN | t= collectionType LBRACE RBRACE )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==86) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=82 && LA84_0<=85)||LA84_0==92) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // USE.g:971:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,86,FOLLOW_86_in_emptyCollectionLiteral4315); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral4317); if (state.failed) return n;
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4321);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral4323); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTEmptyCollectionLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:974:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral4339);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral4341); if (state.failed) return n;
                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral4343); if (state.failed) return n;
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
    // USE.g:985:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;

        ASTType t = null;


        try {
            // USE.g:986:1: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt85=1;
                }
                break;
            case 88:
                {
                alt85=2;
                }
                break;
            case 89:
                {
                int LA85_3 = input.LA(2);

                if ( (LA85_3==LPAREN) ) {
                    alt85=3;
                }
                else if ( (LA85_3==EOF||(LA85_3>=IDENT && LA85_3<=LESS)||LA85_3==EQUAL||(LA85_3>=RBRACK && LA85_3<=DOTDOT)||LA85_3==STAR||LA85_3==AT||LA85_3==RPAREN||(LA85_3>=NOT_EQUAL && LA85_3<=BAR)||LA85_3==45||(LA85_3>=47 && LA85_3<=52)||(LA85_3>=55 && LA85_3<=62)||(LA85_3>=64 && LA85_3<=69)||(LA85_3>=77 && LA85_3<=79)||LA85_3==100) ) {
                    alt85=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // USE.g:987:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,87,FOLLOW_87_in_undefinedLiteral4373); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4375); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral4379);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4381); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:990:5: 'Undefined'
                    {
                    match(input,88,FOLLOW_88_in_undefinedLiteral4395); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(); 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:993:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,89,FOLLOW_89_in_undefinedLiteral4409); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral4411); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_undefinedLiteral4415);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral4417); if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTUndefinedLiteral(t); 
                    }

                    }
                    break;
                case 4 :
                    // USE.g:996:5: 'null'
                    {
                    match(input,89,FOLLOW_89_in_undefinedLiteral4431); if (state.failed) return n;
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
    // USE.g:1006:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;

        ASTTupleItem ti = null;


         List tiList = new ArrayList(); 
        try {
            // USE.g:1008:1: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // USE.g:1009:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,90,FOLLOW_90_in_tupleLiteral4470); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral4476); if (state.failed) return n;
            pushFollow(FOLLOW_tupleItem_in_tupleLiteral4484);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tiList.add(ti); 
            }
            // USE.g:1012:5: ( COMMA ti= tupleItem )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMMA) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // USE.g:1012:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral4495); if (state.failed) return n;
            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral4499);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tiList.add(ti); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral4510); if (state.failed) return n;
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
    // USE.g:1020:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;

        Token name=null;
        ASTType t = null;

        USEParser.expression_return e = null;


        try {
            // USE.g:1021:1: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // USE.g:1022:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem4541); if (state.failed) return n;
            // USE.g:1023:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==COLON) ) {
                int LA87_1 = input.LA(2);

                if ( (synpred1_USE()) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA87_0==EQUAL) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // USE.g:1026:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem4580); if (state.failed) return n;
                    pushFollow(FOLLOW_type_in_tupleItem4584);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem4586); if (state.failed) return n;
                    pushFollow(FOLLOW_expression_in_tupleItem4590);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ASTTupleItem(name, t, (e!=null?e.n:null)); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1029:7: ( COLON | EQUAL ) e= expression
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

                    pushFollow(FOLLOW_expression_in_tupleItem4622);
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
    // USE.g:1038:1: dateLiteral returns [ASTDateLiteral n] : 'Date' LBRACE v= STRING RBRACE ;
    public final ASTDateLiteral dateLiteral() throws RecognitionException {
        ASTDateLiteral n = null;

        Token v=null;

        try {
            // USE.g:1039:1: ( 'Date' LBRACE v= STRING RBRACE )
            // USE.g:1040:5: 'Date' LBRACE v= STRING RBRACE
            {
            match(input,91,FOLLOW_91_in_dateLiteral4667); if (state.failed) return n;
            match(input,LBRACE,FOLLOW_LBRACE_in_dateLiteral4669); if (state.failed) return n;
            v=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral4673); if (state.failed) return n;
            match(input,RBRACE,FOLLOW_RBRACE_in_dateLiteral4675); if (state.failed) return n;
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
    // USE.g:1050:1: type returns [ASTType n] : (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;

        ASTSimpleType nTSimple = null;

        ASTCollectionType nTCollection = null;

        ASTTupleType nTTuple = null;


         Token tok = null; 
        try {
            // USE.g:1052:1: ( (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType ) )
            // USE.g:1053:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) {
               tok = input.LT(1); /* remember start of type */ 
            }
            // USE.g:1054:5: (nTSimple= simpleType | nTCollection= collectionType | nTTuple= tupleType )
            int alt88=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt88=1;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 92:
                {
                alt88=2;
                }
                break;
            case 90:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // USE.g:1055:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type4725);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTSimple; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1056:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type4737);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = nTCollection; if (n != null) n.setStartToken(tok); 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:1057:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type4749);
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
    // USE.g:1062:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;

        ASTType nT = null;


        try {
            // USE.g:1063:1: (nT= type EOF )
            // USE.g:1064:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly4781);
            nT=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_typeOnly4783); if (state.failed) return n;
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
    // USE.g:1074:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;

        Token name=null;

        try {
            // USE.g:1075:1: (name= IDENT )
            // USE.g:1076:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType4811); if (state.failed) return n;
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
    // USE.g:1084:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;

        ASTType elemType = null;


         Token op = null; 
        try {
            // USE.g:1086:1: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // USE.g:1087:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) {
               op = input.LT(1); 
            }
            if ( (input.LA(1)>=82 && input.LA(1)<=85)||input.LA(1)==92 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType4876); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_collectionType4880);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType4882); if (state.failed) return n;
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
    // USE.g:1097:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;

        ASTTuplePart tp = null;


         List tpList = new ArrayList(); 
        try {
            // USE.g:1099:1: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // USE.g:1100:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,90,FOLLOW_90_in_tupleType4916); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType4918); if (state.failed) return n;
            pushFollow(FOLLOW_tuplePart_in_tupleType4927);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               tpList.add(tp); 
            }
            // USE.g:1102:5: ( COMMA tp= tuplePart )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // USE.g:1102:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType4938); if (state.failed) return n;
            	    pushFollow(FOLLOW_tuplePart_in_tupleType4942);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       tpList.add(tp); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType4954); if (state.failed) return n;
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
    // USE.g:1111:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;

        Token name=null;
        ASTType t = null;


        try {
            // USE.g:1112:1: (name= IDENT COLON t= type )
            // USE.g:1113:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart4986); if (state.failed) return n;
            match(input,COLON,FOLLOW_COLON_in_tuplePart4988); if (state.failed) return n;
            pushFollow(FOLLOW_type_in_tuplePart4992);
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
    // USE.g:1152:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;

        USEParser.stat_return s = null;


        try {
            // USE.g:1153:1: (s= stat EOF )
            // USE.g:1154:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly5041);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,EOF,FOLLOW_EOF_in_statOnly5045); if (state.failed) return n;
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
    // USE.g:1164:1: stat returns [ASTStatement n] : nextStat[seq] ( SEMI nextStat[seq] )* ;
    public final USEParser.stat_return stat() throws RecognitionException {
        USEParser.stat_return retval = new USEParser.stat_return();
        retval.start = input.LT(1);


          ASTSequenceStatement seq = new ASTSequenceStatement();

        try {
            // USE.g:1168:1: ( nextStat[seq] ( SEMI nextStat[seq] )* )
            // USE.g:1169:3: nextStat[seq] ( SEMI nextStat[seq] )*
            {
            pushFollow(FOLLOW_nextStat_in_stat5076);
            nextStat(seq);

            state._fsp--;
            if (state.failed) return retval;
            // USE.g:1170:3: ( SEMI nextStat[seq] )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==SEMI) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // USE.g:1171:5: SEMI nextStat[seq]
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat5087); if (state.failed) return retval;
            	    pushFollow(FOLLOW_nextStat_in_stat5093);
            	    nextStat(seq);

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop90;
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
    // USE.g:1187:1: nextStat[ASTSequenceStatement seq] : s= singleStat ;
    public final USEParser.nextStat_return nextStat(ASTSequenceStatement seq) throws RecognitionException {
        USEParser.nextStat_return retval = new USEParser.nextStat_return();
        retval.start = input.LT(1);

        ASTStatement s = null;


        try {
            // USE.g:1188:1: (s= singleStat )
            // USE.g:1189:3: s= singleStat
            {
            pushFollow(FOLLOW_singleStat_in_nextStat5127);
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
    // USE.g:1201:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;

        ASTEmptyStatement emp = null;

        ASTStatement sse = null;

        ASTStatement vas = null;

        ASTStatement ocs = null;

        USEParser.objDestroyStat_return ods = null;

        ASTLinkInsertionStatement lis = null;

        ASTLinkDeletionStatement lds = null;

        ASTConditionalExecutionStatement ces = null;

        ASTIterationStatement its = null;

        ASTWhileStatement whs = null;


        try {
            // USE.g:1205:1: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat )
            int alt91=10;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // USE.g:1206:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat5164);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = emp; 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1208:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat5190);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = sse; 
                    }

                    }
                    break;
                case 3 :
                    // USE.g:1209:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat5202);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = vas; 
                    }

                    }
                    break;
                case 4 :
                    // USE.g:1210:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat5216);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ocs; 
                    }

                    }
                    break;
                case 5 :
                    // USE.g:1211:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat5230);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = (ods!=null?ods.n:null); 
                    }

                    }
                    break;
                case 6 :
                    // USE.g:1212:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat5243);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lis; 
                    }

                    }
                    break;
                case 7 :
                    // USE.g:1213:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat5260);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = lds; 
                    }

                    }
                    break;
                case 8 :
                    // USE.g:1214:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat5277);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = ces; 
                    }

                    }
                    break;
                case 9 :
                    // USE.g:1215:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat5294);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = its; 
                    }

                    }
                    break;
                case 10 :
                    // USE.g:1217:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat5316);
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
    // USE.g:1224:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;

        try {
            // USE.g:1225:1: ( nothing )
            // USE.g:1226:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat5343);
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
    // USE.g:1231:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final ASTStatement statStartingWithExpr() throws RecognitionException {
        ASTStatement n = null;

        ASTExpression expr = null;

        ASTAttributeAssignmentStatement aas = null;


        try {
            // USE.g:1232:1: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // USE.g:1233:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr5369);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:1234:3: (aas= attAssignStat[$expr.n] )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==DOT) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // USE.g:1235:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr5383);
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
    // USE.g:1247:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;

        Token varName=null;
        USEParser.rValue_return rVal = null;


        try {
            // USE.g:1248:1: (varName= IDENT COLON_EQUAL rVal= rValue )
            // USE.g:1249:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat5421); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat5425); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_varAssignStat5433);
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
    // USE.g:1317:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;

        Token attName=null;
        USEParser.rValue_return r = null;


        try {
            // USE.g:1318:1: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // USE.g:1319:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat5464); if (state.failed) return n;
            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat5473); if (state.failed) return n;
            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat5477); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_attAssignStat5485);
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
    // USE.g:1331:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final ASTStatement objCreateStat() throws RecognitionException {
        ASTStatement n = null;

        ASTSimpleType ident = null;

        ASTExpression objName = null;

        USEParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // USE.g:1332:1: ( 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // USE.g:1333:3: 'new' ident= simpleType ( LPAREN objName= inSoilExpression RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,93,FOLLOW_93_in_objCreateStat5511); if (state.failed) return n;
            pushFollow(FOLLOW_simpleType_in_objCreateStat5519);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:1335:3: ( LPAREN objName= inSoilExpression RPAREN )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LPAREN) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // USE.g:1336:5: LPAREN objName= inSoilExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5529); if (state.failed) return n;
                    pushFollow(FOLLOW_inSoilExpression_in_objCreateStat5541);
                    objName=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5547); if (state.failed) return n;

                    }
                    break;

            }

            // USE.g:1341:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==53) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // USE.g:1342:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,53,FOLLOW_53_in_objCreateStat5565); if (state.failed) return n;
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat5573); if (state.failed) return n;
                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5587);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return n;
                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat5595); if (state.failed) return n;
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
    // USE.g:1361:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
        retval.start = input.LT(1);

        List<ASTExpression> el = null;


        try {
            // USE.g:1362:1: ( 'destroy' el= exprListMin1 )
            // USE.g:1363:3: 'destroy' el= exprListMin1
            {
            match(input,94,FOLLOW_94_in_objDestroyStat5631); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat5639);
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
    // USE.g:1384:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final ASTLinkInsertionStatement lnkInsStat() throws RecognitionException {
        ASTLinkInsertionStatement n = null;

        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // USE.g:1385:1: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // USE.g:1386:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,95,FOLLOW_95_in_lnkInsStat5665); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat5669); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5679);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat5683); if (state.failed) return n;
            match(input,96,FOLLOW_96_in_lnkInsStat5687); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat5695); if (state.failed) return n;
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
    // USE.g:1396:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);

        USEParser.rValue_return r = null;

        List<ASTRValue> qualifierValues = null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // USE.g:1402:1: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // USE.g:1403:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5724);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // USE.g:1404:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LBRACE) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // USE.g:1405:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5735); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5744);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5751); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5767); if (state.failed) return retval;
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5778);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.participans.add((r!=null?r.n:null)); 
            }
            // USE.g:1417:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==LBRACE) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // USE.g:1418:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5789); if (state.failed) return retval;
                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5798);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      currentQualifiers = qualifierValues;
                    }
                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5805); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  retval.qualifiers.add(currentQualifiers);
                  currentQualifiers = Collections.emptyList();
                
            }
            // USE.g:1427:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==COMMA) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // USE.g:1428:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5827); if (state.failed) return retval;
            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5842);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	       retval.participans.add((r!=null?r.n:null)); 
            	    }
            	    // USE.g:1432:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==LBRACE) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // USE.g:1433:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5862); if (state.failed) return retval;
            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5873);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	              currentQualifiers = qualifierValues;
            	            }
            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5882); if (state.failed) return retval;

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
            	    break loop98;
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
    // USE.g:1448:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final ASTLinkDeletionStatement lnkDelStat() throws RecognitionException {
        ASTLinkDeletionStatement n = null;

        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p = null;


        try {
            // USE.g:1449:1: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // USE.g:1450:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,97,FOLLOW_97_in_lnkDelStat5923); if (state.failed) return n;
            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat5927); if (state.failed) return n;
            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5937);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return n;
            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat5941); if (state.failed) return n;
            match(input,98,FOLLOW_98_in_lnkDelStat5945); if (state.failed) return n;
            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat5954); if (state.failed) return n;
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
    // USE.g:1464:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' ;
    public final ASTConditionalExecutionStatement condExStat() throws RecognitionException {
        ASTConditionalExecutionStatement n = null;

        ASTExpression con = null;

        USEParser.stat_return ts = null;

        USEParser.stat_return es = null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // USE.g:1468:1: ( 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end' )
            // USE.g:1469:3: 'if' con= inSoilExpression 'then' ts= stat ( 'else' es= stat )? 'end'
            {
            match(input,76,FOLLOW_76_in_condExStat5985); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_condExStat5994);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,77,FOLLOW_77_in_condExStat5998); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_condExStat6007);
            ts=stat();

            state._fsp--;
            if (state.failed) return n;
            // USE.g:1473:3: ( 'else' es= stat )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==78) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // USE.g:1474:5: 'else' es= stat
                    {
                    match(input,78,FOLLOW_78_in_condExStat6018); if (state.failed) return n;
                    pushFollow(FOLLOW_stat_in_condExStat6030);
                    es=stat();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       elseStat = (es!=null?es.n:null); 
                    }

                    }
                    break;

            }

            match(input,50,FOLLOW_50_in_condExStat6041); if (state.failed) return n;
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
    // USE.g:1485:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' ;
    public final ASTIterationStatement iterStat() throws RecognitionException {
        ASTIterationStatement n = null;

        Token var=null;
        ASTExpression set = null;

        USEParser.stat_return s = null;


        try {
            // USE.g:1486:1: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end' )
            // USE.g:1487:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= stat 'end'
            {
            match(input,99,FOLLOW_99_in_iterStat6066); if (state.failed) return n;
            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat6074); if (state.failed) return n;
            match(input,64,FOLLOW_64_in_iterStat6078); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_iterStat6086);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,100,FOLLOW_100_in_iterStat6090); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_iterStat6098);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,50,FOLLOW_50_in_iterStat6102); if (state.failed) return n;
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
    // USE.g:1502:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= stat 'end' ;
    public final ASTWhileStatement whileStat() throws RecognitionException {
        ASTWhileStatement n = null;

        ASTExpression cond = null;

        USEParser.stat_return s = null;


        try {
            // USE.g:1503:1: ( 'while' cond= inSoilExpression 'do' s= stat 'end' )
            // USE.g:1504:3: 'while' cond= inSoilExpression 'do' s= stat 'end'
            {
            match(input,101,FOLLOW_101_in_whileStat6128); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_whileStat6136);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            match(input,100,FOLLOW_100_in_whileStat6140); if (state.failed) return n;
            pushFollow(FOLLOW_stat_in_whileStat6148);
            s=stat();

            state._fsp--;
            if (state.failed) return n;
            match(input,50,FOLLOW_50_in_whileStat6152); if (state.failed) return n;
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
    // USE.g:1527:1: nothing : ;
    public final void nothing() throws RecognitionException {
        try {
            // USE.g:1528:1: ()
            // USE.g:1529:1: 
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
    // USE.g:1535:1: rValue returns [ASTRValue n] : (e= inSoilExpression | oc= objCreateStat );
    public final USEParser.rValue_return rValue() throws RecognitionException {
        USEParser.rValue_return retval = new USEParser.rValue_return();
        retval.start = input.LT(1);

        ASTExpression e = null;

        ASTStatement oc = null;


        try {
            // USE.g:1536:1: (e= inSoilExpression | oc= objCreateStat )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==IDENT||LA100_0==INT||(LA100_0>=AT && LA100_0<=LPAREN)||(LA100_0>=PLUS && LA100_0<=MINUS)||(LA100_0>=REAL && LA100_0<=HASH)||LA100_0==63||LA100_0==70||(LA100_0>=72 && LA100_0<=76)||(LA100_0>=80 && LA100_0<=92)) ) {
                alt100=1;
            }
            else if ( (LA100_0==93) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // USE.g:1537:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue6205);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.n = new ASTRValueExpressionOrOpCall(e); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1538:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue6217);
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
    // USE.g:1552:1: rValList returns [List<ASTRValue> n] : ( nothing | rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;

        List<ASTRValue> rl = null;


        try {
            // USE.g:1553:1: ( nothing | rl= rValListMin1 )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RBRACE) ) {
                alt101=1;
            }
            else if ( (LA101_0==IDENT||LA101_0==INT||(LA101_0>=AT && LA101_0<=LPAREN)||(LA101_0>=PLUS && LA101_0<=MINUS)||(LA101_0>=REAL && LA101_0<=HASH)||LA101_0==63||LA101_0==70||(LA101_0>=72 && LA101_0<=76)||(LA101_0>=80 && LA101_0<=93)) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // USE.g:1554:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList6240);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = Collections.<ASTRValue>emptyList(); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1557:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList6267);
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
    // USE.g:1565:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;

        USEParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1569:1: (r= rValue ( COMMA r= rValue )* )
            // USE.g:1570:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin16300);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // USE.g:1572:3: ( COMMA r= rValue )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==COMMA) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // USE.g:1573:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin16314); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin16324);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop102;
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
    // USE.g:1583:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;

        USEParser.rValue_return r = null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1587:1: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // USE.g:1588:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin26363);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_rValListMin26371); if (state.failed) return n;
            pushFollow(FOLLOW_rValue_in_rValListMin26379);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((r!=null?r.n:null)); 
            }
            // USE.g:1593:3: ( COMMA r= rValue )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==COMMA) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // USE.g:1594:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin26393); if (state.failed) return n;
            	    pushFollow(FOLLOW_rValue_in_rValListMin26403);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       n.add((r!=null?r.n:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop103;
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
    // USE.g:1604:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;

        USEParser.expression_return e = null;


        try {
            // USE.g:1605:1: (e= expression )
            // USE.g:1606:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression6437);
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
    // USE.g:1615:1: exprList returns [List<ASTExpression> n] : ( nothing | el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;

        List<ASTExpression> el = null;


        try {
            // USE.g:1616:1: ( nothing | el= exprListMin1 )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==EOF) ) {
                alt104=1;
            }
            else if ( (LA104_0==IDENT||LA104_0==INT||(LA104_0>=AT && LA104_0<=LPAREN)||(LA104_0>=PLUS && LA104_0<=MINUS)||(LA104_0>=REAL && LA104_0<=HASH)||LA104_0==63||LA104_0==70||(LA104_0>=72 && LA104_0<=76)||(LA104_0>=80 && LA104_0<=92)) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // USE.g:1617:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList6466);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<ASTExpression>(); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1620:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList6484);
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
    // USE.g:1628:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1632:1: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1633:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin16517);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // USE.g:1635:3: ( COMMA e= inSoilExpression )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==COMMA) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // USE.g:1636:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin16532); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin16542);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop105;
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
    // USE.g:1646:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;

        ASTExpression e = null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1650:1: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1651:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26582);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            match(input,COMMA,FOLLOW_COMMA_in_exprListMin26590); if (state.failed) return n;
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin26598);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;
            if ( state.backtracking==0 ) {
               if (e != null) n.add(e); 
            }
            // USE.g:1656:3: ( COMMA e= inSoilExpression )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==COMMA) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // USE.g:1657:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin26612); if (state.failed) return n;
            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin26622);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;
            	    if ( state.backtracking==0 ) {
            	       if (e != null) n.add(e); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop106;
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
    // USE.g:1667:1: identList returns [List<String> n] : ( nothing | il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;

        List<String> il = null;


        try {
            // USE.g:1668:1: ( nothing | il= identListMin1 )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==EOF||(LA107_0>=RBRACE && LA107_0<=SEMI)||LA107_0==50||LA107_0==78) ) {
                alt107=1;
            }
            else if ( (LA107_0==IDENT) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // USE.g:1669:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList6652);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;
                    if ( state.backtracking==0 ) {
                       n = new ArrayList<String>(); 
                    }

                    }
                    break;
                case 2 :
                    // USE.g:1672:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList6669);
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
    // USE.g:1680:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;

        Token id=null;


          n = new ArrayList<String>();

        try {
            // USE.g:1684:1: (id= IDENT ( COMMA id= IDENT )* )
            // USE.g:1685:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16703); if (state.failed) return n;
            if ( state.backtracking==0 ) {
               n.add((id!=null?id.getText():null)); 
            }
            // USE.g:1687:3: ( COMMA id= IDENT )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==COMMA) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // USE.g:1688:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin16717); if (state.failed) return n;
            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin16727); if (state.failed) return n;
            	    if ( state.backtracking==0 ) {

            	          n.add((id!=null?id.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop108;
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

    // $ANTLR start synpred1_USE
    public final void synpred1_USE_fragment() throws RecognitionException {   
        // USE.g:1026:7: ( COLON type EQUAL )
        // USE.g:1026:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_USE4571); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_USE4573);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE4575); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {   
        // USE.g:1208:5: ( statStartingWithExpr )
        // USE.g:1208:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE5182);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_USE

    // Delegated rules

    public final boolean synpred1_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_USE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_USE_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\1\2\15\uffff";
    static final String DFA1_minS =
        "\2\4\2\uffff\1\23\1\4\1\12\2\4\1\25\1\12\1\15\1\25\1\15";
    static final String DFA1_maxS =
        "\1\64\1\4\2\uffff\1\23\1\24\1\12\1\4\1\64\1\25\1\12\1\24\1\25\1"+
        "\24";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\1\12\uffff";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\15\uffff\1\1\32\uffff\1\2\1\3\1\2\3\uffff\2\2",
            "\1\4",
            "",
            "",
            "\1\5",
            "\1\6\10\uffff\1\7\6\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\33\uffff\1\3\1\2\3\uffff\2\2",
            "\1\13",
            "\1\14",
            "\1\7\6\uffff\1\10",
            "\1\15",
            "\1\7\6\uffff\1\10"
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
            return "()* loopback of 129:5: (e= enumTypeDefinition )*";
        }
    }
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\1\1\23\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\23\1\10\1\4\1\uffff\1\12"+
        "\2\4\1\25\1\12\1\4\1\15\1\25\1\10\1\15";
    static final String DFA3_maxS =
        "\1\64\1\uffff\1\4\1\uffff\1\4\1\uffff\1\23\1\65\1\24\1\uffff\1\12"+
        "\1\4\1\64\1\25\1\12\1\4\1\24\1\25\1\65\1\24";
    static final String DFA3_acceptS =
        "\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\12\uffff";
    static final String DFA3_specialS =
        "\24\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\15\uffff\1\2\32\uffff\1\5\1\uffff\1\3\3\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "\1\3\44\uffff\1\3\2\uffff\3\3\2\uffff\1\11",
            "\1\12\10\uffff\1\13\6\uffff\1\14",
            "",
            "\1\15",
            "\1\16",
            "\1\17\15\uffff\1\2\34\uffff\1\3\3\uffff\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\13\6\uffff\1\14",
            "\1\23",
            "\1\3\44\uffff\1\3\2\uffff\3\3\2\uffff\1\11",
            "\1\13\6\uffff\1\14"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()* loopback of 130:5: ( ( generalClassDefinition[$n] ) | (a= associationDefinition ) | ( 'constraints' (cons= invariant | ppc= prePost )* ) )*";
        }
    }
    static final String DFA80_eotS =
        "\16\uffff";
    static final String DFA80_eofS =
        "\16\uffff";
    static final String DFA80_minS =
        "\1\4\7\uffff\1\5\5\uffff";
    static final String DFA80_maxS =
        "\1\134\7\uffff\1\23\5\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\1\14"+
        "\1\10";
    static final String DFA80_specialS =
        "\16\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\7\12\uffff\1\3\20\uffff\1\4\1\5\1\6\55\uffff\1\1\1\2\4\10"+
            "\1\11\3\12\1\13\1\14\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\15\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "916:1: literal returns [ASTExpression n] : (t= 'true' | f= 'false' | i= INT | r= REAL | s= STRING | HASH enumLit= IDENT | enumName= IDENT '::' enumLit= IDENT | nColIt= collectionLiteral | nEColIt= emptyCollectionLiteral | nUndLit= undefinedLiteral | nTupleLit= tupleLiteral | nDateLit= dateLiteral );";
        }
    }
    static final String DFA91_eotS =
        "\43\uffff";
    static final String DFA91_eofS =
        "\1\1\42\uffff";
    static final String DFA91_minS =
        "\1\4\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA91_maxS =
        "\1\145\14\uffff\1\0\14\uffff\1\0\10\uffff";
    static final String DFA91_acceptS =
        "\1\uffff\1\1\3\uffff\10\2\1\uffff\14\2\1\uffff\1\4\1\5\1\6\1\7\1"+
        "\11\1\12\1\3\1\10";
    static final String DFA91_specialS =
        "\1\0\14\uffff\1\1\14\uffff\1\2\10\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\15\2\uffff\1\1\7\uffff\1\11\2\uffff\1\26\1\31\6\uffff\2\6"+
            "\4\uffff\1\12\1\13\1\14\17\uffff\1\1\14\uffff\1\5\6\uffff\1"+
            "\6\1\uffff\1\27\3\30\1\32\1\uffff\1\1\1\uffff\1\7\1\10\4\16"+
            "\1\17\1\21\1\22\1\23\1\24\1\25\1\20\1\33\1\34\1\35\1\uffff\1"+
            "\36\1\uffff\1\37\1\uffff\1\40",
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

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "1201:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr | vas= varAssignStat | ocs= objCreateStat | ods= objDestroyStat | lis= lnkInsStat | lds= lnkDelStat | ces= condExStat | its= iterStat | whs= whileStat );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_0 = input.LA(1);

                         
                        int index91_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA91_0==EOF||LA91_0==SEMI||LA91_0==50||LA91_0==78) ) {s = 1;}

                        else if ( (LA91_0==63) && (synpred2_USE())) {s = 5;}

                        else if ( ((LA91_0>=PLUS && LA91_0<=MINUS)||LA91_0==70) && (synpred2_USE())) {s = 6;}

                        else if ( (LA91_0==80) && (synpred2_USE())) {s = 7;}

                        else if ( (LA91_0==81) && (synpred2_USE())) {s = 8;}

                        else if ( (LA91_0==INT) && (synpred2_USE())) {s = 9;}

                        else if ( (LA91_0==REAL) && (synpred2_USE())) {s = 10;}

                        else if ( (LA91_0==STRING) && (synpred2_USE())) {s = 11;}

                        else if ( (LA91_0==HASH) && (synpred2_USE())) {s = 12;}

                        else if ( (LA91_0==IDENT) ) {s = 13;}

                        else if ( ((LA91_0>=82 && LA91_0<=85)) && (synpred2_USE())) {s = 14;}

                        else if ( (LA91_0==86) && (synpred2_USE())) {s = 15;}

                        else if ( (LA91_0==92) && (synpred2_USE())) {s = 16;}

                        else if ( (LA91_0==87) && (synpred2_USE())) {s = 17;}

                        else if ( (LA91_0==88) && (synpred2_USE())) {s = 18;}

                        else if ( (LA91_0==89) && (synpred2_USE())) {s = 19;}

                        else if ( (LA91_0==90) && (synpred2_USE())) {s = 20;}

                        else if ( (LA91_0==91) && (synpred2_USE())) {s = 21;}

                        else if ( (LA91_0==AT) && (synpred2_USE())) {s = 22;}

                        else if ( (LA91_0==72) && (synpred2_USE())) {s = 23;}

                        else if ( ((LA91_0>=73 && LA91_0<=75)) && (synpred2_USE())) {s = 24;}

                        else if ( (LA91_0==LPAREN) && (synpred2_USE())) {s = 25;}

                        else if ( (LA91_0==76) ) {s = 26;}

                        else if ( (LA91_0==93) ) {s = 27;}

                        else if ( (LA91_0==94) ) {s = 28;}

                        else if ( (LA91_0==95) ) {s = 29;}

                        else if ( (LA91_0==97) ) {s = 30;}

                        else if ( (LA91_0==99) ) {s = 31;}

                        else if ( (LA91_0==101) ) {s = 32;}

                         
                        input.seek(index91_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA91_13 = input.LA(1);

                         
                        int index91_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_USE()) ) {s = 25;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index91_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA91_26 = input.LA(1);

                         
                        int index91_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_USE()) ) {s = 25;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index91_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_annotationSet_in_model70 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_model76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_model80 = new BitSet(new long[]{0x0018E00000040010L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model92 = new BitSet(new long[]{0x0018E00000040010L});
    public static final BitSet FOLLOW_generalClassDefinition_in_model109 = new BitSet(new long[]{0x0018A00000040010L});
    public static final BitSet FOLLOW_associationDefinition_in_model126 = new BitSet(new long[]{0x0018A00000040010L});
    public static final BitSet FOLLOW_45_in_model142 = new BitSet(new long[]{0x0418A00000040010L});
    public static final BitSet FOLLOW_invariant_in_model160 = new BitSet(new long[]{0x0418A00000040010L});
    public static final BitSet FOLLOW_prePost_in_model181 = new BitSet(new long[]{0x0418A00000040010L});
    public static final BitSet FOLLOW_EOF_in_model222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition250 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_enumTypeDefinition256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition268 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassDefinition310 = new BitSet(new long[]{0x0018800000040010L});
    public static final BitSet FOLLOW_47_in_generalClassDefinition318 = new BitSet(new long[]{0x0018800000040010L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassDefinition336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassDefinition356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition399 = new BitSet(new long[]{0x0007200000000100L});
    public static final BitSet FOLLOW_LESS_in_classDefinition409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_classDefinition413 = new BitSet(new long[]{0x0007200000000000L});
    public static final BitSet FOLLOW_48_in_classDefinition426 = new BitSet(new long[]{0x0006200000040010L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition439 = new BitSet(new long[]{0x0006200000040010L});
    public static final BitSet FOLLOW_49_in_classDefinition460 = new BitSet(new long[]{0x0004200000040010L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition473 = new BitSet(new long[]{0x0004200000040010L});
    public static final BitSet FOLLOW_45_in_classDefinition494 = new BitSet(new long[]{0x1804000000000000L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition514 = new BitSet(new long[]{0x1804000000000000L});
    public static final BitSet FOLLOW_50_in_classDefinition538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition597 = new BitSet(new long[]{0x0027200000040110L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition611 = new BitSet(new long[]{0x0027200000040010L});
    public static final BitSet FOLLOW_53_in_associationClassDefinition623 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition631 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition643 = new BitSet(new long[]{0x0007200000040010L});
    public static final BitSet FOLLOW_48_in_associationClassDefinition663 = new BitSet(new long[]{0x0006200000040010L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition676 = new BitSet(new long[]{0x0006200000040010L});
    public static final BitSet FOLLOW_49_in_associationClassDefinition697 = new BitSet(new long[]{0x0004200000040010L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition710 = new BitSet(new long[]{0x0004200000040010L});
    public static final BitSet FOLLOW_45_in_associationClassDefinition731 = new BitSet(new long[]{0x1804000000040010L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition751 = new BitSet(new long[]{0x1804000000040010L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition787 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition791 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_associationClassDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition850 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition852 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition856 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition907 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition917 = new BitSet(new long[]{0x6040000000000682L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition931 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_operationDefinition937 = new BitSet(new long[]{0x6040000000000482L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition965 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationDefinition971 = new BitSet(new long[]{0x6000000000000082L});
    public static final BitSet FOLLOW_54_in_operationDefinition989 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_stat_in_operationDefinition995 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_operationDefinition997 = new BitSet(new long[]{0x6000000000000082L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1018 = new BitSet(new long[]{0x6000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1062 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1094 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_associationDefinition1102 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1110 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1122 = new BitSet(new long[]{0x0004000000040010L});
    public static final BitSet FOLLOW_50_in_associationDefinition1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1168 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1172 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1174 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1189 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_55_in_associationEnd1210 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_56_in_associationEnd1222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1226 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1238 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_57_in_associationEnd1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1254 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1266 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1268 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_associationEnd1272 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1290 = new BitSet(new long[]{0x0380000000000092L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1342 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1352 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1356 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1385 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1395 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_invariant1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant1494 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COMMA_in_invariant1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_invariant1511 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_COLON_in_invariant1519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_invariant1531 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_invariantClause_in_invariant1543 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_59_in_invariantClause1574 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause1580 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_invariantClause1585 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_invariantClause1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_invariantClause1599 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_invariantClause1601 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause1607 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_invariantClause1612 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_invariantClause1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_prePost1642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost1646 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost1648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_prePost1652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_paramList_in_prePost1656 = new BitSet(new long[]{0x6000000000000200L});
    public static final BitSet FOLLOW_COLON_in_prePost1660 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_prePost1664 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost1683 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_set_in_prePostClause1722 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause1737 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_prePostClause1742 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_prePostClause1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet1773 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_AT_in_annotation1792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_annotation1796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation1802 = new BitSet(new long[]{0x0000000000102010L});
    public static final BitSet FOLLOW_annotationValues_in_annotation1811 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues1839 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues1847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues1851 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue1870 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue1875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_expression2067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_expression2071 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_COLON_in_expression2075 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_expression2079 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_expression2084 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_expression2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_expression2090 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList2148 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2165 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_COMMA_in_paramList2177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList2181 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_RPAREN_in_paramList2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList2230 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_idList2240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_idList2244 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration2275 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration2277 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditionalImpliesExpression2330 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_conditionalOrExpression2392 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_conditionalXOrExpression2453 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression2457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_conditionalAndExpression2514 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression2518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2566 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_set_in_equalityExpression2585 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2595 = new BitSet(new long[]{0x0000000000400402L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2644 = new BitSet(new long[]{0x0000000003800102L});
    public static final BitSet FOLLOW_set_in_relationalExpression2662 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2680 = new BitSet(new long[]{0x0000000003800102L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2730 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression2748 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2758 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2808 = new BitSet(new long[]{0x0000000010010002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2826 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2840 = new BitSet(new long[]{0x0000000010010002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_unaryExpression2902 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2979 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression2997 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000F00L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression3003 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000F00L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression3014 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3091 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3095 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_primaryExpression3125 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3129 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3131 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_AT_in_primaryExpression3152 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_primaryExpression3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference3181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_objectReference3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression3328 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression3335 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression3346 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_BAR_in_queryExpression3350 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_queryExpression3361 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_iterateExpression3399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression3405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression3413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression3415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression3423 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression3425 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_iterateExpression3433 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression3483 = new BitSet(new long[]{0x00000000000C0802L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3505 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3518 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3531 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3535 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3547 = new BitSet(new long[]{0x00000000000C0802L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression3564 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3579 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3594 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3598 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression3612 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_AT_in_operationExpression3637 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_operationExpression3639 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression3659 = new BitSet(new long[]{0x800000070C1C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3680 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression3692 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_operationExpression3696 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression3765 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression3781 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_typeExpression3785 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_elemVarsDeclaration3826 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration3834 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization3873 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization3875 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_variableInitialization3879 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization3881 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_variableInitialization3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ifExpression3917 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_ifExpression3921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ifExpression3923 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_ifExpression3927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ifExpression3929 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_ifExpression3933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ifExpression3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_literal3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_literal3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal4040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal4056 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal4058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_literal4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dateLiteral_in_literal4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral4160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral4189 = new BitSet(new long[]{0x800000070C0C8050L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4206 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral4219 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral4223 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem4271 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem4282 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_collectionItem4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_emptyCollectionLiteral4315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral4317 = new BitSet(new long[]{0x0000000000000000L,0x00000000103C0000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral4339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral4341 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_undefinedLiteral4373 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4375 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_undefinedLiteral4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_undefinedLiteral4409 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral4411 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral4415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_undefinedLiteral4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_tupleLiteral4470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral4476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4484 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral4495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral4499 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem4541 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_COLON_in_tupleItem4580 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_tupleItem4584 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem4586 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_tupleItem4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem4612 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_expression_in_tupleItem4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_dateLiteral4667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACE_in_dateLiteral4669 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_STRING_in_dateLiteral4673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_dateLiteral4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType4849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType4876 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_collectionType4880 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_tupleType4916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType4918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4927 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_COMMA_in_tupleType4938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType4942 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart4986 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_tuplePart4988 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_tuplePart4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly5041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextStat_in_stat5076 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_SEMI_in_stat5087 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_nextStat_in_stat5093 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_singleStat_in_nextStat5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr5369 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat5421 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat5425 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat5464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat5473 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat5477 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_objCreateStat5511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat5519 = new BitSet(new long[]{0x0020000000080002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5529 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat5541 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5547 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_objCreateStat5565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat5573 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat5587 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_objDestroyStat5631 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_lnkInsStat5665 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat5669 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat5679 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat5683 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_lnkInsStat5687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5724 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5735 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5751 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5767 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5778 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5789 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5798 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5805 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers5827 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers5842 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers5862 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers5873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers5882 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_97_in_lnkDelStat5923 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat5927 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat5937 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat5941 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_lnkDelStat5945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_condExStat5985 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat5994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_condExStat5998 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_stat_in_condExStat6007 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_condExStat6018 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_stat_in_condExStat6030 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_condExStat6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_iterStat6066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_iterStat6074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iterStat6078 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat6086 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_iterStat6090 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_stat_in_iterStat6098 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_iterStat6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_whileStat6128 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat6136 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_whileStat6140 = new BitSet(new long[]{0x800000070C0C8010L,0x0000002AFFFF1F40L});
    public static final BitSet FOLLOW_stat_in_whileStat6148 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_whileStat6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin16300 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin16314 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_rValListMin16324 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26363 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin26371 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26379 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin26393 = new BitSet(new long[]{0x800000070C0C8010L,0x000000003FFF1F40L});
    public static final BitSet FOLLOW_rValue_in_rValListMin26403 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16517 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin16532 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin16542 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26582 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26590 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26598 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin26612 = new BitSet(new long[]{0x800000070C0C8010L,0x000000001FFF1F40L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin26622 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_nothing_in_identList6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16703 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COMMA_in_identListMin16717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identListMin16727 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_COLON_in_synpred1_USE4571 = new BitSet(new long[]{0x0000000000000010L,0x00000000143C0000L});
    public static final BitSet FOLLOW_type_in_synpred1_USE4573 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_USE4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE5182 = new BitSet(new long[]{0x0000000000000002L});

}