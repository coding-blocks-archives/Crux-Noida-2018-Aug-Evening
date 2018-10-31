package cm.cosingblocks;

public class Human implements Comparable<Human>{

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return age + " -> " + name;
    }

    @Override
    public int compareTo(Human second) {
        return this.getAge() - second.getAge();
    }
}
