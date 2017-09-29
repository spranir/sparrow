package org.etl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.etl.services.SparrowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSparrowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'try'", "'finally'", "'catch'", "'doozle'", "'as'", "'in-table'", "'on'", "'using'", "'rest'", "'secured-by'", "'with-url'", "'and-method-as'", "'from'", "'update-header-with'", "'update-body-with'", "'parent'", "'into'", "'store-ack-at'", "'part'", "'with'", "'trelloget'", "'with-key'", "'through-user'", "'from-board'", "'to'", "'on-condition'", "'trelloput'", "'for-list'", "'from-source'", "'assign'", "'source'", "'callprocess'", "'with-target'", "'from-file'", "'for-every'", "'log'", "'logto'", "'sms'", "'for'", "'slackput'", "'googlecalput'", "'copydata'", "'writecsv'", "'loadcsv'", "'transform'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSparrowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSparrowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSparrowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSparrow.g"; }



     	private SparrowGrammarAccess grammarAccess;

        public InternalSparrowParser(TokenStream input, SparrowGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected SparrowGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalSparrow.g:64:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSparrow.g:64:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSparrow.g:65:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSparrow.g:71:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_try_3_0= ruleTry ) ) ( (lv_catch_4_0= ruleCatch ) ) ( (lv_finally_5_0= ruleFinally ) ) otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_try_3_0 = null;

        EObject lv_catch_4_0 = null;

        EObject lv_finally_5_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:77:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_try_3_0= ruleTry ) ) ( (lv_catch_4_0= ruleCatch ) ) ( (lv_finally_5_0= ruleFinally ) ) otherlv_6= '}' ) )
            // InternalSparrow.g:78:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_try_3_0= ruleTry ) ) ( (lv_catch_4_0= ruleCatch ) ) ( (lv_finally_5_0= ruleFinally ) ) otherlv_6= '}' )
            {
            // InternalSparrow.g:78:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_try_3_0= ruleTry ) ) ( (lv_catch_4_0= ruleCatch ) ) ( (lv_finally_5_0= ruleFinally ) ) otherlv_6= '}' )
            // InternalSparrow.g:79:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_try_3_0= ruleTry ) ) ( (lv_catch_4_0= ruleCatch ) ) ( (lv_finally_5_0= ruleFinally ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalSparrow.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalSparrow.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalSparrow.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalSparrow.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSparrow.g:105:3: ( (lv_try_3_0= ruleTry ) )
            // InternalSparrow.g:106:4: (lv_try_3_0= ruleTry )
            {
            // InternalSparrow.g:106:4: (lv_try_3_0= ruleTry )
            // InternalSparrow.g:107:5: lv_try_3_0= ruleTry
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getTryTryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_try_3_0=ruleTry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"try",
            						lv_try_3_0,
            						"org.etl.Sparrow.Try");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSparrow.g:124:3: ( (lv_catch_4_0= ruleCatch ) )
            // InternalSparrow.g:125:4: (lv_catch_4_0= ruleCatch )
            {
            // InternalSparrow.g:125:4: (lv_catch_4_0= ruleCatch )
            // InternalSparrow.g:126:5: lv_catch_4_0= ruleCatch
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getCatchCatchParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_catch_4_0=ruleCatch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"catch",
            						lv_catch_4_0,
            						"org.etl.Sparrow.Catch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSparrow.g:143:3: ( (lv_finally_5_0= ruleFinally ) )
            // InternalSparrow.g:144:4: (lv_finally_5_0= ruleFinally )
            {
            // InternalSparrow.g:144:4: (lv_finally_5_0= ruleFinally )
            // InternalSparrow.g:145:5: lv_finally_5_0= ruleFinally
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getFinallyFinallyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_finally_5_0=ruleFinally();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"finally",
            						lv_finally_5_0,
            						"org.etl.Sparrow.Finally");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleTry"
    // InternalSparrow.g:170:1: entryRuleTry returns [EObject current=null] : iv_ruleTry= ruleTry EOF ;
    public final EObject entryRuleTry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTry = null;


        try {
            // InternalSparrow.g:170:44: (iv_ruleTry= ruleTry EOF )
            // InternalSparrow.g:171:2: iv_ruleTry= ruleTry EOF
            {
             newCompositeNode(grammarAccess.getTryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTry=ruleTry();

            state._fsp--;

             current =iv_ruleTry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTry"


    // $ANTLR start "ruleTry"
    // InternalSparrow.g:177:1: ruleTry returns [EObject current=null] : (otherlv_0= 'try' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleTry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:183:2: ( (otherlv_0= 'try' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) )
            // InternalSparrow.g:184:2: (otherlv_0= 'try' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            {
            // InternalSparrow.g:184:2: (otherlv_0= 'try' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            // InternalSparrow.g:185:3: otherlv_0= 'try' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTryAccess().getTryKeyword_0());
            		
            // InternalSparrow.g:189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSparrow.g:190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSparrow.g:190:4: (lv_name_1_0= RULE_ID )
            // InternalSparrow.g:191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSparrow.g:211:3: ( (lv_action_3_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==22||LA1_0==34||LA1_0==40||LA1_0==43||LA1_0==45||LA1_0==49||LA1_0==51||(LA1_0>=53 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSparrow.g:212:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalSparrow.g:212:4: (lv_action_3_0= ruleAction )
            	    // InternalSparrow.g:213:5: lv_action_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTryAccess().getActionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_action_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_3_0,
            	    						"org.etl.Sparrow.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTry"


    // $ANTLR start "entryRuleFinally"
    // InternalSparrow.g:238:1: entryRuleFinally returns [EObject current=null] : iv_ruleFinally= ruleFinally EOF ;
    public final EObject entryRuleFinally() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinally = null;


        try {
            // InternalSparrow.g:238:48: (iv_ruleFinally= ruleFinally EOF )
            // InternalSparrow.g:239:2: iv_ruleFinally= ruleFinally EOF
            {
             newCompositeNode(grammarAccess.getFinallyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinally=ruleFinally();

            state._fsp--;

             current =iv_ruleFinally; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinally"


    // $ANTLR start "ruleFinally"
    // InternalSparrow.g:245:1: ruleFinally returns [EObject current=null] : (otherlv_0= 'finally' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleFinally() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:251:2: ( (otherlv_0= 'finally' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) )
            // InternalSparrow.g:252:2: (otherlv_0= 'finally' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            {
            // InternalSparrow.g:252:2: (otherlv_0= 'finally' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            // InternalSparrow.g:253:3: otherlv_0= 'finally' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFinallyAccess().getFinallyKeyword_0());
            		
            // InternalSparrow.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSparrow.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSparrow.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalSparrow.g:259:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFinallyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinallyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFinallyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSparrow.g:279:3: ( (lv_action_3_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==22||LA2_0==34||LA2_0==40||LA2_0==43||LA2_0==45||LA2_0==49||LA2_0==51||(LA2_0>=53 && LA2_0<=58)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSparrow.g:280:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalSparrow.g:280:4: (lv_action_3_0= ruleAction )
            	    // InternalSparrow.g:281:5: lv_action_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getFinallyAccess().getActionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_action_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFinallyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_3_0,
            	    						"org.etl.Sparrow.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFinallyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinally"


    // $ANTLR start "entryRuleCatch"
    // InternalSparrow.g:306:1: entryRuleCatch returns [EObject current=null] : iv_ruleCatch= ruleCatch EOF ;
    public final EObject entryRuleCatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatch = null;


        try {
            // InternalSparrow.g:306:46: (iv_ruleCatch= ruleCatch EOF )
            // InternalSparrow.g:307:2: iv_ruleCatch= ruleCatch EOF
            {
             newCompositeNode(grammarAccess.getCatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatch=ruleCatch();

            state._fsp--;

             current =iv_ruleCatch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatch"


    // $ANTLR start "ruleCatch"
    // InternalSparrow.g:313:1: ruleCatch returns [EObject current=null] : (otherlv_0= 'catch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) ;
    public final EObject ruleCatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_action_3_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:319:2: ( (otherlv_0= 'catch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' ) )
            // InternalSparrow.g:320:2: (otherlv_0= 'catch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            {
            // InternalSparrow.g:320:2: (otherlv_0= 'catch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}' )
            // InternalSparrow.g:321:3: otherlv_0= 'catch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_action_3_0= ruleAction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCatchAccess().getCatchKeyword_0());
            		
            // InternalSparrow.g:325:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSparrow.g:326:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSparrow.g:326:4: (lv_name_1_0= RULE_ID )
            // InternalSparrow.g:327:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCatchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCatchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCatchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSparrow.g:347:3: ( (lv_action_3_0= ruleAction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==22||LA3_0==34||LA3_0==40||LA3_0==43||LA3_0==45||LA3_0==49||LA3_0==51||(LA3_0>=53 && LA3_0<=58)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSparrow.g:348:4: (lv_action_3_0= ruleAction )
            	    {
            	    // InternalSparrow.g:348:4: (lv_action_3_0= ruleAction )
            	    // InternalSparrow.g:349:5: lv_action_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCatchAccess().getActionActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_action_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCatchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_3_0,
            	    						"org.etl.Sparrow.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCatchAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatch"


    // $ANTLR start "entryRuleAction"
    // InternalSparrow.g:374:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSparrow.g:374:47: (iv_ruleAction= ruleAction EOF )
            // InternalSparrow.g:375:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSparrow.g:381:1: ruleAction returns [EObject current=null] : (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Copydata_0 = null;

        EObject this_LoadCsv_1 = null;

        EObject this_WriteCsv_2 = null;

        EObject this_Transform_3 = null;

        EObject this_GooglecalPUT_4 = null;

        EObject this_SlackPUT_5 = null;

        EObject this_Sms_6 = null;

        EObject this_Updatedaudit_7 = null;

        EObject this_Callprocess_8 = null;

        EObject this_Fetch_9 = null;

        EObject this_TrelloPUT_10 = null;

        EObject this_TrelloGET_11 = null;

        EObject this_Rest_12 = null;

        EObject this_Doozle_13 = null;



        	enterRule();

        try {
            // InternalSparrow.g:387:2: ( (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle ) )
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle )
            {
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle )
            int alt4=14;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt4=1;
                }
                break;
            case 57:
                {
                alt4=2;
                }
                break;
            case 56:
                {
                alt4=3;
                }
                break;
            case 58:
                {
                alt4=4;
                }
                break;
            case 54:
                {
                alt4=5;
                }
                break;
            case 53:
                {
                alt4=6;
                }
                break;
            case 51:
                {
                alt4=7;
                }
                break;
            case 49:
                {
                alt4=8;
                }
                break;
            case 45:
                {
                alt4=9;
                }
                break;
            case 43:
                {
                alt4=10;
                }
                break;
            case 40:
                {
                alt4=11;
                }
                break;
            case 34:
                {
                alt4=12;
                }
                break;
            case 22:
                {
                alt4=13;
                }
                break;
            case 17:
                {
                alt4=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSparrow.g:389:3: this_Copydata_0= ruleCopydata
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCopydataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copydata_0=ruleCopydata();

                    state._fsp--;


                    			current = this_Copydata_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSparrow.g:398:3: this_LoadCsv_1= ruleLoadCsv
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLoadCsvParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadCsv_1=ruleLoadCsv();

                    state._fsp--;


                    			current = this_LoadCsv_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSparrow.g:407:3: this_WriteCsv_2= ruleWriteCsv
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWriteCsvParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteCsv_2=ruleWriteCsv();

                    state._fsp--;


                    			current = this_WriteCsv_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSparrow.g:416:3: this_Transform_3= ruleTransform
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTransformParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transform_3=ruleTransform();

                    state._fsp--;


                    			current = this_Transform_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSparrow.g:425:3: this_GooglecalPUT_4= ruleGooglecalPUT
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGooglecalPUTParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_GooglecalPUT_4=ruleGooglecalPUT();

                    state._fsp--;


                    			current = this_GooglecalPUT_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSparrow.g:434:3: this_SlackPUT_5= ruleSlackPUT
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSlackPUTParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SlackPUT_5=ruleSlackPUT();

                    state._fsp--;


                    			current = this_SlackPUT_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSparrow.g:443:3: this_Sms_6= ruleSms
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSmsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sms_6=ruleSms();

                    state._fsp--;


                    			current = this_Sms_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSparrow.g:452:3: this_Updatedaudit_7= ruleUpdatedaudit
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getUpdatedauditParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Updatedaudit_7=ruleUpdatedaudit();

                    state._fsp--;


                    			current = this_Updatedaudit_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSparrow.g:461:3: this_Callprocess_8= ruleCallprocess
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getCallprocessParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Callprocess_8=ruleCallprocess();

                    state._fsp--;


                    			current = this_Callprocess_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSparrow.g:470:3: this_Fetch_9= ruleFetch
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFetchParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fetch_9=ruleFetch();

                    state._fsp--;


                    			current = this_Fetch_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSparrow.g:479:3: this_TrelloPUT_10= ruleTrelloPUT
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTrelloPUTParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrelloPUT_10=ruleTrelloPUT();

                    state._fsp--;


                    			current = this_TrelloPUT_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalSparrow.g:488:3: this_TrelloGET_11= ruleTrelloGET
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTrelloGETParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrelloGET_11=ruleTrelloGET();

                    state._fsp--;


                    			current = this_TrelloGET_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalSparrow.g:497:3: this_Rest_12= ruleRest
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRestParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rest_12=ruleRest();

                    state._fsp--;


                    			current = this_Rest_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalSparrow.g:506:3: this_Doozle_13= ruleDoozle
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDoozleParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Doozle_13=ruleDoozle();

                    state._fsp--;


                    			current = this_Doozle_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDoozle"
    // InternalSparrow.g:518:1: entryRuleDoozle returns [EObject current=null] : iv_ruleDoozle= ruleDoozle EOF ;
    public final EObject entryRuleDoozle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoozle = null;


        try {
            // InternalSparrow.g:518:47: (iv_ruleDoozle= ruleDoozle EOF )
            // InternalSparrow.g:519:2: iv_ruleDoozle= ruleDoozle EOF
            {
             newCompositeNode(grammarAccess.getDoozleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoozle=ruleDoozle();

            state._fsp--;

             current =iv_ruleDoozle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoozle"


    // $ANTLR start "ruleDoozle"
    // InternalSparrow.g:525:1: ruleDoozle returns [EObject current=null] : (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' ) ;
    public final EObject ruleDoozle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        Token lv_on_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:531:2: ( (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' ) )
            // InternalSparrow.g:532:2: (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' )
            {
            // InternalSparrow.g:532:2: (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' )
            // InternalSparrow.g:533:3: otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDoozleAccess().getDoozleKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDoozleAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:541:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:542:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:542:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:543:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDoozleAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoozleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDoozleAccess().getInTableKeyword_3());
            		
            // InternalSparrow.g:563:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:564:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:564:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:565:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_target_4_0, grammarAccess.getDoozleAccess().getTargetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoozleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDoozleAccess().getOnKeyword_5());
            		
            // InternalSparrow.g:585:3: ( (lv_on_6_0= RULE_STRING ) )
            // InternalSparrow.g:586:4: (lv_on_6_0= RULE_STRING )
            {
            // InternalSparrow.g:586:4: (lv_on_6_0= RULE_STRING )
            // InternalSparrow.g:587:5: lv_on_6_0= RULE_STRING
            {
            lv_on_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_on_6_0, grammarAccess.getDoozleAccess().getOnSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoozleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"on",
            						lv_on_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDoozleAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDoozleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:611:3: ( (lv_value_9_0= ruleCreateStatement ) )
            // InternalSparrow.g:612:4: (lv_value_9_0= ruleCreateStatement )
            {
            // InternalSparrow.g:612:4: (lv_value_9_0= ruleCreateStatement )
            // InternalSparrow.g:613:5: lv_value_9_0= ruleCreateStatement
            {

            					newCompositeNode(grammarAccess.getDoozleAccess().getValueCreateStatementParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_9_0=ruleCreateStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoozleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.etl.Sparrow.CreateStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDoozleAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoozle"


    // $ANTLR start "entryRuleRest"
    // InternalSparrow.g:638:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalSparrow.g:638:45: (iv_ruleRest= ruleRest EOF )
            // InternalSparrow.g:639:2: iv_ruleRest= ruleRest EOF
            {
             newCompositeNode(grammarAccess.getRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRest=ruleRest();

            state._fsp--;

             current =iv_ruleRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRest"


    // $ANTLR start "ruleRest"
    // InternalSparrow.g:645:1: ruleRest returns [EObject current=null] : (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_headerdatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-header-with' otherlv_13= '{' ( (lv_headerdata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_postdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-body-with' otherlv_19= '{' otherlv_20= 'parent' otherlv_21= 'as' ( (lv_parentName_22_0= RULE_STRING ) ) ( (lv_parentdata_23_0= ruleSelectStatement ) ) ( (lv_parts_24_0= ruleRestPart ) )* otherlv_25= '}' otherlv_26= 'into' ( (lv_ackdatato_27_0= RULE_STRING ) ) otherlv_28= 'store-ack-at' otherlv_29= '{' ( (lv_ackdata_30_0= ruleSelectStatement ) ) otherlv_31= '}' otherlv_32= '}' ) ;
    public final EObject ruleRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_authtoken_4_0=null;
        Token otherlv_5=null;
        Token lv_url_6_0=null;
        Token otherlv_7=null;
        Token lv_method_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_headerdatafrom_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_postdatafrom_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_parentName_22_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_ackdatato_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_headerdata_14_0 = null;

        AntlrDatatypeRuleToken lv_parentdata_23_0 = null;

        EObject lv_parts_24_0 = null;

        AntlrDatatypeRuleToken lv_ackdata_30_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:651:2: ( (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_headerdatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-header-with' otherlv_13= '{' ( (lv_headerdata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_postdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-body-with' otherlv_19= '{' otherlv_20= 'parent' otherlv_21= 'as' ( (lv_parentName_22_0= RULE_STRING ) ) ( (lv_parentdata_23_0= ruleSelectStatement ) ) ( (lv_parts_24_0= ruleRestPart ) )* otherlv_25= '}' otherlv_26= 'into' ( (lv_ackdatato_27_0= RULE_STRING ) ) otherlv_28= 'store-ack-at' otherlv_29= '{' ( (lv_ackdata_30_0= ruleSelectStatement ) ) otherlv_31= '}' otherlv_32= '}' ) )
            // InternalSparrow.g:652:2: (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_headerdatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-header-with' otherlv_13= '{' ( (lv_headerdata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_postdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-body-with' otherlv_19= '{' otherlv_20= 'parent' otherlv_21= 'as' ( (lv_parentName_22_0= RULE_STRING ) ) ( (lv_parentdata_23_0= ruleSelectStatement ) ) ( (lv_parts_24_0= ruleRestPart ) )* otherlv_25= '}' otherlv_26= 'into' ( (lv_ackdatato_27_0= RULE_STRING ) ) otherlv_28= 'store-ack-at' otherlv_29= '{' ( (lv_ackdata_30_0= ruleSelectStatement ) ) otherlv_31= '}' otherlv_32= '}' )
            {
            // InternalSparrow.g:652:2: (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_headerdatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-header-with' otherlv_13= '{' ( (lv_headerdata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_postdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-body-with' otherlv_19= '{' otherlv_20= 'parent' otherlv_21= 'as' ( (lv_parentName_22_0= RULE_STRING ) ) ( (lv_parentdata_23_0= ruleSelectStatement ) ) ( (lv_parts_24_0= ruleRestPart ) )* otherlv_25= '}' otherlv_26= 'into' ( (lv_ackdatato_27_0= RULE_STRING ) ) otherlv_28= 'store-ack-at' otherlv_29= '{' ( (lv_ackdata_30_0= ruleSelectStatement ) ) otherlv_31= '}' otherlv_32= '}' )
            // InternalSparrow.g:653:3: otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_headerdatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-header-with' otherlv_13= '{' ( (lv_headerdata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_postdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-body-with' otherlv_19= '{' otherlv_20= 'parent' otherlv_21= 'as' ( (lv_parentName_22_0= RULE_STRING ) ) ( (lv_parentdata_23_0= ruleSelectStatement ) ) ( (lv_parts_24_0= ruleRestPart ) )* otherlv_25= '}' otherlv_26= 'into' ( (lv_ackdatato_27_0= RULE_STRING ) ) otherlv_28= 'store-ack-at' otherlv_29= '{' ( (lv_ackdata_30_0= ruleSelectStatement ) ) otherlv_31= '}' otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRestAccess().getRestKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:661:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:662:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:662:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:663:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRestAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:683:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:684:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:684:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:685:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_authtoken_4_0, grammarAccess.getRestAccess().getAuthtokenSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"authtoken",
            						lv_authtoken_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRestAccess().getWithUrlKeyword_5());
            		
            // InternalSparrow.g:705:3: ( (lv_url_6_0= RULE_STRING ) )
            // InternalSparrow.g:706:4: (lv_url_6_0= RULE_STRING )
            {
            // InternalSparrow.g:706:4: (lv_url_6_0= RULE_STRING )
            // InternalSparrow.g:707:5: lv_url_6_0= RULE_STRING
            {
            lv_url_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_url_6_0, grammarAccess.getRestAccess().getUrlSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRestAccess().getAndMethodAsKeyword_7());
            		
            // InternalSparrow.g:727:3: ( (lv_method_8_0= RULE_STRING ) )
            // InternalSparrow.g:728:4: (lv_method_8_0= RULE_STRING )
            {
            // InternalSparrow.g:728:4: (lv_method_8_0= RULE_STRING )
            // InternalSparrow.g:729:5: lv_method_8_0= RULE_STRING
            {
            lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_method_8_0, grammarAccess.getRestAccess().getMethodSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"method",
            						lv_method_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getRestAccess().getFromKeyword_10());
            		
            // InternalSparrow.g:753:3: ( (lv_headerdatafrom_11_0= RULE_STRING ) )
            // InternalSparrow.g:754:4: (lv_headerdatafrom_11_0= RULE_STRING )
            {
            // InternalSparrow.g:754:4: (lv_headerdatafrom_11_0= RULE_STRING )
            // InternalSparrow.g:755:5: lv_headerdatafrom_11_0= RULE_STRING
            {
            lv_headerdatafrom_11_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_headerdatafrom_11_0, grammarAccess.getRestAccess().getHeaderdatafromSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"headerdatafrom",
            						lv_headerdatafrom_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getRestAccess().getUpdateHeaderWithKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSparrow.g:779:3: ( (lv_headerdata_14_0= ruleSelectStatement ) )
            // InternalSparrow.g:780:4: (lv_headerdata_14_0= ruleSelectStatement )
            {
            // InternalSparrow.g:780:4: (lv_headerdata_14_0= ruleSelectStatement )
            // InternalSparrow.g:781:5: lv_headerdata_14_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getHeaderdataSelectStatementParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_8);
            lv_headerdata_14_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"headerdata",
            						lv_headerdata_14_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getRestAccess().getFromKeyword_16());
            		
            // InternalSparrow.g:806:3: ( (lv_postdatafrom_17_0= RULE_STRING ) )
            // InternalSparrow.g:807:4: (lv_postdatafrom_17_0= RULE_STRING )
            {
            // InternalSparrow.g:807:4: (lv_postdatafrom_17_0= RULE_STRING )
            // InternalSparrow.g:808:5: lv_postdatafrom_17_0= RULE_STRING
            {
            lv_postdatafrom_17_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_postdatafrom_17_0, grammarAccess.getRestAccess().getPostdatafromSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"postdatafrom",
            						lv_postdatafrom_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getRestAccess().getUpdateBodyWithKeyword_18());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_19, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_19());
            		
            otherlv_20=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_20, grammarAccess.getRestAccess().getParentKeyword_20());
            		
            otherlv_21=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getRestAccess().getAsKeyword_21());
            		
            // InternalSparrow.g:840:3: ( (lv_parentName_22_0= RULE_STRING ) )
            // InternalSparrow.g:841:4: (lv_parentName_22_0= RULE_STRING )
            {
            // InternalSparrow.g:841:4: (lv_parentName_22_0= RULE_STRING )
            // InternalSparrow.g:842:5: lv_parentName_22_0= RULE_STRING
            {
            lv_parentName_22_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_parentName_22_0, grammarAccess.getRestAccess().getParentNameSTRINGTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parentName",
            						lv_parentName_22_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSparrow.g:858:3: ( (lv_parentdata_23_0= ruleSelectStatement ) )
            // InternalSparrow.g:859:4: (lv_parentdata_23_0= ruleSelectStatement )
            {
            // InternalSparrow.g:859:4: (lv_parentdata_23_0= ruleSelectStatement )
            // InternalSparrow.g:860:5: lv_parentdata_23_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getParentdataSelectStatementParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_22);
            lv_parentdata_23_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"parentdata",
            						lv_parentdata_23_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSparrow.g:877:3: ( (lv_parts_24_0= ruleRestPart ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSparrow.g:878:4: (lv_parts_24_0= ruleRestPart )
            	    {
            	    // InternalSparrow.g:878:4: (lv_parts_24_0= ruleRestPart )
            	    // InternalSparrow.g:879:5: lv_parts_24_0= ruleRestPart
            	    {

            	    					newCompositeNode(grammarAccess.getRestAccess().getPartsRestPartParserRuleCall_24_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_parts_24_0=ruleRestPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_24_0,
            	    						"org.etl.Sparrow.RestPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_25=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_25, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_25());
            		
            otherlv_26=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_26, grammarAccess.getRestAccess().getIntoKeyword_26());
            		
            // InternalSparrow.g:904:3: ( (lv_ackdatato_27_0= RULE_STRING ) )
            // InternalSparrow.g:905:4: (lv_ackdatato_27_0= RULE_STRING )
            {
            // InternalSparrow.g:905:4: (lv_ackdatato_27_0= RULE_STRING )
            // InternalSparrow.g:906:5: lv_ackdatato_27_0= RULE_STRING
            {
            lv_ackdatato_27_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_ackdatato_27_0, grammarAccess.getRestAccess().getAckdatatoSTRINGTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ackdatato",
            						lv_ackdatato_27_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_28=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_28, grammarAccess.getRestAccess().getStoreAckAtKeyword_28());
            		
            otherlv_29=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_29, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_29());
            		
            // InternalSparrow.g:930:3: ( (lv_ackdata_30_0= ruleSelectStatement ) )
            // InternalSparrow.g:931:4: (lv_ackdata_30_0= ruleSelectStatement )
            {
            // InternalSparrow.g:931:4: (lv_ackdata_30_0= ruleSelectStatement )
            // InternalSparrow.g:932:5: lv_ackdata_30_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getAckdataSelectStatementParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_8);
            lv_ackdata_30_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"ackdata",
            						lv_ackdata_30_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_31, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_31());
            		
            otherlv_32=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_32());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleRestPart"
    // InternalSparrow.g:961:1: entryRuleRestPart returns [EObject current=null] : iv_ruleRestPart= ruleRestPart EOF ;
    public final EObject entryRuleRestPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestPart = null;


        try {
            // InternalSparrow.g:961:49: (iv_ruleRestPart= ruleRestPart EOF )
            // InternalSparrow.g:962:2: iv_ruleRestPart= ruleRestPart EOF
            {
             newCompositeNode(grammarAccess.getRestPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestPart=ruleRestPart();

            state._fsp--;

             current =iv_ruleRestPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestPart"


    // $ANTLR start "ruleRestPart"
    // InternalSparrow.g:968:1: ruleRestPart returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleRestPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_partName_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_partData_4_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:974:2: ( (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) ) )
            // InternalSparrow.g:975:2: (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) )
            {
            // InternalSparrow.g:975:2: (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) )
            // InternalSparrow.g:976:3: otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRestPartAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestPartAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:984:3: ( (lv_partName_2_0= RULE_STRING ) )
            // InternalSparrow.g:985:4: (lv_partName_2_0= RULE_STRING )
            {
            // InternalSparrow.g:985:4: (lv_partName_2_0= RULE_STRING )
            // InternalSparrow.g:986:5: lv_partName_2_0= RULE_STRING
            {
            lv_partName_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_partName_2_0, grammarAccess.getRestPartAccess().getPartNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"partName",
            						lv_partName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestPartAccess().getWithKeyword_3());
            		
            // InternalSparrow.g:1006:3: ( (lv_partData_4_0= ruleSelectStatement ) )
            // InternalSparrow.g:1007:4: (lv_partData_4_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1007:4: (lv_partData_4_0= ruleSelectStatement )
            // InternalSparrow.g:1008:5: lv_partData_4_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestPartAccess().getPartDataSelectStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_partData_4_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestPartRule());
            					}
            					set(
            						current,
            						"partData",
            						lv_partData_4_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestPart"


    // $ANTLR start "entryRuleTrelloGET"
    // InternalSparrow.g:1029:1: entryRuleTrelloGET returns [EObject current=null] : iv_ruleTrelloGET= ruleTrelloGET EOF ;
    public final EObject entryRuleTrelloGET() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrelloGET = null;


        try {
            // InternalSparrow.g:1029:50: (iv_ruleTrelloGET= ruleTrelloGET EOF )
            // InternalSparrow.g:1030:2: iv_ruleTrelloGET= ruleTrelloGET EOF
            {
             newCompositeNode(grammarAccess.getTrelloGETRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrelloGET=ruleTrelloGET();

            state._fsp--;

             current =iv_ruleTrelloGET; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrelloGET"


    // $ANTLR start "ruleTrelloGET"
    // InternalSparrow.g:1036:1: ruleTrelloGET returns [EObject current=null] : (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrelloGET() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_authtoken_4_0=null;
        Token otherlv_5=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_useraccount_8_0=null;
        Token otherlv_9=null;
        Token lv_board_10_0=null;
        Token otherlv_11=null;
        Token lv_target_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_condition_18_0=null;
        AntlrDatatypeRuleToken lv_value_15_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1042:2: ( (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1043:2: (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1043:2: (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) )
            // InternalSparrow.g:1044:3: otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTrelloGETAccess().getTrellogetKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrelloGETAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1052:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1053:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1053:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1054:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTrelloGETAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrelloGETAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:1074:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:1075:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1075:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:1076:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_authtoken_4_0, grammarAccess.getTrelloGETAccess().getAuthtokenSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"authtoken",
            						lv_authtoken_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTrelloGETAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:1096:3: ( (lv_key_6_0= RULE_STRING ) )
            // InternalSparrow.g:1097:4: (lv_key_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1097:4: (lv_key_6_0= RULE_STRING )
            // InternalSparrow.g:1098:5: lv_key_6_0= RULE_STRING
            {
            lv_key_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_key_6_0, grammarAccess.getTrelloGETAccess().getKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTrelloGETAccess().getThroughUserKeyword_7());
            		
            // InternalSparrow.g:1118:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:1119:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1119:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:1120:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_useraccount_8_0, grammarAccess.getTrelloGETAccess().getUseraccountSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useraccount",
            						lv_useraccount_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTrelloGETAccess().getFromBoardKeyword_9());
            		
            // InternalSparrow.g:1140:3: ( (lv_board_10_0= RULE_STRING ) )
            // InternalSparrow.g:1141:4: (lv_board_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1141:4: (lv_board_10_0= RULE_STRING )
            // InternalSparrow.g:1142:5: lv_board_10_0= RULE_STRING
            {
            lv_board_10_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_board_10_0, grammarAccess.getTrelloGETAccess().getBoardSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"board",
            						lv_board_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getTrelloGETAccess().getToKeyword_11());
            		
            // InternalSparrow.g:1162:3: ( (lv_target_12_0= RULE_STRING ) )
            // InternalSparrow.g:1163:4: (lv_target_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1163:4: (lv_target_12_0= RULE_STRING )
            // InternalSparrow.g:1164:5: lv_target_12_0= RULE_STRING
            {
            lv_target_12_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_target_12_0, grammarAccess.getTrelloGETAccess().getTargetSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTrelloGETAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getTrelloGETAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:1188:3: ( (lv_value_15_0= ruleSelectStatement ) )
            // InternalSparrow.g:1189:4: (lv_value_15_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1189:4: (lv_value_15_0= ruleSelectStatement )
            // InternalSparrow.g:1190:5: lv_value_15_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getTrelloGETAccess().getValueSelectStatementParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_15_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrelloGETRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_15_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_16, grammarAccess.getTrelloGETAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getTrelloGETAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:1215:3: ( (lv_condition_18_0= RULE_STRING ) )
            // InternalSparrow.g:1216:4: (lv_condition_18_0= RULE_STRING )
            {
            // InternalSparrow.g:1216:4: (lv_condition_18_0= RULE_STRING )
            // InternalSparrow.g:1217:5: lv_condition_18_0= RULE_STRING
            {
            lv_condition_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_18_0, grammarAccess.getTrelloGETAccess().getConditionSTRINGTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloGETRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrelloGET"


    // $ANTLR start "entryRuleTrelloPUT"
    // InternalSparrow.g:1237:1: entryRuleTrelloPUT returns [EObject current=null] : iv_ruleTrelloPUT= ruleTrelloPUT EOF ;
    public final EObject entryRuleTrelloPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrelloPUT = null;


        try {
            // InternalSparrow.g:1237:50: (iv_ruleTrelloPUT= ruleTrelloPUT EOF )
            // InternalSparrow.g:1238:2: iv_ruleTrelloPUT= ruleTrelloPUT EOF
            {
             newCompositeNode(grammarAccess.getTrelloPUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrelloPUT=ruleTrelloPUT();

            state._fsp--;

             current =iv_ruleTrelloPUT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrelloPUT"


    // $ANTLR start "ruleTrelloPUT"
    // InternalSparrow.g:1244:1: ruleTrelloPUT returns [EObject current=null] : (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) ) ;
    public final EObject ruleTrelloPUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_authtoken_4_0=null;
        Token otherlv_5=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_useraccount_8_0=null;
        Token otherlv_9=null;
        Token lv_list_10_0=null;
        Token otherlv_11=null;
        Token lv_source_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_condition_18_0=null;
        AntlrDatatypeRuleToken lv_value_15_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1250:2: ( (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1251:2: (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1251:2: (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) ) )
            // InternalSparrow.g:1252:3: otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTrelloPUTAccess().getTrelloputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrelloPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1260:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1261:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1261:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1262:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTrelloPUTAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrelloPUTAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:1282:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:1283:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1283:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:1284:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_authtoken_4_0, grammarAccess.getTrelloPUTAccess().getAuthtokenSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"authtoken",
            						lv_authtoken_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTrelloPUTAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:1304:3: ( (lv_key_6_0= RULE_STRING ) )
            // InternalSparrow.g:1305:4: (lv_key_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1305:4: (lv_key_6_0= RULE_STRING )
            // InternalSparrow.g:1306:5: lv_key_6_0= RULE_STRING
            {
            lv_key_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_key_6_0, grammarAccess.getTrelloPUTAccess().getKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTrelloPUTAccess().getThroughUserKeyword_7());
            		
            // InternalSparrow.g:1326:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:1327:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1327:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:1328:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_useraccount_8_0, grammarAccess.getTrelloPUTAccess().getUseraccountSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useraccount",
            						lv_useraccount_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTrelloPUTAccess().getForListKeyword_9());
            		
            // InternalSparrow.g:1348:3: ( (lv_list_10_0= RULE_STRING ) )
            // InternalSparrow.g:1349:4: (lv_list_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1349:4: (lv_list_10_0= RULE_STRING )
            // InternalSparrow.g:1350:5: lv_list_10_0= RULE_STRING
            {
            lv_list_10_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_list_10_0, grammarAccess.getTrelloPUTAccess().getListSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"list",
            						lv_list_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getTrelloPUTAccess().getFromSourceKeyword_11());
            		
            // InternalSparrow.g:1370:3: ( (lv_source_12_0= RULE_STRING ) )
            // InternalSparrow.g:1371:4: (lv_source_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1371:4: (lv_source_12_0= RULE_STRING )
            // InternalSparrow.g:1372:5: lv_source_12_0= RULE_STRING
            {
            lv_source_12_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_source_12_0, grammarAccess.getTrelloPUTAccess().getSourceSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTrelloPUTAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getTrelloPUTAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:1396:3: ( (lv_value_15_0= ruleSelectStatement ) )
            // InternalSparrow.g:1397:4: (lv_value_15_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1397:4: (lv_value_15_0= ruleSelectStatement )
            // InternalSparrow.g:1398:5: lv_value_15_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getTrelloPUTAccess().getValueSelectStatementParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_15_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrelloPUTRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_15_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_16, grammarAccess.getTrelloPUTAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getTrelloPUTAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:1423:3: ( (lv_condition_18_0= RULE_STRING ) )
            // InternalSparrow.g:1424:4: (lv_condition_18_0= RULE_STRING )
            {
            // InternalSparrow.g:1424:4: (lv_condition_18_0= RULE_STRING )
            // InternalSparrow.g:1425:5: lv_condition_18_0= RULE_STRING
            {
            lv_condition_18_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_18_0, grammarAccess.getTrelloPUTAccess().getConditionSTRINGTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrelloPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrelloPUT"


    // $ANTLR start "entryRuleFetch"
    // InternalSparrow.g:1445:1: entryRuleFetch returns [EObject current=null] : iv_ruleFetch= ruleFetch EOF ;
    public final EObject entryRuleFetch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetch = null;


        try {
            // InternalSparrow.g:1445:46: (iv_ruleFetch= ruleFetch EOF )
            // InternalSparrow.g:1446:2: iv_ruleFetch= ruleFetch EOF
            {
             newCompositeNode(grammarAccess.getFetchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFetch=ruleFetch();

            state._fsp--;

             current =iv_ruleFetch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFetch"


    // $ANTLR start "ruleFetch"
    // InternalSparrow.g:1452:1: ruleFetch returns [EObject current=null] : (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleFetch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_condition_10_0=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1458:2: ( (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1459:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1459:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:1460:3: otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchAccess().getAssignKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFetchAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1468:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1469:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1469:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1470:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFetchAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFetchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFetchAccess().getSourceKeyword_3());
            		
            // InternalSparrow.g:1490:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:1491:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1491:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:1492:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_source_4_0, grammarAccess.getFetchAccess().getSourceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFetchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFetchAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFetchAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:1516:3: ( (lv_value_7_0= ruleSelectStatement ) )
            // InternalSparrow.g:1517:4: (lv_value_7_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1517:4: (lv_value_7_0= ruleSelectStatement )
            // InternalSparrow.g:1518:5: lv_value_7_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getFetchAccess().getValueSelectStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_7_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFetchRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getFetchAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getFetchAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:1543:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:1544:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1544:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:1545:5: lv_condition_10_0= RULE_STRING
            {
            lv_condition_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_10_0, grammarAccess.getFetchAccess().getConditionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFetchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetch"


    // $ANTLR start "entryRuleCallprocess"
    // InternalSparrow.g:1565:1: entryRuleCallprocess returns [EObject current=null] : iv_ruleCallprocess= ruleCallprocess EOF ;
    public final EObject entryRuleCallprocess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallprocess = null;


        try {
            // InternalSparrow.g:1565:52: (iv_ruleCallprocess= ruleCallprocess EOF )
            // InternalSparrow.g:1566:2: iv_ruleCallprocess= ruleCallprocess EOF
            {
             newCompositeNode(grammarAccess.getCallprocessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallprocess=ruleCallprocess();

            state._fsp--;

             current =iv_ruleCallprocess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallprocess"


    // $ANTLR start "ruleCallprocess"
    // InternalSparrow.g:1572:1: ruleCallprocess returns [EObject current=null] : (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) ;
    public final EObject ruleCallprocess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        Token lv_source_6_0=null;
        Token otherlv_7=null;
        Token lv_datasource_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_condition_14_0=null;
        AntlrDatatypeRuleToken lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1578:2: ( (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1579:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1579:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            // InternalSparrow.g:1580:3: otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCallprocessAccess().getCallprocessKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallprocessAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1588:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1589:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1589:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1590:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCallprocessAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCallprocessAccess().getWithTargetKeyword_3());
            		
            // InternalSparrow.g:1610:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:1611:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1611:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:1612:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_target_4_0, grammarAccess.getCallprocessAccess().getTargetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCallprocessAccess().getFromFileKeyword_5());
            		
            // InternalSparrow.g:1632:3: ( (lv_source_6_0= RULE_STRING ) )
            // InternalSparrow.g:1633:4: (lv_source_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1633:4: (lv_source_6_0= RULE_STRING )
            // InternalSparrow.g:1634:5: lv_source_6_0= RULE_STRING
            {
            lv_source_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_source_6_0, grammarAccess.getCallprocessAccess().getSourceSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCallprocessAccess().getUsingKeyword_7());
            		
            // InternalSparrow.g:1654:3: ( (lv_datasource_8_0= RULE_STRING ) )
            // InternalSparrow.g:1655:4: (lv_datasource_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1655:4: (lv_datasource_8_0= RULE_STRING )
            // InternalSparrow.g:1656:5: lv_datasource_8_0= RULE_STRING
            {
            lv_datasource_8_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_datasource_8_0, grammarAccess.getCallprocessAccess().getDatasourceSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"datasource",
            						lv_datasource_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getCallprocessAccess().getForEveryKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getCallprocessAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:1680:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:1681:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1681:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:1682:5: lv_value_11_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getCallprocessAccess().getValueSelectStatementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_11_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallprocessRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_11_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getCallprocessAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getCallprocessAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:1707:3: ( (lv_condition_14_0= RULE_STRING ) )
            // InternalSparrow.g:1708:4: (lv_condition_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1708:4: (lv_condition_14_0= RULE_STRING )
            // InternalSparrow.g:1709:5: lv_condition_14_0= RULE_STRING
            {
            lv_condition_14_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_14_0, grammarAccess.getCallprocessAccess().getConditionSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallprocess"


    // $ANTLR start "entryRuleUpdatedaudit"
    // InternalSparrow.g:1729:1: entryRuleUpdatedaudit returns [EObject current=null] : iv_ruleUpdatedaudit= ruleUpdatedaudit EOF ;
    public final EObject entryRuleUpdatedaudit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatedaudit = null;


        try {
            // InternalSparrow.g:1729:53: (iv_ruleUpdatedaudit= ruleUpdatedaudit EOF )
            // InternalSparrow.g:1730:2: iv_ruleUpdatedaudit= ruleUpdatedaudit EOF
            {
             newCompositeNode(grammarAccess.getUpdatedauditRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdatedaudit=ruleUpdatedaudit();

            state._fsp--;

             current =iv_ruleUpdatedaudit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdatedaudit"


    // $ANTLR start "ruleUpdatedaudit"
    // InternalSparrow.g:1736:1: ruleUpdatedaudit returns [EObject current=null] : (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' ) ;
    public final EObject ruleUpdatedaudit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_logsink_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1742:2: ( (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' ) )
            // InternalSparrow.g:1743:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' )
            {
            // InternalSparrow.g:1743:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' )
            // InternalSparrow.g:1744:3: otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatedauditAccess().getLogKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdatedauditAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1752:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1753:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1753:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1754:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUpdatedauditAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatedauditRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdatedauditAccess().getLogtoKeyword_3());
            		
            // InternalSparrow.g:1774:3: ( (lv_logsink_4_0= RULE_STRING ) )
            // InternalSparrow.g:1775:4: (lv_logsink_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1775:4: (lv_logsink_4_0= RULE_STRING )
            // InternalSparrow.g:1776:5: lv_logsink_4_0= RULE_STRING
            {
            lv_logsink_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_logsink_4_0, grammarAccess.getUpdatedauditAccess().getLogsinkSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatedauditRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logsink",
            						lv_logsink_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdatedauditAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdatedauditAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:1800:3: ( (lv_value_7_0= ruleSelectStatement ) )
            // InternalSparrow.g:1801:4: (lv_value_7_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1801:4: (lv_value_7_0= ruleSelectStatement )
            // InternalSparrow.g:1802:5: lv_value_7_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getUpdatedauditAccess().getValueSelectStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_7_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatedauditRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdatedauditAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdatedaudit"


    // $ANTLR start "entryRuleSms"
    // InternalSparrow.g:1827:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // InternalSparrow.g:1827:44: (iv_ruleSms= ruleSms EOF )
            // InternalSparrow.g:1828:2: iv_ruleSms= ruleSms EOF
            {
             newCompositeNode(grammarAccess.getSmsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSms=ruleSms();

            state._fsp--;

             current =iv_ruleSms; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSms"


    // $ANTLR start "ruleSms"
    // InternalSparrow.g:1834:1: ruleSms returns [EObject current=null] : (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleSms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_condition_10_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:1840:2: ( (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1841:2: (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1841:2: (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:1842:3: otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSmsAccess().getSmsKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmsAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1850:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1851:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1851:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1852:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSmsAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSmsAccess().getForKeyword_3());
            		
            // InternalSparrow.g:1872:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:1873:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1873:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:1874:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_target_4_0, grammarAccess.getSmsAccess().getTargetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSmsAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSmsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:1898:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalSparrow.g:1899:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalSparrow.g:1899:4: (lv_value_7_0= RULE_STRING )
            // InternalSparrow.g:1900:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_7_0, grammarAccess.getSmsAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getSmsAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSmsAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:1924:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:1925:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1925:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:1926:5: lv_condition_10_0= RULE_STRING
            {
            lv_condition_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_10_0, grammarAccess.getSmsAccess().getConditionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSms"


    // $ANTLR start "entryRuleSlackPUT"
    // InternalSparrow.g:1946:1: entryRuleSlackPUT returns [EObject current=null] : iv_ruleSlackPUT= ruleSlackPUT EOF ;
    public final EObject entryRuleSlackPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlackPUT = null;


        try {
            // InternalSparrow.g:1946:49: (iv_ruleSlackPUT= ruleSlackPUT EOF )
            // InternalSparrow.g:1947:2: iv_ruleSlackPUT= ruleSlackPUT EOF
            {
             newCompositeNode(grammarAccess.getSlackPUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlackPUT=ruleSlackPUT();

            state._fsp--;

             current =iv_ruleSlackPUT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSlackPUT"


    // $ANTLR start "ruleSlackPUT"
    // InternalSparrow.g:1953:1: ruleSlackPUT returns [EObject current=null] : (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleSlackPUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_team_4_0=null;
        Token otherlv_5=null;
        Token lv_channel_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_condition_12_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:1959:2: ( (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1960:2: (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1960:2: (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            // InternalSparrow.g:1961:3: otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSlackPUTAccess().getSlackputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSlackPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1969:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1970:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1970:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1971:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSlackPUTAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSlackPUTAccess().getToKeyword_3());
            		
            // InternalSparrow.g:1991:3: ( (lv_team_4_0= RULE_STRING ) )
            // InternalSparrow.g:1992:4: (lv_team_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1992:4: (lv_team_4_0= RULE_STRING )
            // InternalSparrow.g:1993:5: lv_team_4_0= RULE_STRING
            {
            lv_team_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_team_4_0, grammarAccess.getSlackPUTAccess().getTeamSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"team",
            						lv_team_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSlackPUTAccess().getOnKeyword_5());
            		
            // InternalSparrow.g:2013:3: ( (lv_channel_6_0= RULE_STRING ) )
            // InternalSparrow.g:2014:4: (lv_channel_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2014:4: (lv_channel_6_0= RULE_STRING )
            // InternalSparrow.g:2015:5: lv_channel_6_0= RULE_STRING
            {
            lv_channel_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_channel_6_0, grammarAccess.getSlackPUTAccess().getChannelSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"channel",
            						lv_channel_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSlackPUTAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSlackPUTAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:2039:3: ( (lv_value_9_0= RULE_STRING ) )
            // InternalSparrow.g:2040:4: (lv_value_9_0= RULE_STRING )
            {
            // InternalSparrow.g:2040:4: (lv_value_9_0= RULE_STRING )
            // InternalSparrow.g:2041:5: lv_value_9_0= RULE_STRING
            {
            lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_9_0, grammarAccess.getSlackPUTAccess().getValueSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_10, grammarAccess.getSlackPUTAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSlackPUTAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:2065:3: ( (lv_condition_12_0= RULE_STRING ) )
            // InternalSparrow.g:2066:4: (lv_condition_12_0= RULE_STRING )
            {
            // InternalSparrow.g:2066:4: (lv_condition_12_0= RULE_STRING )
            // InternalSparrow.g:2067:5: lv_condition_12_0= RULE_STRING
            {
            lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_12_0, grammarAccess.getSlackPUTAccess().getConditionSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSlackPUT"


    // $ANTLR start "entryRuleGooglecalPUT"
    // InternalSparrow.g:2087:1: entryRuleGooglecalPUT returns [EObject current=null] : iv_ruleGooglecalPUT= ruleGooglecalPUT EOF ;
    public final EObject entryRuleGooglecalPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGooglecalPUT = null;


        try {
            // InternalSparrow.g:2087:53: (iv_ruleGooglecalPUT= ruleGooglecalPUT EOF )
            // InternalSparrow.g:2088:2: iv_ruleGooglecalPUT= ruleGooglecalPUT EOF
            {
             newCompositeNode(grammarAccess.getGooglecalPUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGooglecalPUT=ruleGooglecalPUT();

            state._fsp--;

             current =iv_ruleGooglecalPUT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGooglecalPUT"


    // $ANTLR start "ruleGooglecalPUT"
    // InternalSparrow.g:2094:1: ruleGooglecalPUT returns [EObject current=null] : (otherlv_0= 'googlecalput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authstore_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-source' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'using' otherlv_12= '{' ( (lv_value_13_0= RULE_STRING ) ) otherlv_14= '}' otherlv_15= 'on-condition' ( (lv_condition_16_0= RULE_STRING ) ) ) ;
    public final EObject ruleGooglecalPUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_authstore_4_0=null;
        Token otherlv_5=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_useraccount_8_0=null;
        Token otherlv_9=null;
        Token lv_source_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_value_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_condition_16_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:2100:2: ( (otherlv_0= 'googlecalput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authstore_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-source' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'using' otherlv_12= '{' ( (lv_value_13_0= RULE_STRING ) ) otherlv_14= '}' otherlv_15= 'on-condition' ( (lv_condition_16_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:2101:2: (otherlv_0= 'googlecalput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authstore_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-source' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'using' otherlv_12= '{' ( (lv_value_13_0= RULE_STRING ) ) otherlv_14= '}' otherlv_15= 'on-condition' ( (lv_condition_16_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:2101:2: (otherlv_0= 'googlecalput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authstore_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-source' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'using' otherlv_12= '{' ( (lv_value_13_0= RULE_STRING ) ) otherlv_14= '}' otherlv_15= 'on-condition' ( (lv_condition_16_0= RULE_STRING ) ) )
            // InternalSparrow.g:2102:3: otherlv_0= 'googlecalput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authstore_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-source' ( (lv_source_10_0= RULE_STRING ) ) otherlv_11= 'using' otherlv_12= '{' ( (lv_value_13_0= RULE_STRING ) ) otherlv_14= '}' otherlv_15= 'on-condition' ( (lv_condition_16_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGooglecalPUTAccess().getGooglecalputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGooglecalPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2110:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2111:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2111:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2112:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGooglecalPUTAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGooglecalPUTAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:2132:3: ( (lv_authstore_4_0= RULE_STRING ) )
            // InternalSparrow.g:2133:4: (lv_authstore_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2133:4: (lv_authstore_4_0= RULE_STRING )
            // InternalSparrow.g:2134:5: lv_authstore_4_0= RULE_STRING
            {
            lv_authstore_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_authstore_4_0, grammarAccess.getGooglecalPUTAccess().getAuthstoreSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"authstore",
            						lv_authstore_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGooglecalPUTAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:2154:3: ( (lv_key_6_0= RULE_STRING ) )
            // InternalSparrow.g:2155:4: (lv_key_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2155:4: (lv_key_6_0= RULE_STRING )
            // InternalSparrow.g:2156:5: lv_key_6_0= RULE_STRING
            {
            lv_key_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_key_6_0, grammarAccess.getGooglecalPUTAccess().getKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGooglecalPUTAccess().getThroughUserKeyword_7());
            		
            // InternalSparrow.g:2176:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:2177:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2177:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:2178:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_useraccount_8_0, grammarAccess.getGooglecalPUTAccess().getUseraccountSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useraccount",
            						lv_useraccount_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGooglecalPUTAccess().getFromSourceKeyword_9());
            		
            // InternalSparrow.g:2198:3: ( (lv_source_10_0= RULE_STRING ) )
            // InternalSparrow.g:2199:4: (lv_source_10_0= RULE_STRING )
            {
            // InternalSparrow.g:2199:4: (lv_source_10_0= RULE_STRING )
            // InternalSparrow.g:2200:5: lv_source_10_0= RULE_STRING
            {
            lv_source_10_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_source_10_0, grammarAccess.getGooglecalPUTAccess().getSourceSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGooglecalPUTAccess().getUsingKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getGooglecalPUTAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalSparrow.g:2224:3: ( (lv_value_13_0= RULE_STRING ) )
            // InternalSparrow.g:2225:4: (lv_value_13_0= RULE_STRING )
            {
            // InternalSparrow.g:2225:4: (lv_value_13_0= RULE_STRING )
            // InternalSparrow.g:2226:5: lv_value_13_0= RULE_STRING
            {
            lv_value_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_13_0, grammarAccess.getGooglecalPUTAccess().getValueSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getGooglecalPUTAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getGooglecalPUTAccess().getOnConditionKeyword_15());
            		
            // InternalSparrow.g:2250:3: ( (lv_condition_16_0= RULE_STRING ) )
            // InternalSparrow.g:2251:4: (lv_condition_16_0= RULE_STRING )
            {
            // InternalSparrow.g:2251:4: (lv_condition_16_0= RULE_STRING )
            // InternalSparrow.g:2252:5: lv_condition_16_0= RULE_STRING
            {
            lv_condition_16_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_16_0, grammarAccess.getGooglecalPUTAccess().getConditionSTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGooglecalPUT"


    // $ANTLR start "entryRuleCopydata"
    // InternalSparrow.g:2272:1: entryRuleCopydata returns [EObject current=null] : iv_ruleCopydata= ruleCopydata EOF ;
    public final EObject entryRuleCopydata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopydata = null;


        try {
            // InternalSparrow.g:2272:49: (iv_ruleCopydata= ruleCopydata EOF )
            // InternalSparrow.g:2273:2: iv_ruleCopydata= ruleCopydata EOF
            {
             newCompositeNode(grammarAccess.getCopydataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopydata=ruleCopydata();

            state._fsp--;

             current =iv_ruleCopydata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopydata"


    // $ANTLR start "ruleCopydata"
    // InternalSparrow.g:2279:1: ruleCopydata returns [EObject current=null] : (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleCopydata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_condition_12_0=null;
        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2285:2: ( (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:2286:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:2286:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            // InternalSparrow.g:2287:3: otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCopydataAccess().getCopydataKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCopydataAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2295:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2296:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2296:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2297:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCopydataAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopydataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCopydataAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:2317:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:2318:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2318:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:2319:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_source_4_0, grammarAccess.getCopydataAccess().getSourceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopydataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCopydataAccess().getToKeyword_5());
            		
            // InternalSparrow.g:2339:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:2340:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2340:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:2341:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_to_6_0, grammarAccess.getCopydataAccess().getToSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopydataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCopydataAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCopydataAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:2365:3: ( (lv_value_9_0= ruleSelectStatement ) )
            // InternalSparrow.g:2366:4: (lv_value_9_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2366:4: (lv_value_9_0= ruleSelectStatement )
            // InternalSparrow.g:2367:5: lv_value_9_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getCopydataAccess().getValueSelectStatementParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_9_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopydataRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_10, grammarAccess.getCopydataAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCopydataAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:2392:3: ( (lv_condition_12_0= RULE_STRING ) )
            // InternalSparrow.g:2393:4: (lv_condition_12_0= RULE_STRING )
            {
            // InternalSparrow.g:2393:4: (lv_condition_12_0= RULE_STRING )
            // InternalSparrow.g:2394:5: lv_condition_12_0= RULE_STRING
            {
            lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_12_0, grammarAccess.getCopydataAccess().getConditionSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopydataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopydata"


    // $ANTLR start "entryRuleWriteCsv"
    // InternalSparrow.g:2414:1: entryRuleWriteCsv returns [EObject current=null] : iv_ruleWriteCsv= ruleWriteCsv EOF ;
    public final EObject entryRuleWriteCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCsv = null;


        try {
            // InternalSparrow.g:2414:49: (iv_ruleWriteCsv= ruleWriteCsv EOF )
            // InternalSparrow.g:2415:2: iv_ruleWriteCsv= ruleWriteCsv EOF
            {
             newCompositeNode(grammarAccess.getWriteCsvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteCsv=ruleWriteCsv();

            state._fsp--;

             current =iv_ruleWriteCsv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWriteCsv"


    // $ANTLR start "ruleWriteCsv"
    // InternalSparrow.g:2421:1: ruleWriteCsv returns [EObject current=null] : (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) ;
    public final EObject ruleWriteCsv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;
        Token otherlv_7=null;
        Token lv_delim_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_condition_14_0=null;
        AntlrDatatypeRuleToken lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2427:2: ( (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:2428:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:2428:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            // InternalSparrow.g:2429:3: otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteCsvAccess().getWritecsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2437:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2438:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2438:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2439:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getWriteCsvAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWriteCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:2459:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:2460:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2460:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:2461:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_source_4_0, grammarAccess.getWriteCsvAccess().getSourceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:2481:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:2482:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2482:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:2483:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_to_6_0, grammarAccess.getWriteCsvAccess().getToSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getWriteCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:2503:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:2504:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2504:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:2505:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_delim_8_0, grammarAccess.getWriteCsvAccess().getDelimSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"delim",
            						lv_delim_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getWriteCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getWriteCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:2529:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:2530:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2530:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:2531:5: lv_value_11_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getWriteCsvAccess().getValueSelectStatementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_11_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteCsvRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_11_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getWriteCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getWriteCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:2556:3: ( (lv_condition_14_0= RULE_STRING ) )
            // InternalSparrow.g:2557:4: (lv_condition_14_0= RULE_STRING )
            {
            // InternalSparrow.g:2557:4: (lv_condition_14_0= RULE_STRING )
            // InternalSparrow.g:2558:5: lv_condition_14_0= RULE_STRING
            {
            lv_condition_14_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_14_0, grammarAccess.getWriteCsvAccess().getConditionSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWriteCsv"


    // $ANTLR start "entryRuleLoadCsv"
    // InternalSparrow.g:2578:1: entryRuleLoadCsv returns [EObject current=null] : iv_ruleLoadCsv= ruleLoadCsv EOF ;
    public final EObject entryRuleLoadCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCsv = null;


        try {
            // InternalSparrow.g:2578:48: (iv_ruleLoadCsv= ruleLoadCsv EOF )
            // InternalSparrow.g:2579:2: iv_ruleLoadCsv= ruleLoadCsv EOF
            {
             newCompositeNode(grammarAccess.getLoadCsvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadCsv=ruleLoadCsv();

            state._fsp--;

             current =iv_ruleLoadCsv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadCsv"


    // $ANTLR start "ruleLoadCsv"
    // InternalSparrow.g:2585:1: ruleLoadCsv returns [EObject current=null] : (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) ;
    public final EObject ruleLoadCsv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;
        Token otherlv_7=null;
        Token lv_delim_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_condition_14_0=null;
        AntlrDatatypeRuleToken lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2591:2: ( (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:2592:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:2592:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            // InternalSparrow.g:2593:3: otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCsvAccess().getLoadcsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2601:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2602:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2602:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2603:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLoadCsvAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:2623:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:2624:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2624:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:2625:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_source_4_0, grammarAccess.getLoadCsvAccess().getSourceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:2645:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:2646:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2646:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:2647:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_to_6_0, grammarAccess.getLoadCsvAccess().getToSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:2667:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:2668:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2668:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:2669:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_delim_8_0, grammarAccess.getLoadCsvAccess().getDelimSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"delim",
            						lv_delim_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLoadCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLoadCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:2693:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:2694:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2694:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:2695:5: lv_value_11_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getLoadCsvAccess().getValueSelectStatementParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_11_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadCsvRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_11_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_12, grammarAccess.getLoadCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getLoadCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:2720:3: ( (lv_condition_14_0= RULE_STRING ) )
            // InternalSparrow.g:2721:4: (lv_condition_14_0= RULE_STRING )
            {
            // InternalSparrow.g:2721:4: (lv_condition_14_0= RULE_STRING )
            // InternalSparrow.g:2722:5: lv_condition_14_0= RULE_STRING
            {
            lv_condition_14_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_14_0, grammarAccess.getLoadCsvAccess().getConditionSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadCsvRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadCsv"


    // $ANTLR start "entryRuleTransform"
    // InternalSparrow.g:2742:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalSparrow.g:2742:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalSparrow.g:2743:2: iv_ruleTransform= ruleTransform EOF
            {
             newCompositeNode(grammarAccess.getTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransform=ruleTransform();

            state._fsp--;

             current =iv_ruleTransform; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransform"


    // $ANTLR start "ruleTransform"
    // InternalSparrow.g:2749:1: ruleTransform returns [EObject current=null] : (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_on_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_condition_10_0=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2755:2: ( (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:2756:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:2756:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:2757:3: otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformAccess().getTransformKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2765:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2766:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2766:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2767:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTransformAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransformAccess().getOnKeyword_3());
            		
            // InternalSparrow.g:2787:3: ( (lv_on_4_0= RULE_STRING ) )
            // InternalSparrow.g:2788:4: (lv_on_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2788:4: (lv_on_4_0= RULE_STRING )
            // InternalSparrow.g:2789:5: lv_on_4_0= RULE_STRING
            {
            lv_on_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_on_4_0, grammarAccess.getTransformAccess().getOnSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformRule());
            					}
            					setWithLastConsumed(
            						current,
            						"on",
            						lv_on_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:2813:3: ( (lv_value_7_0= ruleNonSelectStatement ) )
            // InternalSparrow.g:2814:4: (lv_value_7_0= ruleNonSelectStatement )
            {
            // InternalSparrow.g:2814:4: (lv_value_7_0= ruleNonSelectStatement )
            // InternalSparrow.g:2815:5: lv_value_7_0= ruleNonSelectStatement
            {

            					newCompositeNode(grammarAccess.getTransformAccess().getValueNonSelectStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_7_0=ruleNonSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.etl.Sparrow.NonSelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:2840:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:2841:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:2841:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:2842:5: lv_condition_10_0= RULE_STRING
            {
            lv_condition_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_10_0, grammarAccess.getTransformAccess().getConditionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSparrow.g:2862:1: entryRuleSelectStatement returns [String current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final String entryRuleSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStatement = null;


        try {
            // InternalSparrow.g:2862:55: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSparrow.g:2863:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalSparrow.g:2869:1: ruleSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:2875:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:2876:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getSelectStatementAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleNonSelectStatement"
    // InternalSparrow.g:2886:1: entryRuleNonSelectStatement returns [String current=null] : iv_ruleNonSelectStatement= ruleNonSelectStatement EOF ;
    public final String entryRuleNonSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonSelectStatement = null;


        try {
            // InternalSparrow.g:2886:58: (iv_ruleNonSelectStatement= ruleNonSelectStatement EOF )
            // InternalSparrow.g:2887:2: iv_ruleNonSelectStatement= ruleNonSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getNonSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonSelectStatement=ruleNonSelectStatement();

            state._fsp--;

             current =iv_ruleNonSelectStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonSelectStatement"


    // $ANTLR start "ruleNonSelectStatement"
    // InternalSparrow.g:2893:1: ruleNonSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNonSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:2899:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:2900:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getNonSelectStatementAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonSelectStatement"


    // $ANTLR start "entryRuleCreateStatement"
    // InternalSparrow.g:2910:1: entryRuleCreateStatement returns [String current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final String entryRuleCreateStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCreateStatement = null;


        try {
            // InternalSparrow.g:2910:55: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // InternalSparrow.g:2911:2: iv_ruleCreateStatement= ruleCreateStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateStatement=ruleCreateStatement();

            state._fsp--;

             current =iv_ruleCreateStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateStatement"


    // $ANTLR start "ruleCreateStatement"
    // InternalSparrow.g:2917:1: ruleCreateStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCreateStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:2923:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:2924:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getCreateStatementAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x07EA290400422000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});

}