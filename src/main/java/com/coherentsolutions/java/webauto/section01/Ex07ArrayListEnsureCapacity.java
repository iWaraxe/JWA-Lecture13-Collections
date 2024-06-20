// File: com/coherentsolutions/java/webauto/section01/Ex07ArrayListEnsureCapacity.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;

/**
 * This class demonstrates the ensureCapacity method of an ArrayList.
 */
public class Ex07ArrayListEnsureCapacity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Ensuring the capacity of the ArrayList
        list.ensureCapacity(15);
        System.out.println("ArrayList capacity ensured to 15.");

        // Adding elements to the ArrayList
        list.add("Element1");
        list.add("Element2");
        System.out.println("ArrayList after adding elements: " + list);
    }
}
