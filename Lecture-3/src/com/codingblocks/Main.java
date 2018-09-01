package com.codingblocks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        long val = 3456456788977654l;
////
////        double a = val;
////
////        System.out.println(val);
////        System.out.println('a' + 0);


        Scanner s = new Scanner(System.in);

//        int start = s.nextInt();
//        int end = s.nextInt();
//        int step = s.nextInt();

        //convertor(start, end, step);

        int whatever = s.nextInt();

        System.out.println(prime(whatever));

    }

    public static void convertor(int start, int end, int step){
        for (int i = start; i <= end; i+=step) {


            float c = (5f/9) * (i - 32);

            System.out.println(c);

        }
    }

    public static boolean prime(int num){

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
