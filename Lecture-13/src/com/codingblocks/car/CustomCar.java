package com.codingblocks.car;

public class CustomCar {

    private Engine engine;

    public CustomCar(){
        engine = new PetrolEngine();
    }

    public CustomCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void replaceEngine(){
        engine = new PetrolEngine();
    }

    public void upgradeEngine(){
        engine = new NitroEngine();
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }


    public void someOtherWorkOnEngine(Engine engine){
        this.engine = engine;
        System.out.println("Just doing some random work");
    }

}
