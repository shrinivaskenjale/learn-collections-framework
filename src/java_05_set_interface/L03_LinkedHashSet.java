package java_05_set_interface;

import java.util.*;

public class L03_LinkedHashSet {
    public static void main(String[] args) {

        // ========================
        // Create a LinkedHashSet
        // ========================

        // Create an empty set
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        System.out.println(set);

        // Create a set from elements of other collection.
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 3, 4, 2));
        System.out.println(set2);

        // All methods are same as HashSet.

        set.add(4);
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(9);
        System.out.println(set);

        // Order is same as insertion
        for (int a : set) {
            System.out.print(a + " ");
        }

    }
}

/*
======================
LinkedHashSet Class
======================

The LinkedHashSet class in the Java Collections Framework combines the features
of both a hash table and a linked list.

It implements the Set interface and stores unique elements.

Like HashSet, elements are stored in a hash table for efficient access.

Additionally, LinkedHashSet maintains a doubly-linked list that preserves the
insertion order of elements.

This linked list ensures that when you iterate over a LinkedHashSet, the elements
are returned in the order in which they were added.


============================
LinkedHashSet vs. HashSet
============================

Both LinkedHashSet and HashSet implement the Set interface, but there are some key
differences between them:

=> LinkedHashSet maintains a linked list internally, which preserves the insertion
order of elements.

=> LinkedHashSet requires more memory than HashSet because of the additional linked
list used to maintain order.

=> The performance of LinkedHashSet is slightly slower than HashSet due to the
overhead of maintaining the insertion order.

============================
LinkedHashSet vs. TreeSet
============================

Here are the main differences between LinkedHashSet and TreeSet:

=> TreeSet implements the SortedSet interface, so it automatically sorts elements
(in natural order or via a custom comparator). In contrast, LinkedHashSet only
maintains insertion order, not sorting.

=> TreeSet is usually slower than LinkedHashSet because it performs sorting
operations whenever an element is added or removed.

=> LinkedHashSet allows one null element, whereas TreeSet does not allow null if
it uses natural ordering, as null cannot be compared.


 */