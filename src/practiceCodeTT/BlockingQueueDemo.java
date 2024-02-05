package practiceCodeTT;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Message {
	private String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

class Producer implements Runnable {
	private BlockingQueue<Message> queue;

	public Producer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Message msg = new Message(" " + i);
			try {
				Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced : " + msg.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {
			Message msg;
			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(10);
				System.out.println("Consumer : " + msg.getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class BlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
		System.out.println("Producer and consumer started");
	}
}
