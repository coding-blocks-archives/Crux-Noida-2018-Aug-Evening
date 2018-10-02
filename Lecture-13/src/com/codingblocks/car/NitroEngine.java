package com.codingblocks.car;

public class NitroEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start on Nitro boost");
    }

    @Override
    public void stop() {
        System.out.println("Stop on Nitro boost");
    }

    @Override
    public void acc() {
        System.out.println("Is se tez koi aur na ho payega");
    }
}
