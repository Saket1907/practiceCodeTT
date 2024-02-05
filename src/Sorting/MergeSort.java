package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 12, 10, 9, 1 };

		MergeSort mSort = new MergeSort();
		mSort.mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array : ");
		printArray(arr);

	}

	void mergeSort(int[] arr, int initi, int finl) {
		if (initi < finl) {
			int mid = (initi + finl) / 2;

			mergeSort(arr, initi, mid);
			mergeSort(arr, mid + 1, finl);

			merge(arr, initi, mid, finl);
		}
	}

	void merge(int[] arr, int initi, int mid, int finl) {
		int leftSize = finl - mid + 1;
		int rightSize = mid - finl;
		
		int leftSide[] = new int[leftSize];
		int rightSide[] = new int[rightSize];
		
		for(int x = 0; x < leftSize; x++) {
			leftSide[x] = arr[initi + x];
		}
		for(int y = 0; y < rightSize; y++) {
			rightSide[y] = arr[mid + 1 + y];
		}
		
		int i, j, k;
		i = 0;
		j = 0;
		k = mid;
		
		while(i < leftSize && j < rightSize) {
			if(leftSide[i] <= rightSide[j]) {
				arr[k] = leftSide[i];
				i++;
			}else {
				arr[k] = rightSide[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			arr[k] = leftSide[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			arr[k] = rightSide[j];
			j++;
			k++;
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + "   ");
			System.out.println();
		}

	}

}
