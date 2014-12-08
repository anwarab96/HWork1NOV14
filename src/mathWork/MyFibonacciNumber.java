package mathWork;

public class MyFibonacciNumber {

	public static void main(String[] args) {
		int febCount = 20; 
		int[] feb = new int[febCount];
		feb[0]=0;
		feb[1]=1;
		for(int j = 2; j<febCount; j++)
		{
			feb[j] = feb[j-2] + feb[j-1];
		}
	for(int j=0; j<febCount; j++){
		System.out.print(feb[j]+ " ");
	}
	}

}
