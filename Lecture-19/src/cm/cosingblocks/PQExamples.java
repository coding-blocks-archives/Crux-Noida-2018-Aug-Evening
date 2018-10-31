package cm.cosingblocks;

import java.util.PriorityQueue;

public class PQExamples {

    public static void main(String[] args) {
        PriorityQueueLL<Human> queue = new PriorityQueueLL<>();


        Human anuj = new Human("Anuj Garg", 24);
        Human shivam = new Human("Shivam", 20);
        Human salman = new Human("Salman Khan", 21);
        Human rahul = new Human("Rahul", 27);

        queue.add(anuj);
        queue.add(rahul);
        queue.add(shivam);
        queue.add(salman);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
