package Akif;

public class DoubleLinkedList {
    Node head;
    Node tail;

    private class Node {
        int data;
        Node previous;
        Node next;

        public Node (int item) {
            this.data = item;
        }

    }

    //addFirst
    //addLast
    //deleteFirst
    //contains
    //indexOf

    public void printlist() {
        //Made by Akif
        Node current_node;
        current_node = head;

        if(current_node==null) {
            System.out.println("This list is empty :) ");
            return; // It will get back from here
        }

        System.out.print("[");
        while(current_node.next!=null) {
            System.out.print(current_node.data + ",");
            current_node = current_node.next;
        }

        System.out.println(current_node.data + "]");

    }

    public void addLast(int item) {

        var node = new Node(item);

        if(head == null) {
            head = tail = node;
            node.next = node.previous = null;
        }
        else {
            node.previous = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(int item) {

        var node = new Node(item);

        if(head==null) {
            head = tail = node;
            node.next = node.previous = null;
        }

        else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }

    public void removeLast() {
        if(tail==head) {
            head=tail=null;
        }

        tail = tail.previous;
        tail.next = null;
    }

    public void removeFirst() {
        if(tail==head) {
            head=tail=null;
        }
        head = head.next;
        head.previous = null;
    }


}
