package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Advanced example class demonstrating LinkedHashMap which maintains insertion order.
 */
public class Ex04LinkedHashMap {

    public static void main(String[] args) {
        // Creating a LinkedHashMap instance
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put(1, "First");
        linkedHashMap.put(2, "Second");
        linkedHashMap.put(3, "Third");

        // Iterating over the LinkedHashMap
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
