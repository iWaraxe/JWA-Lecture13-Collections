package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.HashMap;
import java.util.Map;

/**
 * Advanced example class demonstrating how to synchronize a HashMap.
 */
public class Ex03SynchronizedHashMap {

    public static void main(String[] args) {
        // Creating a HashMap instance
        Map<Integer, String> map = new HashMap<>();

        // Synchronizing the map
        Map<Integer, String> synchronizedMap = java.util.Collections.synchronizedMap(map);

        // Adding elements to the synchronized map
        synchronizedMap.put(1, "A");
        synchronizedMap.put(2, "B");

        // Accessing the synchronized map
        synchronized (synchronizedMap) {
            for (Map.Entry<Integer, String> entry : synchronizedMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
