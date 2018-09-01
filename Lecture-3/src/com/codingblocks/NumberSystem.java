package com.codingblocks;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int deci = s.nextInt();

        int bin = deci2any(deci, 8);

        System.out.println(bin);
    }

    private static int deci2bin(int deci) {
        int bin = 0;
        int base = 1;

        while (deci > 0){
            int rem = deci % 2;
            deci = deci / 2;

            bin = bin + rem * base;

            base = base * 10;
        }

        return bin;
    }

    private static int deci2any(int deci, int any) {
        int any_value = 0;
        int base = 1;

        while (deci > 0){
            int rem = deci % any;
            deci = deci / any;

            any_value = any_value + rem * base;

            base = base * 10;
        }

        return any_value;
    }

    public static int bin2deci(int bin){
        int deci = 0;
        int base = 1;

        while (bin > 0){
            int rem = bin % 10;
            bin = bin / 10;

            deci = deci + rem * base;
            base = base * 2;
        }

        return deci;
    }

    public static int any2deci(int any_value, int any){
        int deci = 0;
        int base = 1;

        while (any_value > 0){
            int rem = any_value % 10;
            any_value = any_value / 10;

            deci = deci + rem * base;
            base = base * any;
        }

        return deci;
    }

    public static int any2any(int source, int dest, int value){

        int deci = any2deci(source, value);

        return deci2any(deci, dest);

    }

}
