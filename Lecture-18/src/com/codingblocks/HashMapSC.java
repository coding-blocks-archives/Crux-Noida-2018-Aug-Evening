package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapSC<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;

    private float lf = .5f;

    public HashMapSC() {
        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity: entities) {
            if (entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if (((float)size)/list.size() > lf) {
            rehash();
        }

        entities.add(new Entity(key, value));

        size++;
    }

    private void rehash() {

        System.out.println("Now we are up for rehashing");

        ArrayList<LinkedList<Entity>> old = list;

        list = new ArrayList<LinkedList<Entity>>();

        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : list) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }

    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity: entities) {
            if (entity.key.equals(key)){
                return entity.value;
            }
        }

        return null;

    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;
        for (Entity entity : entities) {
            if (entity.key.equals(key)){
                target = entity;
                break;
            }
        }

        entities.remove(target);

        size--;
    }

    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("{");

        for (LinkedList<Entity> entries : list) {
            for (Entity entry : entries) {
                builder.append(entry.key);
                builder.append("=");
                builder.append(entry.value);
                builder.append(", ");
            }
        }

        builder.append("}");

        return builder.toString();
    }

    private class Entity {
        private K key;
        private V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
