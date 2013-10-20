package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StacksAndQueues {
	public static void main(String[] args) {
		/*
		SetOfStacks stacks = new SetOfStacks();
		for(int i=0; i<8; i++) {
			stacks.push(i+1);
		}
		System.out.println(stacks.mapOfstacks);

		System.out.println("pop at 1: " + stacks.popAt(1));
		System.out.println("pop at 2: " + stacks.popAt(2));
		System.out.println("pop at 1: " + stacks.popAt(1));
		System.out.println(stacks.mapOfstacks);


		for(int i=0; i<11; i++) {
			System.out.println("peek:" + stacks.peek());
			System.out.println("pop:" + stacks.pop());
		}

		System.out.println(stacks.mapOfstacks);
		 */

		Stack3 s3 = new Stack3();
		//System.out.println("sfsdfsdfdsfsd");
		s3.push(5);
		s3.push(7);
		s3.push(3);
		s3.push(5);
		s3.push(7);
		s3.push(3);
		//System.out.println(s3.min());
		//System.out.println(s3.pop());
		//System.out.println(s3.min());
		//System.out.println(s3.pop());

		System.out.println(s3.stack);
		s3.sort();
		System.out.println(s3.stack);

		/*
		Stack1 s = new Stack1();

		System.out.println(s.pushInStack(0, 1));
		System.out.println(s.pushInStack(0, 2));
		System.out.println(s.pushInStack(0, 3));
		System.out.println(s.pushInStack(0, 4));
		System.out.println(s.pushInStack(0, 5));
		System.out.println(s.pushInStack(0, 6));
		System.out.println(s.pushInStack(0, 7));
		System.out.println(s.pushInStack(0, 8));
		System.out.println(s.pushInStack(0, 9));
		System.out.println(s.pushInStack(0, 10));
		System.out.println(s.pushInStack(1, 1));
		System.out.println(s.pushInStack(1, 2));
		System.out.println(s.pushInStack(1, 3));
		System.out.println(s.pushInStack(1, 4));
		System.out.println(s.pushInStack(1, 5));
		System.out.println(s.pushInStack(1, 6));
		System.out.println(s.pushInStack(1, 7));
		System.out.println(s.pushInStack(1, 8));
		System.out.println(s.pushInStack(1, 9));
		System.out.println(s.pushInStack(1, 10));
		System.out.println(s.pushInStack(2, 1));
		System.out.println(s.pushInStack(2, 2));
		System.out.println(s.pushInStack(2, 3));
		System.out.println(s.pushInStack(2, 4));
		System.out.println(s.pushInStack(2, 5));
		System.out.println(s.pushInStack(2, 6));
		System.out.println(s.pushInStack(2, 7));
		System.out.println(s.pushInStack(2, 8));
		System.out.println(s.pushInStack(2, 9));
		System.out.println(s.pushInStack(2, 10));
		System.out.println(s.pushInStack(0, 10));
		System.out.println(s.pushInStack(1, 10));
		System.out.println(s.pushInStack(2, 10));
		System.out.println(s.pushInStack(3, 10));

		for (int i=0; i<10; i++) {
			System.out.println(s.peekFromStack(0));
			System.out.println(s.peekFromStack(1));
			System.out.println(s.peekFromStack(2));
		}
		System.out.println(s.popFromStack(0));
		System.out.println(s.popFromStack(1));
		System.out.println(s.popFromStack(2));
		System.out.println(s.popFromStack(0));
		System.out.println(s.popFromStack(1));
		System.out.println(s.popFromStack(2));


		Stack2 s2 = new Stack2();

		System.out.println(s2.isEmpty(0));
		System.out.println(s2.isEmpty(1));
		System.out.println(s2.isEmpty(2));

		System.out.println(" ************");

		for (int i=0; i<6; i++) {
			System.out.println(s2.pushInStack(0, i));
			System.out.println(s2.pushInStack(0, i));
			System.out.println(s2.pushInStack(0, i));
			System.out.println(s2.pushInStack(1, i));
			System.out.println(s2.pushInStack(1, i));
			System.out.println(s2.pushInStack(2, i));
		}
		/*
		//for (int i=0; i<30; i++) {
			System.out.println(s2.stack1);
			System.out.println(s2.stack2);
			System.out.println(s2.stack3);
		//}

		System.out.println(s2.peekFromStack(0));
		System.out.println(s2.peekFromStack(1));
		System.out.println(s2.peekFromStack(2));
		System.out.println(s2.array[26]);
		System.out.println(s2.array[28]);
		System.out.println(s2.array[29]);

		System.out.println(s2.stack1);
		System.out.println(s2.stack2);
		System.out.println(s2.stack3);
		System.out.println(s2.availableSpace);
		System.out.println(s2.popFromStack(0));
		System.out.println(s2.popFromStack(0));
		System.out.println(s2.popFromStack(0));
		System.out.println(s2.popFromStack(0));
		System.out.println(s2.popFromStack(1));
		System.out.println(s2.popFromStack(1));
		System.out.println(s2.popFromStack(1));
		System.out.println(s2.popFromStack(1));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.popFromStack(2));
		System.out.println(s2.stack1);
		System.out.println(s2.stack2);
		System.out.println(s2.stack3);
		System.out.println(s2.availableSpace);

		System.out.println(" ************");
		System.out.println(s2.isEmpty(0));
		System.out.println(s2.isEmpty(1));
		System.out.println(s2.isEmpty(2));
		 */

	}
}


