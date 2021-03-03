package practiceCodeTT;

import java.util.Arrays;

/*
 * to find the missing number in the given range of array
 * (0,3) => [0,1,2,3] ideal
 * (0,3) => [0,1,3] missing 2
*/
public class MissingNumberInArray {
	public int checkMissingNumber(int[] checkArray){
		Arrays.sort(checkArray);
		for(int j = 0; j < checkArray.length; j++){
			while(checkArray[j] != j){
				return j;
			}
		}
	  return checkArray.length;
	}

	public static void main(String[] args) {
		int rangeEnd = 4;
		int[] inputArray = new int[rangeEnd];
		for(int i = 0; i < rangeEnd; i++){
			inputArray[i] = i;
			System.out.println(inputArray[i]);
		}
		MissingNumberInArray mna = new MissingNumberInArray();
		mna.checkMissingNumber(inputArray);
	}

}
