package java_06_algorithms;

import java.util.*;

public class L06_Fill {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(numbers);

        // fill(list, new element): Replaces all the elements of the specified list
        // with the specified element.
        Collections.fill(numbers, 10);

        System.out.println(numbers);
    }
}

/*

Collections.fill() can be used only on mutable List implementations.

 */
