package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        // create empty arr of size 10
        int[] nums = new int[10];

        // create arr of size 3 with custom values
        int[] data = {12, 43, 345};


//        System.out.println(data[0]);
//
//
//        System.out.println(nums.length);
//        System.out.println(data.length);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        data[2] = data[2] / 2;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        int temp = data[0];
        data[0] = data[2];
        data[2] = temp;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println(data);

        increase(data);

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }

    public static void increase(int[] arr){

        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}
