package practiceCodeTT;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] sumArray = {0, 1, 2, 3, 4, 5, 6, 8};
		int sumInit = 0;
		int sum;
		int value;
		Arrays.sort(sumArray);
		System.out.println(Arrays.toString(sumArray));
		for(int i = 0; i < sumArray.length; i++){
			sumInit = sumInit + sumArray[i];
		}
		System.out.println(sumInit);
	}

}
