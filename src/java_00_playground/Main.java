package java_00_playground;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 2));

        set.add(null);
        System.out.println(set);
    }
}
