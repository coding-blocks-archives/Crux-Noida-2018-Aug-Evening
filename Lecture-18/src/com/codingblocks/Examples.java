package com.codingblocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        HashMapSC<Character, Integer> map = freq(line);

        System.out.println(map);
    }

    private static HashMapSC<Character, Integer> freq(String line) {
        HashMapSC<Character, Integer> map = new HashMapSC<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    private static Map<Character, Integer> vowels(String line) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
        }

        return map;
    }

    public static void intersection(int[] first, int[] second){

        HashMap<Integer, Integer> map = new HashMap<>();


        // create freq map for first array
        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(first[i])){
                map.put(first[i], map.get(first[i])+ 1);
            } else {
                map.put(first[i], 1);
            }
        }


        // detect items from second
        for (int i = 0; i < second.length; i++) {
            if (map.containsKey(second[i]) && map.get(second[i]) > 0){
                map.put(second[i], map.get(second[i]) - 1);
                System.out.println(second[i]);
            }
        }
    }

    public static ArrayList<Integer> duplicates(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
                list.add(nums[i]);
            }
        }

        return list;
    }
}
