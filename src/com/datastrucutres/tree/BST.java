package com.datastrucutres.tree;

public class BST {
	private Node<Integer> insertUsingRecursion(Node<Integer> head, Node<Integer> node){
		if(head == null) {
			return node;
		}
		
		if(node.getData()<= head.getData()) {
			head.setLeftchild(insert(head.getLeftchild(), node));
		}else {
			head.setRightChild(insert(head.getRightChild(),node));
		}
		return head;
	}
	
	
	private Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
		Node<Integer> rootNode = head;
		if(head == null) {
			return rootNode;
		}
		while(true) {
			if(node.getData()<= head.getData()) {
				if(head.getLeftchild() == null) {
					head.setLeftchild(node);
					break;
				}else {
					head = head.getLeftchild();
				}
			}else {
				if(head.getRightChild() == null) {
					head.setRightChild(node);
					break;
				}else {
					head = head.getRightChild();
				}
			}
		}
		return rootNode;
		
	}
		
	private boolean lookup(Node<Integer> head, Integer value) {
		if(head == null) {
			return false;
		}
		
		if(head.getData() == value ) {
			return true;
		}
		
		if(head.getData() < value) {
			return lookup(head.getRightChild(), value);
		}else {
			return lookup(head.getLeftchild(), value);
		}
	}
}
