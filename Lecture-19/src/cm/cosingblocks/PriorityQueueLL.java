package cm.cosingblocks;

import java.util.LinkedList;

public class PriorityQueueLL <T extends Comparable<T>> {

    private LinkedList<T> list;

    public PriorityQueueLL(){
        list = new LinkedList<>();
    }

    public void add(T value){
        int counter = 0;

        for (T item: list) {

            if (value.compareTo(item) < 0){
                break;
            }
            counter++;
        }

        list.add(counter, value);
    }

    public T remove(){
        return list.removeFirst();
    }

    public T min(){
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
