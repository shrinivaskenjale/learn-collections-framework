package java_03_queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class L03_Deque {
    public static void main(String[] args) {
        // Array implementation of Deque
        Deque<String> animal1 = new ArrayDeque<>();

        // LinkedList implementation of Deque
        Deque<String> animal2 = new LinkedList<>();

        System.out.println(animal1);
        System.err.println(animal2);
    }
}

/*
=================
Deque Interface
=================

The Deque interface of the Java collections framework provides the
functionality of a double-ended queue.

It extends the Queue interface.

==================
Working of Deque
==================

In a regular queue, elements are added from the rear and removed from the
front. However, in a deque, we can insert and remove elements from both front
and rear.

=============================
Classes that implement Deque
=============================

In order to use the functionalities of the Deque interface, we need to use
classes that implement it:
=> ArrayDeque
=> LinkedList

=================================
ArrayDeque Vs. LinkedList Class
=================================

Both ArrayDeque and LinkedList classes implement the Deque interface.
However, there exist some differences between them.

=> LinkedList supports null elements, whereas ArrayDeque doesn't.

=> Each node in a linked list includes links to other nodes. That's why
LinkedList requires more storage than ArrayDeque.

=> If you are implementing the queue or the deque data structure, an
ArrayDeque is little faster than a LinkedList.

==================
Methods of Deque
==================


Since Deque extends the Queue interface, it inherits all the methods of the
Queue interface.

Besides methods available in the Queue interface, the Deque interface also
includes the following methods:

=> addFirst() - Adds the specified element at the beginning of the deque.
Throws an exception if the deque is full.

=> addLast() - Adds the specified element at the end of the deque. Throws an
exception if the deque is full.

=> offerFirst() - Adds the specified element at the beginning of the deque.
Returns false if the deque is full.

=> offerLast() - Adds the specified element at the end of the deque. Returns
false if the deque is full.

=> getFirst() - Returns the first element of the deque. Throws an exception
if the deque is empty.

=> getLast() - Returns the last element of the deque. Throws an exception if
the deque is empty.

=> peekFirst() - Returns the first element of the deque. Returns null if the
deque is empty.

=> peekLast() - Returns the last element of the deque. Returns null if the
deque is empty.

=> removeFirst() - Returns and removes the first element of the deque. Throws
an exception if the deque is empty.

=> removeLast() - Returns and removes the last element of the deque. Throws
an exception if the deque is empty.

=> pollFirst() - Returns and removes the first element of the deque. Returns
null if the deque is empty.

=> pollLast() - Returns and removes the last element of the deque. Returns
null if the deque is empty.

===============================
Deque as Stack Data Structure
===============================

Deque as Stack Data Structure
The Stack class of the Java Collections framework provides the implementation
of the stack.

However, it is recommended to use Deque as a stack instead of the Stack
class. It is because methods of Stack are synchronized.

Here are the methods the Deque interface provides to implement stack:

push() - adds an element at the beginning of deque
pop() - removes an element from the beginning of deque
peek() - returns an element from the beginning of deque
 */