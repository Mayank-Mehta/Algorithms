package com.datastrucutres.tree;

public class NodeUtil {
	public static Node<String> createBTree(){
		Node<String> rootNode = new Node<String>();
		Node<String> leftNode = new Node<String>();
		Node<String> rightNode = new Node<String>();
		Node<String> leftLeftNode = new Node<String>();
		Node<String> leftRightNode = new Node<String>();
		Node<String> rightLeftNode = new Node<String>();
		Node<String> rightRightNode = new Node<String>();
		
		rootNode.setData("A");
		leftNode.setData("B");
		rightNode.setData("C");
		leftLeftNode.setData("D");
		leftRightNode.setData("E");
		rightLeftNode.setData("F");
		rightRightNode.setData("G");
		rootNode.setLeftchild(leftNode);
		rootNode.setRightChild(rightNode);
		leftNode.setLeftchild(leftLeftNode);
		leftNode.setRightChild(leftRightNode);
		rightNode.setLeftchild(rightLeftNode);
		rightNode.setRightChild(rightRightNode);
		return rootNode;
	}
}
