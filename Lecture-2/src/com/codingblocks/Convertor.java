package com.codingblocks;

public class Convertor {
    public static void main(String[] args) {
        int deci = 30;

        while (deci > 0){
            int rem = deci % 2;
            deci = deci / 2;
            System.out.println(rem);
        }
    }
}
