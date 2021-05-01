package StackQueue;

public class Queue {
	private int frontIndex, backIndex, bilItem;
	private int [] queue;
		
	public Queue(int size)
	{
		queue = new int[size];
		frontIndex = 0;
		backIndex = -1;
		bilItem=0;
	}
	
	public boolean isFull() 
	{
		return bilItem>=queue.length;
	}
	
	public boolean isEmpty() 
	{
		return bilItem==0;
	}
	
	public void enqueue(int entry)
	{
		if (isFull())			
		System.out.println(entry+" cannot be added because Queue is full");					
		else
		{
			backIndex = (backIndex+1)%queue.length;
			queue[backIndex] = entry;
			bilItem++;
		}	
	}
	
	
	public int dequeue()
	{
		int result=0 ;
		if (isEmpty())
			System.out.println("Queue is empty. Cannot delete data");
		else
		{
			result = queue[frontIndex];
			frontIndex = (frontIndex+1)%queue.length;
			bilItem--;	
		}
		return result;
	}
	
	public void printQueue() {
		if(isEmpty()) {	
			System.out.println("Queue is empty. Cannot print data");
		}
		else if(frontIndex <= backIndex) {
			for (int i= frontIndex; i<=backIndex ; i++) 
				System.out.print(queue[i]+" ");
		}
		else {
			for (int i= frontIndex; i<queue.length ; i++) 
				System.out.print(queue[i]+"\t");
			for(int i=0;i<=backIndex;i++)
				System.out.print(queue[i]+"\t");
		}
		System.out.println();
	}
	
	
	
}
