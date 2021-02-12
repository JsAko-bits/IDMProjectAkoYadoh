package org.xtext.example.mydsl.tests;

import java.io.IOException;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

public class LinearRegression2 {
	
	public static final String TRAINING_DATA_SET_FILENAME="linear-train.arff";
	public static final String TESTING_DATA_SET_FILENAME="linear-test.arff";
	public static final String PREDICTION_DATA_SET_FILENAME="test-confused.arff";

	/**
	 * This method is to load the data set.
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public static Instances getDataSet(String fileName) throws IOException {
		/**
		 * we can set the file i.e., loader.setFile("finename") to load the data
		 */
		int classIdx = 1;
		/** the arffloader to load the arff file */
		ArffLoader loader = new ArffLoader();
		/** load the traing data */
		loader.setSource(LinearRegression2.class.getResourceAsStream("/" + fileName));
		/**
		 * we can also set the file like loader3.setFile(new
		 * File("test-confused.arff"));
		 */
		Instances dataSet = loader.getDataSet();
		/** set the index based on the data given in the arff files */
		dataSet.setClassIndex(classIdx);
		return dataSet;
	}
	
	public static void process() throws Exception {

		Instances trainingDataSet = null;//getDataSet(TRAINING_DATA_SET_FILENAME);
		Instances testingDataSet = null;//getDataSet(TESTING_DATA_SET_FILENAME);
		/** Classifier here is Linear Regression */
		Classifier classifier = new weka.classifiers.functions.LinearRegression();
		/** */
		classifier.buildClassifier(trainingDataSet);
		/**
		 * train the alogorithm with the training data and evaluate the
		 * algorithm with testing data
		 */
		Evaluation eval = new Evaluation(trainingDataSet);
		eval.evaluateModel(classifier, testingDataSet);
		/** Print the algorithm summary */
		System.out.println("** Linear Regression Evaluation with Datasets **");
		System.out.println(eval.toSummaryString());
		System.out.print(" the expression for the input data as per alogorithm is ");
		System.out.println(classifier);

		Instance predicationDataSet = getDataSet(PREDICTION_DATA_SET_FILENAME).lastInstance();
		double value = classifier.classifyInstance(predicationDataSet);
		/** Prediction Output */
		System.out.println(value);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinearRegression2 lr = new LinearRegression2();
		lr.process();
	}

}
