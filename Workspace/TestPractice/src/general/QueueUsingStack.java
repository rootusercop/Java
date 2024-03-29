package general;

/*
 * Implement a MyQueue class which implements a queue using two stacks 
 */
public class QueueUsingStack {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public boolean enQueue(int data) {
		return stack1.push(data);
	}
	
	// VB: This is sub-optimal solution. Think about how you can reuse the work you did for one  de-queue to another
	public int deQueue() {
		stack2 = new Stack<Integer>();
		
		while(stack1.size() != 0) {
			
			stack2.push(stack1.pop());
		}
		
		int data = stack2.pop();
		stack1 = new Stack<Integer>();
		while(stack2.size() != 0) {
			stack1.push(stack2.pop());
		}
		
		return data;
	}
	
	public int peek() {
		stack2 = new Stack<Integer>();
		while(stack1.size() == 0) {
			stack2.push(stack1.pop());
		}
		return stack2.peek();
	}
	
	public static void main(String[] args) {
		QueueUsingStack qStack = new QueueUsingStack();
		for(int i=0; i<5; i++) {
			qStack.enQueue(i+1);
		}
		System.out.println(qStack.deQueue());
		System.out.println("stack1: " + qStack.stack1);
		System.out.println("stack2: " + qStack.stack2);
		System.out.println(qStack.enQueue(6));
	}

}
