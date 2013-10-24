package general;

 interface QueueInterface<T> {

	public boolean enQueue(T data);
	
	public T peek();
	
	public T poll();
	
	public int size();

}

public class Queue<T> implements QueueInterface<T> {
	
	private DoublyLinkedList<T> queue = new DoublyLinkedList<T>();
	
	private int capacity;
	
	Queue() {
		super();
		capacity = 5;
	}


	Queue(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public boolean enQueue(T data) {
		
		if(size() < capacity) {
			queue.insert(size(), data);  
			return true;
		}
		return false;
	}

	@Override
	public T peek() {
		return queue.getValue(0);
	}

	@Override
	public T poll() {
		T data = queue.getValue(0);
		queue.remove(0);
		return data;
	}

	@Override
	public int size() {
		if(null == queue)
			return 0;
		return queue.size();
	}
	
	@Override
	public String toString() {
		return queue.toString();
	}
	
	public static void main (String[] args) {
		Queue<String> queue = new Queue<String>(3);
		queue.enQueue("1");
		queue.enQueue("2");
		queue.enQueue("3");
		queue.enQueue("4");
		queue.enQueue("5");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}
