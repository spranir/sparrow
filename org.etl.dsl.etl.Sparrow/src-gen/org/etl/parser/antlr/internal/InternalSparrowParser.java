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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'try'", "'finally'", "'catch'", "'assign'", "'as'", "'source'", "'using'", "'on-condition'", "'callprocess'", "'target'", "'log'", "'logto'", "'sms'", "'for'", "'slack'", "'to'", "'on'", "'googlecal'", "'for-cal'", "'secured-by'", "'through-user'", "'with-title'", "'from'", "'repeat'", "'copydata'", "'writecsv'", "'with'", "'loadcsv'", "'transform'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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

                if ( (LA1_0==17||LA1_0==22||LA1_0==24||LA1_0==26||LA1_0==28||LA1_0==31||(LA1_0>=38 && LA1_0<=39)||(LA1_0>=41 && LA1_0<=42)) ) {
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

                if ( (LA2_0==17||LA2_0==22||LA2_0==24||LA2_0==26||LA2_0==28||LA2_0==31||(LA2_0>=38 && LA2_0<=39)||(LA2_0>=41 && LA2_0<=42)) ) {
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

                if ( (LA3_0==17||LA3_0==22||LA3_0==24||LA3_0==26||LA3_0==28||LA3_0==31||(LA3_0>=38 && LA3_0<=39)||(LA3_0>=41 && LA3_0<=42)) ) {
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
    // InternalSparrow.g:381:1: ruleAction returns [EObject current=null] : (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_Googlecal_4= ruleGooglecal | this_Slack_5= ruleSlack | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Copydata_0 = null;

        EObject this_LoadCsv_1 = null;

        EObject this_WriteCsv_2 = null;

        EObject this_Transform_3 = null;

        EObject this_Googlecal_4 = null;

        EObject this_Slack_5 = null;

        EObject this_Sms_6 = null;

        EObject this_Updatedaudit_7 = null;

        EObject this_Callprocess_8 = null;

        EObject this_Fetch_9 = null;



        	enterRule();

        try {
            // InternalSparrow.g:387:2: ( (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_Googlecal_4= ruleGooglecal | this_Slack_5= ruleSlack | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch ) )
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_Googlecal_4= ruleGooglecal | this_Slack_5= ruleSlack | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch )
            {
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_Googlecal_4= ruleGooglecal | this_Slack_5= ruleSlack | this_Sms_6= ruleSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 24:
                {
                alt4=8;
                }
                break;
            case 22:
                {
                alt4=9;
                }
                break;
            case 17:
                {
                alt4=10;
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
                    // InternalSparrow.g:425:3: this_Googlecal_4= ruleGooglecal
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGooglecalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Googlecal_4=ruleGooglecal();

                    state._fsp--;


                    			current = this_Googlecal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSparrow.g:434:3: this_Slack_5= ruleSlack
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSlackParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Slack_5=ruleSlack();

                    state._fsp--;


                    			current = this_Slack_5;
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


    // $ANTLR start "entryRuleFetch"
    // InternalSparrow.g:482:1: entryRuleFetch returns [EObject current=null] : iv_ruleFetch= ruleFetch EOF ;
    public final EObject entryRuleFetch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetch = null;


        try {
            // InternalSparrow.g:482:46: (iv_ruleFetch= ruleFetch EOF )
            // InternalSparrow.g:483:2: iv_ruleFetch= ruleFetch EOF
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
    // InternalSparrow.g:489:1: ruleFetch returns [EObject current=null] : (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:495:2: ( (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:496:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:496:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:497:3: otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchAccess().getAssignKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFetchAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:505:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:506:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:506:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:507:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFetchAccess().getSourceKeyword_3());
            		
            // InternalSparrow.g:527:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:528:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:528:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:529:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFetchAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFetchAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:553:3: ( (lv_value_7_0= ruleSelectStatement ) )
            // InternalSparrow.g:554:4: (lv_value_7_0= ruleSelectStatement )
            {
            // InternalSparrow.g:554:4: (lv_value_7_0= ruleSelectStatement )
            // InternalSparrow.g:555:5: lv_value_7_0= ruleSelectStatement
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

            otherlv_8=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getFetchAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getFetchAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:580:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:581:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:581:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:582:5: lv_condition_10_0= RULE_STRING
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
    // InternalSparrow.g:602:1: entryRuleCallprocess returns [EObject current=null] : iv_ruleCallprocess= ruleCallprocess EOF ;
    public final EObject entryRuleCallprocess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallprocess = null;


        try {
            // InternalSparrow.g:602:52: (iv_ruleCallprocess= ruleCallprocess EOF )
            // InternalSparrow.g:603:2: iv_ruleCallprocess= ruleCallprocess EOF
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
    // InternalSparrow.g:609:1: ruleCallprocess returns [EObject current=null] : (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
    public final EObject ruleCallprocess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_condition_10_0=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:615:2: ( (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:616:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:616:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:617:3: otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCallprocessAccess().getCallprocessKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallprocessAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:625:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:626:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:626:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:627:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCallprocessAccess().getTargetKeyword_3());
            		
            // InternalSparrow.g:647:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:648:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:648:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:649:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getCallprocessAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCallprocessAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:673:3: ( (lv_value_7_0= ruleSelectStatement ) )
            // InternalSparrow.g:674:4: (lv_value_7_0= ruleSelectStatement )
            {
            // InternalSparrow.g:674:4: (lv_value_7_0= ruleSelectStatement )
            // InternalSparrow.g:675:5: lv_value_7_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getCallprocessAccess().getValueSelectStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_7_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallprocessRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getCallprocessAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCallprocessAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:700:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:701:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:701:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:702:5: lv_condition_10_0= RULE_STRING
            {
            lv_condition_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_10_0, grammarAccess.getCallprocessAccess().getConditionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallprocessRule());
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
    // $ANTLR end "ruleCallprocess"


    // $ANTLR start "entryRuleUpdatedaudit"
    // InternalSparrow.g:722:1: entryRuleUpdatedaudit returns [EObject current=null] : iv_ruleUpdatedaudit= ruleUpdatedaudit EOF ;
    public final EObject entryRuleUpdatedaudit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatedaudit = null;


        try {
            // InternalSparrow.g:722:53: (iv_ruleUpdatedaudit= ruleUpdatedaudit EOF )
            // InternalSparrow.g:723:2: iv_ruleUpdatedaudit= ruleUpdatedaudit EOF
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
    // InternalSparrow.g:729:1: ruleUpdatedaudit returns [EObject current=null] : (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' ) ;
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
            // InternalSparrow.g:735:2: ( (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' ) )
            // InternalSparrow.g:736:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' )
            {
            // InternalSparrow.g:736:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}' )
            // InternalSparrow.g:737:3: otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleSelectStatement ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatedauditAccess().getLogKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdatedauditAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:745:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:746:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:746:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:747:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdatedauditAccess().getLogtoKeyword_3());
            		
            // InternalSparrow.g:767:3: ( (lv_logsink_4_0= RULE_STRING ) )
            // InternalSparrow.g:768:4: (lv_logsink_4_0= RULE_STRING )
            {
            // InternalSparrow.g:768:4: (lv_logsink_4_0= RULE_STRING )
            // InternalSparrow.g:769:5: lv_logsink_4_0= RULE_STRING
            {
            lv_logsink_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdatedauditAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdatedauditAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:793:3: ( (lv_value_7_0= ruleSelectStatement ) )
            // InternalSparrow.g:794:4: (lv_value_7_0= ruleSelectStatement )
            {
            // InternalSparrow.g:794:4: (lv_value_7_0= ruleSelectStatement )
            // InternalSparrow.g:795:5: lv_value_7_0= ruleSelectStatement
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
    // InternalSparrow.g:820:1: entryRuleSms returns [EObject current=null] : iv_ruleSms= ruleSms EOF ;
    public final EObject entryRuleSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSms = null;


        try {
            // InternalSparrow.g:820:44: (iv_ruleSms= ruleSms EOF )
            // InternalSparrow.g:821:2: iv_ruleSms= ruleSms EOF
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
    // InternalSparrow.g:827:1: ruleSms returns [EObject current=null] : (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:833:2: ( (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:834:2: (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:834:2: (otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:835:3: otherlv_0= 'sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSmsAccess().getSmsKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmsAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:843:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:844:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:844:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:845:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSmsAccess().getForKeyword_3());
            		
            // InternalSparrow.g:865:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:866:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:866:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:867:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSmsAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSmsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:891:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalSparrow.g:892:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalSparrow.g:892:4: (lv_value_7_0= RULE_STRING )
            // InternalSparrow.g:893:5: lv_value_7_0= RULE_STRING
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

            otherlv_8=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getSmsAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSmsAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:917:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:918:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:918:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:919:5: lv_condition_10_0= RULE_STRING
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


    // $ANTLR start "entryRuleSlack"
    // InternalSparrow.g:939:1: entryRuleSlack returns [EObject current=null] : iv_ruleSlack= ruleSlack EOF ;
    public final EObject entryRuleSlack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlack = null;


        try {
            // InternalSparrow.g:939:46: (iv_ruleSlack= ruleSlack EOF )
            // InternalSparrow.g:940:2: iv_ruleSlack= ruleSlack EOF
            {
             newCompositeNode(grammarAccess.getSlackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlack=ruleSlack();

            state._fsp--;

             current =iv_ruleSlack; 
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
    // $ANTLR end "entryRuleSlack"


    // $ANTLR start "ruleSlack"
    // InternalSparrow.g:946:1: ruleSlack returns [EObject current=null] : (otherlv_0= 'slack' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleSlack() throws RecognitionException {
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
            // InternalSparrow.g:952:2: ( (otherlv_0= 'slack' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:953:2: (otherlv_0= 'slack' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:953:2: (otherlv_0= 'slack' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            // InternalSparrow.g:954:3: otherlv_0= 'slack' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSlackAccess().getSlackKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSlackAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:962:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:963:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:963:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:964:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSlackAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSlackAccess().getToKeyword_3());
            		
            // InternalSparrow.g:984:3: ( (lv_team_4_0= RULE_STRING ) )
            // InternalSparrow.g:985:4: (lv_team_4_0= RULE_STRING )
            {
            // InternalSparrow.g:985:4: (lv_team_4_0= RULE_STRING )
            // InternalSparrow.g:986:5: lv_team_4_0= RULE_STRING
            {
            lv_team_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_team_4_0, grammarAccess.getSlackAccess().getTeamSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"team",
            						lv_team_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSlackAccess().getOnKeyword_5());
            		
            // InternalSparrow.g:1006:3: ( (lv_channel_6_0= RULE_STRING ) )
            // InternalSparrow.g:1007:4: (lv_channel_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1007:4: (lv_channel_6_0= RULE_STRING )
            // InternalSparrow.g:1008:5: lv_channel_6_0= RULE_STRING
            {
            lv_channel_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_channel_6_0, grammarAccess.getSlackAccess().getChannelSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"channel",
            						lv_channel_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSlackAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSlackAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:1032:3: ( (lv_value_9_0= RULE_STRING ) )
            // InternalSparrow.g:1033:4: (lv_value_9_0= RULE_STRING )
            {
            // InternalSparrow.g:1033:4: (lv_value_9_0= RULE_STRING )
            // InternalSparrow.g:1034:5: lv_value_9_0= RULE_STRING
            {
            lv_value_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_9_0, grammarAccess.getSlackAccess().getValueSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSlackAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSlackAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:1058:3: ( (lv_condition_12_0= RULE_STRING ) )
            // InternalSparrow.g:1059:4: (lv_condition_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1059:4: (lv_condition_12_0= RULE_STRING )
            // InternalSparrow.g:1060:5: lv_condition_12_0= RULE_STRING
            {
            lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_12_0, grammarAccess.getSlackAccess().getConditionSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSlackRule());
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
    // $ANTLR end "ruleSlack"


    // $ANTLR start "entryRuleGooglecal"
    // InternalSparrow.g:1080:1: entryRuleGooglecal returns [EObject current=null] : iv_ruleGooglecal= ruleGooglecal EOF ;
    public final EObject entryRuleGooglecal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGooglecal = null;


        try {
            // InternalSparrow.g:1080:50: (iv_ruleGooglecal= ruleGooglecal EOF )
            // InternalSparrow.g:1081:2: iv_ruleGooglecal= ruleGooglecal EOF
            {
             newCompositeNode(grammarAccess.getGooglecalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGooglecal=ruleGooglecal();

            state._fsp--;

             current =iv_ruleGooglecal; 
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
    // $ANTLR end "entryRuleGooglecal"


    // $ANTLR start "ruleGooglecal"
    // InternalSparrow.g:1087:1: ruleGooglecal returns [EObject current=null] : (otherlv_0= 'googlecal' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for-cal' ( (lv_calid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_authstore_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'with-title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= 'from' ( (lv_start_12_0= RULE_STRING ) ) otherlv_13= 'to' ( (lv_end_14_0= RULE_STRING ) ) otherlv_15= 'repeat' ( (lv_notify_16_0= RULE_STRING ) ) otherlv_17= 'using' otherlv_18= '{' ( (lv_value_19_0= RULE_STRING ) ) otherlv_20= '}' otherlv_21= 'on-condition' ( (lv_condition_22_0= RULE_STRING ) ) ) ;
    public final EObject ruleGooglecal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_calid_4_0=null;
        Token otherlv_5=null;
        Token lv_authstore_6_0=null;
        Token otherlv_7=null;
        Token lv_useraccount_8_0=null;
        Token otherlv_9=null;
        Token lv_title_10_0=null;
        Token otherlv_11=null;
        Token lv_start_12_0=null;
        Token otherlv_13=null;
        Token lv_end_14_0=null;
        Token otherlv_15=null;
        Token lv_notify_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_value_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_condition_22_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:1093:2: ( (otherlv_0= 'googlecal' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for-cal' ( (lv_calid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_authstore_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'with-title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= 'from' ( (lv_start_12_0= RULE_STRING ) ) otherlv_13= 'to' ( (lv_end_14_0= RULE_STRING ) ) otherlv_15= 'repeat' ( (lv_notify_16_0= RULE_STRING ) ) otherlv_17= 'using' otherlv_18= '{' ( (lv_value_19_0= RULE_STRING ) ) otherlv_20= '}' otherlv_21= 'on-condition' ( (lv_condition_22_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1094:2: (otherlv_0= 'googlecal' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for-cal' ( (lv_calid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_authstore_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'with-title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= 'from' ( (lv_start_12_0= RULE_STRING ) ) otherlv_13= 'to' ( (lv_end_14_0= RULE_STRING ) ) otherlv_15= 'repeat' ( (lv_notify_16_0= RULE_STRING ) ) otherlv_17= 'using' otherlv_18= '{' ( (lv_value_19_0= RULE_STRING ) ) otherlv_20= '}' otherlv_21= 'on-condition' ( (lv_condition_22_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1094:2: (otherlv_0= 'googlecal' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for-cal' ( (lv_calid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_authstore_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'with-title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= 'from' ( (lv_start_12_0= RULE_STRING ) ) otherlv_13= 'to' ( (lv_end_14_0= RULE_STRING ) ) otherlv_15= 'repeat' ( (lv_notify_16_0= RULE_STRING ) ) otherlv_17= 'using' otherlv_18= '{' ( (lv_value_19_0= RULE_STRING ) ) otherlv_20= '}' otherlv_21= 'on-condition' ( (lv_condition_22_0= RULE_STRING ) ) )
            // InternalSparrow.g:1095:3: otherlv_0= 'googlecal' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'for-cal' ( (lv_calid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_authstore_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'with-title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= 'from' ( (lv_start_12_0= RULE_STRING ) ) otherlv_13= 'to' ( (lv_end_14_0= RULE_STRING ) ) otherlv_15= 'repeat' ( (lv_notify_16_0= RULE_STRING ) ) otherlv_17= 'using' otherlv_18= '{' ( (lv_value_19_0= RULE_STRING ) ) otherlv_20= '}' otherlv_21= 'on-condition' ( (lv_condition_22_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGooglecalAccess().getGooglecalKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGooglecalAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1103:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1104:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1104:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1105:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGooglecalAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGooglecalAccess().getForCalKeyword_3());
            		
            // InternalSparrow.g:1125:3: ( (lv_calid_4_0= RULE_STRING ) )
            // InternalSparrow.g:1126:4: (lv_calid_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1126:4: (lv_calid_4_0= RULE_STRING )
            // InternalSparrow.g:1127:5: lv_calid_4_0= RULE_STRING
            {
            lv_calid_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_calid_4_0, grammarAccess.getGooglecalAccess().getCalidSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"calid",
            						lv_calid_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGooglecalAccess().getSecuredByKeyword_5());
            		
            // InternalSparrow.g:1147:3: ( (lv_authstore_6_0= RULE_STRING ) )
            // InternalSparrow.g:1148:4: (lv_authstore_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1148:4: (lv_authstore_6_0= RULE_STRING )
            // InternalSparrow.g:1149:5: lv_authstore_6_0= RULE_STRING
            {
            lv_authstore_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_authstore_6_0, grammarAccess.getGooglecalAccess().getAuthstoreSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"authstore",
            						lv_authstore_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGooglecalAccess().getThroughUserKeyword_7());
            		
            // InternalSparrow.g:1169:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:1170:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1170:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:1171:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_useraccount_8_0, grammarAccess.getGooglecalAccess().getUseraccountSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useraccount",
            						lv_useraccount_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGooglecalAccess().getWithTitleKeyword_9());
            		
            // InternalSparrow.g:1191:3: ( (lv_title_10_0= RULE_STRING ) )
            // InternalSparrow.g:1192:4: (lv_title_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1192:4: (lv_title_10_0= RULE_STRING )
            // InternalSparrow.g:1193:5: lv_title_10_0= RULE_STRING
            {
            lv_title_10_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_title_10_0, grammarAccess.getGooglecalAccess().getTitleSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getGooglecalAccess().getFromKeyword_11());
            		
            // InternalSparrow.g:1213:3: ( (lv_start_12_0= RULE_STRING ) )
            // InternalSparrow.g:1214:4: (lv_start_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1214:4: (lv_start_12_0= RULE_STRING )
            // InternalSparrow.g:1215:5: lv_start_12_0= RULE_STRING
            {
            lv_start_12_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_start_12_0, grammarAccess.getGooglecalAccess().getStartSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getGooglecalAccess().getToKeyword_13());
            		
            // InternalSparrow.g:1235:3: ( (lv_end_14_0= RULE_STRING ) )
            // InternalSparrow.g:1236:4: (lv_end_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1236:4: (lv_end_14_0= RULE_STRING )
            // InternalSparrow.g:1237:5: lv_end_14_0= RULE_STRING
            {
            lv_end_14_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_end_14_0, grammarAccess.getGooglecalAccess().getEndSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getGooglecalAccess().getRepeatKeyword_15());
            		
            // InternalSparrow.g:1257:3: ( (lv_notify_16_0= RULE_STRING ) )
            // InternalSparrow.g:1258:4: (lv_notify_16_0= RULE_STRING )
            {
            // InternalSparrow.g:1258:4: (lv_notify_16_0= RULE_STRING )
            // InternalSparrow.g:1259:5: lv_notify_16_0= RULE_STRING
            {
            lv_notify_16_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_notify_16_0, grammarAccess.getGooglecalAccess().getNotifySTRINGTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"notify",
            						lv_notify_16_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getGooglecalAccess().getUsingKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getGooglecalAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalSparrow.g:1283:3: ( (lv_value_19_0= RULE_STRING ) )
            // InternalSparrow.g:1284:4: (lv_value_19_0= RULE_STRING )
            {
            // InternalSparrow.g:1284:4: (lv_value_19_0= RULE_STRING )
            // InternalSparrow.g:1285:5: lv_value_19_0= RULE_STRING
            {
            lv_value_19_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_19_0, grammarAccess.getGooglecalAccess().getValueSTRINGTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_20, grammarAccess.getGooglecalAccess().getRightCurlyBracketKeyword_20());
            		
            otherlv_21=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getGooglecalAccess().getOnConditionKeyword_21());
            		
            // InternalSparrow.g:1309:3: ( (lv_condition_22_0= RULE_STRING ) )
            // InternalSparrow.g:1310:4: (lv_condition_22_0= RULE_STRING )
            {
            // InternalSparrow.g:1310:4: (lv_condition_22_0= RULE_STRING )
            // InternalSparrow.g:1311:5: lv_condition_22_0= RULE_STRING
            {
            lv_condition_22_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_condition_22_0, grammarAccess.getGooglecalAccess().getConditionSTRINGTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_22_0,
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
    // $ANTLR end "ruleGooglecal"


    // $ANTLR start "entryRuleCopydata"
    // InternalSparrow.g:1331:1: entryRuleCopydata returns [EObject current=null] : iv_ruleCopydata= ruleCopydata EOF ;
    public final EObject entryRuleCopydata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopydata = null;


        try {
            // InternalSparrow.g:1331:49: (iv_ruleCopydata= ruleCopydata EOF )
            // InternalSparrow.g:1332:2: iv_ruleCopydata= ruleCopydata EOF
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
    // InternalSparrow.g:1338:1: ruleCopydata returns [EObject current=null] : (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:1344:2: ( (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1345:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1345:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) ) )
            // InternalSparrow.g:1346:3: otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCopydataAccess().getCopydataKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCopydataAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1354:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1355:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1355:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1356:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCopydataAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:1376:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:1377:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1377:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:1378:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCopydataAccess().getToKeyword_5());
            		
            // InternalSparrow.g:1398:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:1399:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1399:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:1400:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_7=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCopydataAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCopydataAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:1424:3: ( (lv_value_9_0= ruleSelectStatement ) )
            // InternalSparrow.g:1425:4: (lv_value_9_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1425:4: (lv_value_9_0= ruleSelectStatement )
            // InternalSparrow.g:1426:5: lv_value_9_0= ruleSelectStatement
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

            otherlv_10=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getCopydataAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCopydataAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:1451:3: ( (lv_condition_12_0= RULE_STRING ) )
            // InternalSparrow.g:1452:4: (lv_condition_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1452:4: (lv_condition_12_0= RULE_STRING )
            // InternalSparrow.g:1453:5: lv_condition_12_0= RULE_STRING
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
    // InternalSparrow.g:1473:1: entryRuleWriteCsv returns [EObject current=null] : iv_ruleWriteCsv= ruleWriteCsv EOF ;
    public final EObject entryRuleWriteCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCsv = null;


        try {
            // InternalSparrow.g:1473:49: (iv_ruleWriteCsv= ruleWriteCsv EOF )
            // InternalSparrow.g:1474:2: iv_ruleWriteCsv= ruleWriteCsv EOF
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
    // InternalSparrow.g:1480:1: ruleWriteCsv returns [EObject current=null] : (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:1486:2: ( (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1487:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1487:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            // InternalSparrow.g:1488:3: otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteCsvAccess().getWritecsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1496:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1497:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1497:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1498:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWriteCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:1518:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:1519:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1519:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:1520:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:1540:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:1541:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1541:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:1542:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            otherlv_7=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getWriteCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:1562:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:1563:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1563:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:1564:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_9=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getWriteCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getWriteCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:1588:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:1589:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1589:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:1590:5: lv_value_11_0= ruleSelectStatement
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

            otherlv_12=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getWriteCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getWriteCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:1615:3: ( (lv_condition_14_0= RULE_STRING ) )
            // InternalSparrow.g:1616:4: (lv_condition_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1616:4: (lv_condition_14_0= RULE_STRING )
            // InternalSparrow.g:1617:5: lv_condition_14_0= RULE_STRING
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
    // InternalSparrow.g:1637:1: entryRuleLoadCsv returns [EObject current=null] : iv_ruleLoadCsv= ruleLoadCsv EOF ;
    public final EObject entryRuleLoadCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCsv = null;


        try {
            // InternalSparrow.g:1637:48: (iv_ruleLoadCsv= ruleLoadCsv EOF )
            // InternalSparrow.g:1638:2: iv_ruleLoadCsv= ruleLoadCsv EOF
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
    // InternalSparrow.g:1644:1: ruleLoadCsv returns [EObject current=null] : (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:1650:2: ( (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1651:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1651:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) ) )
            // InternalSparrow.g:1652:3: otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCsvAccess().getLoadcsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1660:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1661:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1661:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1662:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:1682:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:1683:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1683:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:1684:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:1704:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:1705:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1705:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:1706:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            otherlv_7=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:1726:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:1727:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1727:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:1728:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_9=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLoadCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLoadCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:1752:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:1753:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:1753:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:1754:5: lv_value_11_0= ruleSelectStatement
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

            otherlv_12=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getLoadCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getLoadCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:1779:3: ( (lv_condition_14_0= RULE_STRING ) )
            // InternalSparrow.g:1780:4: (lv_condition_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1780:4: (lv_condition_14_0= RULE_STRING )
            // InternalSparrow.g:1781:5: lv_condition_14_0= RULE_STRING
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
    // InternalSparrow.g:1801:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalSparrow.g:1801:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalSparrow.g:1802:2: iv_ruleTransform= ruleTransform EOF
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
    // InternalSparrow.g:1808:1: ruleTransform returns [EObject current=null] : (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) ;
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
            // InternalSparrow.g:1814:2: ( (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:1815:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:1815:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) ) )
            // InternalSparrow.g:1816:3: otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformAccess().getTransformKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1824:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1825:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1825:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1826:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransformAccess().getOnKeyword_3());
            		
            // InternalSparrow.g:1846:3: ( (lv_on_4_0= RULE_STRING ) )
            // InternalSparrow.g:1847:4: (lv_on_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1847:4: (lv_on_4_0= RULE_STRING )
            // InternalSparrow.g:1848:5: lv_on_4_0= RULE_STRING
            {
            lv_on_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:1872:3: ( (lv_value_7_0= ruleNonSelectStatement ) )
            // InternalSparrow.g:1873:4: (lv_value_7_0= ruleNonSelectStatement )
            {
            // InternalSparrow.g:1873:4: (lv_value_7_0= ruleNonSelectStatement )
            // InternalSparrow.g:1874:5: lv_value_7_0= ruleNonSelectStatement
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

            otherlv_8=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:1899:3: ( (lv_condition_10_0= RULE_STRING ) )
            // InternalSparrow.g:1900:4: (lv_condition_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1900:4: (lv_condition_10_0= RULE_STRING )
            // InternalSparrow.g:1901:5: lv_condition_10_0= RULE_STRING
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
    // InternalSparrow.g:1921:1: entryRuleSelectStatement returns [String current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final String entryRuleSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStatement = null;


        try {
            // InternalSparrow.g:1921:55: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSparrow.g:1922:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalSparrow.g:1928:1: ruleSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:1934:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:1935:2: this_STRING_0= RULE_STRING
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
    // InternalSparrow.g:1945:1: entryRuleNonSelectStatement returns [String current=null] : iv_ruleNonSelectStatement= ruleNonSelectStatement EOF ;
    public final String entryRuleNonSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonSelectStatement = null;


        try {
            // InternalSparrow.g:1945:58: (iv_ruleNonSelectStatement= ruleNonSelectStatement EOF )
            // InternalSparrow.g:1946:2: iv_ruleNonSelectStatement= ruleNonSelectStatement EOF
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
    // InternalSparrow.g:1952:1: ruleNonSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNonSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:1958:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:1959:2: this_STRING_0= RULE_STRING
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000006C095422000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});

}