package com.coherentsolutions.java.webauto.section03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

/**
 * Example class demonstrating basic usage of HashMap.
 */
public class Ex01BasicHashMapUsage {

    public static void main(String[] args) {
        // Creating a HashMap instance
        Map<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Doe");

        // Retrieving an element
        String name = map.get(2);
        System.out.println("Retrieved name: " + name);

        // Iterating over elements
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
