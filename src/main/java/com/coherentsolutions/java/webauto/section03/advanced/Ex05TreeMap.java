package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Advanced example class demonstrating TreeMap which maintains a sorted order.
 */
public class Ex05TreeMap {

    public static void main(String[] args) {
        // Creating a TreeMap instance
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(3, "Third");
        treeMap.put(1, "First");
        treeMap.put(2, "Second");

        // Iterating over the TreeMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
