package com.codingblocks;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();

        System.out.println(freq(l));

    }

    public static StringBuilder q5(String line){
        StringBuilder builder = new StringBuilder();

        // add first char of line to builder
        builder.append(line.charAt(0));

        // process each char of line one by one
        for (int i = 1; i < line.length(); i++) {

            // ch for line , last for builder
            char ch = line.charAt(i);
            char last = line.charAt(i-1);

            // get diff
            int diff = Math.abs(last - ch);

            // add at last
            builder.append(diff);
            builder.append(ch);
        }

        return builder;
    }

    public static String freq(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            int count = 1;

            while (i < line.length() - 1 && line.charAt(i+1) == line.charAt(i)){
                count++;
                i++;
            }

            builder.append(line.charAt(i));
            builder.append(count);

        }



        return builder.toString();
    }
}
