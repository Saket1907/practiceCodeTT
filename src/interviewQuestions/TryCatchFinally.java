package interviewQuestions;

public class TryCatchFinally {

	public static void main(String[] args) {
		int numberIs = 0;
		
		 System.out.println(value(numberIs));
		

	}

	@SuppressWarnings("finally")
	private static int value(int numberIs) {
		try {
			System.out.println("saket Kumar");
			int y = 5/numberIs;
			return 2; 
		}catch(Exception e){
			System.out.println("saket Kumar catch");
			return 3;
		}finally {
			System.out.println("saket Kumar finally");
			return 4;
		}
	}

}
