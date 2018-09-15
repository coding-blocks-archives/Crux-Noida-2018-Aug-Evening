package com.codingblocks;

public class Streams {
    public static void main(String[] args) {
        System.out.println(skipHi("hitman hit a hen"));
    }

    public static void skip(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'i'){
            skip(processed, unprocessed.substring(1));
        } else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skip(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'i'){
            return skip(unprocessed.substring(1));
        } else {
            return ch + skip(unprocessed.substring(1));
        }
    }

    public static String skipHi(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }

        if (unprocessed.startsWith("hi") && !unprocessed.startsWith("hit")){
            return skipHi(unprocessed.substring(2));
        } else {
            return unprocessed.charAt(0) + skipHi(unprocessed.substring(1));
        }
    }

    public static String skipHiModified(String unprocessed){
        if (unprocessed.length() < 2){
            return unprocessed;
        }

        if (unprocessed.charAt(0) == 'h' && unprocessed.charAt(1) == 'i'){
            if (unprocessed.length() >= 3 && unprocessed.charAt(2) == 't'){
                return unprocessed.charAt(0) + skipHiModified(unprocessed.substring(1));
            }
            return skipHiModified(unprocessed.substring(2));
        } else {
            return unprocessed.charAt(0) + skipHiModified(unprocessed.substring(1));
        }
    }
}
