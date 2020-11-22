package Akif;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Heap {
    Scanner scanner = new Scanner(System.in);
    public int heap_size;
    public int arr[] = new int[heap_size+1];

    Heap(int heap_size,int arr[]) {
        this.heap_size = heap_size;
        this.arr = arr;
    }



    void input_heap() {
        System.out.println("Heap Size : " + heap_size);
        arr[0]=0;
        for (int i = 0; i < heap_size; i++) {
            int x =  scanner.nextInt();
            arr[i] = x;
        }
    }

    int left_child(int parent) {
        if(parent*2>heap_size) return -1;
        else return arr[parent*2];
    }

    int right_child(int parent) {
        if((parent*2)+1>heap_size) return -1;
        else return arr[parent*2+1];
    }

    void print_heap() {
        System.out.println("-------" + arr[1]);
        System.out.println("----" + arr[2] + "------" + arr[3]);
        System.out.println("--" + arr[4] + "---" + arr[5] + "---" + arr[6]+ "---" + arr[7]);
    }

    void max_heapify(int parent) {
        if(parent*2+1 <=heap_size) {
            System.out.println("Selected Parent : " + arr[parent]);
            if(arr[parent] < arr[parent*2]) {
                int temp = arr[parent];
                arr[parent] = arr[parent*2];
                arr[parent*2] = temp;
            }

            if(arr[parent] < arr[parent*2+1]) {
                int temp = arr[parent];
                arr[parent] = arr[parent*2+1];
                arr[parent*2+1] = temp;
            }
        }

    }

    void build_max_heap_total() {

    }


}
