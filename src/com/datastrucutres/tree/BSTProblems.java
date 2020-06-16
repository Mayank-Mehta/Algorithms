package com.datastrucutres.tree;

public class BSTProblems {
	public int minValue(Node<Integer> head) {
		if(head.getLeftchild() == null) {
			return head.getData();
		}
		return minValue(head.getLeftchild());
		
	}
	
	public int maxDepth(Node<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.getLeftchild() == null && root.getRightChild() == null) {
			return 0;
		}
		
		int leftMaxDepth = 1 + maxDepth(root.getLeftchild());
		int rightMaxDepth = 1+ maxDepth(root.getRightChild());
		return Math.max(leftMaxDepth, rightMaxDepth);
	}
	
	
	public Node<Integer> mirror(Node<Integer> root) {
		Node<Integer> n = new Node<Integer>();
		if(root == null) {
			return null;
		}
		n.setData(root.getData());
		n.setLeftchild(mirror(root.getRightChild()));
		n.setRightChild(mirror(root.getLeftchild()));
		return n;
	}
	
	public static int structurallyUniqueBTPossible(int numOfNodes) {
		int sum=0;
		if(numOfNodes <= 1) {
			return 1;
		}
		for(int i = 1; i<= numOfNodes; i++) {
			int left = structurallyUniqueBTPossible(i-1);
			int right = structurallyUniqueBTPossible(numOfNodes -i);
			sum = sum + (left*right);
		}
		return sum;
	
	}
	
	public static void main(String[] args) {
		System.out.println(BSTProblems.structurallyUniqueBTPossible(3));
	}
	
	public static void printNodesInARange(Node<Integer> root, int min, int max) {
		if(root == null) {
			return;
		}
		if(root.getData() >= min && root.getData() <= max) {
			System.out.println(root.getData());
			printNodesInARange(root.getRightChild(), min, max);
			printNodesInARange(root.getLeftchild(), min, max);
		}
		
		if(root.getData() < min && root.getData()< max) {
			printNodesInARange(root.getRightChild(), min, max);
		}
		
		if(root.getData() > min && root.getData()> max) {
			printNodesInARange(root.getLeftchild(), min, max);
		}
		
	}
	
	public static boolean isBST(Node<Integer> root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.getData() <= min || root.getData() > max) {
			return false;
		}
		return isBST(root.getLeftchild(), min, root.getData())  &&  isBST(root.getRightChild(),root.getData(),max);
		
	}
	
}
