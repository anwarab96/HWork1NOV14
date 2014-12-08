package javaApi;

import java.util.Scanner;

public class ScannerApply 
{
	String name;
	 int population; 
	 double growthRate;
	 
	
	public void readInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the country's name?");
		name= scan.nextLine();
		System.out.println("What is the population of the "+ "Country?");
		population= scan.nextInt();
		System.out.println("Enter growth rate " + "(% increase per year):");
		growthRate = scan.nextDouble();
	}
	public void writeOutput()
	{
		System.out.println("Name = " + name);
		System.out.println("Population = " + + population);
		System.out.println("GrouwthRate = " + growthRate + "%");
	}
	 
	 

}

