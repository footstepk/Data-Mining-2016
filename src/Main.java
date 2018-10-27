package BayesClassifier;
import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Scanner;
import java.util.*;


public class Main extends Classifier {
	
	public static void main(String[] args) {
		
/*--------------------------------------------------TRAINING-------------------------------------------------------------*/		
		
		File dataFile = new File("training_data.txt");
				
		Classifier t = new Classifier();
		
		try{
			TreeMap <String, Integer> yyFrequencyTable = new TreeMap<String, Integer>();
			
			
			yyFrequencyTable.put("ClassCount", 1);
			
//			add one smoothing
			yyFrequencyTable.put("Q6-2", 1);
			yyFrequencyTable.put("Q6-3", 1);
			yyFrequencyTable.put("Q6-4", 1);
			yyFrequencyTable.put("Q6-5", 1);
			yyFrequencyTable.put("Q6-6", 1);
			
			yyFrequencyTable.put("Q7-2", 1);
			yyFrequencyTable.put("Q7-3", 1);
			yyFrequencyTable.put("Q7-4", 1);
			yyFrequencyTable.put("Q7-5", 1);
			yyFrequencyTable.put("Q7-6", 1);
			
			yyFrequencyTable.put("Q17-2", 1);
			yyFrequencyTable.put("Q17-3", 1);
			yyFrequencyTable.put("Q17-4", 1);
			yyFrequencyTable.put("Q17-5", 1);
			yyFrequencyTable.put("Q17-6", 1);
			yyFrequencyTable.put("Q17-7", 1);
			
			yyFrequencyTable.put("Q19-2", 1);
			yyFrequencyTable.put("Q19-3", 1);
			yyFrequencyTable.put("Q19-4", 1);
			yyFrequencyTable.put("Q19-5", 1);
			yyFrequencyTable.put("Q19-6", 1);
			
			yyFrequencyTable.put("Q20-2", 1);
			yyFrequencyTable.put("Q20-3", 1);
			yyFrequencyTable.put("Q20-4", 1);
			yyFrequencyTable.put("Q20-5", 1);
			yyFrequencyTable.put("Q20-6", 1);
			
			yyFrequencyTable.put("Q24-2", 1);
			yyFrequencyTable.put("Q24-3", 1);
			yyFrequencyTable.put("Q24-4", 1);
			
			yyFrequencyTable.put("Q25a-2", 1);
			yyFrequencyTable.put("Q25a-3", 1);
			yyFrequencyTable.put("Q25a-4", 1);
			yyFrequencyTable.put("Q25a-5", 1);
			yyFrequencyTable.put("Q25a-6", 1);
			yyFrequencyTable.put("Q25a-7", 1);
			yyFrequencyTable.put("Q25a-8", 1);
			yyFrequencyTable.put("Q25a-9", 1);
			
			yyFrequencyTable.put("Sex-Male", 1);
			yyFrequencyTable.put("Sex-Female", 1);
			
			yyFrequencyTable.put("Marital-2", 1);
			yyFrequencyTable.put("Marital-3", 1);
			yyFrequencyTable.put("Marital-4", 1);
			
			yyFrequencyTable.put("Age-2", 1);
			yyFrequencyTable.put("Age-3", 1);
			yyFrequencyTable.put("Age-4", 1);
			yyFrequencyTable.put("Age-5", 1);
			yyFrequencyTable.put("Age-6", 1);
			yyFrequencyTable.put("Age-7", 1);
			
			yyFrequencyTable.put("Class-2", 1);
			yyFrequencyTable.put("Class-3", 1);
			yyFrequencyTable.put("Class-4", 1);
			yyFrequencyTable.put("Class-5", 1);
			yyFrequencyTable.put("Class-6", 1);
			yyFrequencyTable.put("Class-7", 1);
			
			yyFrequencyTable.put("Region-2", 1);
			yyFrequencyTable.put("Region-3", 1);
			yyFrequencyTable.put("Region-4", 1);
			yyFrequencyTable.put("Region-5", 1);
			
			yyFrequencyTable.put("Area-2", 1);
			yyFrequencyTable.put("Area-3", 1);
			
			yyFrequencyTable.put("Work-2", 1);
			yyFrequencyTable.put("Work-3", 1);
			yyFrequencyTable.put("Work-4", 1);
			yyFrequencyTable.put("Work-5", 1);
			yyFrequencyTable.put("Work-6", 1);
			yyFrequencyTable.put("Work-7", 1);
			yyFrequencyTable.put("Work-8", 1);
			
			yyFrequencyTable.put("Industry-2", 1);
			yyFrequencyTable.put("Industry-3", 1);
			yyFrequencyTable.put("Industry-4", 1);
			yyFrequencyTable.put("Industry-5", 1);
			yyFrequencyTable.put("Industry-6", 1);
			yyFrequencyTable.put("Industry-7", 1);
			yyFrequencyTable.put("Industry-8", 1);
			yyFrequencyTable.put("Industry-9", 1);
			yyFrequencyTable.put("Industry-10", 1);
			yyFrequencyTable.put("Industry-11", 1);
			yyFrequencyTable.put("Industry-12", 1);
			yyFrequencyTable.put("Industry-13", 1);
			yyFrequencyTable.put("Industry-14", 1);
			
			yyFrequencyTable.put("Sector-2", 1);
			yyFrequencyTable.put("Sector-3", 1);
			
			yyFrequencyTable.put("Education-2", 1);
			yyFrequencyTable.put("Education-3", 1);
			yyFrequencyTable.put("Education-4", 1);
			yyFrequencyTable.put("Education-5", 1);
			
			
			TreeMap <String, Integer> ynFrequencyTable = new TreeMap<String, Integer>();
			
			ynFrequencyTable.put("ClassCount", 1);
			
			ynFrequencyTable.put("Q6-2", 1);
			ynFrequencyTable.put("Q6-3", 1);
			ynFrequencyTable.put("Q6-4", 1);
			ynFrequencyTable.put("Q6-5", 1);
			ynFrequencyTable.put("Q6-6", 1);
			
			ynFrequencyTable.put("Q7-2", 1);
			ynFrequencyTable.put("Q7-3", 1);
			ynFrequencyTable.put("Q7-4", 1);
			ynFrequencyTable.put("Q7-5", 1);
			ynFrequencyTable.put("Q7-6", 1);
			
			ynFrequencyTable.put("Q17-2", 1);
			ynFrequencyTable.put("Q17-3", 1);
			ynFrequencyTable.put("Q17-4", 1);
			ynFrequencyTable.put("Q17-5", 1);
			ynFrequencyTable.put("Q17-6", 1);
			ynFrequencyTable.put("Q17-7", 1);
			
			ynFrequencyTable.put("Q19-2", 1);
			ynFrequencyTable.put("Q19-3", 1);
			ynFrequencyTable.put("Q19-4", 1);
			ynFrequencyTable.put("Q19-5", 1);
			ynFrequencyTable.put("Q19-6", 1);
			
			ynFrequencyTable.put("Q20-2", 1);
			ynFrequencyTable.put("Q20-3", 1);
			ynFrequencyTable.put("Q20-4", 1);
			ynFrequencyTable.put("Q20-5", 1);
			ynFrequencyTable.put("Q20-6", 1);
			
			ynFrequencyTable.put("Q24-2", 1);
			ynFrequencyTable.put("Q24-3", 1);
			ynFrequencyTable.put("Q24-4", 1);
			
			ynFrequencyTable.put("Q25a-2", 1);
			ynFrequencyTable.put("Q25a-3", 1);
			ynFrequencyTable.put("Q25a-4", 1);
			ynFrequencyTable.put("Q25a-5", 1);
			ynFrequencyTable.put("Q25a-6", 1);
			ynFrequencyTable.put("Q25a-7", 1);
			ynFrequencyTable.put("Q25a-8", 1);
			ynFrequencyTable.put("Q25a-9", 1);
			
			ynFrequencyTable.put("Sex-Male", 1);
			ynFrequencyTable.put("Sex-Female", 1);
			
			ynFrequencyTable.put("Marital-2", 1);
			ynFrequencyTable.put("Marital-3", 1);
			ynFrequencyTable.put("Marital-4", 1);
			
			ynFrequencyTable.put("Age-2", 1);
			ynFrequencyTable.put("Age-3", 1);
			ynFrequencyTable.put("Age-4", 1);
			ynFrequencyTable.put("Age-5", 1);
			ynFrequencyTable.put("Age-6", 1);
			ynFrequencyTable.put("Age-7", 1);
			
			ynFrequencyTable.put("Class-2", 1);
			ynFrequencyTable.put("Class-3", 1);
			ynFrequencyTable.put("Class-4", 1);
			ynFrequencyTable.put("Class-5", 1);
			ynFrequencyTable.put("Class-6", 1);
			ynFrequencyTable.put("Class-7", 1);
			
			ynFrequencyTable.put("Region-2", 1);
			ynFrequencyTable.put("Region-3", 1);
			ynFrequencyTable.put("Region-4", 1);
			ynFrequencyTable.put("Region-5", 1);
			
			ynFrequencyTable.put("Area-2", 1);
			ynFrequencyTable.put("Area-3", 1);
			
			ynFrequencyTable.put("Work-2", 1);
			ynFrequencyTable.put("Work-3", 1);
			ynFrequencyTable.put("Work-4", 1);
			ynFrequencyTable.put("Work-5", 1);
			ynFrequencyTable.put("Work-6", 1);
			ynFrequencyTable.put("Work-7", 1);
			ynFrequencyTable.put("Work-8", 1);
			
			ynFrequencyTable.put("Industry-2", 1);
			ynFrequencyTable.put("Industry-3", 1);
			ynFrequencyTable.put("Industry-4", 1);
			ynFrequencyTable.put("Industry-5", 1);
			ynFrequencyTable.put("Industry-6", 1);
			ynFrequencyTable.put("Industry-7", 1);
			ynFrequencyTable.put("Industry-8", 1);
			ynFrequencyTable.put("Industry-9", 1);
			ynFrequencyTable.put("Industry-10", 1);
			ynFrequencyTable.put("Industry-11", 1);
			ynFrequencyTable.put("Industry-12", 1);
			ynFrequencyTable.put("Industry-13", 1);
			ynFrequencyTable.put("Industry-14", 1);
			
			ynFrequencyTable.put("Sector-2", 1);
			ynFrequencyTable.put("Sector-3", 1);
			
			ynFrequencyTable.put("Education-2", 1);
			ynFrequencyTable.put("Education-3", 1);
			ynFrequencyTable.put("Education-4", 1);
			ynFrequencyTable.put("Education-5", 1);

			
			TreeMap <String, Integer> nnFrequencyTable = new TreeMap<String, Integer>();
			
			nnFrequencyTable.put("ClassCount", 1);
			
			nnFrequencyTable.put("Q6-2", 1);
			nnFrequencyTable.put("Q6-3", 1);
			nnFrequencyTable.put("Q6-4", 1);
			nnFrequencyTable.put("Q6-5", 1);
			nnFrequencyTable.put("Q6-6", 1);
			
			nnFrequencyTable.put("Q7-2", 1);
			nnFrequencyTable.put("Q7-3", 1);
			nnFrequencyTable.put("Q7-4", 1);
			nnFrequencyTable.put("Q7-5", 1);
			nnFrequencyTable.put("Q7-6", 1);
			
			nnFrequencyTable.put("Q17-2", 1);
			nnFrequencyTable.put("Q17-3", 1);
			nnFrequencyTable.put("Q17-4", 1);
			nnFrequencyTable.put("Q17-5", 1);
			nnFrequencyTable.put("Q17-6", 1);
			nnFrequencyTable.put("Q17-7", 1);
			
			nnFrequencyTable.put("Q19-2", 1);
			nnFrequencyTable.put("Q19-3", 1);
			nnFrequencyTable.put("Q19-4", 1);
			nnFrequencyTable.put("Q19-5", 1);
			nnFrequencyTable.put("Q19-6", 1);
			
			nnFrequencyTable.put("Q20-2", 1);
			nnFrequencyTable.put("Q20-3", 1);
			nnFrequencyTable.put("Q20-4", 1);
			nnFrequencyTable.put("Q20-5", 1);
			nnFrequencyTable.put("Q20-6", 1);
			
			nnFrequencyTable.put("Q24-2", 1);
			nnFrequencyTable.put("Q24-3", 1);
			nnFrequencyTable.put("Q24-4", 1);
			
			nnFrequencyTable.put("Q25a-2", 1);
			nnFrequencyTable.put("Q25a-3", 1);
			nnFrequencyTable.put("Q25a-4", 1);
			nnFrequencyTable.put("Q25a-5", 1);
			nnFrequencyTable.put("Q25a-6", 1);
			nnFrequencyTable.put("Q25a-7", 1);
			nnFrequencyTable.put("Q25a-8", 1);
			nnFrequencyTable.put("Q25a-9", 1);
			
			nnFrequencyTable.put("Sex-Male", 1);
			nnFrequencyTable.put("Sex-Female", 1);
			
			nnFrequencyTable.put("Marital-2", 1);
			nnFrequencyTable.put("Marital-3", 1);
			nnFrequencyTable.put("Marital-4", 1);
			
			nnFrequencyTable.put("Age-2", 1);
			nnFrequencyTable.put("Age-3", 1);
			nnFrequencyTable.put("Age-4", 1);
			nnFrequencyTable.put("Age-5", 1);
			nnFrequencyTable.put("Age-6", 1);
			nnFrequencyTable.put("Age-7", 1);
			
			nnFrequencyTable.put("Class-2", 1);
			nnFrequencyTable.put("Class-3", 1);
			nnFrequencyTable.put("Class-4", 1);
			nnFrequencyTable.put("Class-5", 1);
			nnFrequencyTable.put("Class-6", 1);
			nnFrequencyTable.put("Class-7", 1);
			
			nnFrequencyTable.put("Region-2", 1);
			nnFrequencyTable.put("Region-3", 1);
			nnFrequencyTable.put("Region-4", 1);
			nnFrequencyTable.put("Region-5", 1);
			
			nnFrequencyTable.put("Area-2", 1);
			nnFrequencyTable.put("Area-3", 1);
			
			nnFrequencyTable.put("Work-2", 1);
			nnFrequencyTable.put("Work-3", 1);
			nnFrequencyTable.put("Work-4", 1);
			nnFrequencyTable.put("Work-5", 1);
			nnFrequencyTable.put("Work-6", 1);
			nnFrequencyTable.put("Work-7", 1);
			nnFrequencyTable.put("Work-8", 1);
			
			nnFrequencyTable.put("Industry-2", 1);
			nnFrequencyTable.put("Industry-3", 1);
			nnFrequencyTable.put("Industry-4", 1);
			nnFrequencyTable.put("Industry-5", 1);
			nnFrequencyTable.put("Industry-6", 1);
			nnFrequencyTable.put("Industry-7", 1);
			nnFrequencyTable.put("Industry-8", 1);
			nnFrequencyTable.put("Industry-9", 1);
			nnFrequencyTable.put("Industry-10", 1);
			nnFrequencyTable.put("Industry-11", 1);
			nnFrequencyTable.put("Industry-12", 1);
			nnFrequencyTable.put("Industry-13", 1);
			nnFrequencyTable.put("Industry-14", 1);
			
			nnFrequencyTable.put("Sector-2", 1);
			nnFrequencyTable.put("Sector-3", 1);
			
			nnFrequencyTable.put("Education-2", 1);
			nnFrequencyTable.put("Education-3", 1);
			nnFrequencyTable.put("Education-4", 1);
			nnFrequencyTable.put("Education-5", 1);
			
			TreeMap <String, Integer> nyFrequencyTable = new TreeMap<String, Integer>();
			
			nyFrequencyTable.put("ClassCount", 1);
			
			nyFrequencyTable.put("Q6-2", 1);
			nyFrequencyTable.put("Q6-3", 1);
			nyFrequencyTable.put("Q6-4", 1);
			nyFrequencyTable.put("Q6-5", 1);
			nyFrequencyTable.put("Q6-6", 1);
			
			nyFrequencyTable.put("Q7-2", 1);
			nyFrequencyTable.put("Q7-3", 1);
			nyFrequencyTable.put("Q7-4", 1);
			nyFrequencyTable.put("Q7-5", 1);
			nyFrequencyTable.put("Q7-6", 1);
			
			nyFrequencyTable.put("Q17-2", 1);
			nyFrequencyTable.put("Q17-3", 1);
			nyFrequencyTable.put("Q17-4", 1);
			nyFrequencyTable.put("Q17-5", 1);
			nyFrequencyTable.put("Q17-6", 1);
			nyFrequencyTable.put("Q17-7", 1);
			
			nyFrequencyTable.put("Q19-2", 1);
			nyFrequencyTable.put("Q19-3", 1);
			nyFrequencyTable.put("Q19-4", 1);
			nyFrequencyTable.put("Q19-5", 1);
			nyFrequencyTable.put("Q19-6", 1);
			
			nyFrequencyTable.put("Q20-2", 1);
			nyFrequencyTable.put("Q20-3", 1);
			nyFrequencyTable.put("Q20-4", 1);
			nyFrequencyTable.put("Q20-5", 1);
			nyFrequencyTable.put("Q20-6", 1);
						
			nyFrequencyTable.put("Q24-2", 1);
			nyFrequencyTable.put("Q24-3", 1);
			nyFrequencyTable.put("Q24-4", 1);
			
			nyFrequencyTable.put("Q25a-2", 1);
			nyFrequencyTable.put("Q25a-3", 1);
			nyFrequencyTable.put("Q25a-4", 1);
			nyFrequencyTable.put("Q25a-5", 1);
			nyFrequencyTable.put("Q25a-6", 1);
			nyFrequencyTable.put("Q25a-7", 1);
			nyFrequencyTable.put("Q25a-8", 1);
			nyFrequencyTable.put("Q25a-9", 1);
			
			nyFrequencyTable.put("Sex-Male", 1);
			nyFrequencyTable.put("Sex-Female", 1);
			
			nyFrequencyTable.put("Marital-2", 1);
			nyFrequencyTable.put("Marital-3", 1);
			nyFrequencyTable.put("Marital-4", 1);
			
			nyFrequencyTable.put("Age-2", 1);
			nyFrequencyTable.put("Age-3", 1);
			nyFrequencyTable.put("Age-4", 1);
			nyFrequencyTable.put("Age-5", 1);
			nyFrequencyTable.put("Age-6", 1);
			nyFrequencyTable.put("Age-7", 1);
			
			nyFrequencyTable.put("Class-2", 1);
			nyFrequencyTable.put("Class-3", 1);
			nyFrequencyTable.put("Class-4", 1);
			nyFrequencyTable.put("Class-5", 1);
			nyFrequencyTable.put("Class-6", 1);
			nyFrequencyTable.put("Class-7", 1);
			
			nyFrequencyTable.put("Region-2", 1);
			nyFrequencyTable.put("Region-3", 1);
			nyFrequencyTable.put("Region-4", 1);
			nyFrequencyTable.put("Region-5", 1);
			
			nyFrequencyTable.put("Area-2", 1);
			nyFrequencyTable.put("Area-3", 1);
			
			nyFrequencyTable.put("Work-2", 1);
			nyFrequencyTable.put("Work-3", 1);
			nyFrequencyTable.put("Work-4", 1);
			nyFrequencyTable.put("Work-5", 1);
			nyFrequencyTable.put("Work-6", 1);
			nyFrequencyTable.put("Work-7", 1);
			nyFrequencyTable.put("Work-8", 1);
			
			nyFrequencyTable.put("Industry-2", 1);
			nyFrequencyTable.put("Industry-3", 1);
			nyFrequencyTable.put("Industry-4", 1);
			nyFrequencyTable.put("Industry-5", 1);
			nyFrequencyTable.put("Industry-6", 1);
			nyFrequencyTable.put("Industry-7", 1);
			nyFrequencyTable.put("Industry-8", 1);
			nyFrequencyTable.put("Industry-9", 1);
			nyFrequencyTable.put("Industry-10", 1);
			nyFrequencyTable.put("Industry-11", 1);
			nyFrequencyTable.put("Industry-12", 1);
			nyFrequencyTable.put("Industry-13", 1);
			nyFrequencyTable.put("Industry-14", 1);
			
			nyFrequencyTable.put("Sector-2", 1);
			nyFrequencyTable.put("Sector-3", 1);
			
			nyFrequencyTable.put("Education-2", 1);
			nyFrequencyTable.put("Education-3", 1);
			nyFrequencyTable.put("Education-4", 1);
			nyFrequencyTable.put("Education-5", 1);
			
			int numEntries = 0;
			
			Scanner sc = new Scanner(dataFile);
			
			while(sc.hasNextDouble()){
				Double answer1b = sc.nextDouble();
				Double answer5 = sc.nextDouble();
				String classification = t.assessClass(answer1b, answer5);
				
				if(classification.equals("YY")){
					t.assessData(sc, yyFrequencyTable);
					
				}else if(classification.equals("YN")){
					t.assessData(sc, ynFrequencyTable);
					
				}else if(classification.equals("NY")){
					t.assessData(sc, nyFrequencyTable);
					
				}else if(classification.equals("NN")){
					t.assessData(sc, nnFrequencyTable);
				}
				numEntries++;	
//				System.out.println(classification + " " + numEntries);
				
			}
			
			t.printFreqTable(yyFrequencyTable, "YY");
			t.printFreqTable(ynFrequencyTable, "YN");
			t.printFreqTable(nyFrequencyTable, "NY");
			t.printFreqTable(nnFrequencyTable, "NN");
			
			double priorYY = t.priorProb(yyFrequencyTable, numEntries);
			double priorNY = t.priorProb(nyFrequencyTable, numEntries);
			double priorYN = t.priorProb(ynFrequencyTable, numEntries);
			double priorNN = t.priorProb(nnFrequencyTable, numEntries);
			
			double [] condYY = t.conditionalProb(yyFrequencyTable, numEntries);
			double [] condNY = t.conditionalProb(nyFrequencyTable, numEntries);
			double [] condYN = t.conditionalProb(ynFrequencyTable, numEntries);
			double [] condNN = t.conditionalProb(nnFrequencyTable, numEntries);
			
			t.printCondProbs(condYY, "YY");
			t.printCondProbs(condNY, "NY");
			t.printCondProbs(condYN, "YN");
			t.printCondProbs(condNN, "NN");
			
			System.out.println(" ");
			
			System.out.println("Prior YY = " + priorYY);
			System.out.println("Prior NY = " + priorNY);
			System.out.println("Prior YN = " + priorYN);
			System.out.println("Prior NN = " + priorNN);
			
			System.out.println(" ");
			
		
		
/*--------------------------------------------------TESTING-------------------------------------------------------------*/		

			File testingFile = new File("testing_data.txt");
		
			int caseNum = 1;
			int size = 19;
			int correct =0;
			int wrong = 0;
			Scanner s = new Scanner(testingFile);
			while(s.hasNextDouble()){
				System.out.print("Case " + caseNum + " = ");
				double caseArray [] = new double [size];
				for(int i = 0; i < size; i++ ){
					caseArray[i] = s.nextDouble();
					System.out.print(caseArray[i] + ", ");
				}
				System.out.println(" ");
				String correctClass = t.assessCaseArray(caseArray);
				System.out.println("Correct Classification: " + correctClass);
				t.printCaseCondProb(caseArray, condYY, "YY");
				t.printCaseCondProb(caseArray, condYN, "YN");
				t.printCaseCondProb(caseArray, condNY, "NY");
				t.printCaseCondProb(caseArray, condNN, "NN");
												
				double valYY = t.calcClass(priorYY, condYY);
				double valYN = t.calcClass(priorYN, condYN);
				double valNY = t.calcClass(priorNY, condNY);
				double valNN = t.calcClass(priorNN, condNN);
				
				String predClass = t.compareClass(valYY, valYN, valNN, valNY);
				
				System.out.println("Predicted Class : " + predClass);
				if(correctClass.equals(predClass)){
					System.out.print("Correct");
					correct++;
				}else{
					System.out.println("Wrong");
					wrong++;
				}
				System.out.println(" ");
								
				caseNum++;
			}
			System.out.println("Correct: " + correct);
			System.out.println("Wrong: " + wrong);
			s.close();
		}
		catch(FileNotFoundException e ){
			e.printStackTrace();
		}
		
		
			
		
		
		
	}

}
