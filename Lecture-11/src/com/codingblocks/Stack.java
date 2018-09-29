package com.codingblocks;

public class Stack {

    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            return false;
        }

        data[++top] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new StackException("Can not pop from empty stack");
        }

        return data[top--];
    }

    public int top() throws Exception{
        if (isEmpty()){
            throw new StackException("Can not pop from empty stack");
        }
        return data[top];
    }

    private boolean isEmpty(){
        return top < 0;
    }

    private boolean isFull(){
        return top == data.length - 1;
    }
}
