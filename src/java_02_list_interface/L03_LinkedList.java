package java_02_list_interface;

import java.util.*;

public class L03_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // Everything is same as ArrayList/Deque.
        // It internally uses doubly linked list.

        // add
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.add(1, 10);
        System.out.println(ll);

        // remove
        ll.remove(3);
        System.out.println(ll);

        ll.offerFirst(100);
        System.out.println(ll.pollFirst());

    }
}

/*
 * LinkedList implements List and Deque (sub-interface of Queue) interfaces.
 * 
 * https://www.javatpoint.com/difference-between-arraylist-and-linkedlist
 * 
 * It can be used as list, queue and deque since it implements both List and
 * Deque interfaces.
 * 
 * Insertion or deletion near beginning or middle of the linkedlist is faster
 * compared to arraylist.
 * So, if you want to do insertion or deletion close to the end of the list then
 * use arraylist else linkedlist.
 * 
 * For accessing elements by index, ArrayList is faster because it provides
 * constant time access.
 * For traversal without indexing, both have similar performance.
 */