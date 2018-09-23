package com.codingblocks;

public class LCS {

    public static void main(String[] args) {
        System.out.println(lcsRec("aman", "manan"));
    }

    public static int lcsRec(String first, String second){
        if (first.isEmpty() || second.isEmpty()){
            return 0;
        }

        char f = first.charAt(0);
        char s = second.charAt(0);

        if (f == s){
            return 1 + lcsRec(first.substring(1),
                    second.substring(1));
        } else {
            return Math.max(lcsRec(first.substring(1), second),
                    lcsRec(first, second.substring(1)));
        }
    }

//    public static int lcsRecFirst(String first, String second){
//        if (first.isEmpty() || second.isEmpty()){
//            return 0;
//        }
//
//        char f = first.charAt(0);
//        char s = second.charAt(0);
//
//        if (f == s){
//            return 1 + lcsRec(first.substring(1), second.substring(1));
//        } else {
//            return Math.max(lcsRec(first.substring(0, first.length() - 1), second),
//                    lcsRec(first, second.substring(0, second.length()-1)));
//        }
//    }
}
