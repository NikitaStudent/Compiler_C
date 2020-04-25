// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2020-04-25 17:02:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RETURN", "IF", "ELSE", "DO", "WHILE", "PROGRAM", "TYPE", "ARGS_DECL", "FUNC_DECL", "ARGS", "CALL", "BLOCK", "INDEX", "DIGIT", "LETTER", "NUMBER", "STRING", "IDENT", "WS", "'['", "']'", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'%'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "';'", "'{'", "'}'"
    };
    public static final int CALL=14;
    public static final int LETTER=18;
    public static final int ARGS=13;
    public static final int FUNC_DECL=12;
    public static final int DO=7;
    public static final int RETURN=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int ELSE=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int ARGS_DECL=11;
    public static final int INDEX=16;
    public static final int WS=22;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int IF=5;
    public static final int TYPE=10;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int NUMBER=19;
    public static final int BLOCK=15;
    public static final int DIGIT=17;
    public static final int T__26=26;
    public static final int IDENT=21;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__23=23;
    public static final int STRING=20;
    public static final int T__24=24;
    public static final int WHILE=8;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int PROGRAM=9;

    // delegates
    // delegators


        public MathExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MathExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MathExprParser.tokenNames; }
    public String getGrammarFileName() { return "MathExpr.g"; }


    public static class type0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type0"
    // MathExpr.g:47:1: type0 : IDENT ( '[' ']' )* ;
    public final MathExprParser.type0_return type0() throws RecognitionException {
        MathExprParser.type0_return retval = new MathExprParser.type0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT1=null;
        Token char_literal2=null;
        Token char_literal3=null;

        Object IDENT1_tree=null;
        Object char_literal2_tree=null;
        Object char_literal3_tree=null;

        try {
            // MathExpr.g:47:6: ( IDENT ( '[' ']' )* )
            // MathExpr.g:48:3: IDENT ( '[' ']' )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_type0358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT1_tree = (Object)adaptor.create(IDENT1);
            adaptor.addChild(root_0, IDENT1_tree);
            }
            // MathExpr.g:48:9: ( '[' ']' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:48:10: '[' ']'
            	    {
            	    char_literal2=(Token)match(input,23,FOLLOW_23_in_type0361); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal2_tree = (Object)adaptor.create(char_literal2);
            	    adaptor.addChild(root_0, char_literal2_tree);
            	    }
            	    char_literal3=(Token)match(input,24,FOLLOW_24_in_type0363); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal3_tree = (Object)adaptor.create(char_literal3);
            	    adaptor.addChild(root_0, char_literal3_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type0"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // MathExpr.g:50:1: type : type0 -> TYPE[$type0.text] ;
    public final MathExprParser.type_return type() throws RecognitionException {
        MathExprParser.type_return retval = new MathExprParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.type0_return type04 = null;


        RewriteRuleSubtreeStream stream_type0=new RewriteRuleSubtreeStream(adaptor,"rule type0");
        try {
            // MathExpr.g:50:5: ( type0 -> TYPE[$type0.text] )
            // MathExpr.g:51:3: type0
            {
            pushFollow(FOLLOW_type0_in_type374);
            type04=type0();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type0.add(type04.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 51:10: -> TYPE[$type0.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(TYPE, (type04!=null?input.toString(type04.start,type04.stop):null)));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // MathExpr.g:54:1: term : ( NUMBER | STRING | lvalue | funcCall | '(' logic ')' );
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER5=null;
        Token STRING6=null;
        Token char_literal9=null;
        Token char_literal11=null;
        MathExprParser.lvalue_return lvalue7 = null;

        MathExprParser.funcCall_return funcCall8 = null;

        MathExprParser.logic_return logic10 = null;


        Object NUMBER5_tree=null;
        Object STRING6_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;

        try {
            // MathExpr.g:54:5: ( NUMBER | STRING | lvalue | funcCall | '(' logic ')' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt2=1;
                }
                break;
            case STRING:
                {
                alt2=2;
                }
                break;
            case IDENT:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==25) ) {
                    alt2=4;
                }
                else if ( (LA2_3==EOF||LA2_3==IDENT||(LA2_3>=23 && LA2_3<=24)||(LA2_3>=26 && LA2_3<=31)||(LA2_3>=33 && LA2_3<=38)||LA2_3==40) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // MathExpr.g:55:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER5_tree = (Object)adaptor.create(NUMBER5);
                    adaptor.addChild(root_0, NUMBER5_tree);
                    }

                    }
                    break;
                case 2 :
                    // MathExpr.g:56:3: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_term395); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING6_tree = (Object)adaptor.create(STRING6);
                    adaptor.addChild(root_0, STRING6_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:57:3: lvalue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_term399);
                    lvalue7=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue7.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:58:3: funcCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcCall_in_term403);
                    funcCall8=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcCall8.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:59:3: '(' logic ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,25,FOLLOW_25_in_term407); if (state.failed) return retval;
                    pushFollow(FOLLOW_logic_in_term410);
                    logic10=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic10.getTree());
                    char_literal11=(Token)match(input,26,FOLLOW_26_in_term412); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // MathExpr.g:62:1: args : ( rvalue ( ',' rvalue )* )? -> ^( ARGS ( rvalue )* ) ;
    public final MathExprParser.args_return args() throws RecognitionException {
        MathExprParser.args_return retval = new MathExprParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;
        MathExprParser.rvalue_return rvalue12 = null;

        MathExprParser.rvalue_return rvalue14 = null;


        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        try {
            // MathExpr.g:62:5: ( ( rvalue ( ',' rvalue )* )? -> ^( ARGS ( rvalue )* ) )
            // MathExpr.g:63:3: ( rvalue ( ',' rvalue )* )?
            {
            // MathExpr.g:63:3: ( rvalue ( ',' rvalue )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=NUMBER && LA4_0<=IDENT)||LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:63:4: rvalue ( ',' rvalue )*
                    {
                    pushFollow(FOLLOW_rvalue_in_args425);
                    rvalue12=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rvalue.add(rvalue12.getTree());
                    // MathExpr.g:63:11: ( ',' rvalue )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==27) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // MathExpr.g:63:12: ',' rvalue
                    	    {
                    	    char_literal13=(Token)match(input,27,FOLLOW_27_in_args428); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal13);

                    	    pushFollow(FOLLOW_rvalue_in_args430);
                    	    rvalue14=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rvalue.add(rvalue14.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: rvalue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:28: -> ^( ARGS ( rvalue )* )
            {
                // MathExpr.g:63:32: ^( ARGS ( rvalue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // MathExpr.g:63:39: ( rvalue )*
                while ( stream_rvalue.hasNext() ) {
                    adaptor.addChild(root_1, stream_rvalue.nextTree());

                }
                stream_rvalue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class funcCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcCall"
    // MathExpr.g:65:1: funcCall : IDENT '(' args ')' -> ^( CALL IDENT args ) ;
    public final MathExprParser.funcCall_return funcCall() throws RecognitionException {
        MathExprParser.funcCall_return retval = new MathExprParser.funcCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        MathExprParser.args_return args17 = null;


        Object IDENT15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // MathExpr.g:65:9: ( IDENT '(' args ')' -> ^( CALL IDENT args ) )
            // MathExpr.g:66:3: IDENT '(' args ')'
            {
            IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcCall454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT15);

            char_literal16=(Token)match(input,25,FOLLOW_25_in_funcCall456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal16);

            pushFollow(FOLLOW_args_in_funcCall458);
            args17=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_args.add(args17.getTree());
            char_literal18=(Token)match(input,26,FOLLOW_26_in_funcCall460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal18);



            // AST REWRITE
            // elements: args, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 66:23: -> ^( CALL IDENT args )
            {
                // MathExpr.g:66:27: ^( CALL IDENT args )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcCall"

    public static class arrayIndex0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayIndex0"
    // MathExpr.g:69:1: arrayIndex0 : '[' -> INDEX[\"[]\"] ;
    public final MathExprParser.arrayIndex0_return arrayIndex0() throws RecognitionException {
        MathExprParser.arrayIndex0_return retval = new MathExprParser.arrayIndex0_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;

        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");

        try {
            // MathExpr.g:69:12: ( '[' -> INDEX[\"[]\"] )
            // MathExpr.g:70:3: '['
            {
            char_literal19=(Token)match(input,23,FOLLOW_23_in_arrayIndex0482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal19);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:8: -> INDEX[\"[]\"]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INDEX, "[]"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayIndex0"

    public static class lvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lvalue"
    // MathExpr.g:72:1: lvalue : ( IDENT ( arrayIndex0 rvalue ']' )* | IDENT | type IDENT );
    public final MathExprParser.lvalue_return lvalue() throws RecognitionException {
        MathExprParser.lvalue_return retval = new MathExprParser.lvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT20=null;
        Token char_literal23=null;
        Token IDENT24=null;
        Token IDENT26=null;
        MathExprParser.arrayIndex0_return arrayIndex021 = null;

        MathExprParser.rvalue_return rvalue22 = null;

        MathExprParser.type_return type25 = null;


        Object IDENT20_tree=null;
        Object char_literal23_tree=null;
        Object IDENT24_tree=null;
        Object IDENT26_tree=null;

        try {
            // MathExpr.g:72:7: ( IDENT ( arrayIndex0 rvalue ']' )* | IDENT | type IDENT )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT||LA6_1==23) ) {
                    alt6=3;
                }
                else if ( (synpred9_MathExpr()) ) {
                    alt6=1;
                }
                else if ( (synpred10_MathExpr()) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // MathExpr.g:73:3: IDENT ( arrayIndex0 rvalue ']' )*
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_lvalue500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT20_tree = (Object)adaptor.create(IDENT20);
                    adaptor.addChild(root_0, IDENT20_tree);
                    }
                    // MathExpr.g:73:9: ( arrayIndex0 rvalue ']' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // MathExpr.g:73:10: arrayIndex0 rvalue ']'
                    	    {
                    	    pushFollow(FOLLOW_arrayIndex0_in_lvalue503);
                    	    arrayIndex021=arrayIndex0();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(arrayIndex021.getTree(), root_0);
                    	    pushFollow(FOLLOW_rvalue_in_lvalue506);
                    	    rvalue22=rvalue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue22.getTree());
                    	    char_literal23=(Token)match(input,24,FOLLOW_24_in_lvalue508); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // MathExpr.g:74:3: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_lvalue515); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT24_tree = (Object)adaptor.create(IDENT24);
                    adaptor.addChild(root_0, IDENT24_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:75:3: type IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_type_in_lvalue519);
                    type25=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type25.getTree());
                    IDENT26=(Token)match(input,IDENT,FOLLOW_IDENT_in_lvalue521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT26_tree = (Object)adaptor.create(IDENT26);
                    adaptor.addChild(root_0, IDENT26_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lvalue"

    public static class rvalue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rvalue"
    // MathExpr.g:78:1: rvalue : ( logic | mod );
    public final MathExprParser.rvalue_return rvalue() throws RecognitionException {
        MathExprParser.rvalue_return retval = new MathExprParser.rvalue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.logic_return logic27 = null;

        MathExprParser.mod_return mod28 = null;



        try {
            // MathExpr.g:78:7: ( logic | mod )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NUMBER && LA7_0<=STRING)||LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==IDENT) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||LA7_2==IDENT||(LA7_2>=23 && LA7_2<=31)||(LA7_2>=33 && LA7_2<=38)||LA7_2==40) ) {
                    alt7=1;
                }
                else if ( (LA7_2==32) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // MathExpr.g:79:3: logic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_logic_in_rvalue532);
                    logic27=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic27.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:79:11: mod
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_mod_in_rvalue536);
                    mod28=mod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mod28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rvalue"

    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // MathExpr.g:82:1: mult : term ( ( '*' | '/' ) term )* ;
    public final MathExprParser.mult_return mult() throws RecognitionException {
        MathExprParser.mult_return retval = new MathExprParser.mult_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;
        MathExprParser.term_return term29 = null;

        MathExprParser.term_return term31 = null;


        Object set30_tree=null;

        try {
            // MathExpr.g:82:5: ( term ( ( '*' | '/' ) term )* )
            // MathExpr.g:83:3: term ( ( '*' | '/' ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_mult547);
            term29=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term29.getTree());
            // MathExpr.g:83:8: ( ( '*' | '/' ) term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:83:9: ( '*' | '/' ) term
            	    {
            	    set30=(Token)input.LT(1);
            	    set30=(Token)input.LT(1);
            	    if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set30), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_mult561);
            	    term31=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // MathExpr.g:86:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set33=null;
        MathExprParser.mult_return mult32 = null;

        MathExprParser.mult_return mult34 = null;


        Object set33_tree=null;

        try {
            // MathExpr.g:86:4: ( mult ( ( '+' | '-' ) mult )* )
            // MathExpr.g:87:3: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add574);
            mult32=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult32.getTree());
            // MathExpr.g:87:8: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=30 && LA9_0<=31)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MathExpr.g:87:9: ( '+' | '-' ) mult
            	    {
            	    set33=(Token)input.LT(1);
            	    set33=(Token)input.LT(1);
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set33), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mult_in_add586);
            	    mult34=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult34.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class mod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mod"
    // MathExpr.g:90:1: mod : IDENT '%' NUMBER ;
    public final MathExprParser.mod_return mod() throws RecognitionException {
        MathExprParser.mod_return retval = new MathExprParser.mod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT35=null;
        Token char_literal36=null;
        Token NUMBER37=null;

        Object IDENT35_tree=null;
        Object char_literal36_tree=null;
        Object NUMBER37_tree=null;

        try {
            // MathExpr.g:90:4: ( IDENT '%' NUMBER )
            // MathExpr.g:91:4: IDENT '%' NUMBER
            {
            root_0 = (Object)adaptor.nil();

            IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_mod599); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT35_tree = (Object)adaptor.create(IDENT35);
            adaptor.addChild(root_0, IDENT35_tree);
            }
            char_literal36=(Token)match(input,32,FOLLOW_32_in_mod601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal36_tree = (Object)adaptor.create(char_literal36);
            root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);
            }
            NUMBER37=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_mod604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER37_tree = (Object)adaptor.create(NUMBER37);
            adaptor.addChild(root_0, NUMBER37_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mod"

    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logic"
    // MathExpr.g:94:1: logic : add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? ;
    public final MathExprParser.logic_return logic() throws RecognitionException {
        MathExprParser.logic_return retval = new MathExprParser.logic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set39=null;
        MathExprParser.add_return add38 = null;

        MathExprParser.add_return add40 = null;


        Object set39_tree=null;

        try {
            // MathExpr.g:94:6: ( add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )? )
            // MathExpr.g:95:3: add ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_logic615);
            add38=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add38.getTree());
            // MathExpr.g:95:7: ( ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=38)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // MathExpr.g:95:8: ( '==' | '!=' | '>' | '<' | '>=' | '<=' ) add
                    {
                    set39=(Token)input.LT(1);
                    set39=(Token)input.LT(1);
                    if ( (input.LA(1)>=33 && input.LA(1)<=38) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set39), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_logic643);
                    add40=add();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add40.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logic"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // MathExpr.g:98:1: expr : ( lvalue '=' rvalue ';' | funcCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expr ( ELSE expr )? | WHILE '(' rvalue ')' expr | DO expr WHILE '(' rvalue ')' | '{' exprList '}' );
    public final MathExprParser.expr_return expr() throws RecognitionException {
        MathExprParser.expr_return retval = new MathExprParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token RETURN47=null;
        Token char_literal49=null;
        Token IF50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token ELSE55=null;
        Token WHILE57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token DO62=null;
        Token WHILE64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        MathExprParser.lvalue_return lvalue41 = null;

        MathExprParser.rvalue_return rvalue43 = null;

        MathExprParser.funcCall_return funcCall45 = null;

        MathExprParser.rvalue_return rvalue48 = null;

        MathExprParser.rvalue_return rvalue52 = null;

        MathExprParser.expr_return expr54 = null;

        MathExprParser.expr_return expr56 = null;

        MathExprParser.rvalue_return rvalue59 = null;

        MathExprParser.expr_return expr61 = null;

        MathExprParser.expr_return expr63 = null;

        MathExprParser.rvalue_return rvalue66 = null;

        MathExprParser.exprList_return exprList69 = null;


        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        Object RETURN47_tree=null;
        Object char_literal49_tree=null;
        Object IF50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        Object ELSE55_tree=null;
        Object WHILE57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        Object DO62_tree=null;
        Object WHILE64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        Object char_literal68_tree=null;
        Object char_literal70_tree=null;

        try {
            // MathExpr.g:98:5: ( lvalue '=' rvalue ';' | funcCall ';' | RETURN rvalue ';' | IF '(' rvalue ')' expr ( ELSE expr )? | WHILE '(' rvalue ')' expr | DO expr WHILE '(' rvalue ')' | '{' exprList '}' )
            int alt12=7;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==25) ) {
                    alt12=2;
                }
                else if ( (LA12_1==IDENT||LA12_1==23||LA12_1==39) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RETURN:
                {
                alt12=3;
                }
                break;
            case IF:
                {
                alt12=4;
                }
                break;
            case WHILE:
                {
                alt12=5;
                }
                break;
            case DO:
                {
                alt12=6;
                }
                break;
            case 41:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // MathExpr.g:99:3: lvalue '=' rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lvalue_in_expr657);
                    lvalue41=lvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lvalue41.getTree());
                    char_literal42=(Token)match(input,39,FOLLOW_39_in_expr659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal42_tree = (Object)adaptor.create(char_literal42);
                    root_0 = (Object)adaptor.becomeRoot(char_literal42_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expr662);
                    rvalue43=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue43.getTree());
                    char_literal44=(Token)match(input,40,FOLLOW_40_in_expr664); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:100:3: funcCall ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcCall_in_expr669);
                    funcCall45=funcCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcCall45.getTree());
                    char_literal46=(Token)match(input,40,FOLLOW_40_in_expr671); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // MathExpr.g:101:3: RETURN rvalue ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN47=(Token)match(input,RETURN,FOLLOW_RETURN_in_expr676); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN47_tree = (Object)adaptor.create(RETURN47);
                    root_0 = (Object)adaptor.becomeRoot(RETURN47_tree, root_0);
                    }
                    pushFollow(FOLLOW_rvalue_in_expr679);
                    rvalue48=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue48.getTree());
                    char_literal49=(Token)match(input,40,FOLLOW_40_in_expr681); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // MathExpr.g:102:3: IF '(' rvalue ')' expr ( ELSE expr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF50=(Token)match(input,IF,FOLLOW_IF_in_expr686); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF50_tree = (Object)adaptor.create(IF50);
                    root_0 = (Object)adaptor.becomeRoot(IF50_tree, root_0);
                    }
                    char_literal51=(Token)match(input,25,FOLLOW_25_in_expr689); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expr692);
                    rvalue52=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue52.getTree());
                    char_literal53=(Token)match(input,26,FOLLOW_26_in_expr694); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr697);
                    expr54=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr54.getTree());
                    // MathExpr.g:102:29: ( ELSE expr )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ELSE) ) {
                        int LA11_1 = input.LA(2);

                        if ( (synpred25_MathExpr()) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // MathExpr.g:102:30: ELSE expr
                            {
                            ELSE55=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr700); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr703);
                            expr56=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr56.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // MathExpr.g:103:3: WHILE '(' rvalue ')' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE57=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE57_tree = (Object)adaptor.create(WHILE57);
                    root_0 = (Object)adaptor.becomeRoot(WHILE57_tree, root_0);
                    }
                    char_literal58=(Token)match(input,25,FOLLOW_25_in_expr712); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expr715);
                    rvalue59=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue59.getTree());
                    char_literal60=(Token)match(input,26,FOLLOW_26_in_expr717); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr720);
                    expr61=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr61.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:104:3: DO expr WHILE '(' rvalue ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    DO62=(Token)match(input,DO,FOLLOW_DO_in_expr724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO62_tree = (Object)adaptor.create(DO62);
                    root_0 = (Object)adaptor.becomeRoot(DO62_tree, root_0);
                    }
                    pushFollow(FOLLOW_expr_in_expr727);
                    expr63=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr63.getTree());
                    WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE64_tree = (Object)adaptor.create(WHILE64);
                    adaptor.addChild(root_0, WHILE64_tree);
                    }
                    char_literal65=(Token)match(input,25,FOLLOW_25_in_expr731); if (state.failed) return retval;
                    pushFollow(FOLLOW_rvalue_in_expr734);
                    rvalue66=rvalue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rvalue66.getTree());
                    char_literal67=(Token)match(input,26,FOLLOW_26_in_expr736); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // MathExpr.g:105:3: '{' exprList '}'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal68=(Token)match(input,41,FOLLOW_41_in_expr741); if (state.failed) return retval;
                    pushFollow(FOLLOW_exprList_in_expr744);
                    exprList69=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList69.getTree());
                    char_literal70=(Token)match(input,42,FOLLOW_42_in_expr746); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // MathExpr.g:108:1: exprList : ( expr ( ';' )* )* -> ^( BLOCK ( expr )* ) ;
    public final MathExprParser.exprList_return exprList() throws RecognitionException {
        MathExprParser.exprList_return retval = new MathExprParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        MathExprParser.expr_return expr71 = null;


        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MathExpr.g:108:9: ( ( expr ( ';' )* )* -> ^( BLOCK ( expr )* ) )
            // MathExpr.g:109:3: ( expr ( ';' )* )*
            {
            // MathExpr.g:109:3: ( expr ( ';' )* )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RETURN && LA14_0<=IF)||(LA14_0>=DO && LA14_0<=WHILE)||LA14_0==IDENT||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // MathExpr.g:109:4: expr ( ';' )*
            	    {
            	    pushFollow(FOLLOW_expr_in_exprList759);
            	    expr71=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr71.getTree());
            	    // MathExpr.g:109:9: ( ';' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==40) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: ';'
            	    	    {
            	    	    char_literal72=(Token)match(input,40,FOLLOW_40_in_exprList761); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_40.add(char_literal72);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:17: -> ^( BLOCK ( expr )* )
            {
                // MathExpr.g:109:21: ^( BLOCK ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:109:29: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class argDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argDecl"
    // MathExpr.g:112:1: argDecl : type IDENT ;
    public final MathExprParser.argDecl_return argDecl() throws RecognitionException {
        MathExprParser.argDecl_return retval = new MathExprParser.argDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT74=null;
        MathExprParser.type_return type73 = null;


        Object IDENT74_tree=null;

        try {
            // MathExpr.g:112:8: ( type IDENT )
            // MathExpr.g:113:3: type IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_argDecl785);
            type73=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type73.getTree());
            IDENT74=(Token)match(input,IDENT,FOLLOW_IDENT_in_argDecl787); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT74_tree = (Object)adaptor.create(IDENT74);
            root_0 = (Object)adaptor.becomeRoot(IDENT74_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argDecl"

    public static class argsDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argsDecl"
    // MathExpr.g:115:1: argsDecl : ( argDecl ( ',' argDecl )* )? -> ^( ARGS_DECL ( argDecl )* ) ;
    public final MathExprParser.argsDecl_return argsDecl() throws RecognitionException {
        MathExprParser.argsDecl_return retval = new MathExprParser.argsDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal76=null;
        MathExprParser.argDecl_return argDecl75 = null;

        MathExprParser.argDecl_return argDecl77 = null;


        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_argDecl=new RewriteRuleSubtreeStream(adaptor,"rule argDecl");
        try {
            // MathExpr.g:115:9: ( ( argDecl ( ',' argDecl )* )? -> ^( ARGS_DECL ( argDecl )* ) )
            // MathExpr.g:116:3: ( argDecl ( ',' argDecl )* )?
            {
            // MathExpr.g:116:3: ( argDecl ( ',' argDecl )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // MathExpr.g:116:4: argDecl ( ',' argDecl )*
                    {
                    pushFollow(FOLLOW_argDecl_in_argsDecl798);
                    argDecl75=argDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argDecl.add(argDecl75.getTree());
                    // MathExpr.g:116:12: ( ',' argDecl )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // MathExpr.g:116:13: ',' argDecl
                    	    {
                    	    char_literal76=(Token)match(input,27,FOLLOW_27_in_argsDecl801); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_27.add(char_literal76);

                    	    pushFollow(FOLLOW_argDecl_in_argsDecl803);
                    	    argDecl77=argDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argDecl.add(argDecl77.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: argDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:30: -> ^( ARGS_DECL ( argDecl )* )
            {
                // MathExpr.g:116:34: ^( ARGS_DECL ( argDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS_DECL, "ARGS_DECL"), root_1);

                // MathExpr.g:116:46: ( argDecl )*
                while ( stream_argDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_argDecl.nextTree());

                }
                stream_argDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argsDecl"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // MathExpr.g:119:1: funcDecl : type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )* -> ^( FUNC_DECL IDENT type argsDecl exprList ) ;
    public final MathExprParser.funcDecl_return funcDecl() throws RecognitionException {
        MathExprParser.funcDecl_return retval = new MathExprParser.funcDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        MathExprParser.type_return type78 = null;

        MathExprParser.argsDecl_return argsDecl81 = null;

        MathExprParser.exprList_return exprList84 = null;


        Object IDENT79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_argsDecl=new RewriteRuleSubtreeStream(adaptor,"rule argsDecl");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // MathExpr.g:119:9: ( type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )* -> ^( FUNC_DECL IDENT type argsDecl exprList ) )
            // MathExpr.g:120:3: type IDENT '(' argsDecl ')' '{' exprList '}' ( ';' )*
            {
            pushFollow(FOLLOW_type_in_funcDecl828);
            type78=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type78.getTree());
            IDENT79=(Token)match(input,IDENT,FOLLOW_IDENT_in_funcDecl830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT79);

            char_literal80=(Token)match(input,25,FOLLOW_25_in_funcDecl832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal80);

            pushFollow(FOLLOW_argsDecl_in_funcDecl834);
            argsDecl81=argsDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argsDecl.add(argsDecl81.getTree());
            char_literal82=(Token)match(input,26,FOLLOW_26_in_funcDecl836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal82);

            char_literal83=(Token)match(input,41,FOLLOW_41_in_funcDecl838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal83);

            pushFollow(FOLLOW_exprList_in_funcDecl840);
            exprList84=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList84.getTree());
            char_literal85=(Token)match(input,42,FOLLOW_42_in_funcDecl842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal85);

            // MathExpr.g:120:48: ( ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // MathExpr.g:0:0: ';'
            	    {
            	    char_literal86=(Token)match(input,40,FOLLOW_40_in_funcDecl844); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_40.add(char_literal86);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: exprList, argsDecl, IDENT, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:5: -> ^( FUNC_DECL IDENT type argsDecl exprList )
            {
                // MathExpr.g:121:9: ^( FUNC_DECL IDENT type argsDecl exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_argsDecl.nextTree());
                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // MathExpr.g:128:1: decl : funcDecl ;
    public final MathExprParser.decl_return decl() throws RecognitionException {
        MathExprParser.decl_return retval = new MathExprParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.funcDecl_return funcDecl87 = null;



        try {
            // MathExpr.g:128:5: ( funcDecl )
            // MathExpr.g:129:3: funcDecl
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_funcDecl_in_decl905);
            funcDecl87=funcDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl87.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl"

    public static class declList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declList"
    // MathExpr.g:132:1: declList : ( decl )* ;
    public final MathExprParser.declList_return declList() throws RecognitionException {
        MathExprParser.declList_return retval = new MathExprParser.declList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.decl_return decl88 = null;



        try {
            // MathExpr.g:132:9: ( ( decl )* )
            // MathExpr.g:133:3: ( decl )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:133:3: ( decl )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // MathExpr.g:0:0: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_declList916);
            	    decl88=decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, decl88.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declList"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // MathExpr.g:136:1: program : declList ;
    public final MathExprParser.program_return program() throws RecognitionException {
        MathExprParser.program_return retval = new MathExprParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        MathExprParser.declList_return declList89 = null;



        try {
            // MathExpr.g:136:8: ( declList )
            // MathExpr.g:137:3: declList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declList_in_program928);
            declList89=declList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declList89.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // MathExpr.g:140:1: start : program EOF -> ^( PROGRAM program ) ;
    public final MathExprParser.start_return start() throws RecognitionException {
        MathExprParser.start_return retval = new MathExprParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF91=null;
        MathExprParser.program_return program90 = null;


        Object EOF91_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            // MathExpr.g:140:6: ( program EOF -> ^( PROGRAM program ) )
            // MathExpr.g:141:3: program EOF
            {
            pushFollow(FOLLOW_program_in_start939);
            program90=program();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_program.add(program90.getTree());
            EOF91=(Token)match(input,EOF,FOLLOW_EOF_in_start943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF91);



            // AST REWRITE
            // elements: program
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:5: -> ^( PROGRAM program )
            {
                // MathExpr.g:143:9: ^( PROGRAM program )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_program.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    // $ANTLR start synpred9_MathExpr
    public final void synpred9_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:73:3: ( IDENT ( arrayIndex0 rvalue ']' )* )
        // MathExpr.g:73:3: IDENT ( arrayIndex0 rvalue ']' )*
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred9_MathExpr500); if (state.failed) return ;
        // MathExpr.g:73:9: ( arrayIndex0 rvalue ']' )*
        loop20:
        do {
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }


            switch (alt20) {
        	case 1 :
        	    // MathExpr.g:73:10: arrayIndex0 rvalue ']'
        	    {
        	    pushFollow(FOLLOW_arrayIndex0_in_synpred9_MathExpr503);
        	    arrayIndex0();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_rvalue_in_synpred9_MathExpr506);
        	    rvalue();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,24,FOLLOW_24_in_synpred9_MathExpr508); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop20;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred9_MathExpr

    // $ANTLR start synpred10_MathExpr
    public final void synpred10_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:74:3: ( IDENT )
        // MathExpr.g:74:3: IDENT
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred10_MathExpr515); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_MathExpr

    // $ANTLR start synpred25_MathExpr
    public final void synpred25_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:102:30: ( ELSE expr )
        // MathExpr.g:102:30: ELSE expr
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred25_MathExpr700); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred25_MathExpr703);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_MathExpr

    // Delegated rules

    public final boolean synpred25_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_IDENT_in_type0358 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_type0361 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_type0363 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_type0_in_type374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_term391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_term395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_term399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_term403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_term407 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_logic_in_term410 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_term412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rvalue_in_args425 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_args428 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_args430 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDENT_in_funcCall454 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_funcCall456 = new BitSet(new long[]{0x0000000006380000L});
    public static final BitSet FOLLOW_args_in_funcCall458 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcCall460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_arrayIndex0482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_lvalue500 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_arrayIndex0_in_lvalue503 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_lvalue506 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_lvalue508 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_lvalue515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_lvalue519 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_lvalue521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_rvalue532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mod_in_rvalue536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_mult547 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_mult550 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_term_in_mult561 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_mult_in_add574 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_add577 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_mult_in_add586 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_IDENT_in_mod599 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_mod601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NUMBER_in_mod604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_logic615 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_set_in_logic618 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_add_in_logic643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_expr657 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_expr659 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_expr662 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCall_in_expr669 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expr676 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_expr679 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_expr681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expr686 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expr689 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_expr692 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr694 = new BitSet(new long[]{0x00000200002001B0L});
    public static final BitSet FOLLOW_expr_in_expr697 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_expr700 = new BitSet(new long[]{0x00000200002001B0L});
    public static final BitSet FOLLOW_expr_in_expr703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expr709 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expr712 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_expr715 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr717 = new BitSet(new long[]{0x00000200002001B0L});
    public static final BitSet FOLLOW_expr_in_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_expr724 = new BitSet(new long[]{0x00000200002001B0L});
    public static final BitSet FOLLOW_expr_in_expr727 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_WHILE_in_expr729 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expr731 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_expr734 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_expr741 = new BitSet(new long[]{0x00000600002001B0L});
    public static final BitSet FOLLOW_exprList_in_expr744 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_expr746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList759 = new BitSet(new long[]{0x00000300002001B2L});
    public static final BitSet FOLLOW_40_in_exprList761 = new BitSet(new long[]{0x00000300002001B2L});
    public static final BitSet FOLLOW_type_in_argDecl785 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_argDecl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argDecl_in_argsDecl798 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_argsDecl801 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_argDecl_in_argsDecl803 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_type_in_funcDecl828 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENT_in_funcDecl830 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_funcDecl832 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_argsDecl_in_funcDecl834 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_funcDecl836 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_funcDecl838 = new BitSet(new long[]{0x00000600002001B0L});
    public static final BitSet FOLLOW_exprList_in_funcDecl840 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_funcDecl842 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_funcDecl844 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_funcDecl_in_decl905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_declList916 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_declList_in_program928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_program_in_start939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred9_MathExpr500 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_arrayIndex0_in_synpred9_MathExpr503 = new BitSet(new long[]{0x0000000002380000L});
    public static final BitSet FOLLOW_rvalue_in_synpred9_MathExpr506 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred9_MathExpr508 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_synpred10_MathExpr515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred25_MathExpr700 = new BitSet(new long[]{0x00000200002001B0L});
    public static final BitSet FOLLOW_expr_in_synpred25_MathExpr703 = new BitSet(new long[]{0x0000000000000002L});

}