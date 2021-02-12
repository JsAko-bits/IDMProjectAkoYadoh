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

public class RCompiler {

	private Model model;
	
	public RCompiler(Model model) {
		this.model = model;
	}
	
	private String getAlgo(String algo, int pourcentage) {
		
		String algoSVM = "model <- svm(y ~ X)\r\n"
				+ "result <- predict(model, X)\n"
				+ "print(result)";
		
		String algoTR = "df <- data.frame(predictive=X, prediction=y)\r\n"
				+ "nb_learn <- floor((nrow(df)*0."+pourcentage+"))\r\n"
				+ "df_train <- df[1:nb_learn,]\r\n"
//				+ "print(df_train)\r\n"
				+ "df_test <- df[nb_learn+1:nrow(df),]\r\n"
//				+ "print(df_test)\r\n"
				+ "df_tree <- rpart(y~X,data=df_train,\r\n"
				+ "		     control=rpart.control(minsplit=2,cp=0))\r\n"
				+ "df_treeOpt <- prune(df_tree,\r\n"
				+ "cp=df_tree$cptable[which.min(df_tree$cptable[,4]),1])\r\n"
				+ "df_testPredict<-predict(df_treeOpt, newdata=df_test)\r\n"
				+ "print(df_testPredict)\r\n";
//				+ "mc<-table(df_test$note,df_testPredict)\r\n"
//				+ "\r\n"
//				+ "erreur<-1.0-(mc[1,1]+mc[2,2])/sum(mc)";
		
		String algoLinear = "model <- lm (Y_train ~ X_train, input_data) \n"+
							"result <- predict(model, data.frame(X_test)) \n"+
							"print(model)";
		
		if(algo == "SVM") {
			return algoSVM;
		}else if(algo == "TR") {
			return algoTR;
		}else {
			return algoLinear;
		}
		
	}
	
	public void compileAndRun() throws IOException, InterruptedException {
		
		//Génération de code
		Regression reg = model.getRegressions();
		Fichier f = reg.getFichier();
		Delimiteur d = reg.getDelimiteur();
		Algorithme a = reg.getAlgorithme();
		Predire prediction = reg.getPredire();
		
		String fileName = f.getName();
		String delimiteur = d.getName();
		int pourcentage = prediction.getPourcentage();
		
		
		String rCode =  "library(rpart) \n"+
						"library(e1071)\r\n"+
						"input_data = read.csv(\""+fileName+"\", sep=\""+delimiteur+"\", header=TRUE, encoding=\"UTF-8\") \n"+
						"cols = ncol(input_data) \n"+
						"rows = nrow(input_data) \n"+
						"nbre = floor(0."+pourcentage+"*rows) \n"+
						"X = input_data[,-cols] \n"+
						"y = input_data[,cols] \n"+
						"X_train = X[c(1:nbre)] \n"+
						"Y_train = y[c(1:nbre)] \n"+
						"X_test = X[c(nbre+1:rows)] \n"+
						"X_test = X_test[!is.na(X_test)] \n"+
						"Y_test = y[c(nbre+1:rows)] \n"+
						getAlgo(a.toString(), pourcentage)+" \n";
		
		String R_OUTPUT = "testR.txt";
		Files.write(rCode.getBytes(), new File(R_OUTPUT));
		Process p = Runtime.getRuntime().exec("C:\\Program Files\\R\\R-4.0.3\\bin\\Rscript.exe " + R_OUTPUT);
		
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
