package java_05_set_interface;

public class L01_Set {

}

/*
===================
Set Interface
===================

The Set interface in the Java Collections Framework represents the mathematical
concept of a set.

It extends the Collection interface.

Unlike the List interface, a Set does not allow duplicate elements, ensuring that
each element is unique within the collection.

============================
Classes That Implement Set
============================

Since Set is an interface, we cannot create instances of it directly.

To use the functionality provided by the Set interface, we use one of its
implementing classes, such as:
=> HashSet
=> LinkedHashSet
=> TreeSet
=> EnumSet

Each implementation has its own characteristics and use cases.

============================
Interfaces That Extend Set
============================

The Set interface is further extended by the following sub-interfaces:
=> SortedSet
=> NavigableSet

These interfaces add additional functionality, such as maintaining elements
in a sorted order and providing navigation methods.

================
Methods of Set
================

The Set interface inherits all the methods from the Collection interface
because Collection is a superinterface of Set.

Some commonly used methods available in both Collection and Set interfaces include:

=> add(E e) – Adds the specified element to the set (if it's not already present).

=> addAll(Collection<? extends E> c) – Adds all elements from the specified
collection to the set.

=> iterator() – Returns an iterator to traverse the elements of the set sequentially.

=> remove(Object o) – Removes the specified element from the set, if it is present.

=> removeAll(Collection<?> c) – Removes from the set all elements that are also contained
in the specified collection.

=> retainAll(Collection<?> c) – Retains only the elements in the set that are also
present in the specified collection.

=> clear() – Removes all elements from the set.

=> size() – Returns the number of elements in the set.

=> toArray() – Returns an array containing all the elements of the set.

=> contains(Object o) – Returns true if the set contains the specified element.

=> containsAll(Collection<?> c) – Returns true if the set contains all elements of the
specified collection.

=> hashCode() – Returns the hash code value for the set.


================
Set Operations
================

The Java Set interface supports basic mathematical set operations such as union, intersection, subset, and difference.

Union – Combines all elements from two sets.
To get the union of sets x and y, use:
x.addAll(y)

Intersection – Retains only the common elements between two sets.
To get the intersection of sets x and y, use:
x.retainAll(y)

Subset – Checks if all elements of one set are contained in another.
To check if x is a subset of y, use:
y.containsAll(x)

Difference – Removes all elements in one set that are also in another.
To get the difference x - y (elements in x but not in y), use:
x.removeAll(y)



==============
BTS
==============

Set implementations use Map implementations internally.
- HashSet uses HashMap
- LinkedHashSet uses LinkedHashMap
- TreeSet uses TreeMap

 */