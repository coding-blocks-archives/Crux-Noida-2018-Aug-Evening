package com.codingblocks;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
//        int a = 12;
//////        int b = 23;
//////        int c = 15;
//////
//////        int max = 0;
//////
//////        if(a > b){
//////            max = a;
//////        } else {
//////            max = b;
//////        }
//////
//////        if (max < c){
//////            max = c;
//////        }
//////
//////        System.out.println(max);


        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sum = 0;

        while (n > 0){
            sum = sum + n;
            n = n - 1;
        }

        System.out.println(sum);
    }

}
