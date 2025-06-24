package java_04_map_interface;

import java.util.*;

public class L02_HashMap {
    public static void main(String[] args) {
        // ==================
        // Create a HashMap
        // ==================

        // Create an empty map
        Map<String, Integer> numbers = new HashMap<>();
        System.out.println("Empty map: " + numbers);

        // Create a map from other map implementation
        Map<String, Integer> ratings = new HashMap<>(Map.of("Shri", 10, "John", 8));
        System.out.println("Map initialized with other map's entries: " + ratings);

        // ==============
        // Add entires
        // ==============

        // put(key, value): Adds or updates the value for given key
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 5);
        System.out.println("After multiple put(): " + numbers);

        // Value gets updated if key already exists
        numbers.put("four", 4);
        System.out.println("After put('four', 4): " + numbers);

        // putIfAbsent(key, value): Add key-value pair only if key is not present or
        // value associated with it is null.
        numbers.putIfAbsent("five", 5);
        numbers.putIfAbsent("one", 10); // No effect
        System.out.println("After putIfAbsent(): " + numbers);

        // putAll(map): Copies entries of specified map into this map.
        numbers.putAll(Map.of("Twenty", 20, "Hundred", 100));
        System.out.println("After putAll(): " + numbers);

        // put(), putIfAbsent() return previous value associated with the key else null.

        // ================
        // Access entries
        // ================

        // get(key): Returns value associated with key else null
        System.out.println("get('five'): " + numbers.get("five"));
        System.out.println("get('forty'): " + numbers.get("forty")); // null

        // getOrDefault(key, default value): Returns value associated with key else
        // default value
        System.out.println("getOrDefault('ten'): " +
                numbers.getOrDefault("ten", 0));

        // keySet(): Returns set of keys in the map.
        // Set because keys are unique.
        Set<String> keys = numbers.keySet();
        System.out.println("keySet(): " + keys);

        // values(): Returns collection of values in the map.
        // Collection because values can repeat.
        Collection<Integer> values = numbers.values();
        System.out.println("values(): " + values);

        // entrySet(): Returns set of entries in the map.
        Set<Map.Entry<String, Integer>> entries = numbers.entrySet();
        System.out.println("entrySet(): " + entries);

        // java.util.Map.Entry

        // ================
        // Update entries
        // ================

        // replace(key, value): Updates the value for the specified key only if the key
        // already exists.
        // Returns old value if key is present else null.
        numbers.replace("one", 100);
        numbers.replace("forty", 20); // No effect - Key not present
        System.out.println("After replace(): " + numbers);

        // replace(key, old value, new value): Updates the value for the specified key
        // only if the key already exists with specified old value.
        // Returns true if value was replaced.
        numbers.replace("one", 100, 1);
        System.out.println("After replace(): " + numbers);


        // put() also updates the value associated with the key.
        // replace() ensures that only existing keys are updated without adding new
        // keys.

        // ===================
        // IMPORTANT METHODS
        // ===================

        // size(): Returns size of the map
        System.out.println("size(): " + numbers.size());

        // isEmpty(): Check if map is empty
        System.out.println("isEmpty(): " + numbers.isEmpty());

        // containsKey(key): Check if key is present
        System.out.println("containsKey('three'): " + numbers.containsKey("three"));

        // containsValue(value): Check if value is present
        System.out.println("containsValue(9): " + numbers.containsValue(9));


        // ====================================================
        // Iterate on the map
        // ====================================================

        // Iteration on key-value pairs
        System.out.println("Iterate key-value pairs using for-each loop & entrySet():");
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Iteration on keys
        System.out.println("Iterate keys using for-each loop & keySet():");
        for (String key : numbers.keySet()) {
            System.out.println(key);
        }

        // Iteration on values
        System.out.println("Iterate values using for-each loop & values():");
        for (Integer value : numbers.values()) {
            System.out.println(value);
        }

        // =================
        // Remove entries
        // =================

        // remove(key): Removes the entry associated with the key.
        // Returns value if key is present else null.
        numbers.remove("five"); // returns 5
        numbers.remove("fifty"); // returns null
        System.out.println("After remove('five'): " + numbers);

        // remove(key, value): Removes the entry only if both key and value match.
        // Returns true if entry was removed else false.
        System.out.println(numbers.remove("four", 4));
        System.out.println(numbers.remove("two", 4));
        System.out.println("After remove('four', 4): " + numbers);

        // clear(): Removes all mappings from the map
        numbers.clear();
        System.out.println("After clear(): " + numbers);

        // ================================================
        // HashMap and LinkedHashMap of custom object keys
        // ================================================

        Person p1 = new Person(1, "John", 11);
        Person p2 = new Person(2, "Brock", 12);
        Person p3 = new Person(3, "Randy", 13);
        Person p4 = new Person(2, "Brock", 10); // Logically duplicate object

        Map<Person, Integer> map = new LinkedHashMap<>();
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        System.out.println("Map with custom object keys: " + map);

        // Although p2 and p4 are different objects (look at age). But equals() and
        // hashCode() depend on id and name which are same for these two objects.
        // So, put() here updates the value associated with the p2 key but does not
        // replace the key.
        map.put(p4, 4);
        System.out.println("After put(p4, 4): " + map);

        // If you wanted to change the key, you first need to remove the old entry using
        // old key and then insert new entry using new key.
    }
}



/*
===============
HashMap Class
===============
The HashMap class in the Java Collections Framework provides the functionality of a
hash table data structure.

It stores elements as key-value pairs, where each key is unique and used to associate
with a corresponding value.

The HashMap class implements the Map interface and allows null values and one null key.
It does not maintain any order of keys (neither insertion nor sorted).

=================================================
HashMap and LinkedHashMap with Custom Object Keys
=================================================

When using custom objects as keys in a HashMap or LinkedHashMap, it is essential to
override both equals() and hashCode() methods in the key class.

These methods should be based on the same set of fields that define logical equality.

The hashCode() method helps locate the correct bucket for the key.

The equals() method is used to check for key equality within that bucket.

Failing to override these methods correctly may lead to unexpected behavior, such as
keys not being found even if they appear to be equal.


=====================================
HashMap vs LinkedHashMap vs TreeMap
=====================================

HashMap
=> Does not maintain any order of its entries.
=> Provides constant-time performance for basic operations like get() and put().
=> Allows one null key and multiple null values.
=> Backed by a hash table.

LinkedHashMap
=> Maintains the insertion order of keys.
=> Slightly slower than HashMap due to the added overhead of maintaining a linked list.
=> Also allows one null key and multiple null values.
=> Backed by a hash table and a doubly linked list.

TreeMap
=> Maintains natural ordering of keys, or a custom order if a Comparator is provided.
=> Does not allow null keys (throws NullPointerException), but allows multiple null values.
=> Operations like get(), put() take O(log n) time.
=> Backed by a Red-Black Tree.

==========================
Capacity and Load Factor
==========================

When creating a HashMap, you can specify optional parameters: initial capacity and
load factor. For example:

HashMap<K, V> numbers = new HashMap<>(8, 0.6f);

=> Capacity (8): The initial number of buckets in the hash table.
It means the map can initially store approximately 8 entries before resizing.

=> Load Factor (0.6f): A measure that determines when to resize the hash table.
When the map is 60% full, it will resize by creating a new hash table with double the
previous capacity and rehash all existing entries.

If these parameters are not specified, the default values are:
=> Initial capacity = 16
=> Load factor = 0.75 (resize happens when the table is 75% full)

 */