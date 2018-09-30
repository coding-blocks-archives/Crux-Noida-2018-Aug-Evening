package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        Engine engine = new PetrolEngine();

        PetrolEngine pe = (PetrolEngine) engine;

        System.out.println(engine.acc_speed);


        engine.start();
        engine.acc();
        engine.stop();

//        engine.makeNoise();

        Engine.khamba();

        PetrolEngine.khamba();


//        sum("yyugi" ,1, 7654, 765, 6534, 7654);
    }

    public static int sum( String b, int... nums){
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
