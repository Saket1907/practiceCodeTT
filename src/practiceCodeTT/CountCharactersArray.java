package practiceCodeTT;

/**
 * @author saku.isaket
 *  to count chars repeating in string using array
 */
public class CountCharactersArray {
	public void countChars(String inputString){
		
		char[] strArray;
		while(inputString.length() != 0){
			strArray = inputString.toCharArray();
			char ch = strArray[0];
			int count = 1;
			for(int i = 1; i < strArray.length; i++){
				if(ch == strArray[i]){
					count++;
				}
			}
			if(((ch != ' ') && (ch != '\t'))){
				System.out.println(ch+" - "+count);
			}
			inputString = inputString.replace(""+ch,"");
			System.out.println(" "+inputString+" ");
		}
	}

	public static void main(String[] args) {
		CountCharactersArray cca = new CountCharactersArray();
		cca.countChars("Saket Kumar Chourasia");

	}

}
