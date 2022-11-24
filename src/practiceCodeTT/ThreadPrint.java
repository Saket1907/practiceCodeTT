package practiceCodeTT;

public class ThreadPrint extends Thread{
	
	public void run() {
	    System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		int number = 2; //need to increment	
		ThreadPrint tpEven = new ThreadPrint();
		ThreadPrint tpOdd = new ThreadPrint();
		while(number <20) {
			if(number % 2 == 0) {
				tpEven.start();
				System.out.println(number);
			}else {
				tpOdd.start();
				System.out.println(number);
			}
			number++;
		}
	}

}
