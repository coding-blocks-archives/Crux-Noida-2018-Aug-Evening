package com.codingblocks.car;

public class PetrolEngine implements Engine {

    private int cycles = 10;

    @Override
    public void start() {
        if (cycles == 0){
            System.out.println("We can not start your car");
            return;
        }

        System.out.println("Start on petrol");
        cycles--;
    }

    @Override
    public void stop() {
        System.out.println("Stop on petrol");
    }

    @Override
    public void acc() {
        System.out.println("Is se tez na ho payega");
    }
}
