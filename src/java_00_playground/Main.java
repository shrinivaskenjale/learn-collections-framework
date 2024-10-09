package java_00_playground;

import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.entrySet());
    }
}
