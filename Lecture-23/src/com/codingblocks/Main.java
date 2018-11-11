package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Tries tries = new Tries();
//
//        tries.insert("anuj");
//        tries.insert("mona");
//
//        tries.remove("anuj");
//
//        System.out.println(tries.findPrefix("a"));
//

        BinarySearchTree tree = new BinarySearchTree();

        for (int i = 0; i < 10000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());



    }
}
