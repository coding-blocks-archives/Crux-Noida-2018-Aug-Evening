package com.codingblocks;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    public void populate(Scanner scanner){
        System.out.println("Enter value of root Node");

        int value = scanner.nextInt();

        root = new Node(value);

        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter value of left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter value of right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    private class Node {

        private int value;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
