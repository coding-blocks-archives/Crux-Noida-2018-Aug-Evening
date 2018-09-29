package com.codingblocks;

public class Main {

    public static void main(String[] args) throws Throwable {
	// write your code here

        int[] nums = new int[10];

//        nums.length = 15;

        Human anuj = new Human(20000);

        anuj.naamkaran("Anuj Garg");

//        System.out.println(anuj.name);
//        System.out.println(anuj.balance);

        anuj.loan();
        anuj.loan();
        anuj.loan();

        Human abhi = new Human();

        abhi.naamkaran("Abhishek");

        abhi.loan();

//        System.out.println(anuj.name);

        System.out.println(abhi);
        System.out.println(anuj);

        anuj.eat();

        anuj.toString();


        Human.fest();
    }
}
