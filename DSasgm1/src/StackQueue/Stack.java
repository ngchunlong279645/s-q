package StackQueue;

import java.util.EmptyStackException;

public class Stack {
	private int[] stack;
	private int top;
	 
	
	public Stack(int size) {
		stack=new int[size];
		top=-1;
	}

	public boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top==stack.length-1)
			return true;
		else
			return false;
	}
	
	public void push(int newItem){
	     if (isFull())
	         System.out.println ("Stack Full");
	    else{
	    	top++;
	         stack[top]=newItem;
	         }
	}
	
	public int pop(){
	     if (isEmpty()) {
	         System.out.println ("Empty Stack");
	         throw new EmptyStackException();
	         }
	    else {
	    	
	         return stack[top--];
	    }
	}
	
	public int peek()
	{
	     if (isEmpty()){
	         System.out.println ("Empty stack");
	         throw new EmptyStackException();
	   }
	    else
	         return stack[top];
	}
	
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public void printBack() {
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public int getTop() {
		return stack[top];
	}
	
	public int getSecond() {
		return stack[top-1];
	}
	
	public int countItems() {
		return top+1;
	}
	
	public void removeItem(int input) {
		for(int i=0;i<=top;i++) {
			if(stack[i]==input) {
				for(int j=i;j<=top;j++)
					stack[j]=stack[j+1];
				top--;	
			}
		}
	}
	
	
	
}
