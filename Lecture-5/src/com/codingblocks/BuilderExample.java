package com.codingblocks;

public class BuilderExample {
    public static void main(String[] args) {

        String s = "Hello Brother";

        System.out.println(toggle(s));

//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < 100000000; i++) {
////            s = s + "a";
//            builder.append("a");
//        }
//
//        System.out.println(builder);
    }

    public static String toggle(String line){

        StringBuilder builder = new StringBuilder(line);

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                ch = (char)('a' + (ch - 'A'));
            }

            else if (ch >= 'a' && ch <= 'z'){
                ch = (char)('A' + (ch - 'a'));
            }

            builder.setCharAt(i, ch);
        }

        return builder.toString();
    }

    public static String oddeven(String line){

        StringBuilder builder = new StringBuilder(line);

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);



            if (i % 2 == 0){
                if (ch == 'A' || ch == 'a'){

                }
                else {
                    ch = (char) (ch - 1);
                }
            } else {
                ch = (char) (ch + 1);
            }

            builder.setCharAt(i, ch);
        }

        return builder.toString();
    }
}
