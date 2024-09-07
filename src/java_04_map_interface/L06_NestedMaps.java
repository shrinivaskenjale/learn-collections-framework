package java_04_map_interface;

import java.util.*;

public class L06_NestedMaps {
    public static void main(String[] args) {

        // ==========================
        // Nested map declaration
        // ==========================

        Map<String, Map<String, String>> employeeMap = new HashMap<>();

        // ==============
        // Add entry
        // ==============

        // 1. First create inner map
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("Permanent", "Florida");
        addressMap.put("Postal", "Canada");

        // 2. Insert inner map inside outer map
        employeeMap.put("Alex", addressMap);

        // Insert in existing inner map
        employeeMap.get("Alex").put("Hideout", "UAE");

        // ================
        // Remove entry
        // ================

        employeeMap.get("Alex").remove("Hideout");

        // ==========
        // Iterate
        // ==========

        // Iterate on outer map
        for (Map.Entry<String, Map<String, String>> empMap : employeeMap.entrySet()) {

            Map<String, String> addMap = empMap.getValue();

            // Iterate on inner map
            for (Map.Entry<String, String> addressSet : addMap.entrySet()) {
                System.out.println(addressSet.getKey() + " :: " + addressSet.getValue());
            }

        }

    }
}

/*
 * Example:
 * 
 * {
 * "Alex": {
 * "Hideout": "UAE",
 * "Permanent": "Florida",
 * "Postal": "Canada"
 * },
 * "Brian": {
 * "Hideout": "India",
 * "Permanent": "Alaska",
 * "Postal": "Canada"
 * }
 * }
 */