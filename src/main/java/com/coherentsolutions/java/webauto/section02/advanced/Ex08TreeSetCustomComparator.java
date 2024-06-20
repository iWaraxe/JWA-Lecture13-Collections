// File: com/coherentsolutions/java/webauto/section02/advanced/Ex08TreeSetCustomComparator.java
package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.TreeSet;
import java.util.Comparator;

/**
 * This class demonstrates the TreeSet with a custom comparator for reverse ordering.
 */
public class Ex08TreeSetCustomComparator {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        // Iterating through TreeSet with custom comparator
        System.out.println("Elements in TreeSet (reverse order):");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
