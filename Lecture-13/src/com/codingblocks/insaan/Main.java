package com.codingblocks.insaan;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Human anuj = new Human(23, "Anuj Garg");
        Human mayank = new Human(20, "Mayank");
        Human akshar = new Human(20, "Dukhi");
        Human amit = new Human(27, "Amit");

        Human mohini = new Human(24, "Mohini");
        Human neha = new Human(20, "Neha");

        Human head = mayank;

        mayank.setBaby(mohini);
        mohini.setBaby(akshar);
        akshar.setBaby(neha);
        neha.setBaby(amit);


//        Human[] arr = {anuj, akshar, amit, mayank};
//
////        Arrays.sort(arr, new Comparator<Human>() {
////            @Override
////            public int compare(Human o1, Human o2) {
////                return o1.getAge() - o2.getAge();
////            }
////        });
////
//        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].getName() + " " + arr[i].getAge());
//        }
//
//        for (Human human : arr) {
//            System.out.println(human.getName() +" " + human.getAge());
//        }

    }
}
