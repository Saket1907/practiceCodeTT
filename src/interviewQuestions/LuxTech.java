package interviewQuestions;

public class LuxTech {

	public static void main(String[] args) {
		int[] inputArray = new int[10];
		int size = 3;
		
		int numberOfSubArray = inputArray.length / size;
		if(inputArray.length % size > 0) {
			int udatedNumberOfSubArray = numberOfSubArray + 1;
		}
		
		
		for(int i = 0; i < inputArray.length; i++) {
			
			while(i % size != 0) {
				int[] tempArray = new int[size];
				tempArray[i] = inputArray[i];
				i++;
				for(int j = 0; j < tempArray.length; j++) {
					System.out.println(tempArray[j]);
				}
			}
		}

	}

}
