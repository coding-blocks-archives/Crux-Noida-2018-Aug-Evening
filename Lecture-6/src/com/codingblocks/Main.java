package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(5));
    }

    public static int factorial(int num){
        if (num == 0){
            return 1;
        }

        return  num * factorial(num - 1);
    }


    public static int fibo(int num){
        if (num <= 1){
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }

    public static void printDec(int num){

        if (num == 0){
            return;
        }

        System.out.println(num);
        printDec(num - 1);
    }

    public static void printInc(int num){

        if (num == 0){
            return;
        }

        printInc(num - 1);
        System.out.println(num);
    }

    public static void printDecInc(int num){

        if (num == 0){
            return;
        }

        System.out.println(num);
        printDecInc(num - 1);
        System.out.println(num);
    }

    public static void printDec4(){
        System.out.println(4);
        printDec3();
        //////
    }

    public static void printDec3(){
        System.out.println(3);
        printDec2();
        //////
    }

    public static void printDec2(){
        System.out.println(2);
        printDec1();
        //////
    }

    public static void printDec1(){
        System.out.println(1);
        printDec0();
        //////
    }

    public static void printDec0(){

    }
}
