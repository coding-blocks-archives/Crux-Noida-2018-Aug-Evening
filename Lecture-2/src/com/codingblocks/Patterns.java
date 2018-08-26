package com.codingblocks;

public class Patterns {
    public static void main(String[] args) {
        int n = 7;

//        int k = 1;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(k + "   ");
//                k = k + 1;
//            }
//
//            System.out.println();
//        }

        int i = 0;

        for (int k = 0; k < 2 * n - 1; k++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (k < n - 1  ){
                i++;
            } else {
                i--;
            }

        }
    }
}