/*
 * Imagine a (literal) stack of plates If the stack gets too high, it might topple 
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold 
 * Implement a data structure SetOfStacks that mimics this SetOfStacks should be composed of several stacks, 
 * and should create a new stack once the previous one exceeds capacity 
 * SetOfStacks push() and SetOfStacks pop() should behave identically to a single stack 
 * (that is, pop() should return the same values as it would if there were just a single stack) 
 * FOLLOW UP
 * 	Implement a function popAt(int index) which performs a pop operation on a specific sub-stack 
 */
class SetOfStacks {

	static final int THRESHOLD = 2;

	Map<Integer, LinkedList<Integer>> mapOfstacks = new HashMap<Integer, LinkedList<Integer>>();
	List<Integer> stackKeyslist = new LinkedList<Integer>();

	//int currentStackNumber = 1;

	public boolean push(int data) {
		if(mapOfstacks.isEmpty()){
			LinkedList<Integer> newLocalStack = new LinkedList<Integer>();
			newLocalStack.add(data);
			stackKeyslist.add(1);
			mapOfstacks.put(stackKeyslist.get(stackKeyslist.size()-1), newLocalStack);
			return true;
		}
		LinkedList<Integer> localstack = mapOfstacks.get(stackKeyslist.get(stackKeyslist.size()-1));
		if(localstack.size() >= THRESHOLD) {
			LinkedList<Integer> newLocalStack = new LinkedList<Integer>();
			newLocalStack.add(data);
			stackKeyslist.add(stackKeyslist.get(stackKeyslist.size()-1)+1);
			mapOfstacks.put(stackKeyslist.get(stackKeyslist.size()-1), newLocalStack);

		} else {
			localstack.add(data);
			mapOfstacks.put(stackKeyslist.get(stackKeyslist.size()-1), localstack);
		}
		return true;
	}

	public int pop() {

		if(stackKeyslist.isEmpty())
			return Integer.MIN_VALUE;

		LinkedList<Integer> localStack = mapOfstacks.get(stackKeyslist.get(stackKeyslist.size()-1));

		if(null ==localStack)
			return Integer.MIN_VALUE;

		int data = localStack.get(localStack.size()-1);
		localStack.remove(localStack.size()-1);
		if(localStack.isEmpty()) {
			mapOfstacks.remove(stackKeyslist.get(stackKeyslist.size()-1));
			stackKeyslist.remove(stackKeyslist.get(stackKeyslist.size()-1));
		} else {
			mapOfstacks.put(stackKeyslist.get(stackKeyslist.size()-1), localStack);
		}
		return data;
	}

