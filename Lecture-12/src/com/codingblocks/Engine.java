package com.codingblocks;

public class Engine {

    int acc_speed = 2;

    public void start(){
        System.out.println("I start Generic");
    }


    public void stop(){
        System.out.println("I stop Generic");
    }


    public void acc(){
        System.out.println("I acc Generic with " + this.acc_speed);
    }


    public int acc(int acc_speed){
        System.out.println("I acc Generic with " + acc_speed);

        return acc_speed;
    }

    public void crash(){

    }

    public static void khamba(){
        System.out.println("I am khamba of Engine");
    }
}
