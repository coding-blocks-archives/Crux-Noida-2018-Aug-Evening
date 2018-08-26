package com.codingblocks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int result = 0;

        int counter = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;

            // to count no. of 5
            if (rem == 5){
                counter++;
            }

            // to reverse
            result = result * 10 + rem;
        }

        System.out.println(result);
    }
}
