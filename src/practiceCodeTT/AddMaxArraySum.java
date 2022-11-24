package practiceCodeTT;

public class AddMaxArraySum {

	public static void main(String[] args) {
		
		int[] inputArray = {-2, -3, 4, -1, -2, 1, 5, -3};
		int currentMax = 0;
		int finalMax = 0;
		
		for(int i = 0; i < inputArray.length; i++) {
			currentMax = currentMax + inputArray[i];
			System.out.println("curentMax :: "+currentMax);
			if(finalMax < currentMax) {
				System.out.println("cMax :: "+currentMax+" fMax :: "+finalMax);
				finalMax = currentMax;
			}
			if(currentMax < 0) {
				currentMax = 0;
				System.out.println("cMax :: "+currentMax);
			}
		}
		System.out.println("finalMax is :: "+finalMax);

	}

}
