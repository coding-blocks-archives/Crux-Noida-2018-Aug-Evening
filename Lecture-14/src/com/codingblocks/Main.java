package com.codingblocks;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertLast("Amit");
        list.insertLast("Bhanu");
        list.insertLast("Girja");
        list.insertLast("Shubham");


        LinkedList list2 = new LinkedList();

        list2.insertLast("Anuj");
        list2.insertLast("Chacha");
        list2.insertLast("Happy");
        list2.insertLast("Manoj");

//        list.duplicates();

        LinkedList m = LinkedList.merge(list, list2);

        m.display();

//        list.insertFirst("Mohini");
//        list.insertFirst("Mohit");
//
//        list.display();
//
//        list.insertLast("Shobhit");
//
//        list.display();

    }
}
