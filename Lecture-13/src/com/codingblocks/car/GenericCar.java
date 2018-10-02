package com.codingblocks.car;

public class GenericCar implements Engine, Brake, Steering, MusicPlayer {

    @Override
    public void apply() {
        System.out.println("apply brake");
    }

    @Override
    public void start() {
        System.out.println("Start my engine dhroom dhroom");
    }

    @Override
    public void stop() {
        System.out.println("Stop my engine cheeeeeeeee");
    }

    @Override
    public void acc() {
        System.out.println("My car is running grrrrrrrrrrr");
    }

    @Override
    public void steer() {
        System.out.println("Moving with difficulty to left and right");
    }
}
