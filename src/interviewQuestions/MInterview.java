package interviewQuestions;

public class MInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12  54  88
		//23  53  12
		//13  11  21
		
		//Sum all the diagonal Elements ( 12 + 53 + 21 + 88 + 53 + 13)
		// array[i] [j]
		
		int[][] inputArray = {
				
				{12, 54, 88},
				{23, 53, 12},
				{13, 11, 31}
				
		};
		int sum = 0;
		
		for(int i = 0; i  <= inputArray.length; i++) {
			for(int j = 0; j <= inputArray.length; j++) {
				if( i == j && i == inputArray.length-1) {
					sum = sum + inputArray[i][j];
				}
				if(i == 0 && j == inputArray.length -1) {
					sum = sum + inputArray[0][inputArray.length -1];
				}
				if(i == inputArray.length -1 && j == 0) {
					sum = sum + inputArray[inputArray.length -1][0];
				}
			}
		}
		
		System.out.println(sum);

	}

}