	public int peek() {
		if(stackKeyslist.isEmpty())
			return Integer.MIN_VALUE;

		LinkedList<Integer> localStack = mapOfstacks.get(stackKeyslist.get(stackKeyslist.size()-1));

		if(null== localStack)
			return Integer.MIN_VALUE;

		return localStack.get(localStack.size()-1);
	}

	public int popAt(int index) {
		LinkedList<Integer> localStack = mapOfstacks.get(index);

		if(null == localStack)
			return Integer.MIN_VALUE;

		int data = localStack.get(localStack.size() -1);
		localStack.remove(localStack.size() -1);

		if(localStack.isEmpty()) {
			mapOfstacks.remove(index);
			stackKeyslist.remove(index);
		} else {
			mapOfstacks.put(index, localStack);
		}

		return data;
	}


}

/*
 * How would you design a stack which, in addition to push and pop, 
 * also has a function min which returns the minimum element? 
 * Push, pop and min should all operate in O(1) time 
 */
class Stack3 {

	List<Node> stack = new LinkedList<Node>();

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean push(int data) {
		Node n  = new Node();
		n.data = data;

		if(stack.isEmpty()) {
			n.min = data;
		} else {
			int prevMin = peek().min;
			if(prevMin>data) {
				n.min = data;
			} else {
				n.min = prevMin;
			}
		}
		stack.add(n);
		return true;
	}

	public Node peek() {
		return stack.get(stack.size()-1);
	}

	public Node pop() {
		if(stack.isEmpty())
			return null;

		Node n = stack.get(stack.size()-1);

		stack.remove(stack.size()-1);
		return n;
	}

	public int min() {
		return stack.get(stack.size()-1).min;
	}

	/*
	 * Write a program to sort a stack in ascending order 
	 * You should not make any assumptions about how the stack is implemented 
	 * The following are the only functions that should be used to write this program: push | pop | peek | isEmpty 
	 */
	public void sort() {
		// method 1 - using a linked list
		List<Integer> sortedList = new LinkedList<Integer>();

		if(isEmpty()) {
			return;
		}

		Node topNode = pop();
		while (null != topNode) {
			if(sortedList.isEmpty()) {
				sortedList.add(topNode.data);
			} else {
				Iterator<Integer> it = sortedList.iterator();
				int index = 0;

				while(it.hasNext()) {

					if(topNode.data < it.next()) {
						break;
					}
					index++;
				}
				sortedList.add(index, topNode.data);
			}
			topNode = pop();
		}

		Iterator<Integer> it = sortedList.iterator();
		while(it.hasNext()) {
			push(it.next());
		}

	}

	class Node {
		int data;
		int min = Integer.MAX_VALUE;

		public String toString() {
			return ""+data; 
			//return "data:" + data; // + " min:" + min;
		}
	}
}

//method 2 will give dynamically-alloted spaces for the threestacks
class Stack2 {
	int[] array = new int[30];
	//int pointer = 0;
	List<Integer> stack1 = new LinkedList<Integer>();
	List<Integer> stack2 = new LinkedList<Integer>();
	List<Integer> stack3 = new LinkedList<Integer>();

	List<Integer> availableSpace = new LinkedList<Integer>();

	Stack2() {
		for(int i=0; i<array.length; i++) {
			availableSpace.add(i);
		}
		System.out.println("available spaces: " + availableSpace);
	}

	public boolean pushInStack(int stackNumber, int number) {
		if((stackNumber < 0) || (stackNumber > 2)) {
			return false;
		}

		if(!availableSpace.isEmpty() && availableSpace.get(0) != null) {

			if(stackNumber == 0) {
				stack1.add(availableSpace.get(0));
			} else if(stackNumber == 1) {
				stack2.add(availableSpace.get(0));
			} else {
				stack3.add(availableSpace.get(0));
			}

			array[availableSpace.get(0)] = number;
			availableSpace.remove(0);
			//pointer = availableSpace.get(0);
			return true;
		}

		return false;
	}

