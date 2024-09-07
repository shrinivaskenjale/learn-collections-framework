package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(0);
        newNumbers.add(0);

        // copy(dest list, src list): Copies all of the elements from one list into
        // another.
        Collections.copy(newNumbers, numbers);

        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }
}

/*
 * Copies all of the elements from one list into another. After the operation,
 * the index of each copied element in the destination list will be identical to
 * its index in the source list. The destination list's size must be greater
 * than or equal to the source list's size. If it is greater, the remaining
 * elements in the destination list are unaffected.
 * 
 * This method runs in linear time.
 */