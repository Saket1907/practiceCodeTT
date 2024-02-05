package practiceCodeTT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDuplicate {

	public static void main(String[] args) {
		String inputLine = "my name is saket";
		String afterTrim = inputLine.replaceAll(" ", "");

		char[] stringToChar = new char[afterTrim.length()];

		List<String> charToList = new ArrayList<>();

		for (int i = 0; i < afterTrim.length(); i++) {
			stringToChar[i] = afterTrim.charAt(i);
			charToList.add(String.valueOf(stringToChar[i]));

			System.out.println(charToList.get(i));
		}

		System.out.println(
		charToList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(q -> q.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet())
				);

	}

}
