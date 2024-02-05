package interviewQuestions;


public class StringTest {

	public static void main(String[] args) {
		
		//Define String "This is assessment completed by Saket" and count the letters in each word and reverse each word in statement without using String.reverse() build in method


		//Expected :
		//{sihT:4, si:2,...}
		
		String inputString = "This is assessment completed by Saket";
		StringBuilder sb =  new StringBuilder();
		String[] inputStringToArray = inputString.split(" ");
		for(int i = 0; i <= inputStringToArray.length -1; i++) {
			char[] tempCharArray = new char[inputStringToArray[i].length() ];
			char[] stringToCharArray = inputStringToArray[i].toCharArray();
			int k = inputStringToArray[i].length();
			for(int j = 0; j <= stringToCharArray.length -1; j++) {
				tempCharArray[k -1] = stringToCharArray[j - 1];
				k--;
			}
			String tempString = String.valueOf(tempCharArray);
			sb.append(tempString);		
		}
		System.out.println(sb);

	}

}
