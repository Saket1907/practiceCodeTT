package interviewQuestions;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Minterview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="SaketKumar is having 8+ Years of experience in java and J2ee"
		
		String inputString = "SaketKumar is having 8+ Years of experience in java and J2ee";
		
		Stream.of(inputString).collect(Collectors.toMap(Function.identity(), Collectors.counting()));

	}

}
