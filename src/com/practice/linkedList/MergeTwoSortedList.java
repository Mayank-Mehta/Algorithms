package com.practice.linkedList;

public class MergeTwoSortedList {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalList = null;
        ListNode tempNode = null;
        while(l1 != null && l2 !=null) {
        	if(l1.val > l2.val) {
        		ListNode node = new ListNode(l2.val);
        		if(finalList == null) {
        			finalList = node;
        		}else {
        			tempNode.next = node;
        		}
        		tempNode = node;
        		l2 = l2.next;
        	}else{
        		ListNode node = new ListNode(l1.val);
        		if(finalList == null) {
        			finalList = node;
        		}else {
        			tempNode.next = node;
        		}
        		tempNode = node;

        		l1 = l1.next;
        	}
        	
        }
		
		while(l1 != null) {
			ListNode node = new ListNode(l1.val);
			if(finalList == null) {
				finalList = node;
			}else {
				tempNode.next = node;
			}
			tempNode = node;
			l1 = l1.next;
		}
		
		while(l2 != null) {
			ListNode node = new ListNode(l2.val);
			if(finalList == null) {
				finalList = node;
			}else {
				tempNode.next = node;
			}
			tempNode = node;
			l2 = l2.next;
		}
		return finalList;
    }
	
	
	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode finalList = new ListNode(0);
        ListNode tempNode = finalList;
        while(l1 != null && l2 !=null) {
        	if(l1.val < l2.val) {
        		tempNode.next = l1;
        		tempNode = l1;
        		l1 = l1.next;
        	}else{
	    		tempNode.next = l2;
	    		tempNode = l2;
	    		l2 = l2.next;
        	}
        }
		
		while(l1 != null) {
			tempNode.next = l1;
    		tempNode = l1;
    		l1 = l1.next;
		}
		
		while(l2 != null) {
			tempNode.next = l2;
    		tempNode = l2;
    		l2 = l2.next;
		}
		return finalList.next;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode mergeTwoLists = mergeTwoLists2(node4, null);
		while(mergeTwoLists != null) {
			System.out.println(mergeTwoLists.val);
			mergeTwoLists = mergeTwoLists.next;
		}
	}
}
