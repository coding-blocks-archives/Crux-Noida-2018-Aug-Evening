package com.codingblocks;

public class Searching {

    public static int linear(int[] nums, int item){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == item){
                return i;
            }
        }

        return -1;
    }

    public static int binary(int[] nums, int item){

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = (start + end)/2;

            if (nums[mid] == item){
                return mid;
            }

            else if (nums[mid] < item){
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] data = {12, 34, 56, 78, 79, 90};

        System.out.println(binary(data, 34));
    }

}
