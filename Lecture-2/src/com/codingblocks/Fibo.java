package com.codingblocks;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 1;

        int n = scanner.nextInt();

        if ( n < 2){
            System.out.println(n);
        } else {

            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

            System.out.println(b);
        }
    }
}
