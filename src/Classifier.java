package BayesClassifier;
import java.util.*;

public class Classifier {

/*--------------------------------------------------TRAINING-------------------------------------------------------------*/		
	public String assessClass(Double value1, Double value2){
		String classValue = "classAssessorFailed";
		if(value1 == 2.00 && value2 == 2.00){
			classValue = "YY";
		}
		else if (value1 == 3.00 && value2 == 3.00){
			classValue = "NN";
		}
		else if (value1 == 2.00 && value2 == 3.00){
			classValue = "YN";
		}
		else if (value1 == 3.00 && value2 == 2.00){
			classValue = "NY";
		}
		return  classValue;
	}
	
	public double priorProb(TreeMap <String,Integer> freq, int numEntries){
		double prior = freq.get("ClassCount");
		prior = prior  / numEntries;
		return prior;
	}
	
	public double [] conditionalProb(TreeMap <String,Integer> freq, int numEntries){
		
		double [] condArray = {
			((double)(freq.get("Q6-2"))	/ numEntries),
			((double)(freq.get("Q6-3"))	/ numEntries),
			((double)(freq.get("Q6-4"))	/ numEntries),
			((double)(freq.get("Q6-5"))	/ numEntries),
			((double)(freq.get("Q6-6"))	/ numEntries),
			
			((double)(freq.get("Q7-2"))	/ numEntries),
			((double)(freq.get("Q7-3"))	/ numEntries),
			((double)(freq.get("Q7-4"))	/ numEntries),
			((double)(freq.get("Q7-5"))	/ numEntries),
			((double)(freq.get("Q7-6"))	/ numEntries),
			
			((double)(freq.get("Q17-2")) / numEntries),
			((double)(freq.get("Q17-3")) / numEntries),
			((double)(freq.get("Q17-4")) / numEntries),
			((double)(freq.get("Q17-5")) / numEntries),
			((double)(freq.get("Q17-6")) / numEntries),
			((double)(freq.get("Q17-7")) / numEntries),
			
			((double)(freq.get("Q19-2")) / numEntries),
			((double)(freq.get("Q19-3")) / numEntries),
			((double)(freq.get("Q19-4")) / numEntries),
			((double)(freq.get("Q19-5")) / numEntries),
			((double)(freq.get("Q19-6")) / numEntries),
			
			((double)(freq.get("Q20-2")) / numEntries),
			((double)(freq.get("Q20-3")) / numEntries),
			((double)(freq.get("Q20-4")) / numEntries),
			((double)(freq.get("Q20-5")) / numEntries),
			((double)(freq.get("Q20-6")) / numEntries),
			
			((double)(freq.get("Q24-2")) / numEntries),
			((double)(freq.get("Q24-3")) / numEntries),
			((double)(freq.get("Q24-4")) / numEntries),
			
			((double)(freq.get("Q25a-2")) / numEntries),
			((double)(freq.get("Q25a-3")) / numEntries),
			((double)(freq.get("Q25a-4")) / numEntries),
			((double)(freq.get("Q25a-5")) / numEntries),
			((double)(freq.get("Q25a-6")) / numEntries),
			((double)(freq.get("Q25a-7")) / numEntries),
			((double)(freq.get("Q25a-8")) / numEntries),
			((double)(freq.get("Q25a-9")) / numEntries),
			
			((double)(freq.get("Sex-Male")) / numEntries),
			((double)(freq.get("Sex-Female")) / numEntries),
			
			((double)(freq.get("Marital-2")) / numEntries),
			((double)(freq.get("Marital-3")) / numEntries),
			((double)(freq.get("Marital-4")) / numEntries),
			
			((double)(freq.get("Age-2")) / numEntries),
			((double)(freq.get("Age-3")) / numEntries),
			((double)(freq.get("Age-4")) / numEntries),
			((double)(freq.get("Age-5")) / numEntries),
			((double)(freq.get("Age-6")) / numEntries),
			((double)(freq.get("Age-7")) / numEntries),
			
			((double)(freq.get("Class-2")) / numEntries),
			((double)(freq.get("Class-3")) / numEntries),
			((double)(freq.get("Class-4")) / numEntries),
			((double)(freq.get("Class-5")) / numEntries),
			((double)(freq.get("Class-6")) / numEntries),
			((double)(freq.get("Class-7")) / numEntries),
			
			((double)(freq.get("Region-2")) / numEntries),
			((double)(freq.get("Region-3")) / numEntries),
			((double)(freq.get("Region-4")) / numEntries),
			((double)(freq.get("Region-5")) / numEntries),
			
			((double)(freq.get("Area-2")) / numEntries),
			((double)(freq.get("Area-3")) / numEntries),
			
			((double)(freq.get("Work-2")) / numEntries),
			((double)(freq.get("Work-3")) / numEntries),
			((double)(freq.get("Work-4")) / numEntries),
			((double)(freq.get("Work-5")) / numEntries),
			((double)(freq.get("Work-6")) / numEntries),
			((double)(freq.get("Work-7")) / numEntries),
			((double)(freq.get("Work-8")) / numEntries),
			
			((double)(freq.get("Industry-2")) / numEntries),
			((double)(freq.get("Industry-3")) / numEntries),
			((double)(freq.get("Industry-4")) / numEntries),
			((double)(freq.get("Industry-5")) / numEntries),
			((double)(freq.get("Industry-6")) / numEntries),
			((double)(freq.get("Industry-7")) / numEntries),
			((double)(freq.get("Industry-8")) / numEntries),
			((double)(freq.get("Industry-9")) / numEntries),
			((double)(freq.get("Industry-10")) / numEntries),
			((double)(freq.get("Industry-11")) / numEntries),
			((double)(freq.get("Industry-12")) / numEntries),
			((double)(freq.get("Industry-13")) / numEntries),
			((double)(freq.get("Industry-14")) / numEntries),
			
			((double)(freq.get("Sector-2")) / numEntries),
			((double)(freq.get("Sector-3")) / numEntries),
			
			((double)(freq.get("Education-2")) / numEntries),
			((double)(freq.get("Education-3")) / numEntries),
			((double)(freq.get("Education-4")) / numEntries),
			((double)(freq.get("Education-5")) / numEntries)			
		};
		
		return condArray;
	}
	
