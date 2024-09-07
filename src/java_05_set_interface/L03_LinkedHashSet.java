package java_05_set_interface;

import java.util.*;

public class L03_LinkedHashSet {
    public static void main(String[] args) {

        // ========================
        // Create a LinkedHashSet
        // ========================

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Create a set from elements of other collection.
        // Set<String> set2 = new LinkedHashSet<>(collection);

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
 * ======================
 * LinkedHashSet class
 * ======================
 * 
 * The LinkedHashSet class of the Java collections framework provides
 * functionalities of both the hashtable and the linked list data structure.
 * 
 * It implements the Set interface.
 * 
 * Elements of LinkedHashSet are stored in hash tables similar to HashSet.
 * 
 * However, linked hash sets maintain a doubly-linked list internally for all of
 * its elements. The linked list defines the order in which elements are
 * inserted in hash tables.
 * 
 * 
 * ============================
 * LinkedHashSet Vs. HashSet
 * ============================
 * 
 * Both LinkedHashSet and HashSet implements the Set interface. However, there
 * exist some differences between them.
 * 
 * => LinkedHashSet maintains a linked list internally. Due to this, it
 * maintains the insertion order of its elements.
 * 
 * => The LinkedHashSet class requires more storage than HashSet. This is
 * because LinkedHashSet maintains linked lists internally.
 * 
 * => The performance of LinkedHashSet is slower than HashSet. It is because of
 * linked lists present in LinkedHashSet.
 * 
 * ============================
 * LinkedHashSet Vs. TreeSet
 * ============================
 * 
 * 
 * Here are the major differences between LinkedHashSet and TreeSet:
 * 
 * => The TreeSet class implements the SortedSet interface. That's why elements
 * in a tree set are sorted. However, the LinkedHashSet class only maintains the
 * insertion order of its elements.
 * 
 * => A TreeSet is usually slower than a LinkedHashSet. It is because whenever
 * an element is added to a TreeSet, it has to perform the sorting operation.
 * 
 * => LinkedHashSet allows the insertion of null values. However, we cannot
 * insert a null value to TreeSet.
 * 
 * 
 */