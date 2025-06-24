package java_04_map_interface;

public class L03_LinkedHashMap {
    public static void main(String[] args) {
        // ========================
        // Create a LinkedHashMap
        // ========================

        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>();
        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>(map implementaion);
        // Map<KeyType, ValueType> numbers = new LinkedHashMap<>(capacity, load factor);

        // All methods are same as HashMap.

    }
}

/*
=======================
LinkedHashMap Class
=======================

The LinkedHashMap class in the Java Collections Framework provides a hash table and
linked list implementation of the Map interface.

It extends the functionality of HashMap by maintaining a doubly-linked list running
through all its entries. This linked list preserves the insertion order (or optionally,
access order) of the entries, enabling predictable iteration order.

===========================================
LinkedHashMap with Custom Objects as Keys
===========================================

When using custom objects as keys in a LinkedHashMap, it is essential to override both
equals() and hashCode() methods in the key class.

These methods must be consistent and based on the same set of fields to ensure correct behavior.

Proper overriding ensures that keys are correctly identified and stored in the map,
maintaining the expected insertion order.

===========================
LinkedHashMap vs HashMap
===========================

Both LinkedHashMap and HashMap implement the Map interface, but they have key differences:

=> Ordering:
LinkedHashMap maintains a doubly-linked list internally, preserving the insertion order
of its entries. HashMap does not guarantee any specific order.

=> Memory Usage:
LinkedHashMap requires more memory than HashMap because it stores the linked list pointers
for maintaining order.

Performance:
Due to the overhead of maintaining the linked list, LinkedHashMap operations are typically
slightly slower than those of HashMap.

==========================
Capacity and Load Factor
==========================

By default, a LinkedHashMap has:
Initial capacity = 16
Load factor = 0.75

These defaults mean the map will resize when it is 75% full, similar to HashMap.



 */