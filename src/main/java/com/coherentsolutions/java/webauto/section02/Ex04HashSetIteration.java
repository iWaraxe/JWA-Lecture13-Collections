// File: com/coherentsolutions/java/webauto/section02/Ex04HashSetIteration.java
package com.coherentsolutions.java.webauto.section02;

import java.util.HashSet;
import java.util.Iterator;

/**
 * This class demonstrates different ways to iterate over a HashSet.
 */
public class Ex04HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : set) {
            System.out.println(element);
        }

        // Using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
