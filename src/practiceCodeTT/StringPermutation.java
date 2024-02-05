package practiceCodeTT;

public class StringPermutation {

	public static void main(String[] args) {
		String inputString = "ABC";
		printPermutation(inputString, " ");
	}

	static void printPermutation(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output +" ");
		}
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			String r = input.substring(0, i) + input.substring(i + 1);
			printPermutation(r, output + ch);
		}
	}

}
