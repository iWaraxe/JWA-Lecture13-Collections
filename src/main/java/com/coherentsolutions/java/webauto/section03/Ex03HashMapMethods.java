package com.coherentsolutions.java.webauto.section03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

/**
 * Example class demonstrating various HashMap methods.
 */
public class Ex03HashMapMethods {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alpha");
        map.put(2, "Beta");
        map.put(3, "Gamma");

        // Checking if a key exists
        boolean hasKey = map.containsKey(1);
        System.out.println("Contains key 1: " + hasKey);

        // Checking if a value exists
        boolean hasValue = map.containsValue("Beta");
        System.out.println("Contains value 'Beta': " + hasValue);

        // Getting all keys
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // Getting all values
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        // Getting all entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entries: " + entries);

        // Removing an entry
        map.remove(2);
        System.out.println("Map after removing key 2: " + map);

        // Clearing the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
