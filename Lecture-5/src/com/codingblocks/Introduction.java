package com.codingblocks;

public class Introduction {
    public static void main(String[] args) {
        String line = "你好!";

        display(line);

//        System.out.println(line.startsWith("I", 6));
//
//        locations(line, "o");
//
//        String second = "Hello";
//
//        line.codePointAt()

//        substrings(line);

//        System.out.println(line.indexOf('o', 3));

//        System.out.println(line.equals(second));
//
//        System.out.println(line);
//        System.out.println(line.length());
//        System.out.println(line.charAt(0));
//
//        display(line);
//
//        System.out.println(line.substring(2, 2));

    }

    public static void display(String line){
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + ", ");
        }
    }

    public static void substrings(String line){
        for (int i = 0; i < line.length(); i++) {
            for (int j = i+1; j <= line.length(); j++) {
                System.out.println(line.substring(i, j));
            }
        }
    }

    public static void locations(String line, String pattern){

        int si = 0;
        while(true){
            int loc = line.indexOf(pattern, si);

            if (loc == -1){
                break;
            }

            System.out.println(loc);
            si = loc + 1;
        }
    }

    public static boolean isPallin(String line){
        line = line.toLowerCase();

        for (int i = 0; i <= line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}
