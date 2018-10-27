package com.codingblocks;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree tree = new BinarySearchTree();

//        int[] data = {10, 5, 20, 3, 7, 15, 20};
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 44, 77};

        tree.populateWithSorted(data);

//        tree.insert(10);
//        tree.insert(5);
//        tree.insert(20);
//        tree.insert(3);
//        tree.insert(7);
//        tree.insert(15);
//        tree.insert(30);

        tree.display();

        LinkedList<BinarySearchTree.Node> nodes = tree.sortedList();

        for (BinarySearchTree.Node node: nodes) {
            System.out.println(node.getValue());
        }

        System.out.println(tree.balance());
    }
}
