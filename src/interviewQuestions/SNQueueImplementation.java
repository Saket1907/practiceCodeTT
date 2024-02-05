package interviewQuestions;

public class SNQueueImplementation {
	static int _MAX_SIZE = 5;
	int[] queueInArray = new int[_MAX_SIZE];
	int front, rear;
	
	public SNQueueImplementation() {
		front = -1;
		rear = -1;
	}
	
	boolean isFull() {
		if(front == 0 && rear == _MAX_SIZE -1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		return false;
	}
	
	void addInQueue(int valueToAdded) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			if(front == -1) {
				front = 0;
			}
			rear++;
			queueInArray[rear] = valueToAdded;
			System.out.println("added in queue :: "+valueToAdded);
		}
	}
	
	int deleteFromQueue() {
		int toBeDeleted;
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}else {
			toBeDeleted = queueInArray[front];
			if(front >= rear) {
				front = -1;
				rear = -1;
			}else {
				front++;
			}
			System.out.println("deleted :: "+toBeDeleted);
			return toBeDeleted;
		}
	}
	
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("queue is emply cant display");
		}else {
			System.out.println("\n front index -> "+front);
			for(i = front; i <= rear; i++) {
				System.out.print(queueInArray[i] +"  ");
			}
			System.out.println("\n rear index-> " + rear);
		}
	}
	
	public static void main(String[] args) {
		SNQueueImplementation sNQI = new SNQueueImplementation();
		sNQI.deleteFromQueue();
		for(int j = 0; j < 5; j++) {
			sNQI.addInQueue(j);
		}
		sNQI.addInQueue(6);
		sNQI.display();
		sNQI.deleteFromQueue();
		sNQI.display();
	}

}
