package com.codingblocks;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        Queue queue = new Queue(100000);

        for (int i = 0; i < 100000; i++) {
            int random = (int)(Math.random()*100);
            queue.insert(random);
            //queue.display();
        }

        for (int i = 0; i < 100000; i++) {
            System.out.println("Removed " + queue.remove());
            //queue.display();
        }
    }
}
