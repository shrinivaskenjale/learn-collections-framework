package java_04_map_interface;

public class L01_Map {

}

/*
==================
Map Interface
==================

The Map interface in the Java Collections Framework represents a data structure that
stores key-value pairs. It allows each key to map to exactly one value and provides
methods to add, remove, and access values based on their keys.

===============
Working of Map
===============

Elements in a Map are stored as key-value pairs.

Keys are unique, and each key is associated with a single value.

A Map cannot contain duplicate keys.

If a key already exists, inserting a new value with the same key will overwrite
the existing value.

We can access, update, or remove values using their associated keys.

The Map interface conceptually maintains three distinct views:
1. set of keys
2. collection of values
3. set of key-value mappings (entries)
These views allow us to access keys, values, and mappings individually.

============================
Classes that Implement Map
============================

Since Map is an interface, we cannot create objects directly from it.

To use the functionalities provided by the Map interface, we use its implementations
available in the Java Collections Framework, such as:

=> HashMap – stores key-value pairs with no guaranteed order.

=> LinkedHashMap – maintains the insertion order of keys.

=> TreeMap – stores keys in a sorted (natural or custom) order.

=> EnumMap – designed specifically for use with enum type keys.

=> WeakHashMap – stores entries with weak keys, which can be garbage collected when
no longer referenced elsewhere.

============================
Interfaces that Extend Map
============================

The Map interface is extended by the following sub-interfaces, each providing
additional functionality:

=> SortedMap – maintains keys in a sorted order (usually natural ordering or via
a custom comparator).

=> NavigableMap – extends SortedMap to provide navigation methods for accessing
elements relative to a given key (e.g., lowerKey(), ceilingEntry()).

=> ConcurrentMap – designed for use in concurrent (multi-threaded) environments,
supporting thread-safe operations without needing external synchronization.

================
Methods of Map
================

Note: Unlike List, Queue, and Set, the Map interface does not extend the Collection interface.

Commonly used methods of the Map interface include:

put(K key, V value)
Inserts the specified key-value mapping into the map.
If the key already exists, the old value is replaced with the new one.

putAll(Map<? extends K, ? extends V> m)
Copies all mappings from the specified map to this map.

putIfAbsent(K key, V value)
Inserts the mapping only if the key is not already associated with a value.

get(Object key)
Returns the value mapped to the specified key, or null if the key is not found.

getOrDefault(Object key, V defaultValue)
Returns the value mapped to the specified key, or the provided default value if
the key is not found.

containsKey(Object key)
Returns true if the map contains the specified key.

containsValue(Object value)
Returns true if the map maps one or more keys to the specified value.

replace(K key, V value)
Replaces the value for the specified key only if it is already mapped to some value.

replace(K key, V oldValue, V newValue)
Replaces the value for the specified key only if it is currently mapped to the
specified old value.

remove(Object key)
Removes the mapping for the specified key if it exists.

remove(Object key, Object value)
Removes the mapping only if the key is currently mapped to the specified value.

keySet()
Returns a Set view of all the keys contained in the map.

values()
Returns a Collection view of all the values contained in the map.

entrySet()
Returns a Set view of all key-value mappings (entries) in the map.

isEmpty()
Returns true if the map contains no key-value mappings.

size()
Returns the number of key-value mappings in the map.

clear()
Removes all mappings from the map.



 */