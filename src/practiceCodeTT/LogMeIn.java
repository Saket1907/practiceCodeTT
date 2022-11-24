package practiceCodeTT;

import java.util.Arrays;

public class LogMeIn {

	public static void main(String[] args) {
		
		int[] inputArray = {5,-1,8,6,-2,1, 8};
		int k = 2;
		int output = 0; //for time being
		int j = 1;
		
		Arrays.sort(inputArray);
		/*
		 * for(int i = 0; i < inputArray.length; i++) {
		 * System.out.println(inputArray[i]); }
		 */
		// -2, -1, 1, 5, 6, 8, 8
		while(inputArray[inputArray.length - j] == inputArray[inputArray.length - j + 1]) {
			
			j++;
		}
			
		output = inputArray[inputArray.length - k];
		System.out.println(output);
	}

}
