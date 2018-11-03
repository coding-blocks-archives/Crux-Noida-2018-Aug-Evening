package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMapSC dict = new HashMapSC();

        dict.put("Apple", "A sweet red fruit");
        dict.put("Mango", "King of fruits");
        dict.put("Lichi", "yumm yumm");

        System.out.println(dict.get("Apple"));

        dict.remove("Apple");

        System.out.println(dict.get("Apple"));

//        for (String fruit : dict.keySet()) {
//            System.out.println(fruit);
//        }
//
//
//        for (String fruit : dict.values()) {
//            System.out.println(fruit);
//        }


    }
}
