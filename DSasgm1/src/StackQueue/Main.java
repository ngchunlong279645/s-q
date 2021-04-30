package StackQueue;

import java.util.Scanner;

public class Main {
	static Queue q = new Queue();
	static Stack s = new Stack();
	
	public static void main(String[] args) {
		
		int integer;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter integers (999 to stop): ");
		do{
			integer= scan.nextInt();
			if(integer!=999)
				s.push(integer);
			else
				break;
		}while(integer!=999);  
		
		
		s.printStack();
		s.printBack();
	}
		//System.out.println(s.getSecond());
		//System.out.println(s.countItems());
		//s.removeItem(10);
		//s.printBack();
		//reverseStack();
		
	/*	System.out.println("Enter integers");
		do{
			integer= scan.nextInt();
			if(integer!=999)
				q.enqueue(integer);
			else
				break;
		}while(integer!=999);
		q.printQueue();
		reverseQueue();
	} */

	
	public static void reverseStack() {
		while(!s.isEmpty()) {
			q.enqueue(s.pop());
		}
		q.printQueue();
	}
	
	public static void reverseQueue() {
		while(!q.isEmpty()) {
			s.push(q.dequeue());
		}
		s.printStack();
	}
	
	
	}//end

