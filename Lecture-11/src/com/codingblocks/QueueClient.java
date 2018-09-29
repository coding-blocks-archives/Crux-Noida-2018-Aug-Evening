package com.codingblocks;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        QueueOptimised queue = new QueueOptimised(10);

        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random()*100);
            queue.insert(random);
            queue.display();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Removed " + queue.remove());
            queue.display();
        }
    }
}
