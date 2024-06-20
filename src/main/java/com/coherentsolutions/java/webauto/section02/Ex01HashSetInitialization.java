// File: com/coherentsolutions/java/webauto/section02/Ex01HashSetInitialization.java
package com.coherentsolutions.java.webauto.section02;

import java.util.HashSet;
import java.util.Collection;
import java.util.Arrays;
import java.util.Set;

/**
 * This class demonstrates the initialization of a HashSet using different constructors.
 */
public class Ex01HashSetInitialization {
    public static void main(String[] args) {
        // Creating an empty HashSet
        Set<String> set1 = new HashSet<>();
        System.out.println("Empty HashSet: " + set1);

        // Creating a HashSet with elements from another collection
        Collection<String> collection = Arrays.asList("Element1", "Element2", "Element3");
        HashSet<String> set2 = new HashSet<>(collection);
        System.out.println("HashSet from another collection: " + set2);

        // Creating a HashSet with initial capacity
        HashSet<String> set3 = new HashSet<>(10);
        System.out.println("HashSet with initial capacity 10: " + set3);

        // Creating a HashSet with initial capacity and fill ratio
        HashSet<String> set4 = new HashSet<>(10, 0.75f);
        System.out.println("HashSet with initial capacity 10 and fill ratio 0.75: " + set4);
    }
}
