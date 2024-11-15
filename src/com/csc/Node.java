package com.csc;

public class Node {
    public ChainLink data;
    public Node next;

    public Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }
}