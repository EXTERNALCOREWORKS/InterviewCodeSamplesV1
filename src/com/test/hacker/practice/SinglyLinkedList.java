package com.test.hacker.practice;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SinglyLinkedList {
    private ListNode head;

    // Method to add a node at the end
    public void add(int val) {
    	ListNode newNode = new ListNode(val);
        if(head==null) {
        	head= newNode;
        }else {
        	ListNode current = head;
        	while(current.next!=null) {
        		current=current.next;
        	}
        	current.next = newNode;
        }
    }

    // Method to search for a node
    public boolean search(int val) {
        if(head==null) {
        	return false;
        }else {
        	if(head.val==val) {
        		return true;
        	}else {
        		ListNode current = head;
            	while(current.next!=null) {
            		current=current.next;
            		if(current.val==val)
            			return true;
            	}
            	return false;
        	}
        }
    }

    // Method to print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();  // Output: 1 -> 2 -> 3 -> null
        System.out.println(list.search(2));  // Output: true
        System.out.println(list.search(4));  // Output: false
    }
}
