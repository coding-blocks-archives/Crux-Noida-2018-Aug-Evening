package com.codingblocks.implementations;

public class ArrayList {

    private int[] data;

    private static int DEFAULT_SIZE = 10;

    private int size = 0;

    public ArrayList(){
        data = new int[DEFAULT_SIZE];
    }

    public void add(int item){
        data[size++] = item;
    }

    public int remove(){
        return data[--size];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
}
