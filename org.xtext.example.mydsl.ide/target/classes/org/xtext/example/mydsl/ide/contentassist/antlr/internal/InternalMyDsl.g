/*
 * generated by Xtext 2.23.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getRegressionsAssignment()); }
		(rule__Model__RegressionsAssignment)
		{ after(grammarAccess.getModelAccess().getRegressionsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegression
entryRuleRegression
:
{ before(grammarAccess.getRegressionRule()); }
	 ruleRegression
{ after(grammarAccess.getRegressionRule()); } 
	 EOF 
;

// Rule Regression
ruleRegression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegressionAccess().getGroup()); }
		(rule__Regression__Group__0)
		{ after(grammarAccess.getRegressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFichier
entryRuleFichier
:
{ before(grammarAccess.getFichierRule()); }
	 ruleFichier
{ after(grammarAccess.getFichierRule()); } 
	 EOF 
;

// Rule Fichier
ruleFichier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFichierAccess().getGroup()); }
		(rule__Fichier__Group__0)
		{ after(grammarAccess.getFichierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDelimiteur
entryRuleDelimiteur
:
{ before(grammarAccess.getDelimiteurRule()); }
	 ruleDelimiteur
{ after(grammarAccess.getDelimiteurRule()); } 
	 EOF 
;

// Rule Delimiteur
ruleDelimiteur 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelimiteurAccess().getGroup()); }
		(rule__Delimiteur__Group__0)
		{ after(grammarAccess.getDelimiteurAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePredire
entryRulePredire
:
{ before(grammarAccess.getPredireRule()); }
	 rulePredire
{ after(grammarAccess.getPredireRule()); } 
	 EOF 
;

// Rule Predire
rulePredire 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPredireAccess().getGroup()); }
		(rule__Predire__Group__0)
		{ after(grammarAccess.getPredireAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Algorithme
ruleAlgorithme
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgorithmeAccess().getAlternatives()); }
		(rule__Algorithme__Alternatives)
		{ after(grammarAccess.getAlgorithmeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Algorithme__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0()); }
		('TR')
		{ after(grammarAccess.getAlgorithmeAccess().getTreeRegressionEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1()); }
		('SVM')
		{ after(grammarAccess.getAlgorithmeAccess().getSVMEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2()); }
		('Linear')
		{ after(grammarAccess.getAlgorithmeAccess().getLinearEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Regression__Group__0__Impl
	rule__Regression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegressionAccess().getFichierAssignment_0()); }
	(rule__Regression__FichierAssignment_0)
	{ after(grammarAccess.getRegressionAccess().getFichierAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Regression__Group__1__Impl
	rule__Regression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegressionAccess().getDelimiteurAssignment_1()); }
	(rule__Regression__DelimiteurAssignment_1)
	{ after(grammarAccess.getRegressionAccess().getDelimiteurAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Regression__Group__2__Impl
	rule__Regression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2()); }
	'Algorithme'
	{ after(grammarAccess.getRegressionAccess().getAlgorithmeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Regression__Group__3__Impl
	rule__Regression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegressionAccess().getAlgorithmeAssignment_3()); }
	(rule__Regression__AlgorithmeAssignment_3)
	{ after(grammarAccess.getRegressionAccess().getAlgorithmeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Regression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegressionAccess().getPredireAssignment_4()); }
	(rule__Regression__PredireAssignment_4)
	{ after(grammarAccess.getRegressionAccess().getPredireAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Fichier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__0__Impl
	rule__Fichier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getFichierKeyword_0()); }
	'Fichier'
	{ after(grammarAccess.getFichierAccess().getFichierKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Fichier__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFichierAccess().getNameAssignment_1()); }
	(rule__Fichier__NameAssignment_1)
	{ after(grammarAccess.getFichierAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Delimiteur__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delimiteur__Group__0__Impl
	rule__Delimiteur__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Delimiteur__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0()); }
	'Delimiteur'
	{ after(grammarAccess.getDelimiteurAccess().getDelimiteurKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delimiteur__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Delimiteur__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Delimiteur__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDelimiteurAccess().getNameAssignment_1()); }
	(rule__Delimiteur__NameAssignment_1)
	{ after(grammarAccess.getDelimiteurAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Predire__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Predire__Group__0__Impl
	rule__Predire__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPredireAccess().getPredireKeyword_0()); }
	'Predire('
	{ after(grammarAccess.getPredireAccess().getPredireKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Predire__Group__1__Impl
	rule__Predire__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPredireAccess().getPourcentageAssignment_1()); }
	(rule__Predire__PourcentageAssignment_1)
	{ after(grammarAccess.getPredireAccess().getPourcentageAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Predire__Group__2__Impl
	rule__Predire__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPredireAccess().getCommaKeyword_2()); }
	','
	{ after(grammarAccess.getPredireAccess().getCommaKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Predire__Group__3__Impl
	rule__Predire__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPredireAccess().getValeurAssignment_3()); }
	(rule__Predire__ValeurAssignment_3)
	{ after(grammarAccess.getPredireAccess().getValeurAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Predire__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPredireAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getPredireAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__RegressionsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0()); }
		ruleRegression
		{ after(grammarAccess.getModelAccess().getRegressionsRegressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__FichierAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0()); }
		ruleFichier
		{ after(grammarAccess.getRegressionAccess().getFichierFichierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__DelimiteurAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0()); }
		ruleDelimiteur
		{ after(grammarAccess.getRegressionAccess().getDelimiteurDelimiteurParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__AlgorithmeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0()); }
		ruleAlgorithme
		{ after(grammarAccess.getRegressionAccess().getAlgorithmeAlgorithmeEnumRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Regression__PredireAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0()); }
		rulePredire
		{ after(grammarAccess.getRegressionAccess().getPredirePredireParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Fichier__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getFichierAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Delimiteur__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDelimiteurAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__PourcentageAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getPredireAccess().getPourcentageINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Predire__ValeurAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPredireAccess().getValeurINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getPredireAccess().getValeurINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
