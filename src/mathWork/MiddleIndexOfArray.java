package mathWork;

public class MiddleIndexOfArray {

	public static int MiddleIndexOfArray (int[] numbers) {
	
	int startIndex = 0;
	int endIndex= numbers.length -1;
	int leftSum = 0;
	int rightSum=0;
	while(true){
		if(leftSum > rightSum)
		{
			rightSum = rightSum + numbers[endIndex--];
		}
		else{
			leftSum = leftSum + numbers[startIndex ++];
		}
		if (startIndex>endIndex)
		{
			if(leftSum == rightSum){
				break;
			}
		}
	}
	return endIndex;
		}
		public static void main (String[] args){
			int[] num={3,6,8,2,9,7,4,3,5,6,9,7,8,6,5,7};
		}
}

