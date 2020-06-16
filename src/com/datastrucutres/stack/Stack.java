package com.datastrucutres.stack;

public class Stack<T> {
	private Node<T> top;
	private static int MAX_SIZE=40;
	private int size = 0;
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==MAX_SIZE;
	}
	
	public void push(T element) throws StackOverflowException {
		if(isFull()) {
			throw new StackOverflowException();
		}
		Node<T> newElement = new Node<T>(element, top);
		top = newElement;
		size++;
	}
	
	public T pop() throws StackUnderflowException{
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		Node<T> elementToReturn = top;
		top = top.getNext();
		size--;
		return elementToReturn.getData();
	}
	
	public T peek() throws StackUnderflowException{
		if(isEmpty()) {
			throw new StackUnderflowException();
		}
		return top.getData();
	}
	
	
	
	
	
	
	public int getSize() {
		return size;
	}

	public static void main(String[] args) throws Exception{
		Stack<Integer> s = new Stack<Integer>();
		try {
			s.push(1);
			s.push(3);
			System.out.println(s.pop());
			System.out.println(s.peek());
		}catch(StackUnderflowException e) {
			e.printStackTrace();
		}
		
	} 
	
	
	
}



