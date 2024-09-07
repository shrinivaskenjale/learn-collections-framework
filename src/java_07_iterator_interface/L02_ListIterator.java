package java_07_iterator_interface;

import java.util.ArrayList;
import java.util.ListIterator;

public class L02_ListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // listIterator(): Returns the list iterator.
        ListIterator<Integer> it = numbers.listIterator();

        System.out.println(it.next());
        System.out.println(it.nextIndex());
        System.out.println(it.next());
        System.out.println(it.previousIndex());
        System.out.println(it.previous());
    }
}

/*
 * =========================
 * ListIterator Interface
 * =========================
 * 
 * The ListIterator interface of the Java collections framework provides the
 * functionality to access elements of a list.
 * 
 * It is bidirectional. This means it allows us to iterate elements of a list in
 * both the direction.
 * 
 * It extends the Iterator interface.
 * 
 * The List interface provides a listIterator() method that returns an instance
 * of the ListIterator interface.
 * 
 * =========================
 * Methods of ListIterator
 * =========================
 * 
 * The ListIterator interface provides methods that can be used to perform
 * various operations on the elements of a list.
 * 
 * => hasNext() - returns true if there exists an element in the list
 * 
 * => next() - returns the next element of the list
 * 
 * => nextIndex() - returns the index of the element that the next() method will
 * return
 * 
 * => previous() - returns the previous element of the list
 * 
 * => previousIndex() - returns the index of the element that the previous()
 * method will return
 * 
 * => remove() - removes the element returned by either next() or previous()
 * 
 * => set() - replaces the element returned by either next() or previous() with
 * the specified element
 * 
 */