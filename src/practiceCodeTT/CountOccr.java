package practiceCodeTT;

import java.util.HashMap;
import java.util.Map;

public class CountOccr {

	public static void main(String[] args) {
		String s1 = new String("Ram");
		String s2 = new String("Ram");
		String s3 = "Ram";
		String s4 = "Ram";

		System.out.println(s1 == s2);  //false
		System.out.println(s1 == s3);  //true
		System.out.println(s3 == s4);  //true
		System.out.println(s1 == s4);  //tue
		System.out.println(s1.equals(s2));  //false
		
	}

}
