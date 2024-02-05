package interviewQuestions;

public class TechM {

	public static void main(String[] args) {
		String inputString = "ABC";
		int totalLength = 0;
		String[] inputStringToArray = inputString.split("");  // "A", "B", "C"
		
		Char[] inputStringToCharArray = inputString.toChar();
		Char[] tempArray;
		for(int i = 0; i < inputStringToCharArray.length; i++) {
			
			tempArray[i] = inputStringToCharArray[i] + inputStringToCharArray[i+1]
			
		}
		
		for(int j = 0; j <= inputStringToArray.length; j++) {
			totalLength = totalLength + inputStringToArray[i].length;
			
		}
		for(int k = 0; k<= tempArray.length; k++) {
			totalLength = totalLength + tempArray[i].legth;
		}
		
		totalLength = totalLength + inputString.length();
		

	}

}
