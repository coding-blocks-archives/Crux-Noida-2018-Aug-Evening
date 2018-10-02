package com.codingblocks.insaan;

public class Human implements Comparable<Human> {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Human other) {
//        return this.age - other.age;
        return - this.name.compareTo(other.name);
    }
}
