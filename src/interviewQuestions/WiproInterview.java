package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WiproInterview {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List output = myList.stream().filter( q -> q%2 >0).collect(Collectors.toList());
		System.out.println(output);
		

	}
}
