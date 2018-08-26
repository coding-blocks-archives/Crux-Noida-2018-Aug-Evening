package com.codingblocks;

import java.util.Scanner;

public class FiboLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;

        int n = scanner.nextInt();


        while (a < n) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }


    }
}
