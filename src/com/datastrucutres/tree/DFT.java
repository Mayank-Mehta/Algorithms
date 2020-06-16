package com.datastrucutres.tree;

public class DFT {
	public static void main(String[] args) {
		NodeUtil util = new NodeUtil();
		Node<String> rootNode = util.createBTree();
		DFT tree = new DFT();
		//tree.traversePostOrder(rootNode);
		//tree.traversePreOrder(rootNode);
		tree.traverseInOrder(rootNode);
	}

	private void traversePostOrder(Node<String> rootNode) {
			if(rootNode == null) {
				return;
			}
			
			traversePostOrder(rootNode.getLeftchild());
			traversePostOrder(rootNode.getRightChild());
			System.out.println(rootNode.getData());
	}
	
	private void traversePreOrder(Node<String> rootNode) {
		if(rootNode == null) {
			return;
		}
		
		System.out.println(rootNode.getData());
		traversePreOrder(rootNode.getLeftchild());
		traversePreOrder(rootNode.getRightChild());
}
	
	private void traverseInOrder(Node<String> rootNode) {
		if(rootNode == null) {
			return;
		}
		
		traverseInOrder(rootNode.getLeftchild());
		System.out.println(rootNode.getData());
		traverseInOrder(rootNode.getRightChild());
}
}
