// File: com/coherentsolutions/java/webauto/section02/Ex03HashSetOtherMethods.java
package com.coherentsolutions.java.webauto.section02;

import java.util.HashSet;

/**
 * This class demonstrates other useful methods of a HashSet.
 */
public class Ex03HashSetOtherMethods {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Checking if the set contains a specific element
        boolean contains = set.contains("Element2");
        System.out.println("Set contains 'Element2': " + contains);

        // Getting the size of the set
        int size = set.size();
        System.out.println("Size of the set: " + size);

        // Clearing the set
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}