	public void assessData(Scanner sc, TreeMap <String,Integer> freq){
			
		incrementCounter(freq);
		
		Double answer6 = sc.nextDouble();
		assess6(freq, answer6);
				
		Double answer7 = sc.nextDouble();
		assess7(freq, answer7);
		
		Double answer17 = sc.nextDouble();
		assess17(freq, answer17);
		
		Double answer19 = sc.nextDouble();
		assess19(freq, answer19);
		
		Double answer20 = sc.nextDouble();
		assess20(freq, answer20);
				
		Double answer24 = sc.nextDouble();
		assess24(freq, answer24);
		
		Double answer25a = sc.nextDouble();
		assess25a(freq, answer25a);
		
		Double answerSex = sc.nextDouble();
		assessSex(freq, answerSex);
		
		Double answerMarital = sc.nextDouble();
		assessMarital(freq, answerMarital);
		
		Double answerAge = sc.nextDouble();
		assessAge(freq, answerAge);
		
		Double answerClass = sc.nextDouble();
		assessClass(freq, answerClass);
		
		Double answerRegion = sc.nextDouble();
		assessRegion(freq, answerRegion);
		
		Double answerArea = sc.nextDouble();
		assessArea(freq, answerArea);
		
		Double answerWork = sc.nextDouble();
		assessWork(freq, answerWork);
		
		Double answerIndustry = sc.nextDouble();
		assessIndustry(freq, answerIndustry);
		
		Double answerSector = sc.nextDouble();
		assessSector(freq, answerSector);
		
		Double answerEducation = sc.nextDouble();
		assessEducation(freq, answerEducation);
	}
	
