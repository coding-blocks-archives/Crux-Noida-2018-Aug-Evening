package com.codingblocks;

import java.util.Arrays;
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

    public int size(){
        return size(root);
    }

    private int size(Node node) {
        if (node == null){
            return 0;
        }

        return 1 + size(node.left) + size(node.right);
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null){
            return;
        }

        Main.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public int largest(){
        return largest(root);
    }

    private int largest(Node node) {

        int max = node.value;

        if (node.left != null){
            max = Math.max(max, largest(node.left));
        }

        if (node.right != null){
            max = Math.max(max, largest(node.right));
        }

        return max;
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null){
            return;
        }

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void printLevel(int depth){
        printLevel(root, depth);
    }

    private void printLevel(Node node, int depth) {
        if (node == null){
            return;
        }

        if (depth >= 0) {
            printLevel(node.left, depth - 1);
            if (depth == 0) {
                System.out.println(node.value);
            }
            printLevel(node.right, depth - 1);
        }
    }

    public int height(){
        return height(root);
    }

    private int height(Node node) {
        if (node == null){
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int diameter(){

        if (root == null){
            return 0;
        }

        return 1 + height(root.left) + height(root.right);
    }


    public boolean find(int item){
        return find(root, item);
    }

    private boolean find(Node node, int item) {
        if (node == null){
            return false;
        }

        return node.value == item || find(node.left, item) || find(node.right, item);
    }

    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {
        if (node == null){
            return;
        }

        Node t = node.left;
        node.left = node.right;
        node.right = t;

        mirror(node.left);
        mirror(node.right);
    }

    public static BinaryTree treeUsingPreAndIn(int[] pre, int[] in){

        BinaryTree tree = new BinaryTree();

        tree.root = preAndIn(pre, in);

        return tree;
    }

    public static Node preAndIn(int[] pre, int[] in){

        if (pre.length == 0){
            return null;
        }

        int r = pre[0];

        int index = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] == r){
                index = i;
            }
        }

        Node node = new Node(r);

        node.left = preAndIn(Arrays.copyOfRange(pre, 1, index + 1),
                Arrays.copyOfRange(in, 0, index));

        node.right = preAndIn(Arrays.copyOfRange(pre, index + 1, pre.length),
                Arrays.copyOfRange(in, index + 1, in.length));

        return node;
    }

//    public static Node postAndIn(int[] post, int[] in){
//        if(post.length == 0){
//            return null;
//        }
//
//        int r = post[post.length - 1];
//
//
//
//    }


    private static class Node {

        private int value;

        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
