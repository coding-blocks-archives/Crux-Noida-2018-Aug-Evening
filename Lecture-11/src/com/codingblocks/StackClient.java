package com.codingblocks;

public class StackClient {
    public static void main(String[] args) throws Exception{

        Stack stack = new Stack();

        stack.push(10);
        stack.push(134);
        stack.push(104);

        try {
            int a = 1/0;
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Will I be executed?"); // will not be executed
        } catch (StackException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Go check your math" + e.getMessage()   );
        }

        System.out.println("And what about me"); // executed every time

    }
}
