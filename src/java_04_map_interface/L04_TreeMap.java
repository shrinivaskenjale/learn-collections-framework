package java_04_map_interface;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class L04_TreeMap {
    public static void main(String[] args) {
        // ==================
        // Create a TreeMap
        // ==================

        Map<String, Integer> numbers = new TreeMap<>();

        // Everything is same as HashMap, but keys are stored in sorted order.
        // Built-in data types have Comparable interface implemented.

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 5);
        numbers.put("four", 4);

        System.out.println(numbers);

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

        System.out.println(numbers2);

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

        System.out.println(carsSlowToFast);

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

class Car implements Comparable<Car> {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int compareTo(Car other) {
        return Integer.compare(speed, other.speed);
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", speed=" + speed + "]";
    }

    // TreeMap doesn't depend on hashCode() and equals().
}

/*
=================
TreeMap class
=================

The TreeMap class of the Java collections framework provides the tree data
structure implementation.

It implements the NavigableMap interface.

===================================
TreeMap of custom objects as keys
===================================

For custom objects as keys we have 2 options:

a. Comparator interface
- Pass instance of subclass of Comparator interface as an argument to the
TreeMap constructor.

b. Comparable interface
- Implement the Comparable interface in the class of custom objects.

TreeMap relies on Comparator or Comparable interface to order and store keys.
This is unlike HashMap and LinkedHashMap which utilizes hashCode() and
equals() for key lookups.

Still, it's a good practice to also override equals() and hashCode() to
ensure consistency and interoperability with other hash based collections.

==========================
TreeMap with Comparator
==========================

Treemap elements are sorted naturally (in ascending order). However, we can
also customize the ordering of keys.

For this, we need to create our own comparator class based on which keys in a
treemap are sorted. Then pass the instance of the comparator as an argument to
TreeMap constructor.

TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());



 */