package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CIQ {

	public static void main(String[] args) {
		List<String> myInputList = Arrays.asList("test", "Test40", "tes", "test98765", "test234");
		System.out.println(myInputList.stream().sorted((q1, q2) -> q2.length() - q1.length()).collect(Collectors.toList()));
		
		List<List<Integer>> myListLoL = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		
		myListLoL.stream().flatMap(List::stream).collect(Collectors.toList());
		
		String inputString = "My name is saket kumar";
		
		StringBuilder sb = new StringBuilder();
		sb.append(inputString);
		
		sb.reverse();
		System.out.println(sb);
	}

}
