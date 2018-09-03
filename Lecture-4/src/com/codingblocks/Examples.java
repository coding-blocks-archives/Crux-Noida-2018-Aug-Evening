package com.codingblocks;

import java.util.ArrayList;

public class Examples {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list.size());

        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);

        System.out.println(list.size());

        System.out.println(list.get(2));

        list.set(2, 77);

        System.out.println(list.get(2));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
