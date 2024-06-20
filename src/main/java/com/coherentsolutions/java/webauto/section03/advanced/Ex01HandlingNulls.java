package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.HashMap;
import java.util.Map;

/**
 * Advanced example class demonstrating handling of null values and keys in HashMap.
 */
public class Ex01HandlingNulls {

    public static void main(String[] args) {
        // Creating a HashMap instance
        Map<String, String> map = new HashMap<>();

        // Adding null key and null value
        map.put(null, "NullKey");
        map.put("NullValueKey", null);

        // Retrieving elements
        String nullKeyVal = map.get(null);
        String nullValue = map.get("NullValueKey");

        System.out.println("Value for null key: " + nullKeyVal);
        System.out.println("Value for 'NullValueKey': " + nullValue);
    }
}
