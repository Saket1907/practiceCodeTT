package practiceCodeTT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordByWord {

	public static void main(String[] args) {
		// MS IS LEGEND
		// SM SI DNEGEL
		String inputString = "MS IS LEGEND";
		String[] inputToArray = inputString.split(" ");
		String reverseWords = "";
		for(int i = 0; i < inputToArray.length; i++) {
			StringBuilder sb = new StringBuilder(inputToArray[i]);
			sb.reverse();
			reverseWords = reverseWords + sb +" ";
		}
		System.out.println(reverseWords);
		

	}

}
