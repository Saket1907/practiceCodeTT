package practiceCodeTT;

import java.util.HashMap;
import java.util.Map;

public class MicroFocus {

	public static void main(String[] args) {
		// 5 4 3 1 2 4 5 3 2 1
		// sort number
		// O(n)
		int[] inputArray = {5, 4, 3, 1, 2, 4, 5, 3, 2, 1, 6, 7};
		
		Map<Integer, Integer> myMap = new HashMap<>();
		for(int i = 0; i < inputArray.length; i++) {
			if(myMap.containsKey(inputArray[i])) {
				myMap.put(inputArray[i], myMap.get(inputArray[i])+1);
			}else {
				myMap.put(inputArray[i], 1);
			}
		}
		myMap.entrySet().stream().forEach(q -> System.out.println(q));

	}

}
