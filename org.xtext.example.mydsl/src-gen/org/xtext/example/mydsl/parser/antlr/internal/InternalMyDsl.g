/*
 * generated by Xtext 2.23.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0());
			}
			lv_regressions_0_0=ruleRegression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"regressions",
					lv_regressions_0_0,
					"org.xtext.example.mydsl.MyDsl.Regression");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRegression
entryRuleRegression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegressionRule()); }
	iv_ruleRegression=ruleRegression
	{ $current=$iv_ruleRegression.current; }
	EOF;

// Rule Regression
ruleRegression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0());
				}
				lv_fichier_0_0=ruleFichier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegressionRule());
					}
					set(
						$current,
						"fichier",
						lv_fichier_0_0,
						"org.xtext.example.mydsl.MyDsl.Fichier");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0());
				}
				lv_delimiteur_1_0=ruleDelimiteur
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegressionRule());
					}
					set(
						$current,
						"delimiteur",
						lv_delimiteur_1_0,
						"org.xtext.example.mydsl.MyDsl.Delimiteur");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='Algorithme'
		{
			newLeafNode(otherlv_2, grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0());
				}
				lv_algorithme_3_0=ruleAlgorithme
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegressionRule());
					}
					set(
						$current,
						"algorithme",
						lv_algorithme_3_0,
						"org.xtext.example.mydsl.MyDsl.Algorithme");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0());
				}
				lv_predire_4_0=rulePredire
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegressionRule());
					}
					set(
						$current,
						"predire",
						lv_predire_4_0,
						"org.xtext.example.mydsl.MyDsl.Predire");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFichier
entryRuleFichier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFichierRule()); }
	iv_ruleFichier=ruleFichier
	{ $current=$iv_ruleFichier.current; }
	EOF;

// Rule Fichier
ruleFichier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Fichier'
		{
			newLeafNode(otherlv_0, grammarAccess.getFichierAccess().getFichierKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFichierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleDelimiteur
entryRuleDelimiteur returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelimiteurRule()); }
	iv_ruleDelimiteur=ruleDelimiteur
	{ $current=$iv_ruleDelimiteur.current; }
	EOF;

// Rule Delimiteur
ruleDelimiteur returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Delimiteur'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDelimiteurRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePredire
entryRulePredire returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredireRule()); }
	iv_rulePredire=rulePredire
	{ $current=$iv_rulePredire.current; }
	EOF;

// Rule Predire
rulePredire returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Predire'
		{
			newLeafNode(otherlv_0, grammarAccess.getPredireAccess().getPredireKeyword_0());
		}
		(
			(
				lv_pourcentage_1_0=RULE_INT
				{
					newLeafNode(lv_pourcentage_1_0, grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredireRule());
					}
					setWithLastConsumed(
						$current,
						"pourcentage",
						lv_pourcentage_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Rule Algorithme
ruleAlgorithme returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TR'
			{
				$current = grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SVM'
			{
				$current = grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Linear'
			{
				$current = grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
