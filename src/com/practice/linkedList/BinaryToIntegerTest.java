package com.practice.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryToIntegerTest {

	@Test
	void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		BinaryToInteger binaryToInteger = new BinaryToInteger();
		int output = binaryToInteger.getDecimalValue(node1);
		assertEquals(output , 11);
		
		
	}

}
