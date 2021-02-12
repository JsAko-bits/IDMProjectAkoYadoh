package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TR'", "'SVM'", "'Linear'", "'Algorithme'", "'Fichier'", "'Delimiteur'", "'Predire'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__RegressionsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__RegressionsAssignment ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__RegressionsAssignment ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__RegressionsAssignment ) )
            // InternalMyDsl.g:68:3: ( rule__Model__RegressionsAssignment )
            {
             before(grammarAccess.getModelAccess().getRegressionsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__RegressionsAssignment )
            // InternalMyDsl.g:69:4: rule__Model__RegressionsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__RegressionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRegressionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRegression"
    // InternalMyDsl.g:78:1: entryRuleRegression : ruleRegression EOF ;
    public final void entryRuleRegression() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRegression EOF )
            // InternalMyDsl.g:80:1: ruleRegression EOF
            {
             before(grammarAccess.getRegressionRule()); 
            pushFollow(FOLLOW_1);
            ruleRegression();

            state._fsp--;

             after(grammarAccess.getRegressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegression"


    // $ANTLR start "ruleRegression"
    // InternalMyDsl.g:87:1: ruleRegression : ( ( rule__Regression__Group__0 ) ) ;
    public final void ruleRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Regression__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Regression__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Regression__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Regression__Group__0 )
            {
             before(grammarAccess.getRegressionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Regression__Group__0 )
            // InternalMyDsl.g:94:4: rule__Regression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Regression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegression"


    // $ANTLR start "entryRuleFichier"
    // InternalMyDsl.g:103:1: entryRuleFichier : ruleFichier EOF ;
    public final void entryRuleFichier() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFichier EOF )
            // InternalMyDsl.g:105:1: ruleFichier EOF
            {
             before(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            ruleFichier();

            state._fsp--;

             after(grammarAccess.getFichierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalMyDsl.g:112:1: ruleFichier : ( ( rule__Fichier__Group__0 ) ) ;
    public final void ruleFichier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Fichier__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Fichier__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Fichier__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Fichier__Group__0 )
            {
             before(grammarAccess.getFichierAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Fichier__Group__0 )
            // InternalMyDsl.g:119:4: rule__Fichier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleDelimiteur"
    // InternalMyDsl.g:128:1: entryRuleDelimiteur : ruleDelimiteur EOF ;
    public final void entryRuleDelimiteur() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleDelimiteur EOF )
            // InternalMyDsl.g:130:1: ruleDelimiteur EOF
            {
             before(grammarAccess.getDelimiteurRule()); 
            pushFollow(FOLLOW_1);
            ruleDelimiteur();

            state._fsp--;

             after(grammarAccess.getDelimiteurRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelimiteur"


    // $ANTLR start "ruleDelimiteur"
    // InternalMyDsl.g:137:1: ruleDelimiteur : ( ( rule__Delimiteur__Group__0 ) ) ;
    public final void ruleDelimiteur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Delimiteur__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Delimiteur__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Delimiteur__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Delimiteur__Group__0 )
            {
             before(grammarAccess.getDelimiteurAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Delimiteur__Group__0 )
            // InternalMyDsl.g:144:4: rule__Delimiteur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delimiteur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelimiteurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelimiteur"


    // $ANTLR start "entryRulePredire"
    // InternalMyDsl.g:153:1: entryRulePredire : rulePredire EOF ;
    public final void entryRulePredire() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePredire EOF )
            // InternalMyDsl.g:155:1: rulePredire EOF
            {
             before(grammarAccess.getPredireRule()); 
            pushFollow(FOLLOW_1);
            rulePredire();

            state._fsp--;

             after(grammarAccess.getPredireRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredire"


    // $ANTLR start "rulePredire"
    // InternalMyDsl.g:162:1: rulePredire : ( ( rule__Predire__Group__0 ) ) ;
    public final void rulePredire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Predire__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Predire__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Predire__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Predire__Group__0 )
            {
             before(grammarAccess.getPredireAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Predire__Group__0 )
            // InternalMyDsl.g:169:4: rule__Predire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredire"


    // $ANTLR start "ruleAlgorithme"
    // InternalMyDsl.g:178:1: ruleAlgorithme : ( ( rule__Algorithme__Alternatives ) ) ;
    public final void ruleAlgorithme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__Algorithme__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__Algorithme__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__Algorithme__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__Algorithme__Alternatives )
            {
             before(grammarAccess.getAlgorithmeAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__Algorithme__Alternatives )
            // InternalMyDsl.g:185:4: rule__Algorithme__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "rule__Algorithme__Alternatives"
    // InternalMyDsl.g:193:1: rule__Algorithme__Alternatives : ( ( ( 'TR' ) ) | ( ( 'SVM' ) ) | ( ( 'Linear' ) ) );
    public final void rule__Algorithme__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( ( 'TR' ) ) | ( ( 'SVM' ) ) | ( ( 'Linear' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
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
                    // InternalMyDsl.g:198:2: ( ( 'TR' ) )
                    {
                    // InternalMyDsl.g:198:2: ( ( 'TR' ) )
                    // InternalMyDsl.g:199:3: ( 'TR' )
                    {
                     before(grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:200:3: ( 'TR' )
                    // InternalMyDsl.g:200:4: 'TR'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:2: ( ( 'SVM' ) )
                    {
                    // InternalMyDsl.g:204:2: ( ( 'SVM' ) )
                    // InternalMyDsl.g:205:3: ( 'SVM' )
                    {
                     before(grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:206:3: ( 'SVM' )
                    // InternalMyDsl.g:206:4: 'SVM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:210:2: ( ( 'Linear' ) )
                    {
                    // InternalMyDsl.g:210:2: ( ( 'Linear' ) )
                    // InternalMyDsl.g:211:3: ( 'Linear' )
                    {
                     before(grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:212:3: ( 'Linear' )
                    // InternalMyDsl.g:212:4: 'Linear'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Alternatives"


    // $ANTLR start "rule__Regression__Group__0"
    // InternalMyDsl.g:220:1: rule__Regression__Group__0 : rule__Regression__Group__0__Impl rule__Regression__Group__1 ;
    public final void rule__Regression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:224:1: ( rule__Regression__Group__0__Impl rule__Regression__Group__1 )
            // InternalMyDsl.g:225:2: rule__Regression__Group__0__Impl rule__Regression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Regression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__0"


    // $ANTLR start "rule__Regression__Group__0__Impl"
    // InternalMyDsl.g:232:1: rule__Regression__Group__0__Impl : ( ( rule__Regression__FichierAssignment_0 ) ) ;
    public final void rule__Regression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:236:1: ( ( ( rule__Regression__FichierAssignment_0 ) ) )
            // InternalMyDsl.g:237:1: ( ( rule__Regression__FichierAssignment_0 ) )
            {
            // InternalMyDsl.g:237:1: ( ( rule__Regression__FichierAssignment_0 ) )
            // InternalMyDsl.g:238:2: ( rule__Regression__FichierAssignment_0 )
            {
             before(grammarAccess.getRegressionAccess().getFichierAssignment_0()); 
            // InternalMyDsl.g:239:2: ( rule__Regression__FichierAssignment_0 )
            // InternalMyDsl.g:239:3: rule__Regression__FichierAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Regression__FichierAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegressionAccess().getFichierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__0__Impl"


    // $ANTLR start "rule__Regression__Group__1"
    // InternalMyDsl.g:247:1: rule__Regression__Group__1 : rule__Regression__Group__1__Impl rule__Regression__Group__2 ;
    public final void rule__Regression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( rule__Regression__Group__1__Impl rule__Regression__Group__2 )
            // InternalMyDsl.g:252:2: rule__Regression__Group__1__Impl rule__Regression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Regression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__1"


    // $ANTLR start "rule__Regression__Group__1__Impl"
    // InternalMyDsl.g:259:1: rule__Regression__Group__1__Impl : ( ( rule__Regression__DelimiteurAssignment_1 ) ) ;
    public final void rule__Regression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:263:1: ( ( ( rule__Regression__DelimiteurAssignment_1 ) ) )
            // InternalMyDsl.g:264:1: ( ( rule__Regression__DelimiteurAssignment_1 ) )
            {
            // InternalMyDsl.g:264:1: ( ( rule__Regression__DelimiteurAssignment_1 ) )
            // InternalMyDsl.g:265:2: ( rule__Regression__DelimiteurAssignment_1 )
            {
             before(grammarAccess.getRegressionAccess().getDelimiteurAssignment_1()); 
            // InternalMyDsl.g:266:2: ( rule__Regression__DelimiteurAssignment_1 )
            // InternalMyDsl.g:266:3: rule__Regression__DelimiteurAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Regression__DelimiteurAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegressionAccess().getDelimiteurAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__1__Impl"


    // $ANTLR start "rule__Regression__Group__2"
    // InternalMyDsl.g:274:1: rule__Regression__Group__2 : rule__Regression__Group__2__Impl rule__Regression__Group__3 ;
    public final void rule__Regression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( rule__Regression__Group__2__Impl rule__Regression__Group__3 )
            // InternalMyDsl.g:279:2: rule__Regression__Group__2__Impl rule__Regression__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Regression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__2"


    // $ANTLR start "rule__Regression__Group__2__Impl"
    // InternalMyDsl.g:286:1: rule__Regression__Group__2__Impl : ( 'Algorithme' ) ;
    public final void rule__Regression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:290:1: ( ( 'Algorithme' ) )
            // InternalMyDsl.g:291:1: ( 'Algorithme' )
            {
            // InternalMyDsl.g:291:1: ( 'Algorithme' )
            // InternalMyDsl.g:292:2: 'Algorithme'
            {
             before(grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__2__Impl"


    // $ANTLR start "rule__Regression__Group__3"
    // InternalMyDsl.g:301:1: rule__Regression__Group__3 : rule__Regression__Group__3__Impl rule__Regression__Group__4 ;
    public final void rule__Regression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( rule__Regression__Group__3__Impl rule__Regression__Group__4 )
            // InternalMyDsl.g:306:2: rule__Regression__Group__3__Impl rule__Regression__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Regression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Regression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__3"


    // $ANTLR start "rule__Regression__Group__3__Impl"
    // InternalMyDsl.g:313:1: rule__Regression__Group__3__Impl : ( ( rule__Regression__AlgorithmeAssignment_3 ) ) ;
    public final void rule__Regression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:317:1: ( ( ( rule__Regression__AlgorithmeAssignment_3 ) ) )
            // InternalMyDsl.g:318:1: ( ( rule__Regression__AlgorithmeAssignment_3 ) )
            {
            // InternalMyDsl.g:318:1: ( ( rule__Regression__AlgorithmeAssignment_3 ) )
            // InternalMyDsl.g:319:2: ( rule__Regression__AlgorithmeAssignment_3 )
            {
             before(grammarAccess.getRegressionAccess().getAlgorithmeAssignment_3()); 
            // InternalMyDsl.g:320:2: ( rule__Regression__AlgorithmeAssignment_3 )
            // InternalMyDsl.g:320:3: rule__Regression__AlgorithmeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Regression__AlgorithmeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegressionAccess().getAlgorithmeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__3__Impl"


    // $ANTLR start "rule__Regression__Group__4"
    // InternalMyDsl.g:328:1: rule__Regression__Group__4 : rule__Regression__Group__4__Impl ;
    public final void rule__Regression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( rule__Regression__Group__4__Impl )
            // InternalMyDsl.g:333:2: rule__Regression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Regression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__4"


    // $ANTLR start "rule__Regression__Group__4__Impl"
    // InternalMyDsl.g:339:1: rule__Regression__Group__4__Impl : ( ( rule__Regression__PredireAssignment_4 ) ) ;
    public final void rule__Regression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( ( rule__Regression__PredireAssignment_4 ) ) )
            // InternalMyDsl.g:344:1: ( ( rule__Regression__PredireAssignment_4 ) )
            {
            // InternalMyDsl.g:344:1: ( ( rule__Regression__PredireAssignment_4 ) )
            // InternalMyDsl.g:345:2: ( rule__Regression__PredireAssignment_4 )
            {
             before(grammarAccess.getRegressionAccess().getPredireAssignment_4()); 
            // InternalMyDsl.g:346:2: ( rule__Regression__PredireAssignment_4 )
            // InternalMyDsl.g:346:3: rule__Regression__PredireAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Regression__PredireAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegressionAccess().getPredireAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__Group__4__Impl"


    // $ANTLR start "rule__Fichier__Group__0"
    // InternalMyDsl.g:355:1: rule__Fichier__Group__0 : rule__Fichier__Group__0__Impl rule__Fichier__Group__1 ;
    public final void rule__Fichier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( rule__Fichier__Group__0__Impl rule__Fichier__Group__1 )
            // InternalMyDsl.g:360:2: rule__Fichier__Group__0__Impl rule__Fichier__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Fichier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__0"


    // $ANTLR start "rule__Fichier__Group__0__Impl"
    // InternalMyDsl.g:367:1: rule__Fichier__Group__0__Impl : ( 'Fichier' ) ;
    public final void rule__Fichier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( 'Fichier' ) )
            // InternalMyDsl.g:372:1: ( 'Fichier' )
            {
            // InternalMyDsl.g:372:1: ( 'Fichier' )
            // InternalMyDsl.g:373:2: 'Fichier'
            {
             before(grammarAccess.getFichierAccess().getFichierKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getFichierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__0__Impl"


    // $ANTLR start "rule__Fichier__Group__1"
    // InternalMyDsl.g:382:1: rule__Fichier__Group__1 : rule__Fichier__Group__1__Impl ;
    public final void rule__Fichier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( rule__Fichier__Group__1__Impl )
            // InternalMyDsl.g:387:2: rule__Fichier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__1"


    // $ANTLR start "rule__Fichier__Group__1__Impl"
    // InternalMyDsl.g:393:1: rule__Fichier__Group__1__Impl : ( ( rule__Fichier__NameAssignment_1 ) ) ;
    public final void rule__Fichier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( ( rule__Fichier__NameAssignment_1 ) ) )
            // InternalMyDsl.g:398:1: ( ( rule__Fichier__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:398:1: ( ( rule__Fichier__NameAssignment_1 ) )
            // InternalMyDsl.g:399:2: ( rule__Fichier__NameAssignment_1 )
            {
             before(grammarAccess.getFichierAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:400:2: ( rule__Fichier__NameAssignment_1 )
            // InternalMyDsl.g:400:3: rule__Fichier__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__1__Impl"


    // $ANTLR start "rule__Delimiteur__Group__0"
    // InternalMyDsl.g:409:1: rule__Delimiteur__Group__0 : rule__Delimiteur__Group__0__Impl rule__Delimiteur__Group__1 ;
    public final void rule__Delimiteur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( rule__Delimiteur__Group__0__Impl rule__Delimiteur__Group__1 )
            // InternalMyDsl.g:414:2: rule__Delimiteur__Group__0__Impl rule__Delimiteur__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Delimiteur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delimiteur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delimiteur__Group__0"


    // $ANTLR start "rule__Delimiteur__Group__0__Impl"
    // InternalMyDsl.g:421:1: rule__Delimiteur__Group__0__Impl : ( 'Delimiteur' ) ;
    public final void rule__Delimiteur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:425:1: ( ( 'Delimiteur' ) )
            // InternalMyDsl.g:426:1: ( 'Delimiteur' )
            {
            // InternalMyDsl.g:426:1: ( 'Delimiteur' )
            // InternalMyDsl.g:427:2: 'Delimiteur'
            {
             before(grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delimiteur__Group__0__Impl"


    // $ANTLR start "rule__Delimiteur__Group__1"
    // InternalMyDsl.g:436:1: rule__Delimiteur__Group__1 : rule__Delimiteur__Group__1__Impl ;
    public final void rule__Delimiteur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:440:1: ( rule__Delimiteur__Group__1__Impl )
            // InternalMyDsl.g:441:2: rule__Delimiteur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delimiteur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delimiteur__Group__1"


    // $ANTLR start "rule__Delimiteur__Group__1__Impl"
    // InternalMyDsl.g:447:1: rule__Delimiteur__Group__1__Impl : ( ( rule__Delimiteur__NameAssignment_1 ) ) ;
    public final void rule__Delimiteur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( ( ( rule__Delimiteur__NameAssignment_1 ) ) )
            // InternalMyDsl.g:452:1: ( ( rule__Delimiteur__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:452:1: ( ( rule__Delimiteur__NameAssignment_1 ) )
            // InternalMyDsl.g:453:2: ( rule__Delimiteur__NameAssignment_1 )
            {
             before(grammarAccess.getDelimiteurAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:454:2: ( rule__Delimiteur__NameAssignment_1 )
            // InternalMyDsl.g:454:3: rule__Delimiteur__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delimiteur__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelimiteurAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delimiteur__Group__1__Impl"


    // $ANTLR start "rule__Predire__Group__0"
    // InternalMyDsl.g:463:1: rule__Predire__Group__0 : rule__Predire__Group__0__Impl rule__Predire__Group__1 ;
    public final void rule__Predire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( rule__Predire__Group__0__Impl rule__Predire__Group__1 )
            // InternalMyDsl.g:468:2: rule__Predire__Group__0__Impl rule__Predire__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Predire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predire__Group__0"


    // $ANTLR start "rule__Predire__Group__0__Impl"
    // InternalMyDsl.g:475:1: rule__Predire__Group__0__Impl : ( 'Predire' ) ;
    public final void rule__Predire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:479:1: ( ( 'Predire' ) )
            // InternalMyDsl.g:480:1: ( 'Predire' )
            {
            // InternalMyDsl.g:480:1: ( 'Predire' )
            // InternalMyDsl.g:481:2: 'Predire'
            {
             before(grammarAccess.getPredireAccess().getPredireKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredireAccess().getPredireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predire__Group__0__Impl"


    // $ANTLR start "rule__Predire__Group__1"
    // InternalMyDsl.g:490:1: rule__Predire__Group__1 : rule__Predire__Group__1__Impl ;
    public final void rule__Predire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( rule__Predire__Group__1__Impl )
            // InternalMyDsl.g:495:2: rule__Predire__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predire__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predire__Group__1"


    // $ANTLR start "rule__Predire__Group__1__Impl"
    // InternalMyDsl.g:501:1: rule__Predire__Group__1__Impl : ( ( rule__Predire__PourcentageAssignment_1 ) ) ;
    public final void rule__Predire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( ( rule__Predire__PourcentageAssignment_1 ) ) )
            // InternalMyDsl.g:506:1: ( ( rule__Predire__PourcentageAssignment_1 ) )
            {
            // InternalMyDsl.g:506:1: ( ( rule__Predire__PourcentageAssignment_1 ) )
            // InternalMyDsl.g:507:2: ( rule__Predire__PourcentageAssignment_1 )
            {
             before(grammarAccess.getPredireAccess().getPourcentageAssignment_1()); 
            // InternalMyDsl.g:508:2: ( rule__Predire__PourcentageAssignment_1 )
            // InternalMyDsl.g:508:3: rule__Predire__PourcentageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predire__PourcentageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredireAccess().getPourcentageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predire__Group__1__Impl"


    // $ANTLR start "rule__Model__RegressionsAssignment"
    // InternalMyDsl.g:517:1: rule__Model__RegressionsAssignment : ( ruleRegression ) ;
    public final void rule__Model__RegressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ruleRegression ) )
            // InternalMyDsl.g:522:2: ( ruleRegression )
            {
            // InternalMyDsl.g:522:2: ( ruleRegression )
            // InternalMyDsl.g:523:3: ruleRegression
            {
             before(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRegression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RegressionsAssignment"


    // $ANTLR start "rule__Regression__FichierAssignment_0"
    // InternalMyDsl.g:532:1: rule__Regression__FichierAssignment_0 : ( ruleFichier ) ;
    public final void rule__Regression__FichierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( ( ruleFichier ) )
            // InternalMyDsl.g:537:2: ( ruleFichier )
            {
            // InternalMyDsl.g:537:2: ( ruleFichier )
            // InternalMyDsl.g:538:3: ruleFichier
            {
             before(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFichier();

            state._fsp--;

             after(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__FichierAssignment_0"


    // $ANTLR start "rule__Regression__DelimiteurAssignment_1"
    // InternalMyDsl.g:547:1: rule__Regression__DelimiteurAssignment_1 : ( ruleDelimiteur ) ;
    public final void rule__Regression__DelimiteurAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( ( ruleDelimiteur ) )
            // InternalMyDsl.g:552:2: ( ruleDelimiteur )
            {
            // InternalMyDsl.g:552:2: ( ruleDelimiteur )
            // InternalMyDsl.g:553:3: ruleDelimiteur
            {
             before(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelimiteur();

            state._fsp--;

             after(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__DelimiteurAssignment_1"


    // $ANTLR start "rule__Regression__AlgorithmeAssignment_3"
    // InternalMyDsl.g:562:1: rule__Regression__AlgorithmeAssignment_3 : ( ruleAlgorithme ) ;
    public final void rule__Regression__AlgorithmeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( ( ruleAlgorithme ) )
            // InternalMyDsl.g:567:2: ( ruleAlgorithme )
            {
            // InternalMyDsl.g:567:2: ( ruleAlgorithme )
            // InternalMyDsl.g:568:3: ruleAlgorithme
            {
             before(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__AlgorithmeAssignment_3"


    // $ANTLR start "rule__Regression__PredireAssignment_4"
    // InternalMyDsl.g:577:1: rule__Regression__PredireAssignment_4 : ( rulePredire ) ;
    public final void rule__Regression__PredireAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( rulePredire ) )
            // InternalMyDsl.g:582:2: ( rulePredire )
            {
            // InternalMyDsl.g:582:2: ( rulePredire )
            // InternalMyDsl.g:583:3: rulePredire
            {
             before(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePredire();

            state._fsp--;

             after(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regression__PredireAssignment_4"


    // $ANTLR start "rule__Fichier__NameAssignment_1"
    // InternalMyDsl.g:592:1: rule__Fichier__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fichier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:597:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:597:2: ( RULE_STRING )
            // InternalMyDsl.g:598:3: RULE_STRING
            {
             before(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__NameAssignment_1"


    // $ANTLR start "rule__Delimiteur__NameAssignment_1"
    // InternalMyDsl.g:607:1: rule__Delimiteur__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Delimiteur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:612:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:612:2: ( RULE_STRING )
            // InternalMyDsl.g:613:3: RULE_STRING
            {
             before(grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delimiteur__NameAssignment_1"


    // $ANTLR start "rule__Predire__PourcentageAssignment_1"
    // InternalMyDsl.g:622:1: rule__Predire__PourcentageAssignment_1 : ( RULE_INT ) ;
    public final void rule__Predire__PourcentageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:627:2: ( RULE_INT )
            {
            // InternalMyDsl.g:627:2: ( RULE_INT )
            // InternalMyDsl.g:628:3: RULE_INT
            {
             before(grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predire__PourcentageAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}