package practiceCodeTT;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author saku.isaket
 * to count number of chars repeated in the string using hash map
 */
public class CountCharacters {

		public void countChars(String message){
			Map<Character, Integer> numCharMap = new HashMap<Character, Integer>();
			for(int i = 0; i < message.length(); i++){
				char c = message.charAt(i);
						System.out.println("char :: "+c);
				if(c == ' ')
					continue;
					if(numCharMap.containsKey(c)){
						numCharMap.put(c, numCharMap.get(c)+1);
					}else{
						numCharMap.put(c, 1);
					}
			}
			Set<Map.Entry<Character, Integer>> numSet = numCharMap.entrySet();
			for(Map.Entry<Character, Integer> m : numSet){
				System.out.println("Char- "+m.getKey()+" Count- "+m.getValue());
			}
		}		
		public static void main(String[] args) {
		    CountCharacters cc = new CountCharacters();
		    cc.countChars("saket kumar");
		
	}

}
