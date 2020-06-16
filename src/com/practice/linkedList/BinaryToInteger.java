package com.practice.linkedList;

public class BinaryToInteger {
	public int getDecimalValue(ListNode head) {
        if(head == null){
            return 0;
        }
        int number = 0;
        int length = 0;
        ListNode header = head;
        while (head.next !=null){
            length++;
            head = head.next;
        }
        System.out.println("length:" + length);
        for(int i=length;i>=0;i--){
            if(header.val==1){
                number = number + (int)Math.pow(2,i);
            }
            header = header.next;
        }
    return number;    
    }
	
	 public int getDecimalValue1(ListNode head) {
			ListNode curr = head;
	        int result = 0;
	        while(curr!=null){
	            result *= 2;
	            if(curr.val ==  1) result++;
	            curr = curr.next;
	        }
	        return result;
	    }
	
	
}
