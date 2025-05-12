package com.test.hacker;

class DoublyListNode {
    int val;
    DoublyListNode next, prev;
    DoublyListNode(int x) { val = x; }
}

public class DoublyLinkedList {
    private DoublyListNode head;

    // Method to add a node at the end
    public void add(int val) {
        DoublyListNode newNode = new DoublyListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            DoublyListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to search for a node
    public boolean search(int val) {
        DoublyListNode current = head;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        }
        return false;
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

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();  // Output: 1 <-> 2 <-> 3 <-> null
        System.out.println(list.search(2));  // Output: true
        System.out.println(list.search(4));  // Output: false
    }
}

