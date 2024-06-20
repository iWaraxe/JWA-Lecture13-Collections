// File: com/coherentsolutions/java/webauto/section02/Ex02HashSetAddAndRemove.java
package com.coherentsolutions.java.webauto.section02;

import java.util.HashSet;

/**
 * This class demonstrates adding and removing elements in a HashSet.
 */
public class Ex02HashSetAddAndRemove {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        System.out.println("After adding elements: " + set);

        // Removing an element from the HashSet
        set.remove("Element2");
        System.out.println("After removing 'Element2': " + set);

        // Attempting to add a duplicate element
        boolean added = set.add("Element1");
        System.out.println("Attempting to add 'Element1' again: " + added);
        System.out.println("HashSet after attempting to add duplicate: " + set);
    }
}
