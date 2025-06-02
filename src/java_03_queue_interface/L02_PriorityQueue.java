package java_03_queue_interface;

import java.util.*;

public class L02_PriorityQueue {
    public static void main(String[] args) {

        // =======================================================
        // MIN HEAP: Smallest item has higher priority
        // =======================================================

        // =========================
        // Create a priority queue
        // =========================

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ==================
        // Add elements
        // ==================

        // offer(element): Adds element into priority queue
        pq.offer(4);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);

        // If the queue is full, it returns false.

        System.out.println(pq);

        // =================
        // Access elements
        // =================

        // peek(): Returns element at head of the queue without removing it.
        System.out.println(pq.peek());

        // Returned element is next high priority element which is present at the head
        // of the queue.
        // Returns null if queue is empty.

        // ==================
        // Remove elements
        // ==================

        // poll(): Removes and returns the element at head of the queue
        // Returns null if queue is empty.
        System.out.println(pq.poll());

        System.out.println(pq);

        // remove(element): Removes single instance of the element if present and
        // returns true else returns false.
        boolean isRemoved = pq.remove(3);
        System.out.println(isRemoved);

        System.out.println(pq);

        // ================
        // Useful methods
        // ================

        // size(): Returns size of the queue
        System.out.println(pq.size());

        // isEmpty(): check if queue is empty
        System.out.println(pq.isEmpty());

        // contains(element): Check if element is present in queue
        System.out.println(pq.contains(9));

        // toArray(array of same type): Copies elements of queue into the array

        // =======================================================
        // MAX HEAP: Largest item has higher priority
        // =======================================================

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(2);
        pq2.offer(10);
        pq2.offer(7);
        System.out.println(pq2);
        System.out.println(pq2.peek());
        System.out.println(pq2.poll());
    }
}

/*

=====================
PriorityQueue class
=====================

The PriorityQueue class provides the functionality of the heap data
structure.

It implements the Queue interface.

Unlike normal queues, priority queue elements are retrieved in sorted order.

Suppose, we want to retrieve elements in the ascending order. In this case,
the head of the priority queue will be the smallest element. Once this
element is retrieved, the next smallest element will be the head of the
queue.

It is important to note that the elements of a priority queue may not be
sorted. However, elements are always retrieved in sorted order.

The PriorityQueue class provides the implementation of all the methods
present in the Queue interface.



==================================
Priority Queue of custom objects
==================================

For custom objects we have 2 options:

a. Comparator interface
- Pass instance the implementation of Comparator interface as an argument to
the PriorityQueue constructor.

b. Comparable interface
- Implement the Comparable interface in the class of custom objects.


=========================
PriorityQueue Comparator
=========================

Priority queue elements are retrieved in the natural order (ascending order).
However, we can customize this ordering.

For this, we need to create our own comparator class that implements the
Comparator interface.

Pass this comparator as first argument to constructor of PriorityQueue when
creating.

PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());


============================
Comparator.reverseOrder()
============================

Returns a comparator that imposes the reverse of the natural ordering on
Comparable objects.


 */