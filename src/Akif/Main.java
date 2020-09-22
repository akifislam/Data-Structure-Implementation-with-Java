package Akif;

public class Main {

    public static void main(String[] args) {

        LinkedList li = new LinkedList();

        li.addFirst(10);
        li.addLast(50);
        li.addLast(40);
        li.addLast(30);
        System.out.println(li.indexOf(133));
        System.out.println(li.contains(1122));
        li.printlist();
        li.addFirst(100);
        li.printlist();
        li.removeFirst();
        li.printlist();
        li.removeFirst();
        li.removeFirst();
        li.removeFirst();
        li.removeFirst();
        li.printlist();


    }
}
