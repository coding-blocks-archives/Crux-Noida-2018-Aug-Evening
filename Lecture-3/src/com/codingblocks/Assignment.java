package com.codingblocks;

public class Assignment {

    public static void main(String[] args) {

        Q10();

    }

    public static void Q8(){
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void Q10(){

        int n = 6;

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + "  ");

                int c = a + b;
                a = b;
                b = c;
            }

            System.out.println();
        }
    }
}
