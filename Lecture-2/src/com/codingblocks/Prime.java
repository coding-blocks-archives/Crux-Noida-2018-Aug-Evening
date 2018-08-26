package com.codingblocks;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int c = 2;

        while (c * c <= num){
            if (num % c == 0){
                break;
            }
            c = c + 1;
        }

        if ( c * c > num ){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
