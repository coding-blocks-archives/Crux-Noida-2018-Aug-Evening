package com.codingblocks.implementations;

public class ArrayList {

    private int[] data;

    private static int DEFAULT_SIZE = 10;

    private int size = 0;

    public ArrayList(){
        data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void add(int item){

        if (isFull()){
            resize();
        }

        data[size++] = item;
    }

    private void resize() {

        System.out.println("Now we are doubling up");

        int[] temp = new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
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
