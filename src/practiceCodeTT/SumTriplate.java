package practiceCodeTT;

import java.util.HashSet;

public class SumTriplate {

	public static void main(String[] args) {
		// target = 5 => [1, 4, 0], [3, 2, 0]
		int[] inputArray = { 1, 3, 2, 5, 0, 4 };
		int target = 5;
		int lengthArray = inputArray.length;

		findTriplet(inputArray, target, lengthArray);

	}

	private static void findTriplet(int[] inputArray, int target, int lengthArray) {
		for (int i = 0; i < lengthArray - 2; i++) {
			HashSet<Integer> myHashSet = new HashSet<>();
			int current = target - inputArray[i];
			for (int j = i + 1; j < lengthArray; j++) {
				if (myHashSet.contains(current - inputArray[j])) {
					System.out.println(
							"triplet is :: " + inputArray[i] + " " + inputArray[j] + " " + (current - inputArray[j]));
				}
				myHashSet.add(inputArray[j]);
			}
		}

	}

}
