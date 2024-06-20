// File: com/coherentsolutions/java/webauto/section02/Ex05HashSetClone.java
package com.coherentsolutions.java.webauto.section02;

import java.util.HashSet;

/**
 * This class demonstrates the clone method of a HashSet.
 */
public class Ex05HashSetClone {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Cloning the HashSet
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned HashSet: " + clonedSet);
    }
}
