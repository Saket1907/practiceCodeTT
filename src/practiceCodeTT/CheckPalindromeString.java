package practiceCodeTT;

public class CheckPalindromeString {
	public void checkPalindrome(String _inputString){
		StringBuilder sb = new StringBuilder(_inputString);
		if(_inputString.equalsIgnoreCase(sb.reverse().toString())){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		CheckPalindromeString cps = new CheckPalindromeString();
		cps.checkPalindrome("qwertytrewq");
	}

}
