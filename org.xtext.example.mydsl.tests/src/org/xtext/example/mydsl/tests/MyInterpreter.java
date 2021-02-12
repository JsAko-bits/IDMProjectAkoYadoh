package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.xtext.example.mydsl.myDsl.Model;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.functions.LibSVM;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

public class MyInterpreter {

	HashMap<String, String> match = new HashMap<String, String>();
	
	private class Instruction{
		
		public String getAction() {
			return action;
		}

		public String getArgument() {
			return argument;
		}

		private String action;
		private String argument;
		
		private Instruction(String action, String argument) {
			this.action = action;
			this.argument = argument;
		}

	}
	
	private class Validation{
		
		HashMap<String, String> matchTypes = new HashMap<String, String>();
		ArrayList<String> algos = new ArrayList<String>();
		
		
		private Validation() {
			
			matchTypes.put("Fichier", "String");
			matchTypes.put("Delimiteur", "String");
			matchTypes.put("Algorithme", "Algorithme");
			matchTypes.put("Predire", "Interger");
			
			algos.add("Linear");
			algos.add("SVM");
			algos.add("TR");
		}
		
		private Boolean validateTypeArgs(Instruction instruction) {
			
			String action = instruction.getAction();
			String argument = instruction.getArgument();
			
			if(matchTypes.containsKey(action)) {
				switch(matchTypes.get(action)) {
				
				case "Algorithme":
					return algos.contains(argument);
				
				case "Predire":
					try {
						int n = Integer.parseInt(argument);
						return true;
					}catch(NumberFormatException nfe) {
						System.out.println("Mauvais type d'argument");
						return false;
					}
				
				}
//				if(argument.getClass().getSimpleName() == matchTypes.get(action)) {
//					return true;
//				}else {
//					System.out.println("Argument non reconnu");
//				}
			}else {
				System.out.println("Action non reconnue");
				return false;
			}
			
			return true;
		}
		
		private Instruction validateLine(String ligne) {
			
			ligne = ligne.trim();
			String[] mots = ligne.split(" ");
			System.out.println("Action : " + mots[0] + "  Arguments : "+ mots[1]);
			if(mots.length > 2) {
				System.out.println("Syntaxe non respectée");
				return null;
			}else if(mots.length < 2) {
				System.out.println("Action et/ou argument manquant");
				return null;
			}else {
				return new Instruction(mots[0], mots[1].replaceAll("\"",""));
			}
			
		}
	}
	
	private class Execution{
		
		String fileName;
		String algo;
		int pourcentage;
		
		private void executeLine(Instruction i) {
			switch(i.action) {

				case "Fichier":
					System.out.println(" FICHIER "+i.getArgument());
					executeFichier(i.getArgument());
					break;
				case "Delimiteur":
					break;
					
				case "Algorithme":
					System.out.println(" ALGO "+i.getArgument());
					executeAlgo(i.getArgument());
					break;
				case "Predire":
					System.out.println(" PREDIRE "+i.getArgument());
					executePredire(Integer.parseInt(i.getArgument()));
					break;
			
			}
		}
		
		private void executeFichier(String fileName) {
			this.fileName = fileName;
		}
		
		private void executeDelimiteur() {
			
		}
		
		private void executeAlgo(String algo) {
			this.algo = algo;
		}
		
		private void executePredire(int pourcentage) {
			this.pourcentage = pourcentage;
		}
		
