package interviewQuestions;

public class TryCatchFinally {

	public static void main(String[] args) {
		int numberIs = 1;
		
		 value(numberIs);
		

	}

	@SuppressWarnings("finally")
	private static int value(int numberIs) {
		try {
			return 5/numberIs;
		}catch(Exception e){
			return 3;
		}finally {
			return 4;
		}
	}

}
