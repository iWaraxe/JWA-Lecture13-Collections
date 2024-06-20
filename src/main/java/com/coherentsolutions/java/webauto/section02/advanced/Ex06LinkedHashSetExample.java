// File: com/coherentsolutions/java/webauto/section02/advanced/Ex06LinkedHashSetExample.java
package com.coherentsolutions.java.webauto.section02.advanced;

import java.util.LinkedHashSet;

/**
 * This class demonstrates the LinkedHashSet which maintains insertion order.
 */
public class Ex06LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Element1");
        set.add("Element3");
        set.add("Element2");

        // Iterating through LinkedHashSet
        System.out.println("Elements in LinkedHashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
