package practiceCodeTT;

import java.util.HashSet;
import java.util.Set;

public class EQ {

	public static void main(String[] args) {
		int[] inputArray = {9,2,13,18};
		int target = 11;
		int temp = 0;
		
		Set<Integer> mySet = new HashSet<>();
		for(int i = 0; i < inputArray.length; i++) {
			mySet.add(inputArray[i]);
			temp = target - inputArray[i];
			if(mySet.contains(temp)) {
				System.out.println("temp :: "+i);
				temp = target - temp;
			}
			
		}

	}

}
