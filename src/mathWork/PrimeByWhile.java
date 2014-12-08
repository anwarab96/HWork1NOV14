package mathWork;

import java.util.Scanner;

public class PrimeByWhile {

	public static void main(String[] args) {
	int j = 2;
	int result = 0; 
	int number = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a number");
	number = scan.nextInt();
	while(j<=number/2){
		if(number%j==0){
			result = 1;
		}
		j++;
	}
	if(result == 1 )
	{
		System.out.println( number+ " "+ "number is not prime" );
	}
	else
	{
		System.out.println(number +" "+ "number is prime");
	}
	}

}

//int j = 2;   //variable
//int result = 0; //variable
//int number = 0; //variable
//Scanner reader = new Scanner(System.in); //Scanner object
//System.out.println("Please enter a number: "); //Instruction
//number = reader.nextInt(); //Get the number entered
//while (j <= number / 2) //start loop, during loop j will become each number between 2 and 
//{                             //the entered number divided by 2
//    if (number % j == 0) //If their is no remainder from your number divided by j...
//{
//   result = 1;  //Then result is set to 1 as the number divides equally by another number, hergo
//}                //it is not a prime number
//j++;  //Increment j to the next number to test against the number you entered
//}
//if (result == 1)  //check the result from the loop
//{
//System.out.println("Number: " + number + " is Not Prime."); //If result 1 then a prime     
//}
//else
//{
//System.out.println("Number: " + number + " is Prime. "); //If result is not 1 it's not a prime
//} 
