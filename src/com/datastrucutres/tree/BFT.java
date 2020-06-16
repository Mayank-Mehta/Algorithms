package com.datastrucutres.tree;

import com.datastrucutres.queue.Queue;

public class BFT {
   	public void traverse(Node<String> rootNode) throws Exception{
   		Queue<Node> queue = new Queue<Node>(Node.class);
   		queue.enqueue(rootNode);
   		while (!queue.isEmpty()) {
   			Node<String> node = queue.dequeue();
   			process(node);
   			if(node.getLeftchild() != null) {
   				queue.enqueue(node.getLeftchild());
   			}
   			if(node.getRightChild() != null) {
   				queue.enqueue(node.getRightChild());
   			}
   			
   		}
   		
   	}
   	
   	public void process(Node<String> node) {
   		System.out.println(node.getData());
   	}
   	
   	
   	public static void main(String[] args) throws Exception {
		NodeUtil util = new NodeUtil();
		Node<String> rootNode = util.createBTree();
		BFT tree = new BFT();
		tree.traverse(rootNode);
	}
}	


