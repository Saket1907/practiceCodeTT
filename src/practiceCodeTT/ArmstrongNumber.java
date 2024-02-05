package practiceCodeTT;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// xyz = x^3 + y^3 + z^3;
		
		int inputNumber = 372;
		int tempNumber;
		int reminder = 0;
		int sum = 0;
		
		tempNumber = inputNumber;
		
		while(tempNumber != 0) {
			reminder = tempNumber % 10;
			sum = (int) (sum + Math.pow(reminder, 3));
			tempNumber = tempNumber / 10;
		}
		
		if(sum == inputNumber) {
			System.out.println("ARM");
		}else {
			System.out.println("No ARM");
		}

	}

}
