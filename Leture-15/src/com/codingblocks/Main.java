package com.codingblocks;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {


    public static File output = new File("output.txt");
    public static PrintStream out;

    public static void main(String[] args) throws Exception {
	// write your code here

        // 10 true 20 true 15 false false true 13 false false true 12 false false

        out = new PrintStream(output);

        BinaryTree tree = new BinaryTree();

        File input = new File("input.txt");

        tree.populate(new Scanner(input));

//        tree.display();
//
//        System.out.println(tree.largest());

        tree.printLevel(2);

    }
}
