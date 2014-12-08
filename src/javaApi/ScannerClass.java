package javaApi;

import java.util.Scanner;

public class ScannerClass {
	String name;
	static int population;
	static double growthRate;
	public static void main(String[] args) {
	System.out.println("Input the first number to add ");
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	System.out.println("Input the second number to add");
	int num2 = scan.nextInt();
	int num3 = num1 + num2;
	System.out.println("The answer: "+ num3);
	System.out.println("Enter your username: ");
	String name = scan.nextLine();System.out.println("What is the country's name?");
		name= scan.nextLine();
		System.out.println("What is the population of the "+ "Country?");
		population= scan.nextInt();
		System.out.println("Enter growth rate " + "(% increase per year):");
		growthRate = scan.nextDouble();
	}
	public void writeOutput(){
		System.out.println("Name = " + name);
		System.out.println("Population = " + + population);
		System.out.println("GrouwthRate = " + growthRate + "%");
	}
}