	public void incrementCounter (TreeMap <String,Integer> map){
		map.put("ClassCount", map.get("ClassCount")+1);
	}
	
	public void assess6 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q6-2", map.get("Q6-2")+1);
		}
		else if (value == 3.00){
			map.put("Q6-3", map.get("Q6-3")+1);
			
		}else if (value == 4.00){
			map.put("Q6-4", map.get("Q6-4")+1);
		}
		else if (value == 5.00){
			map.put("Q6-5", map.get("Q6-5")+1);
			
		}else if (value == 6.00){
			map.put("Q6-6", map.get("Q6-6")+1);
		}
	}
	
	public void assess7 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q7-2", map.get("Q7-2")+1);
		}
		else if (value == 3.00){
			map.put("Q7-3", map.get("Q7-3")+1);
			
		}else if (value == 4.00){
			map.put("Q7-4", map.get("Q7-4")+1);
		}
		else if (value == 5.00){
			map.put("Q7-5", map.get("Q7-5")+1);
			
		}else if (value == 6.00){
			map.put("Q7-6", map.get("Q7-6")+1);
		}
	}
	
	public void assess17 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q17-2", map.get("Q17-2")+1);
		}
		else if (value == 3.00){
			map.put("Q17-3", map.get("Q17-3")+1);
			
		}else if (value == 4.00){
			map.put("Q17-4", map.get("Q17-4")+1);
		}
		else if (value == 5.00){
			map.put("Q17-5", map.get("Q17-5")+1);
			
		}else if (value == 6.00){
			map.put("Q17-6", map.get("Q17-6")+1);
			
		}
		else if (value == 7.00){
			map.put("Q17-7", map.get("Q17-7")+1);
		}	
	}
	
	public void assess19 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q19-2", map.get("Q19-2")+1);
		}
		else if (value == 3.00){
			map.put("Q19-3", map.get("Q19-3")+1);
			
		}else if (value == 4.00){
			map.put("Q19-4", map.get("Q19-4")+1);
		}
		else if (value == 5.00){
			map.put("Q19-5", map.get("Q19-5")+1);
			
		}else if (value == 6.00){
			map.put("Q19-6", map.get("Q19-6")+1);
		}
	}
	
	public void assess20 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q20-2", map.get("Q20-2")+1);
		}
		else if (value == 3.00){
			map.put("Q20-3", map.get("Q20-3")+1);
			
		}else if (value == 4.00){
			map.put("Q20-4", map.get("Q20-4")+1);
		}
		else if (value == 5.00){
			map.put("Q20-5", map.get("Q20-5")+1);
			
		}else if (value == 6.00){
			map.put("Q20-6", map.get("Q20-6")+1);
		}
	}
	
	public void assess24 (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q24-2", map.get("Q24-2")+1);
		}
		else if (value == 3.00){
			map.put("Q24-3", map.get("Q24-3")+1);
			
		}else if (value == 4.00){
			map.put("Q24-4", map.get("Q24-4")+1);
		}
	
	}
	
	public void assess25a (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Q25a-2", map.get("Q25a-2")+1);
		}
		else if (value == 3.00){
			map.put("Q25a-3", map.get("Q25a-3")+1);
			
		}else if (value == 4.00){
			map.put("Q25a-4", map.get("Q25a-4")+1);
		}
		else if (value == 5.00){
			map.put("Q25a-5", map.get("Q25a-5")+1);
		}
		else if (value == 6.00){
			map.put("Q25a-6", map.get("Q25a-6")+1);
		}
		else if (value == 7.00){
			map.put("Q25a-7", map.get("Q25a-7")+1);
		}	
		else if (value == 8.00){
			map.put("Q25a-8", map.get("Q25a-8")+1);
		}
		else if (value == 9.00){
			map.put("Q25a-9", map.get("Q25a-9")+1);
		}	
	}
	
	public void assessSex (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Sex-Male", map.get("Sex-Male")+1);
		}
		else if (value == 3.00){
			map.put("Sex-Female", map.get("Sex-Female")+1);
			
		}
	}
	
	public void assessMarital (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Marital-2", map.get("Marital-2")+1);
		}
		else if (value == 3.00){
			map.put("Marital-3", map.get("Marital-3")+1);
			
		}
		else if (value == 4.00){
			map.put("Marital-4", map.get("Marital-4")+1);
			
		}
	}
	
	public void assessAge (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Age-2", map.get("Age-2")+1);
		}
		else if (value == 3.00){
			map.put("Age-3", map.get("Age-3")+1);
			
		}else if (value == 4.00){
			map.put("Age-4", map.get("Age-4")+1);
		}
		else if (value == 5.00){
			map.put("Age-5", map.get("Age-5")+1);
		}
		else if (value == 6.00){
			map.put("Age-6", map.get("Age-6")+1);
		}
		else if (value == 7.00){
			map.put("Age-7", map.get("Age-7")+1);
		}	
	}
	
	public void assessClass (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Class-2", map.get("Class-2")+1);
		}
		else if (value == 3.00){
			map.put("Class-3", map.get("Class-3")+1);
			
		}else if (value == 4.00){
			map.put("Class-4", map.get("Class-4")+1);
		}
		else if (value == 5.00){
			map.put("Class-5", map.get("Class-5")+1);
		}
		else if (value == 6.00){
			map.put("Class-6", map.get("Class-6")+1);
		}
		else if (value == 7.00){
			map.put("Class-7", map.get("Class-7")+1);
		}	
	}
	
	public void assessRegion (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Region-2", map.get("Region-2")+1);
		}
		else if (value == 3.00){
			map.put("Region-3", map.get("Region-3")+1);
			
		}else if (value == 4.00){
			map.put("Region-4", map.get("Region-4")+1);
		}
		else if (value == 5.00){
			map.put("Region-5", map.get("Region-5")+1);
		}
	}
	
	public void assessArea (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Area-2", map.get("Area-2")+1);
		}
		else if (value == 3.00){
			map.put("Area-3", map.get("Area-3")+1);
		}
	}
	
	public void assessWork (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Work-2", map.get("Work-2")+1);
		}
		else if (value == 3.00){
			map.put("Work-3", map.get("Work-3")+1);
			
		}else if (value == 4.00){
			map.put("Work-4", map.get("Work-4")+1);
		}
		else if (value == 5.00){
			map.put("Work-5", map.get("Work-5")+1);
		}
		else if (value == 6.00){
			map.put("Work-6", map.get("Work-6")+1);
		}
		else if (value == 7.00){
			map.put("Work-7", map.get("Work-7")+1);
		}	
		else if (value == 8.00){
			map.put("Work-8", map.get("Work-8")+1);
		}	
	}
	
	public void assessIndustry (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Industry-2", map.get("Industry-2")+1);
		}
		else if (value == 3.00){
			map.put("Industry-3", map.get("Industry-3")+1);
			
		}else if (value == 4.00){
			map.put("Industry-4", map.get("Industry-4")+1);
		}
		else if (value == 5.00){
			map.put("Industry-5", map.get("Industry-5")+1);
		}
		else if (value == 6.00){
			map.put("Industry-6", map.get("Industry-6")+1);
		}
		else if (value == 7.00){
			map.put("Industry-7", map.get("Industry-7")+1);
		}	
		else if (value == 8.00){
			map.put("Industry-8", map.get("Industry-8")+1);
		}	
		else if (value == 9.00){
			map.put("Industry-9", map.get("Industry-9")+1);
			
		}else if (value == 10.00){
			map.put("Industry-10", map.get("Industry-10")+1);
		}
		else if (value == 11.00){
			map.put("Industry-11", map.get("Industry-11")+1);
		}
		else if (value == 12.00){
			map.put("Industry-12", map.get("Industry-12")+1);
		}
		else if (value == 13.00){
			map.put("Industry-13", map.get("Industry-13")+1);
		}	
		else if (value == 14.00){
			map.put("Industry-14", map.get("Industry-14")+1);
		}	
	}
	
	public void assessSector (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Sector-2", map.get("Sector-2")+1);
		}
		else if (value == 3.00){
			map.put("Sector-3", map.get("Sector-3")+1);
		}
	}
	
	public void assessEducation (TreeMap <String,Integer> map, Double value){
		if(value == 2.00){
			map.put("Education-2", map.get("Education-2")+1);
		}
		else if (value == 3.00){
			map.put("Education-3", map.get("Education-3")+1);
			
		}else if (value == 4.00){
			map.put("Education-4", map.get("Education-4")+1);
		}
		else if (value == 5.00){
			map.put("Education-5", map.get("Education-5")+1);
		}
	}
	
