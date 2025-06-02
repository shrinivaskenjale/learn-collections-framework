package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class L09_BinarySearch {
    public static void main(String[] args) {
        // ===============
        // BINARY SEARCH
        // ===============

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(Collections.binarySearch(list, 2));
        System.out.println(Collections.binarySearch(list, 3));

    }
}

/*

=====================================
Collections.binarySearch(list, key)
=====================================

Collections.binarySearch() can be used only on sorted List implementations.

The Collections.binarySearch() method searches the specified list for the specified object using the binary search algorithm.

The list must be sorted in ascending order according to the natural ordering of its elements (as by the sort(List) method) before calling this method. If the list is not sorted, the results are undefined.

If the list contains multiple elements equal to the specified object, there is no guarantee which one will be returned.

This method runs in O(log n) time for random access lists (i.e., those implementing the RandomAccess interface, like ArrayList).

If the list does not implement RandomAccess and is large (e.g., LinkedList), an iterator-based binary search is used, resulting in O(n) link traversals and O(log n) element comparisons.

 */