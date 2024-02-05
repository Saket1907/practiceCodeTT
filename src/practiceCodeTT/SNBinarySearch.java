package practiceCodeTT;

import java.util.Arrays;

import javax.naming.InitialContext;

public class SNBinarySearch {

	public static void main(String[] args) {
		int[] myInputIntArray = {4, 5, 2, 8, 9, 1, 45, 67, 0, 90, 45, -1, -9, 102};
		int intialIndex = 0;
		int finalIndex = myInputIntArray.length - 1;
		Arrays.sort(myInputIntArray);
		System.out.println(Arrays.toString(myInputIntArray));
		System.out.println(searchValueProvided(67, myInputIntArray, intialIndex, finalIndex));
	}

	private static int searchValueProvided(int numberProvided, int[] intArray, int intialIndex, int finalIndex ) {
		if(finalIndex >= intialIndex) {
			int midValue = intialIndex + ( finalIndex - intialIndex )/2;
			System.out.println("mid value :: "+midValue);
			
			if(intArray[midValue] == numberProvided) {
				return midValue;
			}
			
			if(intArray[midValue] > numberProvided) {
				return searchValueProvided(numberProvided, intArray, intialIndex, midValue - 1);
			}else {
				return searchValueProvided(numberProvided, intArray, midValue + 1, finalIndex);
			}
		}
		
		return -2;
	}

}
