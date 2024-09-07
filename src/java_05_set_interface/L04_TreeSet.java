package java_05_set_interface;

import java.util.*;

public class L04_TreeSet {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        // All methods are same as HashSet.

        numbers.add(6);
        numbers.add(4);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);

        System.out.println(numbers);

        // ==========================
        // TreeSet with Comparator
        // ==========================

        Set<String> names = new TreeSet<>(Comparator.reverseOrder());

        names.add("John");
        names.add("Chad");
        names.add("John");
        names.add("Alex");

        System.out.println(names);

        // ==============================
        // TreeMap with Comparable elements
        // ==============================

        // If user defined class' objects are to be inserted into the TreeSet, the class
        // must implement Comparable interface to define the order of objects else you
        // get runtime exception.
        Set<Person> people = new TreeSet<>();

        people.add(new Person("John"));
        people.add(new Person("Alex"));
        people.add(new Person("Randy"));
        people.add(new Person("Brock"));
        people.add(new Person("John")); // Duplicate

        for (Person person : people) {
            System.out.println(person);
        }

    }
}

// Class implements Comparable interface
class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

}

/*
 * ===============
 * TreeSet class
 * ===============
 * 
 * The TreeSet class of the Java collections framework provides the
 * functionality of a tree data structure.
 * 
 * TreeSet maintains the sorted order of elements.
 * 
 * It extends the NavigableSet interface.
 * 
 * There are various methods which are not present in other set implementations.
 * 
 * =====================
 * TreeSet Vs. HashSet
 * =====================
 * 
 * Both the TreeSet as well as the HashSet implements the Set interface.
 * However, there exist some differences between them.
 * 
 * => Unlike HashSet, elements in TreeSet are stored in some order. It is
 * because TreeSet implements the SortedSet interface as well.
 * 
 * => TreeSet provides some methods for easy navigation. For example, first(),
 * last(), headSet(), tailSet(), etc. It is because TreeSet also implements the
 * NavigableSet interface.
 * 
 * => HashSet is faster than the TreeSet for basic operations like add, remove,
 * contains and size.
 * 
 * 
 * =============================================
 * TreeSet of custom objects
 * =============================================
 * 
 * For custom objects as elements we have 2 options:
 * a. Comparator interface
 * - Pass instance of subclass of Comparator interface as an argument to the
 * TreeSet constructor.
 * 
 * b. Comparable interface
 * - Implement the Comparable interface in the class of custom objects.
 * 
 * TreeSet relies on Comparator or Comparable interface to order and store
 * elements.
 * This is unlike HashSet and LinkedHashSet which utilizes hashCode() and
 * equals() for key lookups.
 *
 * Still, it's a good practice to also override equals() and hashCode() to
 * ensure consistency and interoperability with other hash based collections.
 * 
 * =====================
 * TreeSet Comparator
 * =====================
 * 
 * Tree set elements are sorted naturally. However, we can also customize the
 * ordering of elements.
 * 
 * For this, we need to create our own comparator class based on which elements
 * in a tree set are sorted. For example,
 * 
 * TreeSet<String> animals = new TreeSet<>(new CustomComparator());
 * 
 * In the above example, we have created a tree set passing CustomComparator
 * class as an argument.
 * 
 * The CustomComparator class implements the Comparator interface.
 * 
 * 
 * ============
 * Extra
 * ============
 * 
 * If you override the compareTo() method in your class to define a custom
 * ordering, it is generally recommended to also override the equals() and
 * hashCode() methods to ensure consistency and correctness when using
 * collections like TreeSet.
 * 
 * This ensures that objects that are considered equal based on your compareTo()
 * method will also be treated as equal by these collections.
 * 
 * 
 * If there is a conflict between result of equals() and compareTo() in terms of
 * equality then TreeSet/TreeMap shows strange results.
 * E.g., You are comparing two objects based on length of some string field in
 * compareTo() whereas you are comparing some values of fields in equals() then
 * it is not possible for both methods to agree upon equality.
 * 
 * In summary, if equals() returns true then compareTo() should return 0 and
 * vice-verse.
 */