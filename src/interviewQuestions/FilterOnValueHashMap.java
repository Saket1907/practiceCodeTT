package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOnValueHashMap {

	public static void main(String[] args) {
		String inputString = "saket kumar";
		int count = 0;
		
		System.out.println(Stream.of(inputString)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter(v -> v.getValue() > 0)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
		
		List<String> inputString2 = Arrays.asList("Saket", "Kumar");
		
		List<Integer> lengthString = inputString2.stream().map(q -> q.length()).collect(Collectors.toList());
		
		lengthString.stream().forEach(z -> System.out.println(z));
		
		int[] inputArray = {45, 0, 8, 0, 0, 67, 4};
		
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == 0) {
				count++;
				
			}
		}
		
		System.out.println("count :: "+count);

		
	}

}
