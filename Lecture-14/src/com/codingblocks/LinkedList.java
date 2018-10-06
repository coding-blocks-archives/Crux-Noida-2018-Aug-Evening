package com.codingblocks;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public void insertFirst(String value) {
        Node node = new Node(value);
        node.next = head;

        head = node;

        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(String value) {
        if (size == 0) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(int index, String value) {

//        head = insertRec(index, value, head);

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);

//        Node prev = head;
//
//        for (int i = 1; i < index; i++) {
//            prev = prev.next;
//        }

        Node node = new Node(value, prev.next);
        prev.next = node;

        size++;
    }

//    public Node insertRec(int index, String value, Node node){
//       if (index == 0){
//           Node n = new Node(value, node);
//           return n;
//       }
//
//       node.next =  insertRec(index - 1, value, node.next);
//
//       return node;
//    }

    public String deleteFirst() {
        String t = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return t;
    }

    public String deleteLast() {
        if (size < 2) {
            return deleteFirst();
        }

        Node node = get(size - 2);

        String t = tail.value; // save val to temp

        tail = node;
        tail.next = null; // remove last item

        size--;

        return t;
    }

    public String delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        String t = prev.next.value;
        prev.next = prev.next.next;

        size--;

        return t;
    }

    public Node find(String value) {
        Node node = head;

        while (node != null) {
            if (node.value.equals(value)) {
                return node;
            }

            node = node.next;
        }

        return null;
    }

    public void reverse() {
//        reverse(head);
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        tail = present;

        while (present != null) {
            present.next = prev;

            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        head = prev;
    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }

        System.out.println("END");
    }

    private class Node {
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

    public void odd_even() {
        Node odd_h = null;
        Node even_h = null;
        Node even_t = null;
        Node odd_t = null;

        Node node = head;

        while (node != null) {

            if (node.value.length() % 2 == 0) {
                if (even_h == null) {
                    even_h = node;
                    even_t = node;
                }

                even_t.next = node;
                even_t = node;
            } else {
                if (odd_h == null) {
                    odd_h = node;
                    odd_t = node;
                }

                odd_t.next = node;
                odd_t = node;
            }

            node = node.next;
        }

        even_t.next = odd_h;

        head = even_h;
        tail = odd_t;

        tail.next = null;
    }

    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if (node.value.equals(node.next.value)){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }

        }

        tail = node;
        tail.next = null;

    }

    public static LinkedList merge(LinkedList first, LinkedList second){
        Node f = first.head;
        Node s = second.head;

        LinkedList list = new LinkedList();

        while (f != null && s != null){
            if (f.value.compareTo(s.value) > 0){
                list.insertLast(s.value);
                s = s.next;
            } else {
                list.insertLast(f.value);
                f = f.next;
            }
        }

        while (f != null){
            list.insertLast(f.value);
            f = f.next;
        }

        while (s != null){
            list.insertLast(s.value);
            s = s.next;
        }

        return list;
    }

    public Node mid(){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
