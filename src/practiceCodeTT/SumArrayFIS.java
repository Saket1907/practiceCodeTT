package practiceCodeTT;

import java.util.HashSet;
import java.util.Set;

public class SumArrayFIS {

	public static void main(String[] args) {
		int[] inputArray = { 2, 7, 15, 21, 1, 8 };
		int targetSum = 9;
		int checkDiff;
		Set<Integer> checkSet = new HashSet<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			checkSet.add(inputArray[i]);
			checkDiff = targetSum - inputArray[i];
			if (checkSet.contains(checkDiff)) {
				System.out.println("Target value is 9, values from input array eligible for sum = 9 is : "
						+ inputArray[i] + ", " + checkDiff);
			}
		}
	}
}
