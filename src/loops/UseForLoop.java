package loops;

import java.util.Scanner;

public class UseForLoop {
public static void main(String [] args){
	int [] number = new int[10];
			Scanner scan = new Scanner(System.in);
	System.out.println("Enter 10 numbers: ");
	for(int i = 0; i< number.length; i++){
	number[i]=scan.nextInt();
	
}
	System.out.println("The numbers are " );
	for(int j=0;j<number.length; j++)
	{
		System.out.print(number[j] + ",");
	}
}
}

