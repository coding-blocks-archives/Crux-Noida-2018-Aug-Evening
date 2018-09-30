package com.codingblocks;

public class PetrolEngine extends Engine {

    protected int acc_speed = 3;

    @Override
    public void start() {
        System.out.println("Now I start with Petrol" + super.acc_speed);
    }


    public void makeNoise(){
        System.out.println("Phat phat phat");
    }



}
