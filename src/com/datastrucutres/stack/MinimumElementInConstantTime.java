package com.datastrucutres.stack;

public class MinimumElementInConstantTime {
	private Stack<Integer> mainStack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
	
	public void push(Integer element) throws Exception {
		mainStack.push(element);
		if(minStack.isEmpty()) {
			minStack.push(element);
		}else {
			if(element > minStack.peek()) {
				minStack.push(minStack.peek());
			}else {
				minStack.push(element);
			}
			
		}
	}
	
	public Integer pop() throws StackUnderflowException {
		minStack.pop();
		return mainStack.pop();
	}
	
	public Integer getMinimum() throws StackUnderflowException{
		return minStack.peek();
	}
	
	
	
}
