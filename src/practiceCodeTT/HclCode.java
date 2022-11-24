package practiceCodeTT;

import java.util.HashSet;

public class HclCode {

	public static void main(String[] args) {
		int A[] = {
				1, 4, 3, 1, 2, 6
		};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < A.length; i++) {
			hs.add(A[i]);
			System.out.println(hs);
		}
		
		for(int j = 0; j < A.length; j++) {
			if(!hs.contains(j)) {
				System.out.println(hs);
			}
		}
	}

}
