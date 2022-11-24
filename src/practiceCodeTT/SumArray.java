package practiceCodeTT;

import java.util.HashMap;
import java.util.Map;

public class SumArray {

	public static void main(String[] args) {
		int[] inputArray = {2, 7, 15, 21, 1, 8}; 
		int targetSum = 9;
		Map<Integer, Integer> mapToCheckSum = new HashMap<Integer, Integer>();
		for(int i = 0; i < inputArray.length; i++) {
			mapToCheckSum.put(inputArray[i], targetSum - inputArray[i]);
		}
		mapToCheckSum.entrySet().stream().forEach(System.out::println);
		//mapToCheckSum.entrySet().stream().filter()
		/*
		 * for(Map.Entry<Integer, Integer> entry : mapToCheckSum.entrySet()) { int j =
		 * targetSum - entry.getKey(); System.out.println(j+"  "+entry.getValue());
		 * if(entry.getValue() == entry.getKey()) {
		 * System.out.println("Target Number is : 9, value will be : "+ entry.getValue()
		 * + ", "+entry.getValue()); } }
		 */
	}

}
