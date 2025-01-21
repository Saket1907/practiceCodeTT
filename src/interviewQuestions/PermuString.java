package interviewQuestions;

public class PermuString {

	public static void main(String[] args) {
		String inputStringToBePermuted = "ABC";
		printPermu(inputStringToBePermuted, "");
	}

	static void printPermu(String inputStringToBePermuted, String PermutedString) {
		if (inputStringToBePermuted.length() == 0) {
			System.out.println(PermutedString);
		}

		for (int i = 0; i < inputStringToBePermuted.length(); i++) {
			char tempChar = inputStringToBePermuted.charAt(i);
			String restOfString = inputStringToBePermuted.substring(0, i) + inputStringToBePermuted.substring(i + 1);
			System.out.println("count of i :: " + i + " tempChar :: " + tempChar + " restOfString :: "
					+ inputStringToBePermuted.substring(0, i) + "-" + inputStringToBePermuted.substring(i + 1)
					+ " permutedString :: " + PermutedString +"-"+ tempChar);
			printPermu(restOfString, PermutedString + tempChar);
		}
	}

}
