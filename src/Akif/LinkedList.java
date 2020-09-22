package Akif;

public class LinkedList {

    private Node first; //head
    private Node last; //tail

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    public int size=0;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
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

//    public int indexOf(int item) {
//
//    }


}
