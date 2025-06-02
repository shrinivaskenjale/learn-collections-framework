package java_03_queue_interface;

import java.util.*;

public class L05_ArrayDeque {
    public static void main(String[] args) {
        // ===================
        // Create ArrayDeque
        // ===================

        // Queue<Integer> adq = new ArrayDeque<>();

        Deque<Integer> adq = new ArrayDeque<>();

        // ==============
        // Add elements
        // ==============

        // offer(element): Add element at rear of the deque.
        adq.offer(7);

        // offerLast(element) == offer(element)
        adq.offerLast(4);

        // offerFirst(element): Add element at front of the deque.
        adq.offerFirst(3);

        System.out.println(adq);

        // offer(), offerFirst() and offerLast() returns true if the element is
        // successfully inserted; if the array deque is full, these methods return
        // false.

        // addXXX() are alternatives to offerXXX() methods but throw exception if deque
        // is full.

        // =================
        // Access elements
        // =================

        // peek(): Returns element at the head without removing it.
        System.out.println(adq.peek());

        // peekFirst() == peek()
        System.out.println(adq.peekFirst());

        // peekLast(): Returns element at the tail without removing it.
        System.out.println(adq.peekLast());

        // peekXXX() methods return null if deque is empty.

        // getXXX() are alternatives to peekXXX() methods but throw exception if deque
        // is empty.

        // ==================
        // Remove elements
        // ==================

        // poll(): Removes and returns the element at head.
        System.out.println(adq.poll());

        // pollFirst() == poll()
        System.out.println(adq.pollFirst());

        // pollLast(): Removes and returns the element at tail.
        System.out.println(adq.pollLast());

        // pollXXX() methods return null if deque is empty.

        // removeXXX() are alternatives to pollXXX() methods but throw exception if
        // deque is empty.

        // clear(): Removes all elements from the deque.
        adq.clear();

        // ================
        // Useful methods
        // ================

        // size(): Returns the size of deque
        System.out.println(adq.size());

        // isEmpty(): Checks if deque is empty.
        System.out.println(adq.isEmpty());

        // =======================
        // ArrayDeque as a Stack
        // =======================

        Deque<String> stack = new ArrayDeque<>();

        // push(element): Pushes element into the stack.
        // push() == addFirst()
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack: " + stack);

        // peek(): Returns the element at top of the stack.
        // peek() == peekFirst()
        // Returns null if stack is empty.
        String element = stack.peek();
        System.out.println("Accessed Element: " + element);

        // pop(): Removes and returns the element at top of the stack.
        // pop() == removeFirst()
        // Throws exception if stack is empty.
        String remElement = stack.pop();
        System.out.println("Removed element: " + remElement);

    }
}

// If you want normal queue(FIFO) => for adding use 'offer()' and for removal
// use 'poll()'. Or use Queue interface instead of Deque.

// Use ArrayBlockingQueue which implements Queue interface if you want fixed
// size queue.

/*
==================
ArrayDeque class
==================

We can use the ArrayDeque class to implement queue and deque data structures
using arrays.

The ArrayDeque class implements Deque interface.
The ArrayDeque class provides implementations for all the methods present in
Queue and Deque interfaces.

=======================
ArrayDeque as a Stack
=======================

To implement a LIFO (Last-In-First-Out) stacks in Java, it is recommended to
use a deque over the Stack class. The ArrayDeque class is likely to be faster
than the Stack class.

ArrayDeque provides the following methods that can be used for implementing a
stack.

push() - adds an element to the top of the stack
peek() - returns an element from the top of the stack
pop() - returns and removes an element from the top of the stack
 */