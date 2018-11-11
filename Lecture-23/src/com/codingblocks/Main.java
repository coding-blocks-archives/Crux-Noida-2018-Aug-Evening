package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tries tries = new Tries();

        tries.insert("anuj");
        tries.insert("mona");

        tries.remove("anuj");

        System.out.println(tries.findPrefix("a"));


    }
}
