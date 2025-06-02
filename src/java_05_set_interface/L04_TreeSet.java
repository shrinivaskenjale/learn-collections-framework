package java_05_set_interface;

import java.util.*;

public class L04_TreeSet {
    public static void main(String[] args) {

        // Create an empty set.
        Set<Integer> numbers = new TreeSet<>();
        System.out.println(numbers);

        // Create a set from elements of other collection.
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(4, 2, 3, 3, 1, 4, 2));
        System.out.println(set2);

        // All methods are same as HashSet.

        numbers.add(6);
        numbers.add(4);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        System.out.println(numbers);

        // ==========================
        // TreeSet with Comparator
        // ==========================

        Set<String> names = new TreeSet<>(Comparator.reverseOrder());

        names.add("John");
        names.add("Chad");
        names.add("John");
        names.add("Alex");

        System.out.println(names);

        // ==============================
        // TreeMap with Comparable elements
        // ==============================

        // If objects of a user-defined class are to be inserted into a TreeSet,
        // the class must implement the Comparable interface to define the natural ordering.
        // Otherwise, a runtime exception (ClassCastException) will occur.
        Set<Person> people = new TreeSet<>();

        people.add(new Person("John"));
        people.add(new Person("Alex"));
        people.add(new Person("Randy"));
        people.add(new Person("Brock"));
        people.add(new Person("John")); // Duplicate

        for (Person person : people) {
            System.out.println(person);
        }

    }
}



/*
===============
TreeSet Class
===============

The TreeSet class in the Java Collections Framework provides the functionality of
a self-balancing tree data structure (specifically a Red-Black Tree).

TreeSet automatically maintains the elements in sorted order (natural order or based
on a custom comparator).

It implements the NavigableSet interface, which extends SortedSet, providing additional
navigation methods like ceiling(), floor(), higher(), and lower().

TreeSet offers several methods that are not available in other Set implementations,
allowing for range-based operations, element retrieval based on order, and more.

=====================
TreeSet vs. HashSet
=====================

Both TreeSet and HashSet implement the Set interface, but there are key differences
between them:

=> Unlike HashSet, elements in a TreeSet are stored in sorted order. This is because
TreeSet implements the SortedSet interface.

=> TreeSet also implements the NavigableSet interface, providing convenient navigation
methods such as first(), last(), headSet(), tailSet(), and others.

=> For basic operations like add(), remove(), contains(), and size(), HashSet is
generally faster than TreeSet due to the overhead of maintaining sorted order in TreeSet.


============================
TreeSet of Custom Objects
============================

When using custom objects as elements in a TreeSet, you have two options to define
the sorting order:

a. Using the Comparator interface:
Pass an instance of a class that implements the Comparator interface as an argument
to the TreeSet constructor.

b. Using the Comparable interface:
Implement the Comparable interface in your custom object's class and override the
compareTo() method.

Important: If both a Comparator and the object’s Comparable implementation are provided,
the Comparator takes precedence and is used to order the elements.

TreeSet relies on either the Comparator or Comparable interface to order and store
elements. This differs from HashSet and LinkedHashSet, which use the hashCode()
and equals() methods for key lookups and uniqueness.

However, it is still good practice to override equals() and hashCode() in your
custom class to ensure consistency and proper behavior when interacting with other
hash-based collections.

=====================
TreeSet Comparator
=====================

By default, TreeSet elements are sorted according to their natural order. However,
you can customize the ordering by providing your own comparator.

To do this, create a class that implements the Comparator interface and define the
sorting logic. Then, pass an instance of this comparator to the TreeSet constructor.
For example:

TreeSet<String> animals = new TreeSet<>(new CustomComparator());

In this example, CustomComparator is a class that implements the Comparator interface
and defines the custom sorting order for the elements in the tree set.


============
Extra
============

If you override the compareTo() method in your class to define a custom ordering,
it is generally recommended to also override the equals() and hashCode() methods
to ensure consistency and correctness when using collections like TreeSet.

This ensures that objects considered equal by your compareTo() method are also
treated as equal by these collections.

If there is a conflict between the results of equals() and compareTo() regarding
equality, then TreeSet or TreeMap can exhibit unexpected or inconsistent behavior.

For example, if your compareTo() method compares two objects based on the length
of a string field, but equals() compares other field values, the two methods may
disagree on whether objects are equal.

 */