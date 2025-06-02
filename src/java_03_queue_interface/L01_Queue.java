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

The Queue interface of the Java collections framework provides the
functionality of the queue data structure.

It extends the Collection interface.

==============================
Classes that Implement Queue
==============================

Since the Queue is an interface, we cannot provide the direct implementation
of it.

In order to use the functionalities of Queue, we need to use classes that
implement it:
=> ArrayDeque
=> LinkedList
=> PriorityQueue


=============================
Interfaces that extend Queue
=============================

The Queue interface is also extended by various sub-interfaces:
=> Deque
=> BlockingQueue
=> BlockingDeque

=================================
Working of Queue Data Structure
=================================

In queues, elements are stored and accessed in First In, First Out manner.
That is, elements are added from the behind and removed from the front.

==================
Methods of Queue
==================

The Queue interface includes all the methods of the Collection interface. It
is because Collection is the super interface of Queue.

Some of the commonly used methods of the Queue interface are:

=> add() - Inserts the specified element into the queue. If the task is
successful, add() returns true, if not it throws an exception.

=> offer() - Inserts the specified element into the queue. If the task is
successful, offer() returns true, if not it returns false.

=> element() - Returns the head of the queue. Throws an exception if the
queue is empty.

=> peek() - Returns the head of the queue. Returns null if the queue is
empty.

=> remove() - Returns and removes the head of the queue. Throws an exception
if the queue is empty.

=> poll() - Removes and returns the head of the queue. Returns null if the
queue is empty.
 */