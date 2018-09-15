package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        board("", 4);
    }

    public static void subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));

    }

    public static void ascii(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            if (processed.isEmpty()){
                return;
            }
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        ascii(processed + ch, unprocessed.substring(1));
        ascii(processed + (ch+0), unprocessed.substring(1));
        ascii(processed, unprocessed.substring(1));

    }

    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            if (i == 26){
                continue;
            }
            char ch = (char) (i+'a');
            numpad(processed+ch, unprocessed.substring(1));
        }
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String last = processed.substring(i);

            permutation(first + ch + last, unprocessed);
        }
    }

    public static void board(String processed, int target){
        if (target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            board(processed + i, target - i);
        }
    }
}
