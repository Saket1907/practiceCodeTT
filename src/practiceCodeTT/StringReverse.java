package practiceCodeTT;

public class StringReverse {

	public static void main(String[] args) {
		String inputString = "abcdfba";
		
		StringBuilder sb = new StringBuilder();
		sb.append(inputString);
		System.out.println(sb.reverse());
		System.out.println(sb);
		if(inputString.equals(String.valueOf(sb))) {
			System.out.println("anagram");
		}else {
			System.out.println("false");
		}

	}

}
