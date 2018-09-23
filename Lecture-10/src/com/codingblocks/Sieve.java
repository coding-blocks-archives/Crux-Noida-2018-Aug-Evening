package com.codingblocks;

public class Sieve {

    public static void main(String[] args) {

        System.out.println(countPallin("aababb"));

//        int n = 100000000;
//
//        boolean[] primes = new boolean[n + 1];
//
//        for (int i = 2; i*i <= n ; i++) {
//            if (!primes[i]){
//                for (int j = 2 * i; j <= n; j+=i) {
//                    primes[j] = true;
//                }
//            }
//        }
//
//        int c = 0;
//
//        for (int i = 2; i <= n; i++) {
//            if (!primes[i]){
//                c++;
//            }
//        }
//
//        System.out.println(c);
    }

    public static int countPallin(String line){

        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i+1;

            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

}
