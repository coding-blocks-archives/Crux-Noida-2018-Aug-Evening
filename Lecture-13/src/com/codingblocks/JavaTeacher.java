package com.codingblocks;

public class JavaTeacher implements Teacher {

    @Override
    public void study() {
        System.out.println("I study Java with Machine learning ");
    }

    @Override
    public void teach() {
        System.out.println("I teach Java");
    }

    public void dance(){
        System.out.println("I dance in Java");
    }
}
