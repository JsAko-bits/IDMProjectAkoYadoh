package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xtext.example.mydsl.myDsl.Algorithme;
import org.xtext.example.mydsl.myDsl.Delimiteur;
import org.xtext.example.mydsl.myDsl.Fichier;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Predire;
import org.xtext.example.mydsl.myDsl.Regression;

import com.google.common.io.Files;

public class PythonCompiler {

	private Model model;
	
	public PythonCompiler(Model model) {
		this.model = model;
	}
	
	private String getAlgo(String algo) {
			
		String algoSVM = "from sklearn import svm \n"+
				 "clf = svm.SVC() \n"+
				 "clf.fit(X_train, y_train) \n"+
				 "result = clf.predict(X_test)";
		String algoTR = "from sklearn.tree import DecisionTreeRegressor \n"+
				"regr_1 = DecisionTreeRegressor(max_depth=2) \n"+
				"regr_1.fit(X_train, y_train) \n"+
				"result = regr_1.predict(X_test)";
		String algoLinear = "reg_linear = linear_model.LinearRegression() \n"+
					"reg_linear.fit(X_train, y_train) \n"+
					"print(reg_linear) \n"+
					"result = reg_linear.predict(X_test) \n";
			
			if(algo == "SVM") {
				return algoSVM;
			}else if(algo == "TR") {
				return algoTR;
			}else {
				return algoLinear;
			}
			
		}
	
	public void compileAndRun() throws IOException {
		
		//Génration de code
		Regression reg = model.getRegressions();
		Fichier f = reg.getFichier();
		Delimiteur d = reg.getDelimiteur();
		Algorithme a = reg.getAlgorithme();
		Predire prediction = reg.getPredire();
		
		String fileName = f.getName();
		String delimiteur = d.getName();
		int pourcentage = prediction.getPourcentage();
		
		String pythonCode = "import numpy as np \n"+
							"from sklearn import linear_model \n"+
							"\n"+
							"input = r\'"+fileName+"\'\n"+
							"input_data = np.loadtxt(input, delimiter=\""+delimiteur+"\", skiprows=1) \n"+
							"X, y = input_data[:, :-1], input_data[:, -1] \n"+
							"training_samples = int(("+pourcentage+"/100) * len(X)) \n"+
//							"print (\'TRAINING SAMPLE \', training_samples) \n"+
//							"testing_samples = len(X) - num_training \n"+
							"X_train, y_train = X[:training_samples], y[:training_samples] \n"+
//							"print (\'X TRAIN\', X_train) \n"+
							"X_test, y_test = X[training_samples:], y[training_samples:] \n"+
//							"print (\'X TEST \',X_test) \n"+
							getAlgo(a.toString())+" \n"+
							"print(result) \n";
		
		String PYTHON_OUTPUT = "test.py";
		Files.write(pythonCode.getBytes(), new File(PYTHON_OUTPUT));
		Process p = Runtime.getRuntime().exec("python " + PYTHON_OUTPUT);
		
		BufferedReader stdInput = new BufferedReader(
				new InputStreamReader(p.getInputStream()));
		
		 BufferedReader stdError = new BufferedReader(new 
		         InputStreamReader(p.getErrorStream()));
		
		    String o;
			while ((o = stdInput.readLine()) != null) {
		        System.out.println(o);
		    }
		    
			String err; 
			while ((err = stdError.readLine()) != null) {
		        System.out.println(err);
		    }
		
	}
}
