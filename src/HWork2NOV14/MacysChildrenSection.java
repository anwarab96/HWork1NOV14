package HWork2NOV14;

import java.util.Scanner;

public class MacysChildrenSection {
	String dreess;
	String toys;
	int numberOfdreessSold;
	int numberOftoySold;
	static int numberOfSoldItems;
	static double revenue;
	static double avgPrice;
	Scanner scan = new Scanner(System.in);
public void dreessType(String dreess,String toys ){
	this.dreess = dreess;
	System.out.println("There are dreess for Children "+ dreess);	
}
public void toysType(String toys){
	this.toys = toys;
	int age = 18;
System.out.println("They sell toys for Children "+ toys);
if( age<18){
	System.out.println("Buy these nice toys "+ toys);
	}else{
		System.out.println("Go the adults sections according to your age"+ age);
	}
}
public void babyToys(){
	int price= 0; 
	scan.next();
	System.out.println("Enter what type of toy do you want?");
	scan.nextInt();
	System.out.println("Enter how do you want to pay for each toy?");
	scan.nextLine();
	System.out.println("Total amount of  babyToys "+ numberOftoySold);
}
public void writeOutput(){
	double paymentplan = 0;

	System.out.println("Name of toy " + toys);
	System.out.println("Type of payment = " + paymentplan);
	System.out.println("Number of sold out toys"   + numberOftoySold);
}
public void puzzle(int childrenAge){
	 childrenAge = 0;
if(	childrenAge>=1  && childrenAge<=5)
{
	System.out.println("Sell simple puzzle for them ");
}else if(childrenAge>5 &&childrenAge<=10) {
	System.out.println("Sell little thinking afford puzzle for them");
}
else
{
	System.out.println("Sell problem solving puzzle for them");
}	
}
public static double revenuecollection(){
	
	double revenue = avgPrice*numberOfSoldItems;
	return revenue ;
	}
}