		private void process() throws Exception {
			
			int classIdx = 1;
			System.out.println("CHOIX ALGO"+algo);
			ArffLoader loader = new ArffLoader();
			loader.setFile(new File(fileName));
			
			Instances allData = loader.getDataSet();
			
			Instances trainingData ;//= new Instances(new BufferedReader(new FileReader(fileName)));;
			Instances testingData;//= new Instances(new BufferedReader(new FileReader(fileName)));;
			int nbreLignes = allData.numInstances();
			

			allData.instance(0);
			String pourcent = "0."+pourcentage;
			int nbreSplit = (int)(nbreLignes*Double.parseDouble(pourcent));

			trainingData = new Instances(allData, nbreSplit);
			testingData = new Instances(allData, nbreLignes-nbreSplit);
			
			
			for(int i=0; i<nbreSplit; i++) {
				trainingData.add(allData.instance(i));
			}
			

			for(int i=nbreSplit; i<nbreLignes; i++) {
				testingData.add(allData.instance(i));
			}
			

//			System.out.println("INSTANCES TRAINING: "+trainingData.numInstances());
//			System.out.println(trainingData.toString());
//			System.out.println("INSTANCES NBRE: "+trainingData.numInstances());
//			
//			System.out.println("INSTANCES TESTING: "+testingData.numInstances());
//			System.out.println(testingData.toString());
//			System.out.println("INSTANCES NBRE: "+testingData.numInstances());
			
			switch(algo) {
			
			case "Linear":
				System.out.println("CA MARCHE");
				LinearRegression model = new weka.classifiers.functions.LinearRegression();
				trainingData.setClassIndex(trainingData.numAttributes()-1);
				testingData.setClassIndex(testingData.numAttributes()-1);
				model.buildClassifier(trainingData);
				
				Evaluation eval = new Evaluation(trainingData);
				eval.evaluateModel(model, testingData);
				
				System.out.println("** Linear Regression Evaluation with Datasets **");
				System.out.println(eval.toSummaryString());
				System.out.print(" the expression for the input data as per alogorithm is ");
				System.out.println(model);
				
				
				for(int i=0; i<trainingData.numAttributes(); i++) {
					System.out.println(i+" : "+model.classifyInstance(trainingData.instance(i)));
				}
				break;
				
			case "SVM":
				LibSVM model2 = new LibSVM();
				model2.setOptions(new String[] {"B", "H"});
				
				trainingData.setClassIndex(1);
				testingData.setClassIndex(1);
				
				model2.buildClassifier(trainingData);
				
				Evaluation eval2 = new Evaluation(trainingData);
				eval2.evaluateModel(model2, testingData);
				
				System.out.println("** SVM Regression Evaluation with Datasets **");
				System.out.println(eval2.toSummaryString());
				System.out.print(" the expression for the input data as per alogorithm is ");
				System.out.println(model2);
			}
/*			if(algo == "Linear") {
				LinearRegression model = new weka.classifiers.functions.LinearRegression();
				trainingData.setClassIndex(1);
				testingData.setClassIndex(1);
				model.buildClassifier(trainingData);
				
				Evaluation eval = new Evaluation(trainingData);
				eval.evaluateModel(model, testingData);
				
				System.out.println("** Linear Regression Evaluation with Datasets **");
				System.out.println(eval.toSummaryString());
				System.out.print(" the expression for the input data as per alogorithm is ");
				System.out.println(model);
			}else if(algo == "SVM") {
				LibSVM model = new LibSVM();
				model.setOptions(new String[] {"B", "H"});
				
				trainingData.setClassIndex(1);
				testingData.setClassIndex(1);
				
				model.buildClassifier(trainingData);
				
				Evaluation eval = new Evaluation(trainingData);
				eval.evaluateModel(model, testingData);
				
				System.out.println("** Linear Regression Evaluation with Datasets **");
				System.out.println(eval.toSummaryString());
				System.out.print(" the expression for the input data as per alogorithm is ");
				System.out.println(model);
			}
			System.out.println("OKKKKKKKKKKKKK");*/

		}
		
	}
	
	Model model;
	String model2;
	ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	enum Action {LECTURE, DELIMITEUR, ALGOCHOIX, RUN};
	enum Argument {FILE, DEL, ALGO, POURCENTAGE};
	Validation v = new Validation();
	Execution e = new Execution();
	
	
	
	public MyInterpreter(Model model) {
		this.model = model;
	}
	
	public MyInterpreter(String model2) {
		this.model2 = model2;
	}
	
	public void run() throws Exception {
		
		String code2 = model2;
		String ligne ="";
		for(int i=0; i<code2.length(); i++) {
			if(code2.charAt(i) != '\n') {
				ligne += code2.charAt(i);
				//System.out.println("Ligne  =  "+ligne);
			}else {
				Instruction instr = v.validateLine(ligne);
				if(instr != null) {
					if(v.validateTypeArgs(instr)) {
						e.executeLine(instr);
					}
				}else {
					System.out.println("PROBLEME AVEC "+ligne);
				}
				ligne = "";
			}
			
		}
		
		e.process();
		
	}
	
	
}
