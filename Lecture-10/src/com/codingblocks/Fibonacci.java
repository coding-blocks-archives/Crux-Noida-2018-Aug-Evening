package com.codingblocks;

public class Fibonacci {

    public static void main(String[] args) {


        int n = 5000;

        long[] mem = new long[n+1];

        System.out.println(fiboItrDP(n, mem));
    }

    public static int fiboRec(int n){
        if (n < 2){
            return n;
        }

        return fiboRec(n-1) + fiboRec(n-2);
    }


    public static long fiboRecDP(int n, long[] mem){
        if (n < 2){
            return n;
        }

        if(mem[n] != 0){
            return mem[n];
        }

        mem[n] = fiboRecDP(n-1, mem) + fiboRecDP(n-2, mem);

        return mem[n];
    }

    public static long fiboItrDP(int n, long[] mem){
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= n; i++) {
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[n];
    }


}
