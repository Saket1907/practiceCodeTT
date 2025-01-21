package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonWord {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 =  "Hello";
		String s2 = "world";
		Set<String> s1ToSet = new HashSet<>();
		
		List<String> myList = new ArrayList<>();
		
		Set<String> mySet = new HashSet<>();
		
		for(int i = 0; i <= s1.length() -1; i++) {
			char temp = s1.charAt(i);
			s1ToSet.add(String.valueOf(temp));
			/*for(int j = 0; j <= s2.length() -1; j++) {
				if(temp == s2.charAt(j)) {
					System.out.println("common value : "+temp);
				}*/
			
		}
		for(int j = 0; j < s2.length() - 1; j++) {
			char temp2 = s2.charAt(j);
			if(s1ToSet.contains(String.valueOf(temp2))) {
				System.out.println(temp2);
			}
		}

	}

}
