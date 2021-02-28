package practiceCodeTT;
/*
 * 123454321
 * 1, 12345432
 * 
 * reverse the number and check
*/

public class CheckPalindromeInteger {
	public void checkPalindromeInteger(int _inputInt){
		int reverse = 0;
		int reminder;
		int original = _inputInt;
		while(_inputInt > 0){
			reminder = _inputInt % 10;
			reverse = (reverse*10) + reminder;
			_inputInt = _inputInt/10;
			System.out.println("InputNumber :: "+_inputInt+" Reverse :: "+reverse+" Reminder :: "+reminder );
		}
		if(reverse == original){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		CheckPalindromeInteger cpi = new CheckPalindromeInteger();
		cpi.checkPalindromeInteger(123454321);

	}

}
