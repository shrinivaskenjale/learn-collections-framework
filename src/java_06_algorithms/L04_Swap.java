package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L04_Swap {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);

        // swap(list, i, j): Swaps the elements at the specified positions in the
        // specified list.
        Collections.swap(numbers, 1, 3);

        System.out.println(numbers);
    }
}

/*

Collections.swap() works only with List implementations.

 */