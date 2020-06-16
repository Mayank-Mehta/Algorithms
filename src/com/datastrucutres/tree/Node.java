package com.datastrucutres.tree;

public class Node<T> {
	private T data;
	private Node<T> leftchild;
	private Node<T> rightChild;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeftchild() {
		return leftchild;
	}
	public void setLeftchild(Node<T> leftchild) {
		this.leftchild = leftchild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
