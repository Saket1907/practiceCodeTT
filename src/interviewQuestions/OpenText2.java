package interviewQuestions;

class MyThreadClass extends Thread{
	
	
	public void run() {
		@SuppressWarnings("unused")
		int tempNumber;
			for(int i = 1; i <=10; i = i+2) {
				tempNumber = i;
				System.out.println("t1 : "+tempNumber);
			}
		
		
	}

}

class MyThreadClassOdd extends Thread{
	
	public void run() {
		for(int i = 2; i <= 10; i = i+2) {
			@SuppressWarnings("unused")
			int tempNumber2 = i;
			System.out.println("t2 : "+tempNumber2);
		}
	}
}


public class OpenText2 {

	public static void main(String[] args) throws InterruptedException {
		MyThreadClass mtc1 = new MyThreadClass();
		MyThreadClassOdd mtc2 = new MyThreadClassOdd();
		mtc1.start();
		mtc2.start();
		
		
		System.out.println("main ends here");
	}

}
