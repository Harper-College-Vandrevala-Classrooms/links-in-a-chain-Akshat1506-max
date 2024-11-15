package com.csc;

public class Main {
    public static void main(String[] args) {
        LinkedList chainList = new LinkedList();

        // Create ChainLink objects with different colors
        ChainLink redLink = new ChainLink("red");
        ChainLink blueLink = new ChainLink("blue");
        ChainLink greenLink = new ChainLink("green");

        // Append ChainLink objects to the linked list
        chainList.append(redLink);
        chainList.append(blueLink);
        chainList.append(greenLink);

        // Retrieve and print the colors of ChainLink objects by index
        System.out.println("Color at index 0: " + chainList.get(0).color); // Output: red
        System.out.println("Color at index 1: " + chainList.get(1).color); // Output: blue
        System.out.println("Color at index 2: " + chainList.get(2).color); // Output: green
    }
}