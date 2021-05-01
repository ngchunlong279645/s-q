package StackQueue;

import java.util.Scanner;

public class Main {
	static Queue q = new Queue(999);
	static Stack s = new Stack(999);
	static Queue q2 = new Queue(999);
	
	public static void main(String[] args) {
		int integer;
		int value;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter integers (999 to stop): ");
		do{
			integer= scan.nextInt();
			if(integer!=999)
				s.push(integer);
			else
				break;
		}while(integer!=999);  
		
		System.out.println("The original stack printed in direct order (bottom to top) is:");
		s.printStack();
		System.out.println("\nThe stack printed in reverse order (top to bottom) is: ");
		s.printBack();
		System.out.println("\nThe stack stores "+s.countItems()+" items.");
		System.out.println("The top is: "+s.getTop());
		System.out.println("The second item (below top) is: "+s.getSecond());
		System.out.println("\nEnter value to be removed from stack: ");
		value = scan.nextInt();
		s.removeItem(value);
		System.out.println("The stack after removing every occurrence of "+value+" is:");
		s.printStack();
		System.out.println("Reversed the stack. The new stack printed in direct order is: ");
		reverseStack();
	 
		q2.enqueue(3);
		q2.enqueue(6);
		q2.enqueue(12);
		q2.enqueue(15);
		q2.enqueue(18);
		q2.enqueue(21);
		q2.enqueue(24);
		q2.enqueue(27);
		q2.enqueue(30);	
		System.out.println("\nThe queue is: ");
		q2.printQueue();
		System.out.println("The reversed queue is: ");
		reverseQueue();
	}
	
	public static void reverseStack() {
		while(!s.isEmpty()) {
			q.enqueue(s.pop());
		}
		q.printQueue();
	}
	
	public static void reverseQueue() {
		while(!q2.isEmpty()) {
			s.push(q2.dequeue());
		}
		s.printBack();
	} 
	
	
	}//end

