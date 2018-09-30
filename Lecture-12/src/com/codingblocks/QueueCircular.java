package com.codingblocks;

public class QueueCircular {
    private int[] data;

    private static int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    private int size = 0;

    public QueueCircular(){
        this(DEFAULT_SIZE);
    }

    public QueueCircular(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;

        end = end % data.length; // restart from index 0
        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Removing from empty Queue");
        }


        int temp = data[front++];

        front = front % data.length;
        size--;

        return temp;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Checking front from empty Queue");
        }

        return data[0];
    }

    public void display(){
        for (int i = front; i < end; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("END");
    }
}
