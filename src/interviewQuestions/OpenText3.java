package interviewQuestions;

public class OpenText3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //IP: This is a string OP: string a is This
		
		String inputString = "This is a string";
	    char[] stringToChar = inputString.toCharArray();
	    char[] tempArray = new char[stringToChar.length];
	    for(int i = 0; i <= stringToChar.length; i++) {
	    	int tempSize = 0;
	    	while(stringToChar[i] != ' ') {
	    		tempSize++;
	    		for(int j = stringToChar.length - tempSize; j <= stringToChar.length; j++) {
	    			tempArray[stringToChar.length  - tempSize] = stringToChar[i];
	    		}
	    		
	    	}
	    }
	    for(int k = 0; k <= tempArray.length; k++) {
	    	System.out.println(tempArray[k]);
	    }

	}

}
