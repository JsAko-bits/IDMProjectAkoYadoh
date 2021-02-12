package org.xtext.example.mydsl.tests;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.converters.TextDirectoryLoader;
import weka.core.converters.AbstractFileLoader;
import weka.core.converters.ArffLoader;
import weka.classifiers.functions.LinearRegression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import weka.core.Instances;

public class TestRegression {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//DataSource source = new DataSource("C:\\Users\\JS_AKO\\eclipse-workspace\\org.xtext.example.mydsl.parent\\org.xtext.example.mydsl.tests\\data.txt");
		DataSource source2 = new DataSource("dataset\\Test2.arff");
		//File f = new File("C:\\Users\\JS_AKO\\eclipse-workspace\\org.xtext.example.mydsl.parent\\org.xtext.example.mydsl.tests\\dataset\\data.arff");
		//TextDirectoryLoader tdl = new TextDirectoryLoader();
		//tdl.setDirectory(f);
		//tdl.getDataSet();
		//System.out.println(tdl.toString());
		
		ArffLoader loader = new ArffLoader();
		loader.setFile(new File("dataset\\Test2.arff"));
		
		Instances allData = loader.getDataSet();
		System.out.println(allData.numInstances()+" INSTANCES téléchargées.");
		//loader.setSource("dataset\\Test2.arff");
		
		Instances data = source2.getDataSet();
		Instances data2 = source2.getDataSet();
		System.out.println(data.numInstances()+" instances téléchargées.");
		System.out.println(data.toString());
		
		Instances data3 = new Instances(new BufferedReader(new FileReader("dataset\\Test2.arff")));
		data3.setClassIndex(data.numAttributes() - 1);
		
		LinearRegression model = new LinearRegression();
		LinearRegression model2 = new LinearRegression();
	    model.buildClassifier(data); //the last instance with missing class is not used
	    model2.buildClassifier(data2);
	    System.out.println(model);
	    System.out.println(model2);
		
		
		
	}

}
