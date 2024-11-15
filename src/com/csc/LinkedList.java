package com.csc;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Append a ChainLink to the end of the list
    public void append(ChainLink data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Get ChainLink at a specific index
    public ChainLink get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
}