package practiceCodeTT;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Design a rate limiting function that takes 5 requests in one second. First 5 requests in one second should return true and rest all false.
// "my name is saket"

public class Epam {

	public static void main(String[] args) {

		String input = "my name is saket";
		
		String[] inputArray = new String[]{
			"1", "4", "6", "4", "9", "7", "2", "0"
		};
		
		Map<String, Long> myMap = Arrays.stream(input.trim().replace(" ", "").split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(myMap);
		
		Arrays.stream(inputArray).collect(Collectors.averagingDouble(q -> Double.parseDouble(q)));
	}

}
