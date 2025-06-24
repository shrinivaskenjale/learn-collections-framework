package java_04_map_interface;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class L04_TreeMap {
    public static void main(String[] args) {
        // ==================
        // Create a TreeMap
        // ==================

        // Create empty map
        Map<String, Integer> numbers = new TreeMap<>();
        System.out.println("Empty map: " + numbers);

        // Everything is same as HashMap, but keys are stored in sorted order.
        // Built-in data types have natural order defined.

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 5);
        numbers.put("four", 4);
        System.out.println("After multiple put(): " + numbers);

        // ==========================
        // TreeMap with Comparator
        // ==========================

        // Map<String, Integer> numbers2 = new TreeMap<>(Comparator.reverseOrder());

        // Same as above
        Map<String, Integer> numbers2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                return -key1.compareTo(key2);
            }
        });

        numbers2.put("one", 1);
        numbers2.put("two", 2);
        numbers2.put("three", 3);
        numbers2.put("four", 5);
        numbers2.put("four", 4);
        System.out.println("Map with comparator: "+numbers2);

        System.out.println("\n\n");

        // ==============================
        // TreeMap with Comparable keys
        // ==============================

        TreeMap<Car, Integer> carsSlowToFast = new TreeMap<>();

        // Sort according to car speed
        carsSlowToFast.put(new Car("Ferrari", 200), 2000);
        carsSlowToFast.put(new Car("Skoda", 150), 500);
        carsSlowToFast.put(new Car("Audi", 250), 1000);
        carsSlowToFast.put(new Car("Tata", 50), 50);

        System.out.println("Map with Comparable keys: "+carsSlowToFast);

        // Although this (Skoda,150) and the one already present in map are different
        // objects, treemap just compares keys based of speed field of the Car object.
        // So it just updates the value associated with Car object present in the
        // treemap with 150 speed without replacing the key.
        carsSlowToFast.put(new Car("Skoda", 150), 200);

        System.out.println(carsSlowToFast);

        // As per comparable/comparator, (Skoda,150) and (VW,150) are same because it
        // compares only speed field. Since put()/replace() find the key already present
        // in the map, they just update the value associated with the key. Key is not
        // replaced even though it is technically different because semantically both
        // are same.
        carsSlowToFast.put(new Car("VW", 150), 600);

        System.out.println(carsSlowToFast);

        // If you want to update the key:
        // 1. Remove the old entry.
        // 2. Insert the new entry with the updated key.

        for (Map.Entry<Car, Integer> entry : carsSlowToFast.entrySet()) {
            System.out.printf("%s costs %d \n", entry.getKey(), entry.getValue());
        }

        System.out.println("\n\n");

        // ==============================
        // Comparator.reverseOrder()
        // ==============================

        // Comparator.reverseOrder() reverses the order defined by the Comparable.
        TreeMap<Car, Integer> carsFastToSlow = new TreeMap<>(Comparator.reverseOrder());

        carsFastToSlow.put(new Car("Ferrari", 200), 2000);
        carsFastToSlow.put(new Car("Skoda", 150), 500);
        carsFastToSlow.put(new Car("Audi", 250), 1000);
        carsFastToSlow.put(new Car("Tata", 50), 50);

        for (Map.Entry<Car, Integer> entry : carsFastToSlow.entrySet()) {
            System.out.printf("%s costs %d \n", entry.getKey(), entry.getValue());
        }
    }
}



/*
================
TreeMap Class
================

The TreeMap class in the Java Collections Framework provides an implementation of a
red-black tree data structure.

It implements the NavigableMap interface, which extends SortedMap, allowing it to
maintain its entries sorted according to the natural ordering of keys or a specified
Comparator.

===================================
TreeMap with Custom Objects as Keys
===================================

When using custom objects as keys in a TreeMap, you have two options to define the
key ordering:

a. Using the Comparator interface
=> Provide an instance of a class that implements Comparator as an argument to the
TreeMap constructor.
=> This allows custom ordering without modifying the key class.

b. Using the Comparable interface
=> Implement the Comparable interface in the key class itself.
=> Define the natural ordering by overriding the compareTo() method.

TreeMap relies on Comparator or Comparable for sorting and storing keys. This differs
from HashMap and LinkedHashMap, which depend on hashCode() and equals() for key lookup.

Note: It is still good practice to override equals() and hashCode() in the key class to
ensure consistency and compatibility with hash-based collections.

 */