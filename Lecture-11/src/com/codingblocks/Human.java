package com.codingblocks;

public class Human {
    private String name;

    private int balance;

    private final int hand;

    public static int population = 0;

    public static void fest(){
        System.out.println("Hurray hurray");
    }

    public Human(Human old){
        this.name = old.name;
        this.balance = old.balance;
        this.hand = old.hand;
    }

    public Human(){
        this(10000);
    }

    public Human(int balance){
        this( "Anonymous", balance);
    }

    public Human(String name, int balance){
        this.name = name;
        this.balance = balance;
        this.hand = 2;

        population++;
        System.out.println("Its your bday");
    }



//    static int balance = 10000;


    public void naamkaran(String name){
        this.name = name;
        fest();
    }

    public int loan(){
        int t = this.balance / 10;
        balance = balance - t;

        System.out.println(name + " - Yaar ab bas rah gye " + balance);

        return t;
    }

    public void eat(){

        System.out.println("Welcome to Apna Dhaba");


        if (balance < 100){
            System.out.println("Go home bhai. Paise le ke aa");
            return;
        }

        System.out.println("eat eat eat");

        balance = balance - 100;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        System.out.println("Someone just died");
        population--;
    }
}
