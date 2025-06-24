package java_01_collections_framework;

public class L01_CollectionsFramework {

}

/*

The Java Collections Framework provides a unified set of interfaces and classes for
representing and manipulating common data structures and algorithms.

The Java Collections Framework is part of the java.util package.

=========================================
Interfaces of the Collections Framework
=========================================

The Java Collections Framework provides a range of interfaces that define common
methods for performing various operations on collections.

See interface.webp

==========================
Collection Interface
==========================

The Collection interface is the root interface of the Java Collections Framework hierarchy.

Java does not provide direct implementations of the Collection interface. Instead,
it provides classes that implement its sub-interfaces, such as List, Set, and Queue.
For example, ArrayList is a class that implements the List interface, which is a
sub-interface of Collection.

The Collection interface defines many useful methods for working with groups of objects.
These methods are inherited by all its sub-interfaces:

=> size()
Returns the number of elements in the collection.

=> isEmpty()
Returns true if the collection contains no elements.

=> contains(Object o)
Returns true if the collection contains the specified element.

=> iterator()
Returns an Iterator to traverse the elements of the collection.

=> toArray()
Returns an array containing all the elements in the collection.

=> add(E e)
Adds the specified element to the collection if possible.

=> remove(Object o)
Removes a single occurrence of the specified element if present.

=> containsAll(Collection<?> c)
Returns true if the collection contains all elements of the specified collection.

=> addAll(Collection<? extends E> c)
Adds all elements of the specified collection to the collection.

=> removeAll(Collection<?> c)
Removes all elements that are also contained in the specified collection.

=> retainAll(Collection<?> c)
Retains only the elements that are also contained in the specified collection.

=> clear()
Removes all elements from the collection.

=> equals(Object o)
Compares the specified object with this collection for equality.

=> hashCode()
Returns the hash code value for the collection.

=> stream()
Returns a sequential Stream of the collection's elements for functional-style operations.


================================================
Collections Framework vs. Collection Interface
================================================

People often confuse the Collections Framework with the Collection interface.

The Collection interface is the root interface of the Collections Framework’s
collection hierarchy.
The Collections Framework, however, is much broader — it includes other key interfaces
like Map and Iterator, along with their sub-interfaces and implementing classes.

Note: Iterable is not considered the root of the Collections Framework, even though
all collections implement Iterable to support enhanced for-loops.

==========================================
Sub-interfaces of the Collection Interface
==========================================

The Collection interface has several sub-interfaces, each specialized for different
kinds of data structures. These sub-interfaces inherit all the methods defined in the
Collection interface.

Here are the main sub-interfaces of Collection:

1. List Interface
- Represents an ordered collection that allows duplicate elements.
- Elements can be accessed by their index, just like in an array.

2. Set Interface
- Represents a unique collection of elements, similar to a mathematical set.
- Duplicate elements are not allowed.

3. Queue Interface
- Represents a collection designed for First-In-First-Out (FIFO) processing.
- Elements are typically added at the end and removed from the front.

Note: The Map interface is also part of the Collections Framework, but it is not a
sub-interface of Collection.

==============
Map Interface
==============

- The Map interface represents a collection of key–value pairs.
- Each key is unique and is used to access its corresponding value.
- Every key maps to exactly one value, allowing efficient lookups and updates by key.

===================
Iterator Interface
===================

- The Iterator interface is part of the Java Collections Framework.
- The Iterator interface provides methods for traversing elements in a collection one at a time.
- It allows you to iterate over a collection and safely remove elements during iteration.

 */