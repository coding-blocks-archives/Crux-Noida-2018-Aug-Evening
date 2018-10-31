package cm.cosingblocks;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Human anuj = new Human("Anuj Garg", 24);
        Human shivam = new Human("Shivam", 20);
        Human salman = new Human("Salman Khan", 21);
        Human rahul = new Human("Rahul", 27);


        Comparable<Human> c = anuj;

        Human[] humans = {anuj, shivam, salman, rahul};

        System.out.println("Anuj".compareTo("Anamika"));

        System.out.println(Arrays.toString(humans));

        Arrays.sort(humans);

        System.out.println(Arrays.toString(humans));

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Arrays.sort(humans, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(Arrays.toString(humans));

    }
}
