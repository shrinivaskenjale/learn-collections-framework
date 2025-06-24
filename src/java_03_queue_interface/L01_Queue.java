package java_03_queue_interface;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class L01_Queue {
    public static void main(String[] args) {
        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();

        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();

        // Priority Queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}

/*
=================
Queue Interface
=================

The Queue interface in the Java Collections Framework provides the functionality of
a queue data structure, typically following First-In-First-Out (FIFO) ordering.

It extends the Collection interface, thereby inheriting its methods while also
introducing additional methods specifically for queue operations.

================================================
Classes that Implement the Queue Interface
================================================

Since Queue is an interface, it cannot be instantiated directly.

To use the functionalities of a queue, we must use classes that implement the Queue
interface, such as:

=> ArrayDeque: A resizable array implementation of a deque that can be used as a queue
or stack with no capacity restrictions.

=> LinkedList: A doubly linked list implementation that supports all queue operations
and allows null elements.

=> PriorityQueue: A queue implementation that orders elements according to their natural
ordering or a custom comparator.

Each of these classes provides different behaviors and performance characteristics
depending on the use case.

=============================================
Interfaces that Extend the Queue Interface
=============================================

The Queue interface is extended by several sub-interfaces that add specialized behaviors:

=> Deque – A double-ended queue that allows insertion and removal of elements
from both ends.

=> BlockingQueue – A thread-safe queue that supports operations that wait for the
queue to become non-empty or for space to become available.

=> BlockingDeque – A thread-safe, double-ended queue that combines features of Deque
and BlockingQueue.

=======================================
Working of the Queue Data Structure
=======================================

A queue follows the First-In, First-Out (FIFO) principle, meaning the element added
first is the one removed first.

Elements are added at the rear (tail) and removed from the front (head).

==================================
Methods of the Queue Interface
==================================

The Queue interface inherits all methods from the Collection interface, since
Collection is its superinterface.
In addition, it provides several methods specifically designed for queue operations:

add(E e) – Inserts the specified element into the queue.
Returns true if successful; throws an exception if the queue is full.

offer(E e) – Inserts the specified element into the queue.
Returns true if successful; returns false if the queue is full.

element() – Retrieves, but does not remove, the head of the queue.
Throws an exception if the queue is empty.

peek() – Retrieves, but does not remove, the head of the queue.
Returns null if the queue is empty.

remove() – Retrieves and removes the head of the queue.
Throws an exception if the queue is empty.

poll() – Retrieves and removes the head of the queue.
Returns null if the queue is empty.

 */