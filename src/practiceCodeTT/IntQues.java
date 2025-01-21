package practiceCodeTT;


import java.util.PriorityQueue;


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
			System.out.println("first > "+first);
			int second = pQ.poll();
			System.out.println("sec > "+second);

			result += first + second;
			System.out.println("resul> "+result);
			pQ.add(first + second);
		}

		System.out.println(result);
		
		System.out.println("emp"+10+20);

	}

}
