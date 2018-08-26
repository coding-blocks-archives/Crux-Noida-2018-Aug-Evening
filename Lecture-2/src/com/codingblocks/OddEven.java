package com.codingblocks;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int result = 0;

        int odd = 0;
        int even = 0;


        while (num > 0){
            int rem = num % 10;
            num = num / 10;

            even  = even + rem;

            rem = num % 10;
            num = num/10;

            odd = odd + rem;

        }

        System.out.println(even);
        System.out.println(odd);
    }
}
