package conditional;

public class UseConditional {
public static void main(String [] args){
	int num1=100, num2=21;
	if(num1>num2){
		System.out.println(num1 + "is bigger than " + num2);
		int num= num2;
		if(num%2==0){
			System.out.println(num2 + "is even number");	
		}else {
			System.out.println(num2 + "is smaller than "+ num2);
		}
	}else{
		System.out.println(num1 + "is even odd "+ num2);	
	}
}
}
