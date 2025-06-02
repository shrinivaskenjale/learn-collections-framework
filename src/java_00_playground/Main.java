package java_00_playground;

import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(14);
        set.add(43);

        System.out.println(Collections.min(set));
    }
}
