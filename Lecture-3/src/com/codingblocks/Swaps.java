package com.codingblocks;

public class Swaps {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);

        {

            a = 56;

            int c = 345;

            System.out.println(c);
        }

//        System.out.println(c);
    }

    private static void swap(int x, int y) {

        int temp = x;
        x = y;
        y = temp;
    }


}
