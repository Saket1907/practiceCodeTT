package practiceCodeTT;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class IntQues {

	public static void main(String[] args) {

		int[] inputRopes = { 4, 3, 2, 6 };
		int result = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>();

		for (int i = 0; i < inputRopes.length; i++) {
			pQ.add(inputRopes[i]);
		}

		while (pQ.size() > 1) {
			int first = pQ.poll();
			int second = pQ.poll();

			result += first + second;
			pQ.add(first + second);
		}

		System.out.println(result);
		
		System.out.println("emp"+10+20);

	}

}
