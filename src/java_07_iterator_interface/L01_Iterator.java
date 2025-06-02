package java_07_iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class L01_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // iterator(): Returns the iterator.
        Iterator<Integer> it = numbers.iterator();

        // hasNext(): Check if iterator has more elements.
        while (it.hasNext()) {

            // next(): Returns the next element in the iteration.
            // It also moves the cursor forward.
            // Throws exception if the iteration has no more elements
            int currentNumber = it.next();

            System.out.println(currentNumber);

            if (currentNumber == 3) {
                // remove(): Removes from the underlying collection the last element returned by
                // this iterator.
                it.remove();
            }
        }

        System.out.println(numbers);
    }
}



/*
====================
Iterator Interface
====================

The Iterator interface in the Java Collections Framework allows us to access and iterate over elements of a collection.

Interface chain: List / Set / Queue → extend Collection → which extends Iterable.
The Iterable interface has only one abstract method: iterator(). This is why we are able to iterate over different types of collections using iterators or enhanced for-each loops.

Note: The Map interface in Java does not extend the Iterable interface.

All collection classes in Java implement the iterator() method, which returns an instance of an Iterator used to traverse the elements of the collection.

Before the enhanced for-each loop was introduced, iterators were the primary way to iterate over collections.

The Iterator interface has a sub-interface called ListIterator.
The ListIterator interface allows bidirectional traversal (both forward and backward) and also supports adding elements to a List while iterating.

The for-each loop internally uses an iterator behind the scenes.

Using an iterator is especially useful when you want to remove elements from a collection while iterating.
If you try to remove elements in a for-each loop, a ConcurrentModificationException is thrown at runtime.
However, with a while loop and an Iterator, you can safely remove elements by calling the remove() method.

=====================
Methods of Iterator
=====================

The Iterator interface provides 4 methods that can be used to perform various
operations on elements of collections.

=> hasNext() - returns true if there exists an element in the collection

=> next() - returns the next element of the collection

=> remove() - removes the last element returned by the next()

=> forEachRemaining() - performs the specified action for each remaining
element of the collection


===========================================
Visualization of iterator & list iterator
===========================================

Cursor is the marker/pointer that indicates current position in the
collection.

Consider it same as cursor of text editors.

Cursor is always in between the elements just like each character in text.

Initially cursor is before first element: | 1 2 3

next() moves the cursor ahead just like pressing right arrow and returns the
element it crossed: 1 | 2 3 => 1

previous() moves the cursor behind just like pressing left arrow and returns
the element it crossed: | 1 2 3 => 1

 */