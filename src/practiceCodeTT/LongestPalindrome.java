package practiceCodeTT;

/**
 * @author saku.isaket
 * this program is to check the longest palindrome in the string.
 *  Ex : abcba
 */


public class LongestPalindrome {

	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		String palindromeString = lp.findLongestPalindrome("bananas");
		System.out.println("palindromeString :: "+palindromeString);

	}
	
	public String findLongestPalindrome(String  inputString){
		if(inputString.isEmpty()){
			return "Please pass the input string";
		}
		if(inputString.length() == 1){
			return inputString;
		}
		String longest = inputString.substring(0, 1);
		System.out.println("Longest substring(0,1)::"+longest);
		for(int i = 0; i < inputString.length(); i++){
			String tmpCheck = checkForEquality(inputString, i, i);  //for odd number string
			if(tmpCheck.length() > longest.length()){
				longest = tmpCheck;
			}
			tmpCheck = checkForEquality(inputString, i, i+1);    //for even number string
			if(tmpCheck.length() > longest.length()){
				longest = tmpCheck;
			}
		}
		return longest;
	}

	private String checkForEquality(String inputString, int begin, int end) {
		while(begin >= 0 && end <= inputString.length() - 1 && inputString.charAt(begin) == inputString.charAt(end)){
			begin--;
			end++;
		}
		return inputString.substring(begin +1, end);
	}

}
