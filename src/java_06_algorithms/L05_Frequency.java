package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class L05_Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        // frequency(collection, element): Returns the number of elements in the
        // specified collection equal to the specified object.
        int count = Collections.frequency(numbers, 2);
        System.out.println("Count of 2: " + count);
    }
}

/*
This method works with Collection implementations i.e., List, Set and Queue.
 */