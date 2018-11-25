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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'try'", "'finally'", "'catch'", "'smsleadssms'", "'as'", "'on'", "'with-sender'", "'through-account'", "'secured-by'", "'from-source'", "'using'", "'on-condition'", "'do-dryrun-with'", "'abort'", "'gcontact-fetchall'", "'with-key'", "'for-project'", "'on-behalf-of'", "'to-target'", "'gcontact'", "'gcalendar'", "'fblc'", "'through-user'", "'for-campaign'", "'into'", "'dropfile'", "'in-path'", "'doozle'", "'in-table'", "'rest'", "'with-url'", "'and-method-as'", "'from'", "'update-url-with'", "'update-header-with'", "'update-body-with'", "'parent'", "'store-ack-at'", "'part'", "'with'", "'trelloget'", "'from-board'", "'to'", "'trelloput'", "'for-list'", "'assign'", "'source'", "'callprocess'", "'with-target'", "'from-file'", "'for-every'", "'log'", "'logto'", "'in'", "'c2sms'", "'with-user'", "'slackput'", "'copydata'", "'writecsv'", "'loadcsv'", "'transform'", "'if'", "'<'", "'>'", "'=='", "'contains'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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

                if ( (LA1_0==17||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=33 && LA1_0<=35)||LA1_0==39||LA1_0==41||LA1_0==43||LA1_0==54||LA1_0==57||LA1_0==59||LA1_0==61||LA1_0==65||LA1_0==68||(LA1_0>=70 && LA1_0<=74)) ) {
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

                if ( (LA2_0==17||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=33 && LA2_0<=35)||LA2_0==39||LA2_0==41||LA2_0==43||LA2_0==54||LA2_0==57||LA2_0==59||LA2_0==61||LA2_0==65||LA2_0==68||(LA2_0>=70 && LA2_0<=74)) ) {
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

                if ( (LA3_0==17||(LA3_0>=27 && LA3_0<=28)||(LA3_0>=33 && LA3_0<=35)||LA3_0==39||LA3_0==41||LA3_0==43||LA3_0==54||LA3_0==57||LA3_0==59||LA3_0==61||LA3_0==65||LA3_0==68||(LA3_0>=70 && LA3_0<=74)) ) {
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
    // InternalSparrow.g:381:1: ruleAction returns [EObject current=null] : (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_ClickSendSms_6= ruleClickSendSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle | this_Dropfile_14= ruleDropfile | this_FBCLead_15= ruleFBCLead | this_GooglecontactPUT_16= ruleGooglecontactPUT | this_GooglecontactSelectAll_17= ruleGooglecontactSelectAll | this_Abort_18= ruleAbort | this_SmsLeadSms_19= ruleSmsLeadSms ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Copydata_0 = null;

        EObject this_LoadCsv_1 = null;

        EObject this_WriteCsv_2 = null;

        EObject this_Transform_3 = null;

        EObject this_GooglecalPUT_4 = null;

        EObject this_SlackPUT_5 = null;

        EObject this_ClickSendSms_6 = null;

        EObject this_Updatedaudit_7 = null;

        EObject this_Callprocess_8 = null;

        EObject this_Fetch_9 = null;

        EObject this_TrelloPUT_10 = null;

        EObject this_TrelloGET_11 = null;

        EObject this_Rest_12 = null;

        EObject this_Doozle_13 = null;

        EObject this_Dropfile_14 = null;

        EObject this_FBCLead_15 = null;

        EObject this_GooglecontactPUT_16 = null;

        EObject this_GooglecontactSelectAll_17 = null;

        EObject this_Abort_18 = null;

        EObject this_SmsLeadSms_19 = null;



        	enterRule();

        try {
            // InternalSparrow.g:387:2: ( (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_ClickSendSms_6= ruleClickSendSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle | this_Dropfile_14= ruleDropfile | this_FBCLead_15= ruleFBCLead | this_GooglecontactPUT_16= ruleGooglecontactPUT | this_GooglecontactSelectAll_17= ruleGooglecontactSelectAll | this_Abort_18= ruleAbort | this_SmsLeadSms_19= ruleSmsLeadSms ) )
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_ClickSendSms_6= ruleClickSendSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle | this_Dropfile_14= ruleDropfile | this_FBCLead_15= ruleFBCLead | this_GooglecontactPUT_16= ruleGooglecontactPUT | this_GooglecontactSelectAll_17= ruleGooglecontactSelectAll | this_Abort_18= ruleAbort | this_SmsLeadSms_19= ruleSmsLeadSms )
            {
            // InternalSparrow.g:388:2: (this_Copydata_0= ruleCopydata | this_LoadCsv_1= ruleLoadCsv | this_WriteCsv_2= ruleWriteCsv | this_Transform_3= ruleTransform | this_GooglecalPUT_4= ruleGooglecalPUT | this_SlackPUT_5= ruleSlackPUT | this_ClickSendSms_6= ruleClickSendSms | this_Updatedaudit_7= ruleUpdatedaudit | this_Callprocess_8= ruleCallprocess | this_Fetch_9= ruleFetch | this_TrelloPUT_10= ruleTrelloPUT | this_TrelloGET_11= ruleTrelloGET | this_Rest_12= ruleRest | this_Doozle_13= ruleDoozle | this_Dropfile_14= ruleDropfile | this_FBCLead_15= ruleFBCLead | this_GooglecontactPUT_16= ruleGooglecontactPUT | this_GooglecontactSelectAll_17= ruleGooglecontactSelectAll | this_Abort_18= ruleAbort | this_SmsLeadSms_19= ruleSmsLeadSms )
            int alt4=20;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt4=1;
                }
                break;
            case 73:
                {
                alt4=2;
                }
                break;
            case 72:
                {
                alt4=3;
                }
                break;
            case 74:
                {
                alt4=4;
                }
                break;
            case 34:
                {
                alt4=5;
                }
                break;
            case 70:
                {
                alt4=6;
                }
                break;
            case 68:
                {
                alt4=7;
                }
                break;
            case 65:
                {
                alt4=8;
                }
                break;
            case 61:
                {
                alt4=9;
                }
                break;
            case 59:
                {
                alt4=10;
                }
                break;
            case 57:
                {
                alt4=11;
                }
                break;
            case 54:
                {
                alt4=12;
                }
                break;
            case 43:
                {
                alt4=13;
                }
                break;
            case 41:
                {
                alt4=14;
                }
                break;
            case 39:
                {
                alt4=15;
                }
                break;
            case 35:
                {
                alt4=16;
                }
                break;
            case 33:
                {
                alt4=17;
                }
                break;
            case 28:
                {
                alt4=18;
                }
                break;
            case 27:
                {
                alt4=19;
                }
                break;
            case 17:
                {
                alt4=20;
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
                    // InternalSparrow.g:443:3: this_ClickSendSms_6= ruleClickSendSms
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickSendSmsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickSendSms_6=ruleClickSendSms();

                    state._fsp--;


                    			current = this_ClickSendSms_6;
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
                case 15 :
                    // InternalSparrow.g:515:3: this_Dropfile_14= ruleDropfile
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDropfileParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dropfile_14=ruleDropfile();

                    state._fsp--;


                    			current = this_Dropfile_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalSparrow.g:524:3: this_FBCLead_15= ruleFBCLead
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFBCLeadParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_FBCLead_15=ruleFBCLead();

                    state._fsp--;


                    			current = this_FBCLead_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalSparrow.g:533:3: this_GooglecontactPUT_16= ruleGooglecontactPUT
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGooglecontactPUTParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_GooglecontactPUT_16=ruleGooglecontactPUT();

                    state._fsp--;


                    			current = this_GooglecontactPUT_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalSparrow.g:542:3: this_GooglecontactSelectAll_17= ruleGooglecontactSelectAll
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGooglecontactSelectAllParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_GooglecontactSelectAll_17=ruleGooglecontactSelectAll();

                    state._fsp--;


                    			current = this_GooglecontactSelectAll_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalSparrow.g:551:3: this_Abort_18= ruleAbort
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAbortParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_Abort_18=ruleAbort();

                    state._fsp--;


                    			current = this_Abort_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalSparrow.g:560:3: this_SmsLeadSms_19= ruleSmsLeadSms
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSmsLeadSmsParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_SmsLeadSms_19=ruleSmsLeadSms();

                    state._fsp--;


                    			current = this_SmsLeadSms_19;
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


    // $ANTLR start "entryRuleSmsLeadSms"
    // InternalSparrow.g:572:1: entryRuleSmsLeadSms returns [EObject current=null] : iv_ruleSmsLeadSms= ruleSmsLeadSms EOF ;
    public final EObject entryRuleSmsLeadSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmsLeadSms = null;


        try {
            // InternalSparrow.g:572:51: (iv_ruleSmsLeadSms= ruleSmsLeadSms EOF )
            // InternalSparrow.g:573:2: iv_ruleSmsLeadSms= ruleSmsLeadSms EOF
            {
             newCompositeNode(grammarAccess.getSmsLeadSmsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmsLeadSms=ruleSmsLeadSms();

            state._fsp--;

             current =iv_ruleSmsLeadSms; 
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
    // $ANTLR end "entryRuleSmsLeadSms"


    // $ANTLR start "ruleSmsLeadSms"
    // InternalSparrow.g:579:1: ruleSmsLeadSms returns [EObject current=null] : (otherlv_0= 'smsleadssms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'with-sender' ( (lv_sender_6_0= RULE_STRING ) ) otherlv_7= 'through-account' ( (lv_account_8_0= RULE_STRING ) ) otherlv_9= 'secured-by' ( (lv_privateKey_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_dbSrc_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) otherlv_19= 'do-dryrun-with' ( (lv_dryrunNumber_20_0= RULE_STRING ) ) ) ;
    public final EObject ruleSmsLeadSms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token lv_sender_6_0=null;
        Token otherlv_7=null;
        Token lv_account_8_0=null;
        Token otherlv_9=null;
        Token lv_privateKey_10_0=null;
        Token otherlv_11=null;
        Token lv_dbSrc_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_value_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_dryrunNumber_20_0=null;
        EObject lv_condition_18_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:585:2: ( (otherlv_0= 'smsleadssms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'with-sender' ( (lv_sender_6_0= RULE_STRING ) ) otherlv_7= 'through-account' ( (lv_account_8_0= RULE_STRING ) ) otherlv_9= 'secured-by' ( (lv_privateKey_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_dbSrc_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) otherlv_19= 'do-dryrun-with' ( (lv_dryrunNumber_20_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:586:2: (otherlv_0= 'smsleadssms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'with-sender' ( (lv_sender_6_0= RULE_STRING ) ) otherlv_7= 'through-account' ( (lv_account_8_0= RULE_STRING ) ) otherlv_9= 'secured-by' ( (lv_privateKey_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_dbSrc_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) otherlv_19= 'do-dryrun-with' ( (lv_dryrunNumber_20_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:586:2: (otherlv_0= 'smsleadssms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'with-sender' ( (lv_sender_6_0= RULE_STRING ) ) otherlv_7= 'through-account' ( (lv_account_8_0= RULE_STRING ) ) otherlv_9= 'secured-by' ( (lv_privateKey_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_dbSrc_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) otherlv_19= 'do-dryrun-with' ( (lv_dryrunNumber_20_0= RULE_STRING ) ) )
            // InternalSparrow.g:587:3: otherlv_0= 'smsleadssms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'with-sender' ( (lv_sender_6_0= RULE_STRING ) ) otherlv_7= 'through-account' ( (lv_account_8_0= RULE_STRING ) ) otherlv_9= 'secured-by' ( (lv_privateKey_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_dbSrc_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) otherlv_19= 'do-dryrun-with' ( (lv_dryrunNumber_20_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSmsLeadSmsAccess().getSmsleadssmsKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmsLeadSmsAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:595:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:596:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:596:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:597:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSmsLeadSmsAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSmsLeadSmsAccess().getOnKeyword_3());
            		
            // InternalSparrow.g:617:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalSparrow.g:618:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalSparrow.g:618:4: (lv_url_4_0= RULE_STRING )
            // InternalSparrow.g:619:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_url_4_0, grammarAccess.getSmsLeadSmsAccess().getUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSmsLeadSmsAccess().getWithSenderKeyword_5());
            		
            // InternalSparrow.g:639:3: ( (lv_sender_6_0= RULE_STRING ) )
            // InternalSparrow.g:640:4: (lv_sender_6_0= RULE_STRING )
            {
            // InternalSparrow.g:640:4: (lv_sender_6_0= RULE_STRING )
            // InternalSparrow.g:641:5: lv_sender_6_0= RULE_STRING
            {
            lv_sender_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_sender_6_0, grammarAccess.getSmsLeadSmsAccess().getSenderSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSmsLeadSmsAccess().getThroughAccountKeyword_7());
            		
            // InternalSparrow.g:661:3: ( (lv_account_8_0= RULE_STRING ) )
            // InternalSparrow.g:662:4: (lv_account_8_0= RULE_STRING )
            {
            // InternalSparrow.g:662:4: (lv_account_8_0= RULE_STRING )
            // InternalSparrow.g:663:5: lv_account_8_0= RULE_STRING
            {
            lv_account_8_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_account_8_0, grammarAccess.getSmsLeadSmsAccess().getAccountSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSmsLeadSmsAccess().getSecuredByKeyword_9());
            		
            // InternalSparrow.g:683:3: ( (lv_privateKey_10_0= RULE_STRING ) )
            // InternalSparrow.g:684:4: (lv_privateKey_10_0= RULE_STRING )
            {
            // InternalSparrow.g:684:4: (lv_privateKey_10_0= RULE_STRING )
            // InternalSparrow.g:685:5: lv_privateKey_10_0= RULE_STRING
            {
            lv_privateKey_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_privateKey_10_0, grammarAccess.getSmsLeadSmsAccess().getPrivateKeySTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"privateKey",
            						lv_privateKey_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSmsLeadSmsAccess().getFromSourceKeyword_11());
            		
            // InternalSparrow.g:705:3: ( (lv_dbSrc_12_0= RULE_STRING ) )
            // InternalSparrow.g:706:4: (lv_dbSrc_12_0= RULE_STRING )
            {
            // InternalSparrow.g:706:4: (lv_dbSrc_12_0= RULE_STRING )
            // InternalSparrow.g:707:5: lv_dbSrc_12_0= RULE_STRING
            {
            lv_dbSrc_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_dbSrc_12_0, grammarAccess.getSmsLeadSmsAccess().getDbSrcSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbSrc",
            						lv_dbSrc_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getSmsLeadSmsAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getSmsLeadSmsAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:731:3: ( (lv_value_15_0= RULE_STRING ) )
            // InternalSparrow.g:732:4: (lv_value_15_0= RULE_STRING )
            {
            // InternalSparrow.g:732:4: (lv_value_15_0= RULE_STRING )
            // InternalSparrow.g:733:5: lv_value_15_0= RULE_STRING
            {
            lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_15_0, grammarAccess.getSmsLeadSmsAccess().getValueSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getSmsLeadSmsAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_17, grammarAccess.getSmsLeadSmsAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:757:3: ( (lv_condition_18_0= ruleExpression ) )
            // InternalSparrow.g:758:4: (lv_condition_18_0= ruleExpression )
            {
            // InternalSparrow.g:758:4: (lv_condition_18_0= ruleExpression )
            // InternalSparrow.g:759:5: lv_condition_18_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSmsLeadSmsAccess().getConditionExpressionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_20);
            lv_condition_18_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmsLeadSmsRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.etl.Sparrow.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getSmsLeadSmsAccess().getDoDryrunWithKeyword_19());
            		
            // InternalSparrow.g:780:3: ( (lv_dryrunNumber_20_0= RULE_STRING ) )
            // InternalSparrow.g:781:4: (lv_dryrunNumber_20_0= RULE_STRING )
            {
            // InternalSparrow.g:781:4: (lv_dryrunNumber_20_0= RULE_STRING )
            // InternalSparrow.g:782:5: lv_dryrunNumber_20_0= RULE_STRING
            {
            lv_dryrunNumber_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_dryrunNumber_20_0, grammarAccess.getSmsLeadSmsAccess().getDryrunNumberSTRINGTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSmsLeadSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dryrunNumber",
            						lv_dryrunNumber_20_0,
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
    // $ANTLR end "ruleSmsLeadSms"


    // $ANTLR start "entryRuleAbort"
    // InternalSparrow.g:802:1: entryRuleAbort returns [EObject current=null] : iv_ruleAbort= ruleAbort EOF ;
    public final EObject entryRuleAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbort = null;


        try {
            // InternalSparrow.g:802:46: (iv_ruleAbort= ruleAbort EOF )
            // InternalSparrow.g:803:2: iv_ruleAbort= ruleAbort EOF
            {
             newCompositeNode(grammarAccess.getAbortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbort=ruleAbort();

            state._fsp--;

             current =iv_ruleAbort; 
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
    // $ANTLR end "entryRuleAbort"


    // $ANTLR start "ruleAbort"
    // InternalSparrow.g:809:1: ruleAbort returns [EObject current=null] : (otherlv_0= 'abort' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' otherlv_6= 'on-condition' ( (lv_condition_7_0= ruleExpression ) ) ) ;
    public final EObject ruleAbort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:815:2: ( (otherlv_0= 'abort' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' otherlv_6= 'on-condition' ( (lv_condition_7_0= ruleExpression ) ) ) )
            // InternalSparrow.g:816:2: (otherlv_0= 'abort' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' otherlv_6= 'on-condition' ( (lv_condition_7_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:816:2: (otherlv_0= 'abort' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' otherlv_6= 'on-condition' ( (lv_condition_7_0= ruleExpression ) ) )
            // InternalSparrow.g:817:3: otherlv_0= 'abort' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= '}' otherlv_6= 'on-condition' ( (lv_condition_7_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAbortAccess().getAbortKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAbortAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:825:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:826:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:826:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:827:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAbortAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAbortAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSparrow.g:847:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSparrow.g:848:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalSparrow.g:848:4: (lv_value_4_0= RULE_STRING )
            // InternalSparrow.g:849:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_4_0, grammarAccess.getAbortAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getAbortAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getAbortAccess().getOnConditionKeyword_6());
            		
            // InternalSparrow.g:873:3: ( (lv_condition_7_0= ruleExpression ) )
            // InternalSparrow.g:874:4: (lv_condition_7_0= ruleExpression )
            {
            // InternalSparrow.g:874:4: (lv_condition_7_0= ruleExpression )
            // InternalSparrow.g:875:5: lv_condition_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAbortAccess().getConditionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbortRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_7_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleAbort"


    // $ANTLR start "entryRuleGooglecontactSelectAll"
    // InternalSparrow.g:896:1: entryRuleGooglecontactSelectAll returns [EObject current=null] : iv_ruleGooglecontactSelectAll= ruleGooglecontactSelectAll EOF ;
    public final EObject entryRuleGooglecontactSelectAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGooglecontactSelectAll = null;


        try {
            // InternalSparrow.g:896:63: (iv_ruleGooglecontactSelectAll= ruleGooglecontactSelectAll EOF )
            // InternalSparrow.g:897:2: iv_ruleGooglecontactSelectAll= ruleGooglecontactSelectAll EOF
            {
             newCompositeNode(grammarAccess.getGooglecontactSelectAllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGooglecontactSelectAll=ruleGooglecontactSelectAll();

            state._fsp--;

             current =iv_ruleGooglecontactSelectAll; 
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
    // $ANTLR end "entryRuleGooglecontactSelectAll"


    // $ANTLR start "ruleGooglecontactSelectAll"
    // InternalSparrow.g:903:1: ruleGooglecontactSelectAll returns [EObject current=null] : (otherlv_0= 'gcontact-fetchall' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'to-target' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) ;
    public final EObject ruleGooglecontactSelectAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_account_4_0=null;
        Token otherlv_5=null;
        Token lv_privateKey_6_0=null;
        Token otherlv_7=null;
        Token lv_ptwelveFile_8_0=null;
        Token otherlv_9=null;
        Token lv_project_10_0=null;
        Token otherlv_11=null;
        Token lv_impersonatedUser_12_0=null;
        Token otherlv_13=null;
        Token lv_dbSrc_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_value_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_condition_20_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:909:2: ( (otherlv_0= 'gcontact-fetchall' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'to-target' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) )
            // InternalSparrow.g:910:2: (otherlv_0= 'gcontact-fetchall' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'to-target' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:910:2: (otherlv_0= 'gcontact-fetchall' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'to-target' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            // InternalSparrow.g:911:3: otherlv_0= 'gcontact-fetchall' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'to-target' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGooglecontactSelectAllAccess().getGcontactFetchallKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGooglecontactSelectAllAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:919:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:920:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:920:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:921:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGooglecontactSelectAllAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGooglecontactSelectAllAccess().getThroughAccountKeyword_3());
            		
            // InternalSparrow.g:941:3: ( (lv_account_4_0= RULE_STRING ) )
            // InternalSparrow.g:942:4: (lv_account_4_0= RULE_STRING )
            {
            // InternalSparrow.g:942:4: (lv_account_4_0= RULE_STRING )
            // InternalSparrow.g:943:5: lv_account_4_0= RULE_STRING
            {
            lv_account_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_account_4_0, grammarAccess.getGooglecontactSelectAllAccess().getAccountSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGooglecontactSelectAllAccess().getSecuredByKeyword_5());
            		
            // InternalSparrow.g:963:3: ( (lv_privateKey_6_0= RULE_STRING ) )
            // InternalSparrow.g:964:4: (lv_privateKey_6_0= RULE_STRING )
            {
            // InternalSparrow.g:964:4: (lv_privateKey_6_0= RULE_STRING )
            // InternalSparrow.g:965:5: lv_privateKey_6_0= RULE_STRING
            {
            lv_privateKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_privateKey_6_0, grammarAccess.getGooglecontactSelectAllAccess().getPrivateKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"privateKey",
            						lv_privateKey_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGooglecontactSelectAllAccess().getWithKeyKeyword_7());
            		
            // InternalSparrow.g:985:3: ( (lv_ptwelveFile_8_0= RULE_STRING ) )
            // InternalSparrow.g:986:4: (lv_ptwelveFile_8_0= RULE_STRING )
            {
            // InternalSparrow.g:986:4: (lv_ptwelveFile_8_0= RULE_STRING )
            // InternalSparrow.g:987:5: lv_ptwelveFile_8_0= RULE_STRING
            {
            lv_ptwelveFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_ptwelveFile_8_0, grammarAccess.getGooglecontactSelectAllAccess().getPtwelveFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ptwelveFile",
            						lv_ptwelveFile_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGooglecontactSelectAllAccess().getForProjectKeyword_9());
            		
            // InternalSparrow.g:1007:3: ( (lv_project_10_0= RULE_STRING ) )
            // InternalSparrow.g:1008:4: (lv_project_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1008:4: (lv_project_10_0= RULE_STRING )
            // InternalSparrow.g:1009:5: lv_project_10_0= RULE_STRING
            {
            lv_project_10_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_project_10_0, grammarAccess.getGooglecontactSelectAllAccess().getProjectSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project",
            						lv_project_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getGooglecontactSelectAllAccess().getOnBehalfOfKeyword_11());
            		
            // InternalSparrow.g:1029:3: ( (lv_impersonatedUser_12_0= RULE_STRING ) )
            // InternalSparrow.g:1030:4: (lv_impersonatedUser_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1030:4: (lv_impersonatedUser_12_0= RULE_STRING )
            // InternalSparrow.g:1031:5: lv_impersonatedUser_12_0= RULE_STRING
            {
            lv_impersonatedUser_12_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_impersonatedUser_12_0, grammarAccess.getGooglecontactSelectAllAccess().getImpersonatedUserSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impersonatedUser",
            						lv_impersonatedUser_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getGooglecontactSelectAllAccess().getToTargetKeyword_13());
            		
            // InternalSparrow.g:1051:3: ( (lv_dbSrc_14_0= RULE_STRING ) )
            // InternalSparrow.g:1052:4: (lv_dbSrc_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1052:4: (lv_dbSrc_14_0= RULE_STRING )
            // InternalSparrow.g:1053:5: lv_dbSrc_14_0= RULE_STRING
            {
            lv_dbSrc_14_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_dbSrc_14_0, grammarAccess.getGooglecontactSelectAllAccess().getDbSrcSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbSrc",
            						lv_dbSrc_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getGooglecontactSelectAllAccess().getUsingKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getGooglecontactSelectAllAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSparrow.g:1077:3: ( (lv_value_17_0= RULE_STRING ) )
            // InternalSparrow.g:1078:4: (lv_value_17_0= RULE_STRING )
            {
            // InternalSparrow.g:1078:4: (lv_value_17_0= RULE_STRING )
            // InternalSparrow.g:1079:5: lv_value_17_0= RULE_STRING
            {
            lv_value_17_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_17_0, grammarAccess.getGooglecontactSelectAllAccess().getValueSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGooglecontactSelectAllAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getGooglecontactSelectAllAccess().getOnConditionKeyword_19());
            		
            // InternalSparrow.g:1103:3: ( (lv_condition_20_0= ruleExpression ) )
            // InternalSparrow.g:1104:4: (lv_condition_20_0= ruleExpression )
            {
            // InternalSparrow.g:1104:4: (lv_condition_20_0= ruleExpression )
            // InternalSparrow.g:1105:5: lv_condition_20_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGooglecontactSelectAllAccess().getConditionExpressionParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_20_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGooglecontactSelectAllRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_20_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleGooglecontactSelectAll"


    // $ANTLR start "entryRuleGooglecontactPUT"
    // InternalSparrow.g:1126:1: entryRuleGooglecontactPUT returns [EObject current=null] : iv_ruleGooglecontactPUT= ruleGooglecontactPUT EOF ;
    public final EObject entryRuleGooglecontactPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGooglecontactPUT = null;


        try {
            // InternalSparrow.g:1126:57: (iv_ruleGooglecontactPUT= ruleGooglecontactPUT EOF )
            // InternalSparrow.g:1127:2: iv_ruleGooglecontactPUT= ruleGooglecontactPUT EOF
            {
             newCompositeNode(grammarAccess.getGooglecontactPUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGooglecontactPUT=ruleGooglecontactPUT();

            state._fsp--;

             current =iv_ruleGooglecontactPUT; 
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
    // $ANTLR end "entryRuleGooglecontactPUT"


    // $ANTLR start "ruleGooglecontactPUT"
    // InternalSparrow.g:1133:1: ruleGooglecontactPUT returns [EObject current=null] : (otherlv_0= 'gcontact' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) ;
    public final EObject ruleGooglecontactPUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_account_4_0=null;
        Token otherlv_5=null;
        Token lv_privateKey_6_0=null;
        Token otherlv_7=null;
        Token lv_ptwelveFile_8_0=null;
        Token otherlv_9=null;
        Token lv_project_10_0=null;
        Token otherlv_11=null;
        Token lv_impersonatedUser_12_0=null;
        Token otherlv_13=null;
        Token lv_dbSrc_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_value_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_condition_20_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1139:2: ( (otherlv_0= 'gcontact' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) )
            // InternalSparrow.g:1140:2: (otherlv_0= 'gcontact' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:1140:2: (otherlv_0= 'gcontact' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            // InternalSparrow.g:1141:3: otherlv_0= 'gcontact' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGooglecontactPUTAccess().getGcontactKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGooglecontactPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1149:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1150:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1150:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1151:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGooglecontactPUTAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGooglecontactPUTAccess().getThroughAccountKeyword_3());
            		
            // InternalSparrow.g:1171:3: ( (lv_account_4_0= RULE_STRING ) )
            // InternalSparrow.g:1172:4: (lv_account_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1172:4: (lv_account_4_0= RULE_STRING )
            // InternalSparrow.g:1173:5: lv_account_4_0= RULE_STRING
            {
            lv_account_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_account_4_0, grammarAccess.getGooglecontactPUTAccess().getAccountSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGooglecontactPUTAccess().getSecuredByKeyword_5());
            		
            // InternalSparrow.g:1193:3: ( (lv_privateKey_6_0= RULE_STRING ) )
            // InternalSparrow.g:1194:4: (lv_privateKey_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1194:4: (lv_privateKey_6_0= RULE_STRING )
            // InternalSparrow.g:1195:5: lv_privateKey_6_0= RULE_STRING
            {
            lv_privateKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_privateKey_6_0, grammarAccess.getGooglecontactPUTAccess().getPrivateKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"privateKey",
            						lv_privateKey_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGooglecontactPUTAccess().getWithKeyKeyword_7());
            		
            // InternalSparrow.g:1215:3: ( (lv_ptwelveFile_8_0= RULE_STRING ) )
            // InternalSparrow.g:1216:4: (lv_ptwelveFile_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1216:4: (lv_ptwelveFile_8_0= RULE_STRING )
            // InternalSparrow.g:1217:5: lv_ptwelveFile_8_0= RULE_STRING
            {
            lv_ptwelveFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_ptwelveFile_8_0, grammarAccess.getGooglecontactPUTAccess().getPtwelveFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ptwelveFile",
            						lv_ptwelveFile_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGooglecontactPUTAccess().getForProjectKeyword_9());
            		
            // InternalSparrow.g:1237:3: ( (lv_project_10_0= RULE_STRING ) )
            // InternalSparrow.g:1238:4: (lv_project_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1238:4: (lv_project_10_0= RULE_STRING )
            // InternalSparrow.g:1239:5: lv_project_10_0= RULE_STRING
            {
            lv_project_10_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_project_10_0, grammarAccess.getGooglecontactPUTAccess().getProjectSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project",
            						lv_project_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getGooglecontactPUTAccess().getOnBehalfOfKeyword_11());
            		
            // InternalSparrow.g:1259:3: ( (lv_impersonatedUser_12_0= RULE_STRING ) )
            // InternalSparrow.g:1260:4: (lv_impersonatedUser_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1260:4: (lv_impersonatedUser_12_0= RULE_STRING )
            // InternalSparrow.g:1261:5: lv_impersonatedUser_12_0= RULE_STRING
            {
            lv_impersonatedUser_12_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_impersonatedUser_12_0, grammarAccess.getGooglecontactPUTAccess().getImpersonatedUserSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impersonatedUser",
            						lv_impersonatedUser_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getGooglecontactPUTAccess().getFromSourceKeyword_13());
            		
            // InternalSparrow.g:1281:3: ( (lv_dbSrc_14_0= RULE_STRING ) )
            // InternalSparrow.g:1282:4: (lv_dbSrc_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1282:4: (lv_dbSrc_14_0= RULE_STRING )
            // InternalSparrow.g:1283:5: lv_dbSrc_14_0= RULE_STRING
            {
            lv_dbSrc_14_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_dbSrc_14_0, grammarAccess.getGooglecontactPUTAccess().getDbSrcSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbSrc",
            						lv_dbSrc_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getGooglecontactPUTAccess().getUsingKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getGooglecontactPUTAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSparrow.g:1307:3: ( (lv_value_17_0= RULE_STRING ) )
            // InternalSparrow.g:1308:4: (lv_value_17_0= RULE_STRING )
            {
            // InternalSparrow.g:1308:4: (lv_value_17_0= RULE_STRING )
            // InternalSparrow.g:1309:5: lv_value_17_0= RULE_STRING
            {
            lv_value_17_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_17_0, grammarAccess.getGooglecontactPUTAccess().getValueSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecontactPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGooglecontactPUTAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getGooglecontactPUTAccess().getOnConditionKeyword_19());
            		
            // InternalSparrow.g:1333:3: ( (lv_condition_20_0= ruleExpression ) )
            // InternalSparrow.g:1334:4: (lv_condition_20_0= ruleExpression )
            {
            // InternalSparrow.g:1334:4: (lv_condition_20_0= ruleExpression )
            // InternalSparrow.g:1335:5: lv_condition_20_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGooglecontactPUTAccess().getConditionExpressionParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_20_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGooglecontactPUTRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_20_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleGooglecontactPUT"


    // $ANTLR start "entryRuleGooglecalPUT"
    // InternalSparrow.g:1356:1: entryRuleGooglecalPUT returns [EObject current=null] : iv_ruleGooglecalPUT= ruleGooglecalPUT EOF ;
    public final EObject entryRuleGooglecalPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGooglecalPUT = null;


        try {
            // InternalSparrow.g:1356:53: (iv_ruleGooglecalPUT= ruleGooglecalPUT EOF )
            // InternalSparrow.g:1357:2: iv_ruleGooglecalPUT= ruleGooglecalPUT EOF
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
    // InternalSparrow.g:1363:1: ruleGooglecalPUT returns [EObject current=null] : (otherlv_0= 'gcalendar' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) ;
    public final EObject ruleGooglecalPUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_account_4_0=null;
        Token otherlv_5=null;
        Token lv_privateKey_6_0=null;
        Token otherlv_7=null;
        Token lv_ptwelveFile_8_0=null;
        Token otherlv_9=null;
        Token lv_project_10_0=null;
        Token otherlv_11=null;
        Token lv_impersonatedUser_12_0=null;
        Token otherlv_13=null;
        Token lv_dbSrc_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_value_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_condition_20_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1369:2: ( (otherlv_0= 'gcalendar' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) ) )
            // InternalSparrow.g:1370:2: (otherlv_0= 'gcalendar' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:1370:2: (otherlv_0= 'gcalendar' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) ) )
            // InternalSparrow.g:1371:3: otherlv_0= 'gcalendar' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'through-account' ( (lv_account_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_privateKey_6_0= RULE_STRING ) ) otherlv_7= 'with-key' ( (lv_ptwelveFile_8_0= RULE_STRING ) ) otherlv_9= 'for-project' ( (lv_project_10_0= RULE_STRING ) ) otherlv_11= 'on-behalf-of' ( (lv_impersonatedUser_12_0= RULE_STRING ) ) otherlv_13= 'from-source' ( (lv_dbSrc_14_0= RULE_STRING ) ) otherlv_15= 'using' otherlv_16= '{' ( (lv_value_17_0= RULE_STRING ) ) otherlv_18= '}' otherlv_19= 'on-condition' ( (lv_condition_20_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGooglecalPUTAccess().getGcalendarKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGooglecalPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1379:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1380:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1380:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1381:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getGooglecalPUTAccess().getThroughAccountKeyword_3());
            		
            // InternalSparrow.g:1401:3: ( (lv_account_4_0= RULE_STRING ) )
            // InternalSparrow.g:1402:4: (lv_account_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1402:4: (lv_account_4_0= RULE_STRING )
            // InternalSparrow.g:1403:5: lv_account_4_0= RULE_STRING
            {
            lv_account_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_account_4_0, grammarAccess.getGooglecalPUTAccess().getAccountSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGooglecalPUTAccess().getSecuredByKeyword_5());
            		
            // InternalSparrow.g:1423:3: ( (lv_privateKey_6_0= RULE_STRING ) )
            // InternalSparrow.g:1424:4: (lv_privateKey_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1424:4: (lv_privateKey_6_0= RULE_STRING )
            // InternalSparrow.g:1425:5: lv_privateKey_6_0= RULE_STRING
            {
            lv_privateKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_privateKey_6_0, grammarAccess.getGooglecalPUTAccess().getPrivateKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"privateKey",
            						lv_privateKey_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGooglecalPUTAccess().getWithKeyKeyword_7());
            		
            // InternalSparrow.g:1445:3: ( (lv_ptwelveFile_8_0= RULE_STRING ) )
            // InternalSparrow.g:1446:4: (lv_ptwelveFile_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1446:4: (lv_ptwelveFile_8_0= RULE_STRING )
            // InternalSparrow.g:1447:5: lv_ptwelveFile_8_0= RULE_STRING
            {
            lv_ptwelveFile_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_ptwelveFile_8_0, grammarAccess.getGooglecalPUTAccess().getPtwelveFileSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ptwelveFile",
            						lv_ptwelveFile_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGooglecalPUTAccess().getForProjectKeyword_9());
            		
            // InternalSparrow.g:1467:3: ( (lv_project_10_0= RULE_STRING ) )
            // InternalSparrow.g:1468:4: (lv_project_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1468:4: (lv_project_10_0= RULE_STRING )
            // InternalSparrow.g:1469:5: lv_project_10_0= RULE_STRING
            {
            lv_project_10_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_project_10_0, grammarAccess.getGooglecalPUTAccess().getProjectSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project",
            						lv_project_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getGooglecalPUTAccess().getOnBehalfOfKeyword_11());
            		
            // InternalSparrow.g:1489:3: ( (lv_impersonatedUser_12_0= RULE_STRING ) )
            // InternalSparrow.g:1490:4: (lv_impersonatedUser_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1490:4: (lv_impersonatedUser_12_0= RULE_STRING )
            // InternalSparrow.g:1491:5: lv_impersonatedUser_12_0= RULE_STRING
            {
            lv_impersonatedUser_12_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_impersonatedUser_12_0, grammarAccess.getGooglecalPUTAccess().getImpersonatedUserSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impersonatedUser",
            						lv_impersonatedUser_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getGooglecalPUTAccess().getFromSourceKeyword_13());
            		
            // InternalSparrow.g:1511:3: ( (lv_dbSrc_14_0= RULE_STRING ) )
            // InternalSparrow.g:1512:4: (lv_dbSrc_14_0= RULE_STRING )
            {
            // InternalSparrow.g:1512:4: (lv_dbSrc_14_0= RULE_STRING )
            // InternalSparrow.g:1513:5: lv_dbSrc_14_0= RULE_STRING
            {
            lv_dbSrc_14_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_dbSrc_14_0, grammarAccess.getGooglecalPUTAccess().getDbSrcSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dbSrc",
            						lv_dbSrc_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getGooglecalPUTAccess().getUsingKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getGooglecalPUTAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSparrow.g:1537:3: ( (lv_value_17_0= RULE_STRING ) )
            // InternalSparrow.g:1538:4: (lv_value_17_0= RULE_STRING )
            {
            // InternalSparrow.g:1538:4: (lv_value_17_0= RULE_STRING )
            // InternalSparrow.g:1539:5: lv_value_17_0= RULE_STRING
            {
            lv_value_17_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_17_0, grammarAccess.getGooglecalPUTAccess().getValueSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGooglecalPUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGooglecalPUTAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getGooglecalPUTAccess().getOnConditionKeyword_19());
            		
            // InternalSparrow.g:1563:3: ( (lv_condition_20_0= ruleExpression ) )
            // InternalSparrow.g:1564:4: (lv_condition_20_0= ruleExpression )
            {
            // InternalSparrow.g:1564:4: (lv_condition_20_0= ruleExpression )
            // InternalSparrow.g:1565:5: lv_condition_20_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGooglecalPUTAccess().getConditionExpressionParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_20_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGooglecalPUTRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_20_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleGooglecalPUT"


    // $ANTLR start "entryRuleFBCLead"
    // InternalSparrow.g:1586:1: entryRuleFBCLead returns [EObject current=null] : iv_ruleFBCLead= ruleFBCLead EOF ;
    public final EObject entryRuleFBCLead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFBCLead = null;


        try {
            // InternalSparrow.g:1586:48: (iv_ruleFBCLead= ruleFBCLead EOF )
            // InternalSparrow.g:1587:2: iv_ruleFBCLead= ruleFBCLead EOF
            {
             newCompositeNode(grammarAccess.getFBCLeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFBCLead=ruleFBCLead();

            state._fsp--;

             current =iv_ruleFBCLead; 
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
    // $ANTLR end "entryRuleFBCLead"


    // $ANTLR start "ruleFBCLead"
    // InternalSparrow.g:1593:1: ruleFBCLead returns [EObject current=null] : (otherlv_0= 'fblc' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_accessToken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_appSecret_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_accountId_8_0= RULE_STRING ) ) otherlv_9= 'for-campaign' ( (lv_campaignId_10_0= RULE_STRING ) ) otherlv_11= 'into' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) ;
    public final EObject ruleFBCLead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_accessToken_4_0=null;
        Token otherlv_5=null;
        Token lv_appSecret_6_0=null;
        Token otherlv_7=null;
        Token lv_accountId_8_0=null;
        Token otherlv_9=null;
        Token lv_campaignId_10_0=null;
        Token otherlv_11=null;
        Token lv_target_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_value_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_condition_18_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1599:2: ( (otherlv_0= 'fblc' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_accessToken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_appSecret_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_accountId_8_0= RULE_STRING ) ) otherlv_9= 'for-campaign' ( (lv_campaignId_10_0= RULE_STRING ) ) otherlv_11= 'into' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) )
            // InternalSparrow.g:1600:2: (otherlv_0= 'fblc' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_accessToken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_appSecret_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_accountId_8_0= RULE_STRING ) ) otherlv_9= 'for-campaign' ( (lv_campaignId_10_0= RULE_STRING ) ) otherlv_11= 'into' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:1600:2: (otherlv_0= 'fblc' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_accessToken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_appSecret_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_accountId_8_0= RULE_STRING ) ) otherlv_9= 'for-campaign' ( (lv_campaignId_10_0= RULE_STRING ) ) otherlv_11= 'into' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            // InternalSparrow.g:1601:3: otherlv_0= 'fblc' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_accessToken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_appSecret_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_accountId_8_0= RULE_STRING ) ) otherlv_9= 'for-campaign' ( (lv_campaignId_10_0= RULE_STRING ) ) otherlv_11= 'into' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= RULE_STRING ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFBCLeadAccess().getFblcKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFBCLeadAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1609:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1610:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1610:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1611:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFBCLeadAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFBCLeadAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:1631:3: ( (lv_accessToken_4_0= RULE_STRING ) )
            // InternalSparrow.g:1632:4: (lv_accessToken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1632:4: (lv_accessToken_4_0= RULE_STRING )
            // InternalSparrow.g:1633:5: lv_accessToken_4_0= RULE_STRING
            {
            lv_accessToken_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_accessToken_4_0, grammarAccess.getFBCLeadAccess().getAccessTokenSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accessToken",
            						lv_accessToken_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFBCLeadAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:1653:3: ( (lv_appSecret_6_0= RULE_STRING ) )
            // InternalSparrow.g:1654:4: (lv_appSecret_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1654:4: (lv_appSecret_6_0= RULE_STRING )
            // InternalSparrow.g:1655:5: lv_appSecret_6_0= RULE_STRING
            {
            lv_appSecret_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_appSecret_6_0, grammarAccess.getFBCLeadAccess().getAppSecretSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appSecret",
            						lv_appSecret_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getFBCLeadAccess().getThroughUserKeyword_7());
            		
            // InternalSparrow.g:1675:3: ( (lv_accountId_8_0= RULE_STRING ) )
            // InternalSparrow.g:1676:4: (lv_accountId_8_0= RULE_STRING )
            {
            // InternalSparrow.g:1676:4: (lv_accountId_8_0= RULE_STRING )
            // InternalSparrow.g:1677:5: lv_accountId_8_0= RULE_STRING
            {
            lv_accountId_8_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_accountId_8_0, grammarAccess.getFBCLeadAccess().getAccountIdSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accountId",
            						lv_accountId_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getFBCLeadAccess().getForCampaignKeyword_9());
            		
            // InternalSparrow.g:1697:3: ( (lv_campaignId_10_0= RULE_STRING ) )
            // InternalSparrow.g:1698:4: (lv_campaignId_10_0= RULE_STRING )
            {
            // InternalSparrow.g:1698:4: (lv_campaignId_10_0= RULE_STRING )
            // InternalSparrow.g:1699:5: lv_campaignId_10_0= RULE_STRING
            {
            lv_campaignId_10_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_campaignId_10_0, grammarAccess.getFBCLeadAccess().getCampaignIdSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"campaignId",
            						lv_campaignId_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getFBCLeadAccess().getIntoKeyword_11());
            		
            // InternalSparrow.g:1719:3: ( (lv_target_12_0= RULE_STRING ) )
            // InternalSparrow.g:1720:4: (lv_target_12_0= RULE_STRING )
            {
            // InternalSparrow.g:1720:4: (lv_target_12_0= RULE_STRING )
            // InternalSparrow.g:1721:5: lv_target_12_0= RULE_STRING
            {
            lv_target_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_target_12_0, grammarAccess.getFBCLeadAccess().getTargetSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getFBCLeadAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getFBCLeadAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:1745:3: ( (lv_value_15_0= RULE_STRING ) )
            // InternalSparrow.g:1746:4: (lv_value_15_0= RULE_STRING )
            {
            // InternalSparrow.g:1746:4: (lv_value_15_0= RULE_STRING )
            // InternalSparrow.g:1747:5: lv_value_15_0= RULE_STRING
            {
            lv_value_15_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_15_0, grammarAccess.getFBCLeadAccess().getValueSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFBCLeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getFBCLeadAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_17, grammarAccess.getFBCLeadAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:1771:3: ( (lv_condition_18_0= ruleExpression ) )
            // InternalSparrow.g:1772:4: (lv_condition_18_0= ruleExpression )
            {
            // InternalSparrow.g:1772:4: (lv_condition_18_0= ruleExpression )
            // InternalSparrow.g:1773:5: lv_condition_18_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFBCLeadAccess().getConditionExpressionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_18_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFBCLeadRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleFBCLead"


    // $ANTLR start "entryRuleDropfile"
    // InternalSparrow.g:1794:1: entryRuleDropfile returns [EObject current=null] : iv_ruleDropfile= ruleDropfile EOF ;
    public final EObject entryRuleDropfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropfile = null;


        try {
            // InternalSparrow.g:1794:49: (iv_ruleDropfile= ruleDropfile EOF )
            // InternalSparrow.g:1795:2: iv_ruleDropfile= ruleDropfile EOF
            {
             newCompositeNode(grammarAccess.getDropfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropfile=ruleDropfile();

            state._fsp--;

             current =iv_ruleDropfile; 
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
    // $ANTLR end "entryRuleDropfile"


    // $ANTLR start "ruleDropfile"
    // InternalSparrow.g:1801:1: ruleDropfile returns [EObject current=null] : (otherlv_0= 'dropfile' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-path' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on-condition' ( (lv_condition_6_0= ruleExpression ) ) ) ;
    public final EObject ruleDropfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;
        Token otherlv_5=null;
        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1807:2: ( (otherlv_0= 'dropfile' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-path' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on-condition' ( (lv_condition_6_0= ruleExpression ) ) ) )
            // InternalSparrow.g:1808:2: (otherlv_0= 'dropfile' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-path' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on-condition' ( (lv_condition_6_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:1808:2: (otherlv_0= 'dropfile' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-path' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on-condition' ( (lv_condition_6_0= ruleExpression ) ) )
            // InternalSparrow.g:1809:3: otherlv_0= 'dropfile' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-path' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on-condition' ( (lv_condition_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDropfileAccess().getDropfileKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDropfileAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1817:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1818:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1818:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1819:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDropfileAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDropfileAccess().getInPathKeyword_3());
            		
            // InternalSparrow.g:1839:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:1840:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1840:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:1841:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_target_4_0, grammarAccess.getDropfileAccess().getTargetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getDropfileAccess().getOnConditionKeyword_5());
            		
            // InternalSparrow.g:1861:3: ( (lv_condition_6_0= ruleExpression ) )
            // InternalSparrow.g:1862:4: (lv_condition_6_0= ruleExpression )
            {
            // InternalSparrow.g:1862:4: (lv_condition_6_0= ruleExpression )
            // InternalSparrow.g:1863:5: lv_condition_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDropfileAccess().getConditionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropfileRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_6_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleDropfile"


    // $ANTLR start "entryRuleDoozle"
    // InternalSparrow.g:1884:1: entryRuleDoozle returns [EObject current=null] : iv_ruleDoozle= ruleDoozle EOF ;
    public final EObject entryRuleDoozle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoozle = null;


        try {
            // InternalSparrow.g:1884:47: (iv_ruleDoozle= ruleDoozle EOF )
            // InternalSparrow.g:1885:2: iv_ruleDoozle= ruleDoozle EOF
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
    // InternalSparrow.g:1891:1: ruleDoozle returns [EObject current=null] : (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) ;
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
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_9_0 = null;

        EObject lv_condition_12_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:1897:2: ( (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) )
            // InternalSparrow.g:1898:2: (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:1898:2: (otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            // InternalSparrow.g:1899:3: otherlv_0= 'doozle' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'in-table' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_on_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleCreateStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDoozleAccess().getDoozleKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDoozleAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:1907:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:1908:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:1908:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:1909:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_3=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDoozleAccess().getInTableKeyword_3());
            		
            // InternalSparrow.g:1929:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:1930:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:1930:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:1931:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDoozleAccess().getOnKeyword_5());
            		
            // InternalSparrow.g:1951:3: ( (lv_on_6_0= RULE_STRING ) )
            // InternalSparrow.g:1952:4: (lv_on_6_0= RULE_STRING )
            {
            // InternalSparrow.g:1952:4: (lv_on_6_0= RULE_STRING )
            // InternalSparrow.g:1953:5: lv_on_6_0= RULE_STRING
            {
            lv_on_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDoozleAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDoozleAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:1977:3: ( (lv_value_9_0= ruleCreateStatement ) )
            // InternalSparrow.g:1978:4: (lv_value_9_0= ruleCreateStatement )
            {
            // InternalSparrow.g:1978:4: (lv_value_9_0= ruleCreateStatement )
            // InternalSparrow.g:1979:5: lv_value_9_0= ruleCreateStatement
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

            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getDoozleAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getDoozleAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:2004:3: ( (lv_condition_12_0= ruleExpression ) )
            // InternalSparrow.g:2005:4: (lv_condition_12_0= ruleExpression )
            {
            // InternalSparrow.g:2005:4: (lv_condition_12_0= ruleExpression )
            // InternalSparrow.g:2006:5: lv_condition_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDoozleAccess().getConditionExpressionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoozleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleDoozle"


    // $ANTLR start "entryRuleRest"
    // InternalSparrow.g:2027:1: entryRuleRest returns [EObject current=null] : iv_ruleRest= ruleRest EOF ;
    public final EObject entryRuleRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRest = null;


        try {
            // InternalSparrow.g:2027:45: (iv_ruleRest= ruleRest EOF )
            // InternalSparrow.g:2028:2: iv_ruleRest= ruleRest EOF
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
    // InternalSparrow.g:2034:1: ruleRest returns [EObject current=null] : (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_resourcedatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-url-with' otherlv_13= '{' ( (lv_urldata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_headerdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-header-with' otherlv_19= '{' ( (lv_headerdata_20_0= ruleSelectStatement ) ) otherlv_21= '}' otherlv_22= 'from' ( (lv_postdatafrom_23_0= RULE_STRING ) ) otherlv_24= 'update-body-with' otherlv_25= '{' otherlv_26= 'parent' otherlv_27= 'as' ( (lv_parentName_28_0= RULE_STRING ) ) ( (lv_parentdata_29_0= ruleSelectStatement ) ) ( (lv_parts_30_0= ruleRestPart ) )* otherlv_31= '}' otherlv_32= 'into' ( (lv_ackdatato_33_0= RULE_STRING ) ) otherlv_34= 'store-ack-at' otherlv_35= '{' ( (lv_ackdata_36_0= ruleSelectStatement ) ) otherlv_37= '}' otherlv_38= '}' otherlv_39= 'on-condition' ( (lv_condition_40_0= ruleExpression ) ) ) ;
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
        Token lv_resourcedatafrom_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_headerdatafrom_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_postdatafrom_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_parentName_28_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_ackdatato_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_urldata_14_0 = null;

        AntlrDatatypeRuleToken lv_headerdata_20_0 = null;

        AntlrDatatypeRuleToken lv_parentdata_29_0 = null;

        EObject lv_parts_30_0 = null;

        AntlrDatatypeRuleToken lv_ackdata_36_0 = null;

        EObject lv_condition_40_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2040:2: ( (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_resourcedatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-url-with' otherlv_13= '{' ( (lv_urldata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_headerdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-header-with' otherlv_19= '{' ( (lv_headerdata_20_0= ruleSelectStatement ) ) otherlv_21= '}' otherlv_22= 'from' ( (lv_postdatafrom_23_0= RULE_STRING ) ) otherlv_24= 'update-body-with' otherlv_25= '{' otherlv_26= 'parent' otherlv_27= 'as' ( (lv_parentName_28_0= RULE_STRING ) ) ( (lv_parentdata_29_0= ruleSelectStatement ) ) ( (lv_parts_30_0= ruleRestPart ) )* otherlv_31= '}' otherlv_32= 'into' ( (lv_ackdatato_33_0= RULE_STRING ) ) otherlv_34= 'store-ack-at' otherlv_35= '{' ( (lv_ackdata_36_0= ruleSelectStatement ) ) otherlv_37= '}' otherlv_38= '}' otherlv_39= 'on-condition' ( (lv_condition_40_0= ruleExpression ) ) ) )
            // InternalSparrow.g:2041:2: (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_resourcedatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-url-with' otherlv_13= '{' ( (lv_urldata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_headerdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-header-with' otherlv_19= '{' ( (lv_headerdata_20_0= ruleSelectStatement ) ) otherlv_21= '}' otherlv_22= 'from' ( (lv_postdatafrom_23_0= RULE_STRING ) ) otherlv_24= 'update-body-with' otherlv_25= '{' otherlv_26= 'parent' otherlv_27= 'as' ( (lv_parentName_28_0= RULE_STRING ) ) ( (lv_parentdata_29_0= ruleSelectStatement ) ) ( (lv_parts_30_0= ruleRestPart ) )* otherlv_31= '}' otherlv_32= 'into' ( (lv_ackdatato_33_0= RULE_STRING ) ) otherlv_34= 'store-ack-at' otherlv_35= '{' ( (lv_ackdata_36_0= ruleSelectStatement ) ) otherlv_37= '}' otherlv_38= '}' otherlv_39= 'on-condition' ( (lv_condition_40_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:2041:2: (otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_resourcedatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-url-with' otherlv_13= '{' ( (lv_urldata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_headerdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-header-with' otherlv_19= '{' ( (lv_headerdata_20_0= ruleSelectStatement ) ) otherlv_21= '}' otherlv_22= 'from' ( (lv_postdatafrom_23_0= RULE_STRING ) ) otherlv_24= 'update-body-with' otherlv_25= '{' otherlv_26= 'parent' otherlv_27= 'as' ( (lv_parentName_28_0= RULE_STRING ) ) ( (lv_parentdata_29_0= ruleSelectStatement ) ) ( (lv_parts_30_0= ruleRestPart ) )* otherlv_31= '}' otherlv_32= 'into' ( (lv_ackdatato_33_0= RULE_STRING ) ) otherlv_34= 'store-ack-at' otherlv_35= '{' ( (lv_ackdata_36_0= ruleSelectStatement ) ) otherlv_37= '}' otherlv_38= '}' otherlv_39= 'on-condition' ( (lv_condition_40_0= ruleExpression ) ) )
            // InternalSparrow.g:2042:3: otherlv_0= 'rest' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-url' ( (lv_url_6_0= RULE_STRING ) ) otherlv_7= 'and-method-as' ( (lv_method_8_0= RULE_STRING ) ) otherlv_9= '{' otherlv_10= 'from' ( (lv_resourcedatafrom_11_0= RULE_STRING ) ) otherlv_12= 'update-url-with' otherlv_13= '{' ( (lv_urldata_14_0= ruleSelectStatement ) ) otherlv_15= '}' otherlv_16= 'from' ( (lv_headerdatafrom_17_0= RULE_STRING ) ) otherlv_18= 'update-header-with' otherlv_19= '{' ( (lv_headerdata_20_0= ruleSelectStatement ) ) otherlv_21= '}' otherlv_22= 'from' ( (lv_postdatafrom_23_0= RULE_STRING ) ) otherlv_24= 'update-body-with' otherlv_25= '{' otherlv_26= 'parent' otherlv_27= 'as' ( (lv_parentName_28_0= RULE_STRING ) ) ( (lv_parentdata_29_0= ruleSelectStatement ) ) ( (lv_parts_30_0= ruleRestPart ) )* otherlv_31= '}' otherlv_32= 'into' ( (lv_ackdatato_33_0= RULE_STRING ) ) otherlv_34= 'store-ack-at' otherlv_35= '{' ( (lv_ackdata_36_0= ruleSelectStatement ) ) otherlv_37= '}' otherlv_38= '}' otherlv_39= 'on-condition' ( (lv_condition_40_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRestAccess().getRestKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2050:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2051:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2051:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2052:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:2072:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:2073:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2073:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:2074:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            otherlv_5=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRestAccess().getWithUrlKeyword_5());
            		
            // InternalSparrow.g:2094:3: ( (lv_url_6_0= RULE_STRING ) )
            // InternalSparrow.g:2095:4: (lv_url_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2095:4: (lv_url_6_0= RULE_STRING )
            // InternalSparrow.g:2096:5: lv_url_6_0= RULE_STRING
            {
            lv_url_6_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_7=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRestAccess().getAndMethodAsKeyword_7());
            		
            // InternalSparrow.g:2116:3: ( (lv_method_8_0= RULE_STRING ) )
            // InternalSparrow.g:2117:4: (lv_method_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2117:4: (lv_method_8_0= RULE_STRING )
            // InternalSparrow.g:2118:5: lv_method_8_0= RULE_STRING
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

            otherlv_9=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_9, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getRestAccess().getFromKeyword_10());
            		
            // InternalSparrow.g:2142:3: ( (lv_resourcedatafrom_11_0= RULE_STRING ) )
            // InternalSparrow.g:2143:4: (lv_resourcedatafrom_11_0= RULE_STRING )
            {
            // InternalSparrow.g:2143:4: (lv_resourcedatafrom_11_0= RULE_STRING )
            // InternalSparrow.g:2144:5: lv_resourcedatafrom_11_0= RULE_STRING
            {
            lv_resourcedatafrom_11_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_resourcedatafrom_11_0, grammarAccess.getRestAccess().getResourcedatafromSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"resourcedatafrom",
            						lv_resourcedatafrom_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getRestAccess().getUpdateUrlWithKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSparrow.g:2168:3: ( (lv_urldata_14_0= ruleSelectStatement ) )
            // InternalSparrow.g:2169:4: (lv_urldata_14_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2169:4: (lv_urldata_14_0= ruleSelectStatement )
            // InternalSparrow.g:2170:5: lv_urldata_14_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getUrldataSelectStatementParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_8);
            lv_urldata_14_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"urldata",
            						lv_urldata_14_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getRestAccess().getFromKeyword_16());
            		
            // InternalSparrow.g:2195:3: ( (lv_headerdatafrom_17_0= RULE_STRING ) )
            // InternalSparrow.g:2196:4: (lv_headerdatafrom_17_0= RULE_STRING )
            {
            // InternalSparrow.g:2196:4: (lv_headerdatafrom_17_0= RULE_STRING )
            // InternalSparrow.g:2197:5: lv_headerdatafrom_17_0= RULE_STRING
            {
            lv_headerdatafrom_17_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_headerdatafrom_17_0, grammarAccess.getRestAccess().getHeaderdatafromSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"headerdatafrom",
            						lv_headerdatafrom_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getRestAccess().getUpdateHeaderWithKeyword_18());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_19());
            		
            // InternalSparrow.g:2221:3: ( (lv_headerdata_20_0= ruleSelectStatement ) )
            // InternalSparrow.g:2222:4: (lv_headerdata_20_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2222:4: (lv_headerdata_20_0= ruleSelectStatement )
            // InternalSparrow.g:2223:5: lv_headerdata_20_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getHeaderdataSelectStatementParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_8);
            lv_headerdata_20_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"headerdata",
            						lv_headerdata_20_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_21, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_22=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getRestAccess().getFromKeyword_22());
            		
            // InternalSparrow.g:2248:3: ( (lv_postdatafrom_23_0= RULE_STRING ) )
            // InternalSparrow.g:2249:4: (lv_postdatafrom_23_0= RULE_STRING )
            {
            // InternalSparrow.g:2249:4: (lv_postdatafrom_23_0= RULE_STRING )
            // InternalSparrow.g:2250:5: lv_postdatafrom_23_0= RULE_STRING
            {
            lv_postdatafrom_23_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_postdatafrom_23_0, grammarAccess.getRestAccess().getPostdatafromSTRINGTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"postdatafrom",
            						lv_postdatafrom_23_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_24=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_24, grammarAccess.getRestAccess().getUpdateBodyWithKeyword_24());
            		
            otherlv_25=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_25, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_25());
            		
            otherlv_26=(Token)match(input,50,FOLLOW_11); 

            			newLeafNode(otherlv_26, grammarAccess.getRestAccess().getParentKeyword_26());
            		
            otherlv_27=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getRestAccess().getAsKeyword_27());
            		
            // InternalSparrow.g:2282:3: ( (lv_parentName_28_0= RULE_STRING ) )
            // InternalSparrow.g:2283:4: (lv_parentName_28_0= RULE_STRING )
            {
            // InternalSparrow.g:2283:4: (lv_parentName_28_0= RULE_STRING )
            // InternalSparrow.g:2284:5: lv_parentName_28_0= RULE_STRING
            {
            lv_parentName_28_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_parentName_28_0, grammarAccess.getRestAccess().getParentNameSTRINGTerminalRuleCall_28_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parentName",
            						lv_parentName_28_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSparrow.g:2300:3: ( (lv_parentdata_29_0= ruleSelectStatement ) )
            // InternalSparrow.g:2301:4: (lv_parentdata_29_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2301:4: (lv_parentdata_29_0= ruleSelectStatement )
            // InternalSparrow.g:2302:5: lv_parentdata_29_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getParentdataSelectStatementParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_37);
            lv_parentdata_29_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"parentdata",
            						lv_parentdata_29_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSparrow.g:2319:3: ( (lv_parts_30_0= ruleRestPart ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==52) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSparrow.g:2320:4: (lv_parts_30_0= ruleRestPart )
            	    {
            	    // InternalSparrow.g:2320:4: (lv_parts_30_0= ruleRestPart )
            	    // InternalSparrow.g:2321:5: lv_parts_30_0= ruleRestPart
            	    {

            	    					newCompositeNode(grammarAccess.getRestAccess().getPartsRestPartParserRuleCall_30_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_parts_30_0=ruleRestPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_30_0,
            	    						"org.etl.Sparrow.RestPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_31=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_31, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_31());
            		
            otherlv_32=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_32, grammarAccess.getRestAccess().getIntoKeyword_32());
            		
            // InternalSparrow.g:2346:3: ( (lv_ackdatato_33_0= RULE_STRING ) )
            // InternalSparrow.g:2347:4: (lv_ackdatato_33_0= RULE_STRING )
            {
            // InternalSparrow.g:2347:4: (lv_ackdatato_33_0= RULE_STRING )
            // InternalSparrow.g:2348:5: lv_ackdatato_33_0= RULE_STRING
            {
            lv_ackdatato_33_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_ackdatato_33_0, grammarAccess.getRestAccess().getAckdatatoSTRINGTerminalRuleCall_33_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ackdatato",
            						lv_ackdatato_33_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_34=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_34, grammarAccess.getRestAccess().getStoreAckAtKeyword_34());
            		
            otherlv_35=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_35, grammarAccess.getRestAccess().getLeftCurlyBracketKeyword_35());
            		
            // InternalSparrow.g:2372:3: ( (lv_ackdata_36_0= ruleSelectStatement ) )
            // InternalSparrow.g:2373:4: (lv_ackdata_36_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2373:4: (lv_ackdata_36_0= ruleSelectStatement )
            // InternalSparrow.g:2374:5: lv_ackdata_36_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getRestAccess().getAckdataSelectStatementParserRuleCall_36_0());
            				
            pushFollow(FOLLOW_8);
            lv_ackdata_36_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"ackdata",
            						lv_ackdata_36_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_37=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_37, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_37());
            		
            otherlv_38=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_38, grammarAccess.getRestAccess().getRightCurlyBracketKeyword_38());
            		
            otherlv_39=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_39, grammarAccess.getRestAccess().getOnConditionKeyword_39());
            		
            // InternalSparrow.g:2403:3: ( (lv_condition_40_0= ruleExpression ) )
            // InternalSparrow.g:2404:4: (lv_condition_40_0= ruleExpression )
            {
            // InternalSparrow.g:2404:4: (lv_condition_40_0= ruleExpression )
            // InternalSparrow.g:2405:5: lv_condition_40_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRestAccess().getConditionExpressionParserRuleCall_40_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_40_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_40_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleRest"


    // $ANTLR start "entryRuleRestPart"
    // InternalSparrow.g:2426:1: entryRuleRestPart returns [EObject current=null] : iv_ruleRestPart= ruleRestPart EOF ;
    public final EObject entryRuleRestPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestPart = null;


        try {
            // InternalSparrow.g:2426:49: (iv_ruleRestPart= ruleRestPart EOF )
            // InternalSparrow.g:2427:2: iv_ruleRestPart= ruleRestPart EOF
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
    // InternalSparrow.g:2433:1: ruleRestPart returns [EObject current=null] : (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleRestPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_partName_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_partData_4_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2439:2: ( (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) ) )
            // InternalSparrow.g:2440:2: (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) )
            {
            // InternalSparrow.g:2440:2: (otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) ) )
            // InternalSparrow.g:2441:3: otherlv_0= 'part' otherlv_1= 'as' ( (lv_partName_2_0= RULE_STRING ) ) otherlv_3= 'with' ( (lv_partData_4_0= ruleSelectStatement ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRestPartAccess().getPartKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestPartAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2449:3: ( (lv_partName_2_0= RULE_STRING ) )
            // InternalSparrow.g:2450:4: (lv_partName_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2450:4: (lv_partName_2_0= RULE_STRING )
            // InternalSparrow.g:2451:5: lv_partName_2_0= RULE_STRING
            {
            lv_partName_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            otherlv_3=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRestPartAccess().getWithKeyword_3());
            		
            // InternalSparrow.g:2471:3: ( (lv_partData_4_0= ruleSelectStatement ) )
            // InternalSparrow.g:2472:4: (lv_partData_4_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2472:4: (lv_partData_4_0= ruleSelectStatement )
            // InternalSparrow.g:2473:5: lv_partData_4_0= ruleSelectStatement
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
    // InternalSparrow.g:2494:1: entryRuleTrelloGET returns [EObject current=null] : iv_ruleTrelloGET= ruleTrelloGET EOF ;
    public final EObject entryRuleTrelloGET() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrelloGET = null;


        try {
            // InternalSparrow.g:2494:50: (iv_ruleTrelloGET= ruleTrelloGET EOF )
            // InternalSparrow.g:2495:2: iv_ruleTrelloGET= ruleTrelloGET EOF
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
    // InternalSparrow.g:2501:1: ruleTrelloGET returns [EObject current=null] : (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_15_0 = null;

        EObject lv_condition_18_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2507:2: ( (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) )
            // InternalSparrow.g:2508:2: (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:2508:2: (otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            // InternalSparrow.g:2509:3: otherlv_0= 'trelloget' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'from-board' ( (lv_board_10_0= RULE_STRING ) ) otherlv_11= 'to' ( (lv_target_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTrelloGETAccess().getTrellogetKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrelloGETAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2517:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2518:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2518:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2519:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrelloGETAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:2539:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:2540:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2540:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:2541:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTrelloGETAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:2561:3: ( (lv_key_6_0= RULE_STRING ) )
            // InternalSparrow.g:2562:4: (lv_key_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2562:4: (lv_key_6_0= RULE_STRING )
            // InternalSparrow.g:2563:5: lv_key_6_0= RULE_STRING
            {
            lv_key_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
            		
            // InternalSparrow.g:2583:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:2584:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2584:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:2585:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

            otherlv_9=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTrelloGETAccess().getFromBoardKeyword_9());
            		
            // InternalSparrow.g:2605:3: ( (lv_board_10_0= RULE_STRING ) )
            // InternalSparrow.g:2606:4: (lv_board_10_0= RULE_STRING )
            {
            // InternalSparrow.g:2606:4: (lv_board_10_0= RULE_STRING )
            // InternalSparrow.g:2607:5: lv_board_10_0= RULE_STRING
            {
            lv_board_10_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_11=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getTrelloGETAccess().getToKeyword_11());
            		
            // InternalSparrow.g:2627:3: ( (lv_target_12_0= RULE_STRING ) )
            // InternalSparrow.g:2628:4: (lv_target_12_0= RULE_STRING )
            {
            // InternalSparrow.g:2628:4: (lv_target_12_0= RULE_STRING )
            // InternalSparrow.g:2629:5: lv_target_12_0= RULE_STRING
            {
            lv_target_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_13=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTrelloGETAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getTrelloGETAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:2653:3: ( (lv_value_15_0= ruleSelectStatement ) )
            // InternalSparrow.g:2654:4: (lv_value_15_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2654:4: (lv_value_15_0= ruleSelectStatement )
            // InternalSparrow.g:2655:5: lv_value_15_0= ruleSelectStatement
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

            otherlv_16=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getTrelloGETAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_17, grammarAccess.getTrelloGETAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:2680:3: ( (lv_condition_18_0= ruleExpression ) )
            // InternalSparrow.g:2681:4: (lv_condition_18_0= ruleExpression )
            {
            // InternalSparrow.g:2681:4: (lv_condition_18_0= ruleExpression )
            // InternalSparrow.g:2682:5: lv_condition_18_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTrelloGETAccess().getConditionExpressionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_18_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrelloGETRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleTrelloGET"


    // $ANTLR start "entryRuleTrelloPUT"
    // InternalSparrow.g:2703:1: entryRuleTrelloPUT returns [EObject current=null] : iv_ruleTrelloPUT= ruleTrelloPUT EOF ;
    public final EObject entryRuleTrelloPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrelloPUT = null;


        try {
            // InternalSparrow.g:2703:50: (iv_ruleTrelloPUT= ruleTrelloPUT EOF )
            // InternalSparrow.g:2704:2: iv_ruleTrelloPUT= ruleTrelloPUT EOF
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
    // InternalSparrow.g:2710:1: ruleTrelloPUT returns [EObject current=null] : (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_15_0 = null;

        EObject lv_condition_18_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2716:2: ( (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) ) )
            // InternalSparrow.g:2717:2: (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:2717:2: (otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) ) )
            // InternalSparrow.g:2718:3: otherlv_0= 'trelloput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'secured-by' ( (lv_authtoken_4_0= RULE_STRING ) ) otherlv_5= 'with-key' ( (lv_key_6_0= RULE_STRING ) ) otherlv_7= 'through-user' ( (lv_useraccount_8_0= RULE_STRING ) ) otherlv_9= 'for-list' ( (lv_list_10_0= RULE_STRING ) ) otherlv_11= 'from-source' ( (lv_source_12_0= RULE_STRING ) ) otherlv_13= 'using' otherlv_14= '{' ( (lv_value_15_0= ruleSelectStatement ) ) otherlv_16= '}' otherlv_17= 'on-condition' ( (lv_condition_18_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTrelloPUTAccess().getTrelloputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrelloPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2726:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2727:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2727:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2728:5: lv_name_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrelloPUTAccess().getSecuredByKeyword_3());
            		
            // InternalSparrow.g:2748:3: ( (lv_authtoken_4_0= RULE_STRING ) )
            // InternalSparrow.g:2749:4: (lv_authtoken_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2749:4: (lv_authtoken_4_0= RULE_STRING )
            // InternalSparrow.g:2750:5: lv_authtoken_4_0= RULE_STRING
            {
            lv_authtoken_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTrelloPUTAccess().getWithKeyKeyword_5());
            		
            // InternalSparrow.g:2770:3: ( (lv_key_6_0= RULE_STRING ) )
            // InternalSparrow.g:2771:4: (lv_key_6_0= RULE_STRING )
            {
            // InternalSparrow.g:2771:4: (lv_key_6_0= RULE_STRING )
            // InternalSparrow.g:2772:5: lv_key_6_0= RULE_STRING
            {
            lv_key_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
            		
            // InternalSparrow.g:2792:3: ( (lv_useraccount_8_0= RULE_STRING ) )
            // InternalSparrow.g:2793:4: (lv_useraccount_8_0= RULE_STRING )
            {
            // InternalSparrow.g:2793:4: (lv_useraccount_8_0= RULE_STRING )
            // InternalSparrow.g:2794:5: lv_useraccount_8_0= RULE_STRING
            {
            lv_useraccount_8_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            otherlv_9=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTrelloPUTAccess().getForListKeyword_9());
            		
            // InternalSparrow.g:2814:3: ( (lv_list_10_0= RULE_STRING ) )
            // InternalSparrow.g:2815:4: (lv_list_10_0= RULE_STRING )
            {
            // InternalSparrow.g:2815:4: (lv_list_10_0= RULE_STRING )
            // InternalSparrow.g:2816:5: lv_list_10_0= RULE_STRING
            {
            lv_list_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_11=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getTrelloPUTAccess().getFromSourceKeyword_11());
            		
            // InternalSparrow.g:2836:3: ( (lv_source_12_0= RULE_STRING ) )
            // InternalSparrow.g:2837:4: (lv_source_12_0= RULE_STRING )
            {
            // InternalSparrow.g:2837:4: (lv_source_12_0= RULE_STRING )
            // InternalSparrow.g:2838:5: lv_source_12_0= RULE_STRING
            {
            lv_source_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_13=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTrelloPUTAccess().getUsingKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getTrelloPUTAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalSparrow.g:2862:3: ( (lv_value_15_0= ruleSelectStatement ) )
            // InternalSparrow.g:2863:4: (lv_value_15_0= ruleSelectStatement )
            {
            // InternalSparrow.g:2863:4: (lv_value_15_0= ruleSelectStatement )
            // InternalSparrow.g:2864:5: lv_value_15_0= ruleSelectStatement
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

            otherlv_16=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getTrelloPUTAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_17, grammarAccess.getTrelloPUTAccess().getOnConditionKeyword_17());
            		
            // InternalSparrow.g:2889:3: ( (lv_condition_18_0= ruleExpression ) )
            // InternalSparrow.g:2890:4: (lv_condition_18_0= ruleExpression )
            {
            // InternalSparrow.g:2890:4: (lv_condition_18_0= ruleExpression )
            // InternalSparrow.g:2891:5: lv_condition_18_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTrelloPUTAccess().getConditionExpressionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_18_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrelloPUTRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_18_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleTrelloPUT"


    // $ANTLR start "entryRuleFetch"
    // InternalSparrow.g:2912:1: entryRuleFetch returns [EObject current=null] : iv_ruleFetch= ruleFetch EOF ;
    public final EObject entryRuleFetch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetch = null;


        try {
            // InternalSparrow.g:2912:46: (iv_ruleFetch= ruleFetch EOF )
            // InternalSparrow.g:2913:2: iv_ruleFetch= ruleFetch EOF
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
    // InternalSparrow.g:2919:1: ruleFetch returns [EObject current=null] : (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) ) ;
    public final EObject ruleFetch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_condition_10_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:2925:2: ( (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) ) )
            // InternalSparrow.g:2926:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:2926:2: (otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) )
            // InternalSparrow.g:2927:3: otherlv_0= 'assign' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'source' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= RULE_STRING ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFetchAccess().getAssignKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFetchAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:2935:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:2936:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:2936:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:2937:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

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

            otherlv_3=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFetchAccess().getSourceKeyword_3());
            		
            // InternalSparrow.g:2957:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:2958:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:2958:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:2959:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFetchAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFetchAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:2983:3: ( (lv_value_7_0= RULE_STRING ) )
            // InternalSparrow.g:2984:4: (lv_value_7_0= RULE_STRING )
            {
            // InternalSparrow.g:2984:4: (lv_value_7_0= RULE_STRING )
            // InternalSparrow.g:2985:5: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_7_0, grammarAccess.getFetchAccess().getValueSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFetchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getFetchAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getFetchAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:3009:3: ( (lv_condition_10_0= ruleExpression ) )
            // InternalSparrow.g:3010:4: (lv_condition_10_0= ruleExpression )
            {
            // InternalSparrow.g:3010:4: (lv_condition_10_0= ruleExpression )
            // InternalSparrow.g:3011:5: lv_condition_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFetchAccess().getConditionExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFetchRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleFetch"


    // $ANTLR start "entryRuleCallprocess"
    // InternalSparrow.g:3032:1: entryRuleCallprocess returns [EObject current=null] : iv_ruleCallprocess= ruleCallprocess EOF ;
    public final EObject entryRuleCallprocess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallprocess = null;


        try {
            // InternalSparrow.g:3032:52: (iv_ruleCallprocess= ruleCallprocess EOF )
            // InternalSparrow.g:3033:2: iv_ruleCallprocess= ruleCallprocess EOF
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
    // InternalSparrow.g:3039:1: ruleCallprocess returns [EObject current=null] : (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_11_0 = null;

        EObject lv_condition_14_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3045:2: ( (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3046:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3046:2: (otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            // InternalSparrow.g:3047:3: otherlv_0= 'callprocess' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-target' ( (lv_target_4_0= RULE_STRING ) ) otherlv_5= 'from-file' ( (lv_source_6_0= RULE_STRING ) ) otherlv_7= 'using' ( (lv_datasource_8_0= RULE_STRING ) ) otherlv_9= 'for-every' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCallprocessAccess().getCallprocessKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallprocessAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3055:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3056:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3056:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3057:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_3=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCallprocessAccess().getWithTargetKeyword_3());
            		
            // InternalSparrow.g:3077:3: ( (lv_target_4_0= RULE_STRING ) )
            // InternalSparrow.g:3078:4: (lv_target_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3078:4: (lv_target_4_0= RULE_STRING )
            // InternalSparrow.g:3079:5: lv_target_4_0= RULE_STRING
            {
            lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

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

            otherlv_5=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCallprocessAccess().getFromFileKeyword_5());
            		
            // InternalSparrow.g:3099:3: ( (lv_source_6_0= RULE_STRING ) )
            // InternalSparrow.g:3100:4: (lv_source_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3100:4: (lv_source_6_0= RULE_STRING )
            // InternalSparrow.g:3101:5: lv_source_6_0= RULE_STRING
            {
            lv_source_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCallprocessAccess().getUsingKeyword_7());
            		
            // InternalSparrow.g:3121:3: ( (lv_datasource_8_0= RULE_STRING ) )
            // InternalSparrow.g:3122:4: (lv_datasource_8_0= RULE_STRING )
            {
            // InternalSparrow.g:3122:4: (lv_datasource_8_0= RULE_STRING )
            // InternalSparrow.g:3123:5: lv_datasource_8_0= RULE_STRING
            {
            lv_datasource_8_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

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

            otherlv_9=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getCallprocessAccess().getForEveryKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getCallprocessAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:3147:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:3148:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:3148:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:3149:5: lv_value_11_0= ruleSelectStatement
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

            otherlv_12=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getCallprocessAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getCallprocessAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:3174:3: ( (lv_condition_14_0= ruleExpression ) )
            // InternalSparrow.g:3175:4: (lv_condition_14_0= ruleExpression )
            {
            // InternalSparrow.g:3175:4: (lv_condition_14_0= ruleExpression )
            // InternalSparrow.g:3176:5: lv_condition_14_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCallprocessAccess().getConditionExpressionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_14_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCallprocessRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleCallprocess"


    // $ANTLR start "entryRuleUpdatedaudit"
    // InternalSparrow.g:3197:1: entryRuleUpdatedaudit returns [EObject current=null] : iv_ruleUpdatedaudit= ruleUpdatedaudit EOF ;
    public final EObject entryRuleUpdatedaudit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatedaudit = null;


        try {
            // InternalSparrow.g:3197:53: (iv_ruleUpdatedaudit= ruleUpdatedaudit EOF )
            // InternalSparrow.g:3198:2: iv_ruleUpdatedaudit= ruleUpdatedaudit EOF
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
    // InternalSparrow.g:3204:1: ruleUpdatedaudit returns [EObject current=null] : (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'in' ( (lv_datasource_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) ;
    public final EObject ruleUpdatedaudit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_logsink_4_0=null;
        Token otherlv_5=null;
        Token lv_datasource_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_9_0 = null;

        EObject lv_condition_12_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3210:2: ( (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'in' ( (lv_datasource_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3211:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'in' ( (lv_datasource_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3211:2: (otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'in' ( (lv_datasource_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            // InternalSparrow.g:3212:3: otherlv_0= 'log' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'logto' ( (lv_logsink_4_0= RULE_STRING ) ) otherlv_5= 'in' ( (lv_datasource_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatedauditAccess().getLogKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdatedauditAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3220:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3221:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3221:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3222:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            otherlv_3=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdatedauditAccess().getLogtoKeyword_3());
            		
            // InternalSparrow.g:3242:3: ( (lv_logsink_4_0= RULE_STRING ) )
            // InternalSparrow.g:3243:4: (lv_logsink_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3243:4: (lv_logsink_4_0= RULE_STRING )
            // InternalSparrow.g:3244:5: lv_logsink_4_0= RULE_STRING
            {
            lv_logsink_4_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            otherlv_5=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdatedauditAccess().getInKeyword_5());
            		
            // InternalSparrow.g:3264:3: ( (lv_datasource_6_0= RULE_STRING ) )
            // InternalSparrow.g:3265:4: (lv_datasource_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3265:4: (lv_datasource_6_0= RULE_STRING )
            // InternalSparrow.g:3266:5: lv_datasource_6_0= RULE_STRING
            {
            lv_datasource_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_datasource_6_0, grammarAccess.getUpdatedauditAccess().getDatasourceSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatedauditRule());
            					}
            					setWithLastConsumed(
            						current,
            						"datasource",
            						lv_datasource_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdatedauditAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdatedauditAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:3290:3: ( (lv_value_9_0= ruleSelectStatement ) )
            // InternalSparrow.g:3291:4: (lv_value_9_0= ruleSelectStatement )
            {
            // InternalSparrow.g:3291:4: (lv_value_9_0= ruleSelectStatement )
            // InternalSparrow.g:3292:5: lv_value_9_0= ruleSelectStatement
            {

            					newCompositeNode(grammarAccess.getUpdatedauditAccess().getValueSelectStatementParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_9_0=ruleSelectStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatedauditRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.etl.Sparrow.SelectStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getUpdatedauditAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getUpdatedauditAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:3317:3: ( (lv_condition_12_0= ruleExpression ) )
            // InternalSparrow.g:3318:4: (lv_condition_12_0= ruleExpression )
            {
            // InternalSparrow.g:3318:4: (lv_condition_12_0= ruleExpression )
            // InternalSparrow.g:3319:5: lv_condition_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getUpdatedauditAccess().getConditionExpressionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatedauditRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleUpdatedaudit"


    // $ANTLR start "entryRuleClickSendSms"
    // InternalSparrow.g:3340:1: entryRuleClickSendSms returns [EObject current=null] : iv_ruleClickSendSms= ruleClickSendSms EOF ;
    public final EObject entryRuleClickSendSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickSendSms = null;


        try {
            // InternalSparrow.g:3340:53: (iv_ruleClickSendSms= ruleClickSendSms EOF )
            // InternalSparrow.g:3341:2: iv_ruleClickSendSms= ruleClickSendSms EOF
            {
             newCompositeNode(grammarAccess.getClickSendSmsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickSendSms=ruleClickSendSms();

            state._fsp--;

             current =iv_ruleClickSendSms; 
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
    // $ANTLR end "entryRuleClickSendSms"


    // $ANTLR start "ruleClickSendSms"
    // InternalSparrow.g:3347:1: ruleClickSendSms returns [EObject current=null] : (otherlv_0= 'c2sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-user' ( (lv_userid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_securityKey_6_0= RULE_STRING ) ) otherlv_7= 'from-source' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= RULE_STRING ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) ;
    public final EObject ruleClickSendSms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_userid_4_0=null;
        Token otherlv_5=null;
        Token lv_securityKey_6_0=null;
        Token otherlv_7=null;
        Token lv_target_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_value_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_condition_14_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3353:2: ( (otherlv_0= 'c2sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-user' ( (lv_userid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_securityKey_6_0= RULE_STRING ) ) otherlv_7= 'from-source' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= RULE_STRING ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3354:2: (otherlv_0= 'c2sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-user' ( (lv_userid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_securityKey_6_0= RULE_STRING ) ) otherlv_7= 'from-source' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= RULE_STRING ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3354:2: (otherlv_0= 'c2sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-user' ( (lv_userid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_securityKey_6_0= RULE_STRING ) ) otherlv_7= 'from-source' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= RULE_STRING ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            // InternalSparrow.g:3355:3: otherlv_0= 'c2sms' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'with-user' ( (lv_userid_4_0= RULE_STRING ) ) otherlv_5= 'secured-by' ( (lv_securityKey_6_0= RULE_STRING ) ) otherlv_7= 'from-source' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= RULE_STRING ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickSendSmsAccess().getC2smsKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClickSendSmsAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3363:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3364:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3364:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3365:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClickSendSmsAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickSendSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getClickSendSmsAccess().getWithUserKeyword_3());
            		
            // InternalSparrow.g:3385:3: ( (lv_userid_4_0= RULE_STRING ) )
            // InternalSparrow.g:3386:4: (lv_userid_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3386:4: (lv_userid_4_0= RULE_STRING )
            // InternalSparrow.g:3387:5: lv_userid_4_0= RULE_STRING
            {
            lv_userid_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_userid_4_0, grammarAccess.getClickSendSmsAccess().getUseridSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickSendSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"userid",
            						lv_userid_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getClickSendSmsAccess().getSecuredByKeyword_5());
            		
            // InternalSparrow.g:3407:3: ( (lv_securityKey_6_0= RULE_STRING ) )
            // InternalSparrow.g:3408:4: (lv_securityKey_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3408:4: (lv_securityKey_6_0= RULE_STRING )
            // InternalSparrow.g:3409:5: lv_securityKey_6_0= RULE_STRING
            {
            lv_securityKey_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_securityKey_6_0, grammarAccess.getClickSendSmsAccess().getSecurityKeySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickSendSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"securityKey",
            						lv_securityKey_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getClickSendSmsAccess().getFromSourceKeyword_7());
            		
            // InternalSparrow.g:3429:3: ( (lv_target_8_0= RULE_STRING ) )
            // InternalSparrow.g:3430:4: (lv_target_8_0= RULE_STRING )
            {
            // InternalSparrow.g:3430:4: (lv_target_8_0= RULE_STRING )
            // InternalSparrow.g:3431:5: lv_target_8_0= RULE_STRING
            {
            lv_target_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_target_8_0, grammarAccess.getClickSendSmsAccess().getTargetSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickSendSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getClickSendSmsAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getClickSendSmsAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:3455:3: ( (lv_value_11_0= RULE_STRING ) )
            // InternalSparrow.g:3456:4: (lv_value_11_0= RULE_STRING )
            {
            // InternalSparrow.g:3456:4: (lv_value_11_0= RULE_STRING )
            // InternalSparrow.g:3457:5: lv_value_11_0= RULE_STRING
            {
            lv_value_11_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_value_11_0, grammarAccess.getClickSendSmsAccess().getValueSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickSendSmsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getClickSendSmsAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getClickSendSmsAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:3481:3: ( (lv_condition_14_0= ruleExpression ) )
            // InternalSparrow.g:3482:4: (lv_condition_14_0= ruleExpression )
            {
            // InternalSparrow.g:3482:4: (lv_condition_14_0= ruleExpression )
            // InternalSparrow.g:3483:5: lv_condition_14_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getClickSendSmsAccess().getConditionExpressionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_14_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickSendSmsRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleClickSendSms"


    // $ANTLR start "entryRuleSlackPUT"
    // InternalSparrow.g:3504:1: entryRuleSlackPUT returns [EObject current=null] : iv_ruleSlackPUT= ruleSlackPUT EOF ;
    public final EObject entryRuleSlackPUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlackPUT = null;


        try {
            // InternalSparrow.g:3504:49: (iv_ruleSlackPUT= ruleSlackPUT EOF )
            // InternalSparrow.g:3505:2: iv_ruleSlackPUT= ruleSlackPUT EOF
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
    // InternalSparrow.g:3511:1: ruleSlackPUT returns [EObject current=null] : (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) ;
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
        EObject lv_condition_12_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3517:2: ( (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3518:2: (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3518:2: (otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            // InternalSparrow.g:3519:3: otherlv_0= 'slackput' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'to' ( (lv_team_4_0= RULE_STRING ) ) otherlv_5= 'on' ( (lv_channel_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= RULE_STRING ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSlackPUTAccess().getSlackputKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSlackPUTAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3527:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3528:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3528:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3529:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_3=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSlackPUTAccess().getToKeyword_3());
            		
            // InternalSparrow.g:3549:3: ( (lv_team_4_0= RULE_STRING ) )
            // InternalSparrow.g:3550:4: (lv_team_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3550:4: (lv_team_4_0= RULE_STRING )
            // InternalSparrow.g:3551:5: lv_team_4_0= RULE_STRING
            {
            lv_team_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSlackPUTAccess().getOnKeyword_5());
            		
            // InternalSparrow.g:3571:3: ( (lv_channel_6_0= RULE_STRING ) )
            // InternalSparrow.g:3572:4: (lv_channel_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3572:4: (lv_channel_6_0= RULE_STRING )
            // InternalSparrow.g:3573:5: lv_channel_6_0= RULE_STRING
            {
            lv_channel_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSlackPUTAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSlackPUTAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:3597:3: ( (lv_value_9_0= RULE_STRING ) )
            // InternalSparrow.g:3598:4: (lv_value_9_0= RULE_STRING )
            {
            // InternalSparrow.g:3598:4: (lv_value_9_0= RULE_STRING )
            // InternalSparrow.g:3599:5: lv_value_9_0= RULE_STRING
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

            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getSlackPUTAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getSlackPUTAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:3623:3: ( (lv_condition_12_0= ruleExpression ) )
            // InternalSparrow.g:3624:4: (lv_condition_12_0= ruleExpression )
            {
            // InternalSparrow.g:3624:4: (lv_condition_12_0= ruleExpression )
            // InternalSparrow.g:3625:5: lv_condition_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSlackPUTAccess().getConditionExpressionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSlackPUTRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleSlackPUT"


    // $ANTLR start "entryRuleCopydata"
    // InternalSparrow.g:3646:1: entryRuleCopydata returns [EObject current=null] : iv_ruleCopydata= ruleCopydata EOF ;
    public final EObject entryRuleCopydata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopydata = null;


        try {
            // InternalSparrow.g:3646:49: (iv_ruleCopydata= ruleCopydata EOF )
            // InternalSparrow.g:3647:2: iv_ruleCopydata= ruleCopydata EOF
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
    // InternalSparrow.g:3653:1: ruleCopydata returns [EObject current=null] : (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_9_0 = null;

        EObject lv_condition_12_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3659:2: ( (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3660:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3660:2: (otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) ) )
            // InternalSparrow.g:3661:3: otherlv_0= 'copydata' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'using' otherlv_8= '{' ( (lv_value_9_0= ruleSelectStatement ) ) otherlv_10= '}' otherlv_11= 'on-condition' ( (lv_condition_12_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCopydataAccess().getCopydataKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCopydataAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3669:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3670:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3670:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3671:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCopydataAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:3691:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:3692:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3692:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:3693:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_5=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCopydataAccess().getToKeyword_5());
            		
            // InternalSparrow.g:3713:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:3714:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3714:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:3715:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCopydataAccess().getUsingKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCopydataAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSparrow.g:3739:3: ( (lv_value_9_0= ruleSelectStatement ) )
            // InternalSparrow.g:3740:4: (lv_value_9_0= ruleSelectStatement )
            {
            // InternalSparrow.g:3740:4: (lv_value_9_0= ruleSelectStatement )
            // InternalSparrow.g:3741:5: lv_value_9_0= ruleSelectStatement
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

            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getCopydataAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getCopydataAccess().getOnConditionKeyword_11());
            		
            // InternalSparrow.g:3766:3: ( (lv_condition_12_0= ruleExpression ) )
            // InternalSparrow.g:3767:4: (lv_condition_12_0= ruleExpression )
            {
            // InternalSparrow.g:3767:4: (lv_condition_12_0= ruleExpression )
            // InternalSparrow.g:3768:5: lv_condition_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCopydataAccess().getConditionExpressionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopydataRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_12_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleCopydata"


    // $ANTLR start "entryRuleWriteCsv"
    // InternalSparrow.g:3789:1: entryRuleWriteCsv returns [EObject current=null] : iv_ruleWriteCsv= ruleWriteCsv EOF ;
    public final EObject entryRuleWriteCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteCsv = null;


        try {
            // InternalSparrow.g:3789:49: (iv_ruleWriteCsv= ruleWriteCsv EOF )
            // InternalSparrow.g:3790:2: iv_ruleWriteCsv= ruleWriteCsv EOF
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
    // InternalSparrow.g:3796:1: ruleWriteCsv returns [EObject current=null] : (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_11_0 = null;

        EObject lv_condition_14_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3802:2: ( (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3803:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3803:2: (otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            // InternalSparrow.g:3804:3: otherlv_0= 'writecsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteCsvAccess().getWritecsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWriteCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3812:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3813:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3813:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3814:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWriteCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:3834:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:3835:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:3835:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:3836:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_5=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getWriteCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:3856:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:3857:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:3857:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:3858:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            otherlv_7=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getWriteCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:3878:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:3879:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:3879:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:3880:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getWriteCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getWriteCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:3904:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:3905:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:3905:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:3906:5: lv_value_11_0= ruleSelectStatement
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

            otherlv_12=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getWriteCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getWriteCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:3931:3: ( (lv_condition_14_0= ruleExpression ) )
            // InternalSparrow.g:3932:4: (lv_condition_14_0= ruleExpression )
            {
            // InternalSparrow.g:3932:4: (lv_condition_14_0= ruleExpression )
            // InternalSparrow.g:3933:5: lv_condition_14_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWriteCsvAccess().getConditionExpressionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_14_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteCsvRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleWriteCsv"


    // $ANTLR start "entryRuleLoadCsv"
    // InternalSparrow.g:3954:1: entryRuleLoadCsv returns [EObject current=null] : iv_ruleLoadCsv= ruleLoadCsv EOF ;
    public final EObject entryRuleLoadCsv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadCsv = null;


        try {
            // InternalSparrow.g:3954:48: (iv_ruleLoadCsv= ruleLoadCsv EOF )
            // InternalSparrow.g:3955:2: iv_ruleLoadCsv= ruleLoadCsv EOF
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
    // InternalSparrow.g:3961:1: ruleLoadCsv returns [EObject current=null] : (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_11_0 = null;

        EObject lv_condition_14_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:3967:2: ( (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) ) )
            // InternalSparrow.g:3968:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:3968:2: (otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) ) )
            // InternalSparrow.g:3969:3: otherlv_0= 'loadcsv' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'from' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_to_6_0= RULE_STRING ) ) otherlv_7= 'with' ( (lv_delim_8_0= RULE_STRING ) ) otherlv_9= 'using' otherlv_10= '{' ( (lv_value_11_0= ruleSelectStatement ) ) otherlv_12= '}' otherlv_13= 'on-condition' ( (lv_condition_14_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadCsvAccess().getLoadcsvKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadCsvAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:3977:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:3978:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:3978:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:3979:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadCsvAccess().getFromKeyword_3());
            		
            // InternalSparrow.g:3999:3: ( (lv_source_4_0= RULE_STRING ) )
            // InternalSparrow.g:4000:4: (lv_source_4_0= RULE_STRING )
            {
            // InternalSparrow.g:4000:4: (lv_source_4_0= RULE_STRING )
            // InternalSparrow.g:4001:5: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            otherlv_5=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadCsvAccess().getToKeyword_5());
            		
            // InternalSparrow.g:4021:3: ( (lv_to_6_0= RULE_STRING ) )
            // InternalSparrow.g:4022:4: (lv_to_6_0= RULE_STRING )
            {
            // InternalSparrow.g:4022:4: (lv_to_6_0= RULE_STRING )
            // InternalSparrow.g:4023:5: lv_to_6_0= RULE_STRING
            {
            lv_to_6_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            otherlv_7=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadCsvAccess().getWithKeyword_7());
            		
            // InternalSparrow.g:4043:3: ( (lv_delim_8_0= RULE_STRING ) )
            // InternalSparrow.g:4044:4: (lv_delim_8_0= RULE_STRING )
            {
            // InternalSparrow.g:4044:4: (lv_delim_8_0= RULE_STRING )
            // InternalSparrow.g:4045:5: lv_delim_8_0= RULE_STRING
            {
            lv_delim_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getLoadCsvAccess().getUsingKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getLoadCsvAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSparrow.g:4069:3: ( (lv_value_11_0= ruleSelectStatement ) )
            // InternalSparrow.g:4070:4: (lv_value_11_0= ruleSelectStatement )
            {
            // InternalSparrow.g:4070:4: (lv_value_11_0= ruleSelectStatement )
            // InternalSparrow.g:4071:5: lv_value_11_0= ruleSelectStatement
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

            otherlv_12=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getLoadCsvAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getLoadCsvAccess().getOnConditionKeyword_13());
            		
            // InternalSparrow.g:4096:3: ( (lv_condition_14_0= ruleExpression ) )
            // InternalSparrow.g:4097:4: (lv_condition_14_0= ruleExpression )
            {
            // InternalSparrow.g:4097:4: (lv_condition_14_0= ruleExpression )
            // InternalSparrow.g:4098:5: lv_condition_14_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLoadCsvAccess().getConditionExpressionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_14_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadCsvRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleLoadCsv"


    // $ANTLR start "entryRuleTransform"
    // InternalSparrow.g:4119:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalSparrow.g:4119:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalSparrow.g:4120:2: iv_ruleTransform= ruleTransform EOF
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
    // InternalSparrow.g:4126:1: ruleTransform returns [EObject current=null] : (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) ) ;
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
        AntlrDatatypeRuleToken lv_value_7_0 = null;

        EObject lv_condition_10_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:4132:2: ( (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) ) )
            // InternalSparrow.g:4133:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) )
            {
            // InternalSparrow.g:4133:2: (otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) ) )
            // InternalSparrow.g:4134:3: otherlv_0= 'transform' otherlv_1= 'as' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'on' ( (lv_on_4_0= RULE_STRING ) ) otherlv_5= 'using' otherlv_6= '{' ( (lv_value_7_0= ruleNonSelectStatement ) ) otherlv_8= '}' otherlv_9= 'on-condition' ( (lv_condition_10_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformAccess().getTransformKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getAsKeyword_1());
            		
            // InternalSparrow.g:4142:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSparrow.g:4143:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSparrow.g:4143:4: (lv_name_2_0= RULE_STRING )
            // InternalSparrow.g:4144:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransformAccess().getOnKeyword_3());
            		
            // InternalSparrow.g:4164:3: ( (lv_on_4_0= RULE_STRING ) )
            // InternalSparrow.g:4165:4: (lv_on_4_0= RULE_STRING )
            {
            // InternalSparrow.g:4165:4: (lv_on_4_0= RULE_STRING )
            // InternalSparrow.g:4166:5: lv_on_4_0= RULE_STRING
            {
            lv_on_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTransformAccess().getUsingKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSparrow.g:4190:3: ( (lv_value_7_0= ruleNonSelectStatement ) )
            // InternalSparrow.g:4191:4: (lv_value_7_0= ruleNonSelectStatement )
            {
            // InternalSparrow.g:4191:4: (lv_value_7_0= ruleNonSelectStatement )
            // InternalSparrow.g:4192:5: lv_value_7_0= ruleNonSelectStatement
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

            otherlv_8=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getTransformAccess().getOnConditionKeyword_9());
            		
            // InternalSparrow.g:4217:3: ( (lv_condition_10_0= ruleExpression ) )
            // InternalSparrow.g:4218:4: (lv_condition_10_0= ruleExpression )
            {
            // InternalSparrow.g:4218:4: (lv_condition_10_0= ruleExpression )
            // InternalSparrow.g:4219:5: lv_condition_10_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTransformAccess().getConditionExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_10_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_10_0,
            						"org.etl.Sparrow.Expression");
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
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalSparrow.g:4240:1: entryRuleSelectStatement returns [String current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final String entryRuleSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStatement = null;


        try {
            // InternalSparrow.g:4240:55: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalSparrow.g:4241:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalSparrow.g:4247:1: ruleSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:4253:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:4254:2: this_STRING_0= RULE_STRING
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
    // InternalSparrow.g:4264:1: entryRuleNonSelectStatement returns [String current=null] : iv_ruleNonSelectStatement= ruleNonSelectStatement EOF ;
    public final String entryRuleNonSelectStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonSelectStatement = null;


        try {
            // InternalSparrow.g:4264:58: (iv_ruleNonSelectStatement= ruleNonSelectStatement EOF )
            // InternalSparrow.g:4265:2: iv_ruleNonSelectStatement= ruleNonSelectStatement EOF
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
    // InternalSparrow.g:4271:1: ruleNonSelectStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNonSelectStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:4277:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:4278:2: this_STRING_0= RULE_STRING
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
    // InternalSparrow.g:4288:1: entryRuleCreateStatement returns [String current=null] : iv_ruleCreateStatement= ruleCreateStatement EOF ;
    public final String entryRuleCreateStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCreateStatement = null;


        try {
            // InternalSparrow.g:4288:55: (iv_ruleCreateStatement= ruleCreateStatement EOF )
            // InternalSparrow.g:4289:2: iv_ruleCreateStatement= ruleCreateStatement EOF
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
    // InternalSparrow.g:4295:1: ruleCreateStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCreateStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSparrow.g:4301:2: (this_STRING_0= RULE_STRING )
            // InternalSparrow.g:4302:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleExpression"
    // InternalSparrow.g:4312:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSparrow.g:4312:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSparrow.g:4313:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSparrow.g:4319:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'if' ( (lv_lhs_1_0= RULE_STRING ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_rhs_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lhs_1_0=null;
        Token lv_rhs_3_0=null;
        AntlrDatatypeRuleToken lv_operator_2_0 = null;



        	enterRule();

        try {
            // InternalSparrow.g:4325:2: ( (otherlv_0= 'if' ( (lv_lhs_1_0= RULE_STRING ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_rhs_3_0= RULE_STRING ) ) ) )
            // InternalSparrow.g:4326:2: (otherlv_0= 'if' ( (lv_lhs_1_0= RULE_STRING ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_rhs_3_0= RULE_STRING ) ) )
            {
            // InternalSparrow.g:4326:2: (otherlv_0= 'if' ( (lv_lhs_1_0= RULE_STRING ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_rhs_3_0= RULE_STRING ) ) )
            // InternalSparrow.g:4327:3: otherlv_0= 'if' ( (lv_lhs_1_0= RULE_STRING ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_rhs_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getIfKeyword_0());
            		
            // InternalSparrow.g:4331:3: ( (lv_lhs_1_0= RULE_STRING ) )
            // InternalSparrow.g:4332:4: (lv_lhs_1_0= RULE_STRING )
            {
            // InternalSparrow.g:4332:4: (lv_lhs_1_0= RULE_STRING )
            // InternalSparrow.g:4333:5: lv_lhs_1_0= RULE_STRING
            {
            lv_lhs_1_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            					newLeafNode(lv_lhs_1_0, grammarAccess.getExpressionAccess().getLhsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lhs",
            						lv_lhs_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSparrow.g:4349:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalSparrow.g:4350:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalSparrow.g:4350:4: (lv_operator_2_0= ruleOperator )
            // InternalSparrow.g:4351:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getOperatorOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.etl.Sparrow.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSparrow.g:4368:3: ( (lv_rhs_3_0= RULE_STRING ) )
            // InternalSparrow.g:4369:4: (lv_rhs_3_0= RULE_STRING )
            {
            // InternalSparrow.g:4369:4: (lv_rhs_3_0= RULE_STRING )
            // InternalSparrow.g:4370:5: lv_rhs_3_0= RULE_STRING
            {
            lv_rhs_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_rhs_3_0, grammarAccess.getExpressionAccess().getRhsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rhs",
            						lv_rhs_3_0,
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperator"
    // InternalSparrow.g:4390:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalSparrow.g:4390:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalSparrow.g:4391:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalSparrow.g:4397:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '==' | kw= 'contains' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSparrow.g:4403:2: ( (kw= '<' | kw= '>' | kw= '==' | kw= 'contains' ) )
            // InternalSparrow.g:4404:2: (kw= '<' | kw= '>' | kw= '==' | kw= 'contains' )
            {
            // InternalSparrow.g:4404:2: (kw= '<' | kw= '>' | kw= '==' | kw= 'contains' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt6=1;
                }
                break;
            case 77:
                {
                alt6=2;
                }
                break;
            case 78:
                {
                alt6=3;
                }
                break;
            case 79:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSparrow.g:4405:3: kw= '<'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSparrow.g:4411:3: kw= '>'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSparrow.g:4417:3: kw= '=='
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSparrow.g:4423:3: kw= 'contains'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getContainsKeyword_3());
                    		

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
    // $ANTLR end "ruleOperator"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2A400A8E18022000L,0x00000000000007D2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});

}