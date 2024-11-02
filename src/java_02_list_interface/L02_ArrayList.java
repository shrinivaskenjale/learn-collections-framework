package java_02_list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L02_ArrayList {
    public static void main(String[] args) {
        // =================
        // Create arraylist
        // =================

        // When creating ArrayList, define class of objects or data
        // that will be stored in it using type parameter.
        // Use wrapper classes for primitive types

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(Integer.valueOf(43));

        List<String> names = new ArrayList<>();

        // Creating new arraylist from other collection.
        // new ArrayList<>(Collection implementation)

        // =============
        // Add elements
        // =============

        // add(element): Add single element to the end
        names.add("Shrinivas");
        names.add("Ram");
        names.add("Shyam");

        System.out.println(names);

        // add(index, element): Add element at given index
        names.add(1, "Arjun");

        System.out.println(names);

        List<String> names2 = new ArrayList<>();
        names2.add("Sourabh");
        names2.add("Vedant");

        // addAll(Collection-implementation): Add elements of collection to the end
        names.addAll(names2);

        // addAll(index, Collection-implementation): Add elements of the collection at
        // given index

        // collection-implementation can be List, Queue or Set implementations.

        System.out.println(names);

        // =================
        // Access elements
        // =================

        // get(index): Get the element at index
        System.out.println(names.get(2));

        // We can also access elements using iterator

        // =================
        // Change elements
        // =================

        // set(index, element): Set element at index
        names.set(0, "Shri");

        System.out.println(names);

        // ================
        // Useful methods
        // ================

        // contains(element): Check whether list has element
        System.out.println(names.contains("Ram"));

        // size(): Get size of list
        System.out.println(names.size());

        // isEmpty(): Check whether list is empty
        System.out.println(names.isEmpty());

        // indexOf(element): Get first index of element
        System.out.println(names.indexOf("Ram"));

        // lastIndexOf(element): Get last index of element

        // ======================
        // Iteratre on the list
        // ======================

        // For loop
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        System.out.println();

        // For-each loop
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();

        // ================
        // Remove elements
        // ================

        // remove(index): Remove element at index
        names.remove(1);

        System.out.println(names);

        // remove(object): Remove first occurence of object
        names.remove(String.valueOf("Shyam"));

        System.out.println(names);

        // If it was arraylist of integers then we would do:
        // intergerList.remove(Integer.valueOf(30));

        // clear(): Empty the list
        names.clear();

        // removeAll(Collection implementation): Removes all elements from the list that
        // are present in the given collection.

        // removeXXX() methods return true if any element was removed else false.

        System.out.println(names);

        // =============================
        // Convert ArrayList to array
        // =============================

        List<String> languages = new ArrayList<>();

        // Add elements in the array list
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Create a new array of String type
        String[] languagesArr = new String[languages.size()];

        // toArray(array): Copy ArrayList into an array
        languages.toArray(languagesArr);

        // We can independently change the values of array and list
        languages.set(0, "Kotlin");
        languagesArr[0] = "JavaScript";

        System.out.println(Arrays.toString(languagesArr));
        System.out.println(languages);

        // Getting new array each time
        String[] newArr = languages.toArray(new String[0]);
        System.out.println(Arrays.toString(newArr));

        // =============================
        // Convert array into ArrayList
        // =============================

        // Create an array of String type
        String[] languagesArr2 = { "Java", "Python", "C++" };

        // Create an ArrayList from an array
        List<String> languages2 = new ArrayList<>(Arrays.asList(languagesArr2));

        // We can independently change the values of array and list
        languages2.set(0, "Kotlin");
        languagesArr2[0] = "JavaScript";

        System.out.println(Arrays.toString(languagesArr2));
        System.out.println(languages2);

        // =====================================================
        // Create and initialize an arraylist in a single line
        // =====================================================

        List<String> cars = new ArrayList<>(Arrays.asList("Ford", "Mahindra", "Skoda"));

        System.out.println(cars);
    }
}

/*
 * ArrayList implements List interface
 * 
 * Arraylist uses array BTS.
 * 
 * We use the ArrayList class to implement the functionality of
 * resizable-arrays.
 * 
 * Unlike arrays, arraylists can automatically adjust their capacity when we add
 * or remove elements from them. Hence, arraylists are also known as dynamic
 * arrays.
 * 
 * Removing the elements from the end of the arraylist is fast but from the
 * start it's slow. This is because elements after the deleted item are shifted
 * backwards to fill the gap.
 */
