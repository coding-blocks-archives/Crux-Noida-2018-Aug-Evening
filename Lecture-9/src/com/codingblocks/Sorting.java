package com.codingblocks;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 9, 4};

        int[] sorted = mergeSort(nums);

        System.out.println(Arrays.toString(sorted));
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length == 1){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i]; // move smaller item to mix
                i++; // inc index of first
                k++; // inc index at mix
            } else {
                mix[k] = second[j]; // move smaller item to mix
                j++; // inc index of second
                k++; // inc index at mix
            }

        }

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
