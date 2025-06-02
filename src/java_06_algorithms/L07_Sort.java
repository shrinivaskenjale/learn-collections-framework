package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L07_Sort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        // =========================
        // Sorting built-in types
        // =========================

        // Built-in data types in java implement Comparable interface.

        // Ascending
        Collections.sort(numbers);
        System.out.println(numbers);

        // Descending
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        // =========================================
        // Comparable interface
        // =========================================

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "D"));
        students.add(new Student(1, "B"));
        students.add(new Student(8, "A"));
        students.add(new Student(5, "C"));

        // To sort list of objects of user-defined class, that class needs to implement
        // `Comparable` interface. Now we should override compareTo() method and write
        // logic to compare given object to current object.

        // Sorting with roll no.
        Collections.sort(students);
        System.out.println(students);

        // compareTo()
        Student s1 = new Student(1, "Sanket");
        Student s2 = new Student(3, "Shrinivas");
        System.out.println(s1.compareTo(s2));

        // =======================
        // Comparator interface
        // =======================

        // Pass the object of a class that implements Comparator interface as second
        // argument to the sort() method.
        // We have to override compare() method and write the logic to compare given
        // objects.

        // Sorting with name
        Collections.sort(students, new Comparator<Student>() {
            // Here, anonymous class is used.
            @Override
            public int compare(Student o1, Student o2) {
                // Ascending with name
                return o1.name.compareTo(o2.name);

                // Descending with name
                // return -(o1.name.compareTo(o2.name));
            }

        });

        System.out.println(students);

        // ===========================
        // Comparator.reverseOrder()
        // ===========================

        // Comparator.reverseOrder() returns a comparator that imposes the reverse of
        // the natural ordering on Comparable objects.

        // Sorting integers in reverse order
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        // Sorting Student objects with roll no. in reverse order of the compare().
        Collections.sort(students, Comparator.reverseOrder());
        System.out.println(students);
    }
}



/*

Collections.sort() works only on List implementations that are mutable and contain
elements that are either Comparable or with a provided Comparator.

If the type implements Comparable but you provide a Comparator to Collections.sort(), the Comparator takes precedence and is used for sorting instead of the natural ordering.

It can't sort Set & Queue implementations.

It sorts original list.

https://www.javatpoint.com/difference-between-comparable-and-comparator

================
Useful methods
================

Most built-in types in Java, such as String, Integer, Double, and other wrapper classes, implement the Comparable interface to support natural ordering.

"stringA".compareTo("stringB");
"stringA".compareToIgnoreCase("stringB");
Character.compare('a', 'b');
Integer.compare(3, 4);
Double.compare(3.0, 4.0);

Integer n = 3;
n.compareTo(4); // Won't work with primitive int type variable

String.compare() does not exist.

Just add - sign before these methods to get descending order.

 */