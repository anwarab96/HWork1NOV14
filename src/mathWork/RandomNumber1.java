package mathWork;

import java.util.Random;

public class RandomNumber1 {

	public static void main(String[] args) {
		int[] randomNumber = new int[50];
		System.out.println("Random numbers between 1 and 500 are, ");
		for(int i = 0; i< 50; i++){
			int randomNumbers= (int)(Math.random()*500);
			if(randomNumbers%2==0)
			System.out.println("Random Number[" + (i+1 )+ "]:" + randomNumbers);	
			
		}
}
}
