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

// Before for-each loops, iterators was the way to iterate over collections.

// Interface chain: List extends Collection extends Iterable
// Iterable interface has only one method iterator(). This is why we are able to
// iterate on different types of collections.

// Initially, iterator points before the first element in the collection.

// it.remove() removes the last item from collection which was returned by
// it.next()
// It is also useful if you want to remove items from collection while iterating
// over it. Because if we try to remove items from collection in for-each loop,
// we get runtime exception. But we can do it with while loop and iterator by
// calling remove() method.

// ListIterator interface allows us to move in both directions and allow us to
// add items to List collections while iterating over it.

// For-each loop uses iterators behind the scenes.

/*
 * ====================
 * Iterator Interface
 * ====================
 * 
 * The Iterator interface of the Java collections framework allows us to access
 * elements of a collection.
 * 
 * It has a subinterface ListIterator.
 * 
 * All the Java collections include an iterator() method. This method returns an
 * instance of iterator used to iterate over elements of collections.
 * 
 * =====================
 * Methods of Iterator
 * =====================
 * 
 * The Iterator interface provides 4 methods that can be used to perform various
 * operations on elements of collections.
 * 
 * => hasNext() - returns true if there exists an element in the collection
 * 
 * => next() - returns the next element of the collection
 * 
 * => remove() - removes the last element returned by the next()
 * 
 * => forEachRemaining() - performs the specified action for each remaining
 * element of the collection
 * 
 * 
 * ===========================================
 * Visualization of iterator & list iterator
 * ===========================================
 * 
 * Cursor is the marker/pointer that indicates current position in the
 * collection.
 * 
 * Consider it same as cursor of text editors.
 * 
 * Cursor is always in between the elements just like each character in text.
 * 
 * Initially cursor is before first element: | 1 2 3
 * 
 * next() moves the cursor ahead just like pressing right arrow and returns the
 * element it crossed: 1 | 2 3 => 1
 * 
 * previous() moves the cursor behind just like pressing left arrow and returns
 * the element it crossed: | 1 2 3 => 1
 * 
 */