package com.datastrucutres.queue;

import java.lang.reflect.Array;

public class Queue<T> {
	private static int MAX_SIZE = 50;
	private T[] elements; 
	int head = -1;
	int tail = -1;
	
	
	
	public Queue(Class<T> clazz) {
		elements = (T[])Array.newInstance(clazz, MAX_SIZE);
	}

	public T dequeue() throws Exception{
        if(isEmpty()) {
        	throw new Exception("queue is empty");
        }
        int nextIndex = (head+1)%elements.length;
        head = nextIndex;
        return elements[nextIndex];
	}
	
	public void enqueue(T t) throws Exception{
		if(isFull()) {
			throw new Exception("queue is full");
		}
		/*
		 * if(head == -1) { head = 0; }
		 */
		int nextIndex = (tail+1)%elements.length;
		tail=nextIndex;
		elements[tail] = t;
		
	}
	
	public T peek() {
		return elements[tail] ;
	}
	
	public boolean isEmpty() {
		return tail == head;
	}
	
	public boolean isFull() {
		int tailsNextIndex = (tail+1)%elements.length;
		return tailsNextIndex == head;
	}
	
	public static void main(String[] args) throws Exception{
		Queue<Integer> q = new Queue<Integer>(Integer.class);
		System.out.println(q.isEmpty());
	//	System.out.println(q.dequeue());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}
	
	
}
