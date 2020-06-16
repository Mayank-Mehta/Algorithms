package com.practice.linkedList;

public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode oddList = head;
		ListNode evenList = head.next;
		ListNode movingOddNode = head;
		ListNode movingEvenNode = head.next;
		while(movingOddNode != null && movingEvenNode!=null) {
			movingOddNode.next = movingEvenNode.next;
            if(movingOddNode.next != null) {
            	movingOddNode = movingOddNode.next;
            }
            if(movingOddNode != null) {
            	movingEvenNode.next = movingOddNode.next;
            	movingEvenNode = movingEvenNode.next;
            }
		}
		movingOddNode.next = evenList;
		return oddList;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode mergeTwoLists = oddEvenList(node1);
		while(mergeTwoLists != null) {
			System.out.println(mergeTwoLists.val);
			mergeTwoLists = mergeTwoLists.next;
		}
	}
}
