package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algorithme'", "'Fichier'", "'Delimiteur'", "'Predire'", "'TR'", "'SVM'", "'Linear'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_regressions_0_0= ruleRegression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_regressions_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_regressions_0_0= ruleRegression ) ) )
            // InternalMyDsl.g:79:2: ( (lv_regressions_0_0= ruleRegression ) )
            {
            // InternalMyDsl.g:79:2: ( (lv_regressions_0_0= ruleRegression ) )
            // InternalMyDsl.g:80:3: (lv_regressions_0_0= ruleRegression )
            {
            // InternalMyDsl.g:80:3: (lv_regressions_0_0= ruleRegression )
            // InternalMyDsl.g:81:4: lv_regressions_0_0= ruleRegression
            {

            				newCompositeNode(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_regressions_0_0=ruleRegression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"regressions",
            					lv_regressions_0_0,
            					"org.xtext.example.mydsl.MyDsl.Regression");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRegression"
    // InternalMyDsl.g:101:1: entryRuleRegression returns [EObject current=null] : iv_ruleRegression= ruleRegression EOF ;
    public final EObject entryRuleRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegression = null;


        try {
            // InternalMyDsl.g:101:51: (iv_ruleRegression= ruleRegression EOF )
            // InternalMyDsl.g:102:2: iv_ruleRegression= ruleRegression EOF
            {
             newCompositeNode(grammarAccess.getRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegression=ruleRegression();

            state._fsp--;

             current =iv_ruleRegression; 
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
    // $ANTLR end "entryRuleRegression"


    // $ANTLR start "ruleRegression"
    // InternalMyDsl.g:108:1: ruleRegression returns [EObject current=null] : ( ( (lv_fichier_0_0= ruleFichier ) ) ( (lv_delimiteur_1_0= ruleDelimiteur ) ) otherlv_2= 'Algorithme' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ( (lv_predire_4_0= rulePredire ) ) ) ;
    public final EObject ruleRegression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_fichier_0_0 = null;

        EObject lv_delimiteur_1_0 = null;

        Enumerator lv_algorithme_3_0 = null;

        EObject lv_predire_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( ( ( (lv_fichier_0_0= ruleFichier ) ) ( (lv_delimiteur_1_0= ruleDelimiteur ) ) otherlv_2= 'Algorithme' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ( (lv_predire_4_0= rulePredire ) ) ) )
            // InternalMyDsl.g:115:2: ( ( (lv_fichier_0_0= ruleFichier ) ) ( (lv_delimiteur_1_0= ruleDelimiteur ) ) otherlv_2= 'Algorithme' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ( (lv_predire_4_0= rulePredire ) ) )
            {
            // InternalMyDsl.g:115:2: ( ( (lv_fichier_0_0= ruleFichier ) ) ( (lv_delimiteur_1_0= ruleDelimiteur ) ) otherlv_2= 'Algorithme' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ( (lv_predire_4_0= rulePredire ) ) )
            // InternalMyDsl.g:116:3: ( (lv_fichier_0_0= ruleFichier ) ) ( (lv_delimiteur_1_0= ruleDelimiteur ) ) otherlv_2= 'Algorithme' ( (lv_algorithme_3_0= ruleAlgorithme ) ) ( (lv_predire_4_0= rulePredire ) )
            {
            // InternalMyDsl.g:116:3: ( (lv_fichier_0_0= ruleFichier ) )
            // InternalMyDsl.g:117:4: (lv_fichier_0_0= ruleFichier )
            {
            // InternalMyDsl.g:117:4: (lv_fichier_0_0= ruleFichier )
            // InternalMyDsl.g:118:5: lv_fichier_0_0= ruleFichier
            {

            					newCompositeNode(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fichier_0_0=ruleFichier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegressionRule());
            					}
            					set(
            						current,
            						"fichier",
            						lv_fichier_0_0,
            						"org.xtext.example.mydsl.MyDsl.Fichier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:135:3: ( (lv_delimiteur_1_0= ruleDelimiteur ) )
            // InternalMyDsl.g:136:4: (lv_delimiteur_1_0= ruleDelimiteur )
            {
            // InternalMyDsl.g:136:4: (lv_delimiteur_1_0= ruleDelimiteur )
            // InternalMyDsl.g:137:5: lv_delimiteur_1_0= ruleDelimiteur
            {

            					newCompositeNode(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_delimiteur_1_0=ruleDelimiteur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegressionRule());
            					}
            					set(
            						current,
            						"delimiteur",
            						lv_delimiteur_1_0,
            						"org.xtext.example.mydsl.MyDsl.Delimiteur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2());
            		
            // InternalMyDsl.g:158:3: ( (lv_algorithme_3_0= ruleAlgorithme ) )
            // InternalMyDsl.g:159:4: (lv_algorithme_3_0= ruleAlgorithme )
            {
            // InternalMyDsl.g:159:4: (lv_algorithme_3_0= ruleAlgorithme )
            // InternalMyDsl.g:160:5: lv_algorithme_3_0= ruleAlgorithme
            {

            					newCompositeNode(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_algorithme_3_0=ruleAlgorithme();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegressionRule());
            					}
            					set(
            						current,
            						"algorithme",
            						lv_algorithme_3_0,
            						"org.xtext.example.mydsl.MyDsl.Algorithme");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:177:3: ( (lv_predire_4_0= rulePredire ) )
            // InternalMyDsl.g:178:4: (lv_predire_4_0= rulePredire )
            {
            // InternalMyDsl.g:178:4: (lv_predire_4_0= rulePredire )
            // InternalMyDsl.g:179:5: lv_predire_4_0= rulePredire
            {

            					newCompositeNode(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_predire_4_0=rulePredire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegressionRule());
            					}
            					set(
            						current,
            						"predire",
            						lv_predire_4_0,
            						"org.xtext.example.mydsl.MyDsl.Predire");
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
    // $ANTLR end "ruleRegression"


    // $ANTLR start "entryRuleFichier"
    // InternalMyDsl.g:200:1: entryRuleFichier returns [EObject current=null] : iv_ruleFichier= ruleFichier EOF ;
    public final EObject entryRuleFichier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichier = null;


        try {
            // InternalMyDsl.g:200:48: (iv_ruleFichier= ruleFichier EOF )
            // InternalMyDsl.g:201:2: iv_ruleFichier= ruleFichier EOF
            {
             newCompositeNode(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFichier=ruleFichier();

            state._fsp--;

             current =iv_ruleFichier; 
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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalMyDsl.g:207:1: ruleFichier returns [EObject current=null] : (otherlv_0= 'Fichier' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFichier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (otherlv_0= 'Fichier' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:214:2: (otherlv_0= 'Fichier' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:214:2: (otherlv_0= 'Fichier' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:215:3: otherlv_0= 'Fichier' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFichierAccess().getFichierKeyword_0());
            		
            // InternalMyDsl.g:219:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:220:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:220:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:221:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFichierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleDelimiteur"
    // InternalMyDsl.g:241:1: entryRuleDelimiteur returns [EObject current=null] : iv_ruleDelimiteur= ruleDelimiteur EOF ;
    public final EObject entryRuleDelimiteur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelimiteur = null;


        try {
            // InternalMyDsl.g:241:51: (iv_ruleDelimiteur= ruleDelimiteur EOF )
            // InternalMyDsl.g:242:2: iv_ruleDelimiteur= ruleDelimiteur EOF
            {
             newCompositeNode(grammarAccess.getDelimiteurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelimiteur=ruleDelimiteur();

            state._fsp--;

             current =iv_ruleDelimiteur; 
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
    // $ANTLR end "entryRuleDelimiteur"


    // $ANTLR start "ruleDelimiteur"
    // InternalMyDsl.g:248:1: ruleDelimiteur returns [EObject current=null] : (otherlv_0= 'Delimiteur' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDelimiteur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'Delimiteur' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'Delimiteur' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'Delimiteur' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:256:3: otherlv_0= 'Delimiteur' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:261:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:261:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:262:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelimiteurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleDelimiteur"


    // $ANTLR start "entryRulePredire"
    // InternalMyDsl.g:282:1: entryRulePredire returns [EObject current=null] : iv_rulePredire= rulePredire EOF ;
    public final EObject entryRulePredire() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredire = null;


        try {
            // InternalMyDsl.g:282:48: (iv_rulePredire= rulePredire EOF )
            // InternalMyDsl.g:283:2: iv_rulePredire= rulePredire EOF
            {
             newCompositeNode(grammarAccess.getPredireRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredire=rulePredire();

            state._fsp--;

             current =iv_rulePredire; 
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
    // $ANTLR end "entryRulePredire"


    // $ANTLR start "rulePredire"
    // InternalMyDsl.g:289:1: rulePredire returns [EObject current=null] : (otherlv_0= 'Predire' ( (lv_pourcentage_1_0= RULE_INT ) ) ) ;
    public final EObject rulePredire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pourcentage_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( (otherlv_0= 'Predire' ( (lv_pourcentage_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:296:2: (otherlv_0= 'Predire' ( (lv_pourcentage_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:296:2: (otherlv_0= 'Predire' ( (lv_pourcentage_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:297:3: otherlv_0= 'Predire' ( (lv_pourcentage_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPredireAccess().getPredireKeyword_0());
            		
            // InternalMyDsl.g:301:3: ( (lv_pourcentage_1_0= RULE_INT ) )
            // InternalMyDsl.g:302:4: (lv_pourcentage_1_0= RULE_INT )
            {
            // InternalMyDsl.g:302:4: (lv_pourcentage_1_0= RULE_INT )
            // InternalMyDsl.g:303:5: lv_pourcentage_1_0= RULE_INT
            {
            lv_pourcentage_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_pourcentage_1_0, grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pourcentage",
            						lv_pourcentage_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulePredire"


    // $ANTLR start "ruleAlgorithme"
    // InternalMyDsl.g:323:1: ruleAlgorithme returns [Enumerator current=null] : ( (enumLiteral_0= 'TR' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) ) ;
    public final Enumerator ruleAlgorithme() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:329:2: ( ( (enumLiteral_0= 'TR' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) ) )
            // InternalMyDsl.g:330:2: ( (enumLiteral_0= 'TR' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) )
            {
            // InternalMyDsl.g:330:2: ( (enumLiteral_0= 'TR' ) | (enumLiteral_1= 'SVM' ) | (enumLiteral_2= 'Linear' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:331:3: (enumLiteral_0= 'TR' )
                    {
                    // InternalMyDsl.g:331:3: (enumLiteral_0= 'TR' )
                    // InternalMyDsl.g:332:4: enumLiteral_0= 'TR'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:339:3: (enumLiteral_1= 'SVM' )
                    {
                    // InternalMyDsl.g:339:3: (enumLiteral_1= 'SVM' )
                    // InternalMyDsl.g:340:4: enumLiteral_1= 'SVM'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:347:3: (enumLiteral_2= 'Linear' )
                    {
                    // InternalMyDsl.g:347:3: (enumLiteral_2= 'Linear' )
                    // InternalMyDsl.g:348:4: enumLiteral_2= 'Linear'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleAlgorithme"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}