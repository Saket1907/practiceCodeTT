package practiceCodeTT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapUse {

	public static void main(String[] args) {
		List<List<Integer>> myList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		System.out.println(myList.stream().flatMap(q -> q.stream()).collect(Collectors.toList()));

	}

}
