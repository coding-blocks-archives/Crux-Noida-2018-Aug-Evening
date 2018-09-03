package com.codingblocks;

public class Sorting {

    public static void bubble(int[] nums){
        // run the loop n-1 times
        for (int i = 0; i < nums.length; i++) {

            // reduce items from last
            for (int j = 1; j < nums.length - i; j++) {

                // swap if next item is smaller then prev
                if (nums[j] < nums[j-1]){
                    Utility.swap(nums, j, j-1);
                }
            }
        }
    }

    public static void selection(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = Utility.max(nums, 0, last);
            Utility.swap(nums, max, last);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    Utility.swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 4, 0, 3, 2, 5};

        //insertion(data);

        Utility.display(inverse(data));

    }

    public static void reverse(int[] nums){
        for (int i = 0; i < nums.length/2; i++) {
            Utility.swap(nums, i, nums.length - 1 - i);
        }
    }

    public static int[] inverse(int[] nums){

        int[] data = new int[nums.length];

        for (int p = 0; p < nums.length; p++) {
            int v = nums[p];

            data[v] = p;
        }

        return data;
    }

}
