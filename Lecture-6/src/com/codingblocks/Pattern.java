package com.codingblocks;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        int[] nums = {456, 657, 345, 83};

        bubble(nums, nums.length-1, 0);

        System.out.println(Arrays.toString(nums));

    }

    public static void triangle(int row, int col){

        if (row == 0){
            return;
        }

        if (col < row){
            System.out.print("*");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    public static void bubble(int[] nums, int row, int col){

        if (row == 0){
            return;
        }

        if (col < row){
            if (nums[col]> nums[col+1]){
                int t = nums[col];
                nums[col] = nums[col + 1];
                nums[col+1] = t;
            }
            bubble(nums, row, col + 1);
        } else {
            bubble(nums, row - 1, 0);
        }
    }
}
