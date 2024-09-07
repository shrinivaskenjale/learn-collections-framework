package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        // Collections.min(collection): Returns minimum element of the collection
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);

        // Collections.max(collection): Returns maximum element of the collection
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}

/*
 * Elements of the collection should implement Comparable interface.
 * 
 * Built-in types in java implement Comparable interface.
 */
