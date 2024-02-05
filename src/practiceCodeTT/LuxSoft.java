package practiceCodeTT;

import java.util.Stack;

public class LuxSoft {

	public static void main(String[] args) {
		String inputString = "[()]{}{[()()]()}";
		char[] inputToCharArray = inputString.toCharArray();
		
		Stack<Character> myStack = new Stack<>();
		
		for(int i = 0; i < inputToCharArray.length; i++) {
			char temp = inputToCharArray[i];
			char check;
			if(temp == '(' || temp == '{' || temp == '[') {
				myStack.push(temp);
			}else {
				switch(temp) {
				
				case ')' : check = myStack.pop();
				if(check == '}' || check ==']');
				break;
				
				case '}' : check = myStack.pop();
				if(check == ')' || check ==']');
				break;
				
				case ']' : check = myStack.pop();
				if(check == ')' || check =='}');
				break;
				}
				System.out.println(true);
			}
		}
		

	}

}
