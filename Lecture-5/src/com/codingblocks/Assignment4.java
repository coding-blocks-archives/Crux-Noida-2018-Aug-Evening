package com.codingblocks;


public class Assignment4 {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}
        };

        spiral(nums);

    }

    public static void pair(int[] nums, int sum){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum){
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }
    }

    public static void triplet(int[] nums, int sum){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == sum){
                        System.out.println(nums[i] + " " + nums[j]+ " " + nums[k]);
                    }
                }

            }
        }
    }

    public static void waveH(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.println(nums[i][j]);
                }
            }

            if (i % 2 != 0){
                for (int j = nums[i].length-1; j >= 0; j--) {
                    System.out.println(nums[i][j]);
                }
            }
        }
    }

    public static void waveV(int[][] nums){
        for (int j = 0; j < nums[0].length; j++) {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i][j]);
            }
        }
    }

    public static void spiral(int[][] nums){
        int left = 0;
        int top = 0;
        int right = nums[0].length - 1;
        int bottom = nums.length - 1;

        while (left <= right && top <= bottom){
            for (int i = left; i <= right && top <= bottom; i++) {
                System.out.println(nums[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && left <= right; i++) {
                System.out.println(nums[i][right]);
            }
            right--;

            for (int i = right; i >= left && top <= bottom; i--) {
                System.out.println(nums[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && left <= right; i--) {
                System.out.println(nums[i][left]);
            }
            left++;
        }
    }
}
