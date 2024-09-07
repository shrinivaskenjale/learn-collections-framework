package java_06_algorithms;

import java.util.*;

public class Fill {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(numbers);

        // fill(list, new element): Replaces all of the elements of the specified list
        // with the specified element.
        Collections.fill(numbers, 10);

        System.out.println(numbers);
    }
}

/*
 * This method runs in linear time.
 * 
 */
