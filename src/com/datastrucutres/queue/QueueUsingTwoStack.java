package com.datastrucutres.queue;

import com.datastrucutres.stack.Stack;

public class QueueUsingTwoStack<T> {
	private Stack<T> mainStack = new Stack<T>();
	private Stack<T> reverseStack = new Stack<T>();
	private static int MAX_SIZE = 50;
	
	public T dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		
		if(reverseStack.isEmpty()) {
			while(!mainStack.isEmpty()) {
				reverseStack.push(mainStack.pop());
			}
		}
		
		
		return reverseStack.pop();
	}
	
	public void enqueue(T t) throws Exception{
		if(isFull()) {
			throw new Exception("queue is full");
		}
		if(mainStack.isEmpty()) {
			while(!reverseStack.isEmpty()) {
				mainStack.push(reverseStack.pop());
			}
		}
		mainStack.push(t);
	}
	
	public boolean isFull() {
		return mainStack.getSize()+reverseStack.getSize() == MAX_SIZE;
	}
	
	public boolean isEmpty() {
		return mainStack.getSize()+reverseStack.getSize() == 0;
	}
	
	
}
