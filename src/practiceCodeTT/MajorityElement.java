package practiceCodeTT;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		/*
		 * for majority occurence should be more then n/2 times.
		 * 
		 * array to map : count repeat, if value > n/2 print key.
		 */
		int[] inputArray = { 3, 3, 4, 2, 4, 4, 2, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3 };
		int count = 0;
		int maxCount = 1;
		int storeIndex = -1;
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] == inputArray[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (maxCount < count) {
				maxCount = count;
				storeIndex = i;
			}
		}
		if (maxCount > inputArray.length / 2)
			System.out.println("maxCount :: " + maxCount + " index value :: " + inputArray[storeIndex]+" Majority array");

	}

}