/*--------------------------------------------------TESTING-------------------------------------------------------------*/		

	public String assessCaseArray(double [] array){
		String correctClass = assessClass(array[0], array [1]);
		return correctClass;
		
	}
	
	public double calcClass(double prior, double [] condProbs){
		double value = prior;
		for(int i = 0; i <condProbs.length; i++ ){
			value = value*condProbs[i];
		}
		return value;
	}
	
	public String compareClass(double valueYY, double valueYN, double valueNN, double valueNY){
		String classValue = "";
		
		if((valueYY > valueYN) && (valueYY > valueNN) && (valueYY > valueNY)){
			classValue = "YY";
		}
		else if((valueYN > valueYY) && (valueYN > valueNN) && (valueYN > valueNY)){
			classValue = "YN";
		}
		else if((valueNN > valueYY) && (valueNN > valueYN) && (valueNN > valueNY)){
			classValue = "NN";
		}
		else classValue = "NY";
		
		
		return classValue;
	}
	
	public double [] conditionalForCase(double [] caseArray, double [] condArray ){
		double [] condForCase = new double [18];
		
		for(int i = 2; i < (caseArray.length); i++){
			if(i == 2){
				if(caseArray[i] == 2.00){
					condForCase[0] = condArray[0];
				}
				else if(caseArray[i] == 3.00){
					condForCase[0] = condArray[1];
				}
				else if(caseArray[i] == 4.00){
					condForCase[0] = condArray[2];
				}
				else if(caseArray[i] == 5.00){
					condForCase[0] = condArray[3];
				}
				else if(caseArray[i] == 6.00){
					condForCase[0] = condArray[4];
				}
			}
			else if(i == 3){
				if(caseArray[i] == 2.00){
					condForCase[1] = condArray[5];
				}
				else if(caseArray[i] == 3.00){
					condForCase[1] = condArray[6];
				}
				else if(caseArray[i] == 4.00){
					condForCase[1] = condArray[7];
				}
				else if(caseArray[i] == 5.00){
					condForCase[1] = condArray[8];
				}
				else if(caseArray[i] == 6.00){
					condForCase[1] = condArray[9];
				}
			}
			else if(i == 4){
				if(caseArray[i] == 2.00){
					condForCase[2] = condArray[10];
				}
				else if(caseArray[i] == 3.00){
					condForCase[2] = condArray[11];
				}
				else if(caseArray[i] == 4.00){
					condForCase[2] = condArray[12];
				}
				else if(caseArray[i] == 5.00){
					condForCase[2] = condArray[13];
				}
				else if(caseArray[i] == 6.00){
					condForCase[2] = condArray[14];
				}
				else if(caseArray[i] == 7.00){
					condForCase[2] = condArray[15];
				}
			}

			else if(i == 5){
				if(caseArray[i] == 2.00){
					condForCase[3] = condArray[16];
				}
				else if(caseArray[i] == 3.00){
					condForCase[3] = condArray[17];
				}
				else if(caseArray[i] == 4.00){
					condForCase[3] = condArray[18];
				}
				else if(caseArray[i] == 5.00){
					condForCase[3] = condArray[19];
				}
				else if(caseArray[i] == 6.00){
					condForCase[3] = condArray[20];
				}
			}
			else if(i == 6){
				if(caseArray[i] == 2.00){
					condForCase[4] = condArray[21];
				}
				else if(caseArray[i] == 3.00){
					condForCase[4] = condArray[22];
				}
				else if(caseArray[i] == 4.00){
					condForCase[4] = condArray[23];
				}
				else if(caseArray[i] == 5.00){
					condForCase[4] = condArray[24];
				}
				else if(caseArray[i] == 6.00){
					condForCase[4] = condArray[25];
				}
			}
			else if(i == 7){
				if(caseArray[i] == 2.00){
					condForCase[5] = condArray[26];
				}
				else if(caseArray[i] == 3.00){
					condForCase[5] = condArray[27];
				}
				else if(caseArray[i] == 4.00){
					condForCase[5] = condArray[28];
				}
			}
			else if(i == 8){
				if(caseArray[i] == 2.00){
					condForCase[6] = condArray[29];
				}
				else if(caseArray[i] == 3.00){
					condForCase[6] = condArray[30];
				}
				else if(caseArray[i] == 4.00){
					condForCase[7] = condArray[31];
				}
				else if(caseArray[i] == 5.00){
					condForCase[6] = condArray[32];
				}
				else if(caseArray[i] == 6.00){
					condForCase[6] = condArray[33];
				}
				else if(caseArray[i] == 7.00){
					condForCase[6] = condArray[34];
				}
				else if(caseArray[i] == 8.00){
					condForCase[6] = condArray[35];
				}
				else if(caseArray[i] == 9.00){
					condForCase[6] = condArray[36];
				}
			}
			else if(i == 9){
				if(caseArray[i] == 2.00){
					condForCase[7] = condArray[37];
				}
				else if(caseArray[i] == 3.00){
					condForCase[7] = condArray[38];
				}
			}
			else if(i == 10){
				if(caseArray[i] == 2.00){
					condForCase[8] = condArray[39];
				}
				else if(caseArray[i] == 3.00){
					condForCase[8] = condArray[40];
				}
				else if(caseArray[i] == 4.00){
					condForCase[8] = condArray[41];
				}
			}
			else if(i == 11){
				if(caseArray[i] == 2.00){
					condForCase[9] = condArray[42];
				}
				else if(caseArray[i] == 3.00){
					condForCase[9] = condArray[43];
				}
				else if(caseArray[i] == 4.00){
					condForCase[9] = condArray[44];
				}
				else if(caseArray[i] == 5.00){
					condForCase[9] = condArray[45];
				}
				else if(caseArray[i] == 6.00){
					condForCase[9] = condArray[46];
				}
				else if(caseArray[i] == 7.00){
					condForCase[9] = condArray[47];
				}
			}
			else if(i == 12){
				if(caseArray[i] == 2.00){
					condForCase[10] = condArray[47];
				}
				else if(caseArray[i] == 3.00){
					condForCase[10] = condArray[48];
				}
				else if(caseArray[i] == 4.00){
					condForCase[10] = condArray[49];
				}
				else if(caseArray[i] == 5.00){
					condForCase[10] = condArray[50];
				}
				else if(caseArray[i] == 6.00){
					condForCase[10] = condArray[51];
				}
				else if(caseArray[i] == 7.00){
					condForCase[10] = condArray[52];
				}
			}
			else if(i == 13){
				if(caseArray[i] == 2.00){
					condForCase[11] = condArray[53];
				}
				else if(caseArray[i] == 3.00){
					condForCase[11] = condArray[54];
				}
				else if(caseArray[i] == 4.00){
					condForCase[11] = condArray[55];
				}
				else if(caseArray[i] == 5.00){
					condForCase[11] = condArray[56];
				}
			}
			else if(i == 14){
				if(caseArray[i] == 2.00){
					condForCase[12] = condArray[57];
				}
				else if(caseArray[i] == 3.00){
					condForCase[12] = condArray[58];
				}
			}
			else if(i == 15){
				if(caseArray[i] == 2.00){
					condForCase[13] = condArray[59];
				}
				else if(caseArray[i] == 3.00){
					condForCase[13] = condArray[60];
				}
				else if(caseArray[i] == 4.00){
					condForCase[13] = condArray[61];
				}
				else if(caseArray[i] == 5.00){
					condForCase[13] = condArray[62];
				}
				else if(caseArray[i] == 6.00){
					condForCase[13] = condArray[63];
				}
				else if(caseArray[i] == 7.00){
					condForCase[13] = condArray[64];
				}
				else if(caseArray[i] == 8.00){
					condForCase[13] = condArray[65];
				}
			}
			else if(i == 16){
				if(caseArray[i] == 2.00){
					condForCase[14] = condArray[66];
				}
				else if(caseArray[i] == 3.00){
					condForCase[14] = condArray[67];
				}
				else if(caseArray[i] == 4.00){
					condForCase[14] = condArray[68];
				}
				else if(caseArray[i] == 5.00){
					condForCase[14] = condArray[69];
				}
				else if(caseArray[i] == 6.00){
					condForCase[14] = condArray[70];
				}
				else if(caseArray[i] == 7.00){
					condForCase[14] = condArray[71];
				}
				else if(caseArray[i] == 8.00){
					condForCase[14] = condArray[72];
				}
				else if(caseArray[i] == 9.00){
					condForCase[14] = condArray[73];
				}
				else if(caseArray[i] == 10.00){
					condForCase[14] = condArray[74];
				}
				else if(caseArray[i] == 11.00){
					condForCase[14] = condArray[75];
				}
				else if(caseArray[i] == 12.00){
					condForCase[14] = condArray[76];
				}
				else if(caseArray[i] == 13.00){
					condForCase[14] = condArray[77];
				}
				else if(caseArray[i] == 14.00){
					condForCase[14] = condArray[78];
				}
			}
			else if(i == 17){
				if(caseArray[i] == 2.00){
					condForCase[15] = condArray[79];
				}
				else if(caseArray[i] == 3.00){
					condForCase[15] = condArray[80];
				}
			}
			else if(i == 18){
				if(caseArray[i] == 2.00){
					condForCase[16] = condArray[81];
				}
				else if(caseArray[i] == 3.00){
					condForCase[16] = condArray[82];
				}
				else if(caseArray[i] == 4.00){
					condForCase[16] = condArray[83];
				}
				else if(caseArray[i] == 5.00){
					condForCase[16] = condArray[84];
				}
			}
		}
		
		return condForCase;
	}
	
/*--------------------------------------------------PRINTING-------------------------------------------------------------*/	
	public void printCondProbs(double [] array, String name){
		System.out.print("Cond " + name + ":");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	public void printCaseCondProb(double [] caseArray, double [] condArray, String name){
		System.out.print(name + " Conditional Probabilities for this case: ");
		double condProbs [] = conditionalForCase(caseArray, condArray);
		for(int j = 0; j < condProbs.length; j++){
			System.out.print(condProbs[j] + ", ");
		}
		System.out.println(" ");
	}
	
	public void printFreqTable(TreeMap<String, Integer> freq, String name){
		Iterator<String> iterator = freq.keySet().iterator();
		System.out.println("Class " + name + ": ");
		System.out.printf("%-11s %10s\n", "KEY", "FREQUENCY");
		System.out.println("------------------------");
		while(iterator.hasNext()){
		  String key = iterator.next();
		    System.out.printf("%-11s %10d\n", key, freq.get(key));
		}
		System.out.println(" ");
	}
}
