package com.test.hacker.practice;

class DoublyListNode {
	int val;
	DoublyListNode next, prev;

	DoublyListNode(int x) {val = x;}
}

public class DoublyLinkedList {
	private DoublyListNode head;
	private DoublyListNode tail;

	// Method to add a node at the end
	public void add(int val) {
		DoublyListNode newNode = new DoublyListNode(val);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			DoublyListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			current.next.prev = current;
			tail = current.next;
		}
	}

	// Method to search for a node
	public boolean search(int val) {
		if (head == null) {
			return false;
		} else {
			if (head.val == val) {
				return true;
			} else {
				DoublyListNode current = head;
				while (current.next != null) {
					current = current.next;
					if (current.val == val)
						return true;
				}
				return false;
			}
		}
	}

	// Method to print the linked list
	public void printList() {
		DoublyListNode current = head;
		while (current != null) {
			System.out.print(current.val + " <-> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void printListBackwards() {
		DoublyListNode current = tail;
		while (current != null) {
			System.out.print(current.val + " <-> ");
			current = current.prev;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		// list.add(4);
		list.printList(); // Output: 1 <-> 2 <-> 3 <-> null
		list.printListBackwards(); // Output: 3 <-> 2 <-> 1 <-> null
		System.out.println(list.search(2)); // Output: true
		System.out.println(list.search(4)); // Output: false
	}
}
