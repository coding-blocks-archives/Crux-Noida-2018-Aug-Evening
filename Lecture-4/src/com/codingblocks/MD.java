package com.codingblocks;

public class MD {
    public static void main(String[] args) {
        //int[][] nums = new int[4][];

        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

    }
}
