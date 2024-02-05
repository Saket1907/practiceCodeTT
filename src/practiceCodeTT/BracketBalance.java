package practiceCodeTT;

import java.util.Stack;

public class BracketBalance {

	public static void main(String[] args) {
		String inputBracket = "{}[][[]](){[()]}";
		boolean isBalanced = false;
		if (inputBracket.length() % 2 == 0) {
			isBalanced = checkForValidOrNot(inputBracket);
		}
		System.out.println(isBalanced);

	}

	private static boolean checkForValidOrNot(String inputBracket) {
		Stack<Character> myStack = new Stack<Character>();
		for (char tempCharToFilledInStack : inputBracket.toCharArray()) {
			if (tempCharToFilledInStack == '{') {
				myStack.push('}');
			} else if (tempCharToFilledInStack == '(') {
				myStack.push(')');
			} else if (tempCharToFilledInStack == '[') {
				myStack.push(']');
			} else if (myStack.isEmpty() || myStack.pop() != tempCharToFilledInStack) {  //when ever } ) or ] is encountered it will check the top with opening bracket.
				return false;
			}
		}
		return myStack.isEmpty();
	}

}
