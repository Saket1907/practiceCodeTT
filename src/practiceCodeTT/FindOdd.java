package practiceCodeTT;


import java.util.Map;
import java.util.TreeMap;

public class FindOdd {
	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new TreeMap<>();
		myMap.put(1, 1);
		myMap.put(2, 1);
		myMap.put(3, 1);
		myMap.put(null, 1);
		myMap.put(5, 1);
		
		myMap.entrySet().stream().forEach(q -> System.out.println(q));
	}
}