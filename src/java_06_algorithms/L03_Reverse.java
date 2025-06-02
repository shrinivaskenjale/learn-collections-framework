package java_06_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L03_Reverse {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // reverse(list): Reverses the original list
        Collections.reverse(numbers);

        System.out.println(numbers);
    }
}

/*

The Collections.reverse() method in Java can be used only on lists, i.e., instances of the List interface.

 */