package java_03_queue_interface;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L04_LinkedList {
    public static void main(String[] args) {

        // =====================
        // Create a LinkedList
        // =====================

        LinkedList<String> items0 = new LinkedList<>();

        // We can also create a LinkedList using interfaces in Java.
        // Here, if the LinkedList is created using one interface, then we cannot use
        // methods provided by other interfaces. That is, animals1 cannot use methods
        // specific to Queue and Deque interfaces.

        // Creating linkedlist as a List
        List<String> items1 = new LinkedList<>();

        // Creating linkedlist as a Queue
        Queue<String> items2 = new LinkedList<>();

        // Creating linkedlist as a Deque
        Deque<String> items3 = new LinkedList<>();

        System.out.println(items0);
        System.out.println(items1);
        System.out.println(items2);
        System.out.println(items3);

    }
}

/*
 * ====================
 * LinkedList class
 * ====================
 * 
 * LinkedList implements List, Deque (sub-interface of Queue) interfaces.
 * 
 * The LinkedList class of the Java collections framework provides the
 * functionality of the doubly linked list data structure.
 * 
 * Each element in a linked list is known as a node. It consists of 3 fields:
 * => Prev - stores an address of the previous element in the list. It is null
 * for the first element
 * => Next - stores an address of the next element in the list. It is null for
 * the last element
 * => Data - stores the actual data
 * 
 */