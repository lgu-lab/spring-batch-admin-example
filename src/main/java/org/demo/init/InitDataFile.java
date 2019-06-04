package org.demo.init;

public class InitDataFile {
  public static void main(String[] args) {
		
	//generate data
	InputFileGenerator data = new InputFileGenerator();
	System.out.println("Init ...");
	data.generateFile("src/main/resources/DATA/sampleData.csv");
	System.out.println("Init done.");
	
  }
}
