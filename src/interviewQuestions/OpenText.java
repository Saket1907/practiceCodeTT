package interviewQuestions;

import java.util.Stack;

public class OpenText {

	public static void main(String[] args) {
		String inputString = "(())";
		String opratedString = inputString.trim().replace(" ", "");
		
		char[] inputStringToChar = opratedString.toCharArray();
		
		Stack<Character> myStack = new Stack<Character>();
		
		for(int i = 0; i <= inputStringToChar.length; i++) {
			if(inputStringToChar[i] == '(') {
				myStack.add('(');
			}
			if(inputStringToChar[i] == ')') {
				char temp = myStack.pop();
				if(temp != '(') {
					break;
				}
			}
		}
		if(myStack.size() == 0) {
			System.out.println("Balanced/true");
		}else {
			System.out.println("Not balanced/false");
		}

	}

}
