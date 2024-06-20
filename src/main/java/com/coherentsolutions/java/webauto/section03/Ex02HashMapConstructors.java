package com.coherentsolutions.java.webauto.section03;

import java.util.HashMap;
import java.util.Map;

/**
 * Example class demonstrating HashMap constructors.
 */
public class Ex02HashMapConstructors {

    public static void main(String[] args) {
        // Default constructor
        Map<Integer, String> defaultMap = new HashMap<>();

        // Constructor with initial capacity
        Map<Integer, String> capacityMap = new HashMap<>(10);

        // Constructor with another map
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "Alice");
        anotherMap.put(2, "Bob");

        Map<Integer, String> initializedMap = new HashMap<>(anotherMap);

        System.out.println("Default Map: " + defaultMap);
        System.out.println("Capacity Map (initial size 10): " + capacityMap);
        System.out.println("Initialized Map: " + initializedMap);
    }
}
