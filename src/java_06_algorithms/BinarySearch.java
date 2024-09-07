package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        // =========================================
        // BINARY SEARCH
        // =========================================
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
 * =====================================
 * Collections.binarySearch(list, key)
 * =====================================
 * 
 * Searches the specified list for the specified object using the binary search
 * algorithm.
 * 
 * The list must be sorted into ascending order according to the natural
 * ordering of its elements (as by the sort(List) method) prior to making this
 * call. If it is not sorted, the results are undefined.
 * 
 * If the list contains multiple elements equal to the specified object, there
 * is no guarantee which one will be found.
 * 
 * This method runs in log(n) time for a "random access" list (which provides
 * near-constant-time positional access). If the specified list does not
 * implement the RandomAccess interface and is large, this method will do an
 * iterator-based binary search that performs O(n) link traversals and O(log n)
 * element comparisons.
 * 
 * 
 * 
 */