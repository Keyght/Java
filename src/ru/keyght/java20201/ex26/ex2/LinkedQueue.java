package ru.keyght.java20201.ex26.ex2;

public class LinkedQueue extends AbstractQueue {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public void enqueue(Object element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            // n.prev = tail;
            tail.next = n;
            tail = tail.next;
        }
        size++;
    }

    public Object element() {
        assert !isEmpty();

        return head.value;
    }

    public Object dequeue() {
        assert !isEmpty();

        Node n = head;
        // head.next.prev = null;
        head = head.next;
        size--;
        return n.value;
    }

    public int size() {
        return size;
    }

    public class Node {
        Object value;
        Node next;
        Node prev;

        public Node(Object value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Node(Object value, Node next) {
            this.value = value;
            this.prev = null;
            this.next = next;
        }

        public Node(Object value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}