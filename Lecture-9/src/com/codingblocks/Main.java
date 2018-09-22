package com.codingblocks;

public class Main {
    public static void main(String[] args) {
//        lexoNumbers(0, 130);

        String line = "mango";

        lexoAlpha(freq(line), "", line.length(), line);
    }

    public static int[] freq(String line){

        int[] nums = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            nums[ch-'a']++;
        }

        return nums;
    }

    public static void lexoNumbers(int present, int target){
        if (present > target){
            return;
        }

        System.out.println(present);

        for (int i = 0; i < 10; i++) {

            if (present == 0 && i == 0){
                continue;
            }

            lexoNumbers(present * 10 + i, target);
        }
    }

    public static void lexoAlpha(int[] count, String processed, int target, String source){
        if (processed.length() == target){
            if (processed.compareTo(source) <= 0){
                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0){
                count[i]--;
                lexoAlpha(count, processed + (char)('a'+i), target, source);
                count[i]++;
            }
        }
    }
}
