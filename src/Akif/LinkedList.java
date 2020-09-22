package Akif;

public class LinkedList {

    private Node first; //head
    private Node last; //tail
    private int size;

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }


    //addFirst
    //addLast
    //deleteFirst
    //contains
    //indexOf

    public void addLast(int item) {
        var node = new Node(item);
        if(first== null)  first = last = node;

        else {
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (first==null) {
            first = last = node;
        }
        else {
            node.next = first ;
            first = node;

        }

    }

    public int indexOf(int item) {
        int index = 0;
        var current_node  = first;

        while(current_node!= null) {
            if(current_node.value == item) return index;
            current_node = current_node.next;
            index ++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item)!=-1; //Resuing own created indexOf
    }

    public void removeFirst() {
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void printlist() {
        //Made by Akif
        Node current_node;
        current_node = first;

        if(current_node==null) {
            System.out.println("This list is empty :) ");
            return; // It will get back from here
        }

        System.out.print("[");
        while(current_node.next!=null) {
            System.out.print(current_node.value + ",");
            current_node = current_node.next;
        }

        System.out.println(current_node.value + "]");

    }


}
