package Akif;



public class DS_Demo {

    public static void main(String[] args) {
        int[] max_heap ={0,19,10,17,5,7,12,1};
        int[] no_order_array = {0,110,517,222,1,907,51,129};


        Heap heap = new Heap(7,no_order_array);

        heap.print_heap();
        System.out.println();
        System.out.println("New : ");
        System.out.println();

        int o =0 ;
        while(o<5) {
            for (int i = heap.heap_size; i > 0; i--) {
                heap.max_heapify(i);
            }
            o++;
        }


        //Put the value of 'node' to know his child's name
        heap.print_heap();





//        BinaryTree tree = new BinaryTree();
//        tree.add_Node(2);
//
//        tree.add_left(7);
//        tree.add_right(9);
//
//        tree.add_left(1);
//        tree.add_right(6);
//        DoubleLinkedList dl = new DoubleLinkedList();
//        dl.addLast(2);
//        dl.addLast(3);
//        dl.addLast(4);
//        dl.addFirst(1);
//        dl.addFirst(0);
//        dl.addLast(5);
//        dl.printlist();
//        dl.removeLast();
//        dl.printlist();
//        dl.removeFirst();
//        dl.removeFirst();
//        dl.printlist();



        // For Single Linked List
//
//        SingleLinkedList li = new SingleLinkedList();
//
//        li.addFirst(10);
//        li.addLast(50);
//        li.addLast(40);
//        li.addLast(30);
//        System.out.println(li.indexOf(133));
//        System.out.println(li.contains(1122));
//        li.printlist();
//        li.addFirst(100);
//        li.printlist();
//        li.removeFirst();
//        li.printlist();
//        li.removeFirst();
//        li.removeFirst();
//        li.removeFirst();
//        li.removeFirst();
//        li.printlist();


    }
}
