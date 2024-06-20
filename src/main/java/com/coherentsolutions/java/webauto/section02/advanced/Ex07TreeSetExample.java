// File: com/coherentsolutions/java/webauto/section02/advanced/Ex07TreeSetExample.java
package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.TreeSet;

/**
 * This class demonstrates the TreeSet which maintains natural ordering.
 */
public class Ex07TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");

        // Iterating through TreeSet
        System.out.println("Elements in TreeSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
