package com.codingblocks;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        size = 0;
    }

    public void insertFirst(String value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(String value){
        if (size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(String value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        } else if (index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;

        size++;
    }

    public String deleteFirst(){
        String value = head.value;

        head = head.next;

        if (head == null){
            tail = null;
        }

        size--;

        return value;
    }

    public String deleteLast(){
        if (size < 2){
            return deleteFirst();
        }

        Node node = get(size - 2);

//        Node node = head;
//
//        while (node.next != tail){
//            node = node.next;
//        }

        String value = tail.value;
        tail = node;
        tail.next = null;

        size--;

        return value;
    }

    public Node get(int index){

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    private class Node{
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
