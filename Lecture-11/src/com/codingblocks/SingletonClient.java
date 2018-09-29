package com.codingblocks;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();

        Singleton dub = Singleton.getInstance();



        System.out.println(single);
        System.out.println(dub);


    }
}
