package java_05_set_interface;

import java.util.*;

public class L02_HashSet {

    public static void main(String[] args) {
        // ==================
        // Create a HashSet
        // ==================

        // Create an empty HashSet
        Set<Integer> set = new HashSet<>();
        System.out.println("Empty set: " + set);

        // Create a HashSet from a collection.
        Set<Integer> initializedSet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 2));
        System.out.println("Set initialized with collection elements: " + initializedSet);

        // ==============
        // Add elements
        // ==============

        // add(element): Adds the element into the set if not present.
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(9);
        System.out.println("After multiple add(): " + set);

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 6));

        // addAll(collection implementation): Adds elements from collection which are
        // not present.
        set.addAll(list);

        System.out.println("After addAll(): " + set);


        // add() and addAll() return true if list was changed else false.

        // ================
        // Iterate on set
        // ================

        // Iterate using for-each loop
        System.out.println("Iterate using for-each loop:");
        for (Integer a : set) {
            System.out.println(a);
        }


        // Iterate using iterator.
        Iterator<Integer> it = set.iterator();
        System.out.println("Iterate using iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // =====================
        // Useful methods
        // =====================

        // contains(element): Check if element is present (in constant time)
        System.out.println("contains(4): " + set.contains(4));
        System.out.println("contains(12): " + set.contains(12));

        // containsAll(collection): Check if all elements of collection are present
        System.out.println("containsAll(4, 2): " + set.containsAll(Arrays.asList(4, 2)));
        System.out.println("containsAll(4, 12): " + set.containsAll(Arrays.asList(4, 12)));

        // isEmpty(): Check if set is empty.
        System.out.println("isEmpty(): " + set.isEmpty());

        // size(): Returns size of the set.
        System.out.println("size(): " + set.size());


        // ==================
        // Remove elements
        // ==================

        // remove(element): Removes the element if present
        set.remove(4);
        System.out.println("After remove(4): " + set);

        // removeAll(collection implementation): Removes all elements that are in the
        // collection from set.
        set.removeAll(list);
        System.out.println("After removeAll(): " + set);

        // remove() and removeAll() return true if set was changed else false.

        // clear(): Removes all elements from set
        set.clear();
        System.out.println("After clear(): " + set);


        // =============================================
        // HashSet and LinkedHashSet of custom objects
        // =============================================

        Set<Student> objSet = new HashSet<>();

        objSet.add(new Student(1, "A"));
        objSet.add(new Student(2, "B"));
        objSet.add(new Student(3, "C"));
        objSet.add(new Student(4, "D"));
        objSet.add(new Student(1, "E")); // Duplicate

        for (Student s : objSet) {
            System.out.println(s);
        }


        // ================
        // Set Operations
        // ================

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(12);
        a.add(4);
        b.add(12);
        b.add(40);
        System.out.println("Set A: " + a);
        System.out.println("Set B: " + b);

        // Union
        // addAll(collection): Adds all elements from collection into the set.
        a.addAll(b);
        System.out.println("A after union of A and B: " + a);

        // Intersection
        // retainAll(collection): Removes all elements of set that are not present in
        // the specified collection. In short, keeps common elements in the set.
        a.retainAll(b);
        System.out.println("A after intersection of A and B: " + a);

        // Difference
        // removeAll(collection): Removes all elements of set that are present in
        // specified collection.
        a.removeAll(b);
        System.out.println("A after difference of A and B: " + a);

        // Check subset
        // containsAll(): Check if set contains all the elements of specified
        // collection.
        System.out.println("Is B subset of A?: " + a.containsAll(b));

    }

}



/*
===============
HashSet class
===============

The HashSet class provides the functionality of a hash table-based data structure.

It implements the Set interface and stores unique elements only.

Elements in a HashSet are unordered, meaning their iteration order is not guaranteed
and may change over time.

=====================================
HashSet vs LinkedHashSet vs TreeSet
=====================================

HashSet does not maintain any order of its elements (it is unordered).

LinkedHashSet maintains the insertion order of elements.

TreeSet maintains the elements in their natural order (or a custom order if a
comparator is provided).

===============================================
HashSet and LinkedHashSet with Custom Objects
===============================================

When using HashSet or LinkedHashSet with custom objects, you must override both
equals() and hashCode() in the object's class.
=> Both methods should be based on the same fields to ensure consistent behavior.
=> These methods are used to determine object uniqueness and to locate the correct
bucket in the underlying data structure.

Internally:
=> HashSet uses a HashMap to store elements.
=> LinkedHashSet uses a LinkedHashMap, which maintains the insertion order.


==========================
Capacity and Load Factor
==========================

HashSet<Integer> numbers = new HashSet<>(8, 0.75f);

In the above example:
The first parameter (8) is the initial capacity.
The second parameter (0.75f) is the load factor.

Capacity:
The initial capacity of this HashSet is 8, meaning it can hold approximately 8
elements before resizing may be considered (depending on the load factor).

Load Factor:
The load factor is 0.75. This means that when the set is 75% full
(i.e., 6 elements in this case), the internal hash table will resize automatically
— typically doubling in size — to maintain performance.

Default values:
=> Default capacity = 16
=> Default load factor = 0.75

 */