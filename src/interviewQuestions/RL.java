package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RL {

	public static void main(String args[]) {
		
		String[] inputString = {"eat","tea","tan","ate","nat","bat"};
				//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		
		for(int i = 0; i <= inputString.length; i++ ) {
			String[] stringToArray = inputString[i].split("");	
			Arrays.sort(stringToArray);
			
			for(int j = i + 1; j < inputString.length; j++) {
				
			}
		}

	}

}

// select distinct from employee order by salary desc where row_count = 5;