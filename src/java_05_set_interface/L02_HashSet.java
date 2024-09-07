package java_05_set_interface;

import java.util.*;

public class L02_HashSet {

    public static void main(String[] args) {
        // ==================
        // Create a HashSet
        // ==================

        // Duplicate elements are not allowed in HashSet.
        // Order does not matter in HashSet.
        HashSet<Integer> set = new HashSet<>();

        // new HashSet<>(collection implementation): Returns set initialized with the
        // values present in collection.
        // HashSet<Integer> initializedSet = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4,
        // 2));

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

        System.out.println(set);

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 6));

        // addAll(collection implementation): Adds elements from collection which are
        // not present.
        set.addAll(list);

        // add() and addAll() return true if list was changed else false.

        // ====================================================
        // Iterate on set
        // ====================================================

        // Iterate using for-each loop
        for (Integer a : set) {
            System.out.print(a + " ");
        }
        System.out.println();

        // You can also iterate using iterator
        // Iterator<Integer> iterate = set.iterator();

        // ====================================================
        // IMPORTANT METHODS
        // ====================================================

        // contains(element): Check if element is present (in constant time)
        System.out.println(set.contains(4));
        System.out.println(set.contains(2));

        // isEmpty(): Check if set is empty.
        System.out.println(set.isEmpty());

        // size(): Returns size of the set.
        System.out.println(set.size());

        // ================
        // Set Operations
        // ================

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(12);
        a.add(4);
        b.add(12);
        b.add(40);

        // Union
        // addAll(collection): Adds all elements from collection into the set.
        a.addAll(b);
        System.out.println("union of a and b: " + a);

        // Intersection
        // retainAll(collection): Removes all elements of set that are not present in
        // the specified collection. In short, keeps common elements in the set.
        a.retainAll(b);
        System.out.println("intersection of a and b: " + a);

        // Difference
        // removeAll(collection): Removes all elements of set that are present in
        // specified collection.
        a.removeAll(b);
        System.out.println("difference of a and b: " + a);

        // Check subset
        // containsAll(): Check if set contains all the elements of specified
        // collection. In short, check if a is superset or b is subset.
        System.out.println(a.containsAll(b));

        // ==================
        // Remove elements
        // ==================

        // remove(element): Removes the element if present
        set.remove(4);

        System.out.println(set);

        // removeAll(collection implementation): Removes all elements that are in the
        // collection from set.
        set.removeAll(list);

        System.out.println(set);

        // remove() and removeAll() return true if set was changed else false.

        // clear(): Removes all elements from set
        set.clear();

        System.out.println(set);

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

    }

}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

    // Hash Code of object will be based on rollNo.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    // Define equality of objects based on rollNo.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

}

/*
 * ===============
 * HashSet class
 * ===============
 * 
 * The HashSet class of the Java Collections framework provides the
 * functionalities of the hash table data structure.
 * 
 * It implements the Set interface.
 * 
 * Elements in hashset are unordered.
 * 
 * =====================================
 * HashSet vs LinkedHashSet vs TreeSet
 * =====================================
 * 
 * HashSet is unordered.
 * LinkedHashSet maintains insertion order.
 * TreeSet maintains natural order.
 * 
 * 
 * =============================================
 * HashSet and LinkedHashSet of custom objects
 * =============================================
 * 
 * Override both equals() and hashCode() in the class of the objects. Both
 * methods should depend on same fields. These methods help to find the right
 * bucket for the object key.
 * 
 * HashSet uses HashMap whereas LinkedHashSet uses LinkedHashMap internally.
 * 
 * 
 * ==========================
 * Capacity and load factor
 * ==========================
 * 
 * HashSet<Integer> numbers = new HashSet<>(8, 0.75);
 * 
 * Here, the first parameter is capacity, and the second parameter is
 * loadFactor.
 * 
 * capacity - The capacity of this hash set is 8. Meaning, it can store 8
 * elements.
 * loadFactor - The load factor of this hash set is 0.6. This means, whenever
 * our hash set is filled by 60%, the elements are moved to a new hash table of
 * double the size of the original hash table.
 * 
 * By default,
 * the capacity of the hash set will be 16
 * the load factor will be 0.75
 */