	public int peekFromStack(int stackNumber) {
		if((stackNumber < 0) || (stackNumber > 2)) {
			return Integer.MIN_VALUE;
		}

		int index = 0;
		if(stackNumber == 0) {
			try {
				index = stack1.get(stack1.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		} else if(stackNumber == 1) {
			try {
				index = stack2.get(stack2.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		} else {
			try {
				index = stack3.get(stack3.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		}

		if(index != -1)
			return array[index];
		else 
			return Integer.MIN_VALUE;
	}

	public int popFromStack(int stackNumber) {
		if((stackNumber < 0) || (stackNumber > 2)) {
			return Integer.MIN_VALUE;
		}

		int index = 0;
		if(stackNumber == 0) {
			try {
				index = stack1.get(stack1.size()-1);
				stack1.remove(stack1.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		} else if(stackNumber == 1) {
			try {
				index = stack2.get(stack2.size()-1);
				stack2.remove(stack2.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		} else {
			try {
				index = stack3.get(stack3.size()-1);
				stack3.remove(stack3.size()-1);
			} catch(IndexOutOfBoundsException e) {
				index = -1;
			}
		}

		if(index != -1) {
			availableSpace.add(index);
			return array[index];
		}
		else 
			return Integer.MIN_VALUE;
	}

	//public boolean hasSpace(int stackNumber) {}


	public boolean isEmpty(int stackNumber) {
		if(stackNumber == 0) {
			if(stack1.isEmpty())
				return true;
		} else if(stackNumber == 1) {
			if(stack2.isEmpty())
				return true;
		} else {
			if(stack3.isEmpty())
				return true;
		}
		return false;
	}


}
/*
 * Describe how you could use a single array to implement three stacks 
 */
// method 1 will give pre-alloted spaces for the threestacks
class Stack1 {
	int[] array = new int[30];
	int stack1Base = 0;
	int stack2Base = 10;
	int stack3Base = 20;

	int stack1Top = 9;
	int stack2Top = 19;
	int stack3Top = 29;

	int stack1Pointer = -1;
	int stack2Pointer = 9;
	int stack3Pointer = 19;

	public int peekFromStack(int stackNumber) {

		if((stackNumber < 0) || (stackNumber > 2)) {
			return -1;
		}

		if(stackNumber==0) {
			if((stack1Pointer <= 9)) {
				return array[stack1Pointer];
			}
		} else if(stackNumber==1) {
			if((stack2Pointer >= 10) && (stack2Pointer <=19)) {
				return array[stack2Pointer];
			}
		} else {
			if((stack3Pointer >= 20) && (stack3Pointer <=29)) {
				return array[stack3Pointer];
			}
		}
		return -1;
	}

	public int popFromStack(int stackNumber) {

		if((stackNumber < 0) || (stackNumber > 2)) {
			return -1;
		}

		if(stackNumber==0) {
			if((stack1Pointer >= 0) && (stack1Pointer <= 9)) {
				return array[stack1Pointer--];
			}
		} else if(stackNumber==1) {
			if((stack2Pointer >= 10) && (stack2Pointer <=19)) {
				return array[stack2Pointer--];
			}
		} else {
			if((stack3Pointer >= 20) && (stack3Pointer <= 29)) {
				return array[stack3Pointer--];
			}
		}
		return -1;
	}

	public boolean pushInStack(int stackNumber, int number) {

		if((stackNumber < 0) || (stackNumber > 2) || (number == 0)) {
			return false;
		}

		if(stackNumber==0) {
			if(stack1Pointer < 9) {
				array[stack1Pointer+1] = number;
				stack1Pointer++;
				return true;
			}
		} else if(stackNumber==1) {
			if(stack2Pointer <19) {
				array[stack2Pointer+1] = number;
				stack2Pointer++;
				return true;
			}
		} else {
			if (stack3Pointer <29) {
				array[stack3Pointer+1] = number;
				stack3Pointer++;
				return true;
			}
		}
		return false;
	}

	public boolean hasSpace(int stackNumber) {
		if(stackNumber==0) {
			if((stack1Pointer >= 0) && (stack1Pointer < 9)) {
				return true;
			}
		} else if(stackNumber==1) {
			if((stack2Pointer >= 10) && (stack2Pointer <19)) {
				return true;
			}
		} else {
			if((stack3Pointer >= 20) && (stack3Pointer <29)) {
				return true;
			}
		}
		return false;
	}


}
