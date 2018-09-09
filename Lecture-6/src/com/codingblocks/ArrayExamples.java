package com.codingblocks;

public class ArrayExamples {
    public static void main(String[] args) {

        int[] nums = {2, 5, 56, 65};

        System.out.println(sorted(nums, 0));

    }

    public static boolean sorted(int[] nums, int index){

        if (index == nums.length - 1){
            return true;
        }

        return nums[index] <= nums[index+1] && sorted(nums, index+1);
    }

    public static boolean find(int[] nums, int item, int index){
        if (index == nums.length){
            return false;
        }

        return nums[index] == item || find(nums, item, index + 1);
    }

    public static int findIndex(int[] nums, int item, int index){
        if (index == nums.length){
            return -1;
        }

        if (nums[index] == item){
            return index;
        }

        return findIndex(nums, item, index+1);

    }
}
