package com.codingblocks.car;

public class Main {
    public static void main(String[] args) {
//        GenericCar car = new GenericCar();
//
//        car.apply();
//
//        car.start();
//
//        car.stop();

//        MusicPlayer player = new GenericCar();
//
//        player.stop();

        NitroEngine engine = new NitroEngine();

        CustomCar car = new CustomCar(engine);

        for (int i = 0; i < 20; i++) {

            car.start();
            car.stop();
        }

        car.replaceEngine();

        for (int i = 0; i < 20; i++) {

            car.start();
            car.stop();
        }

        car.upgradeEngine();

        for (int i = 0; i < 20; i++) {

            car.start();
            car.stop();
        }
    }
}
