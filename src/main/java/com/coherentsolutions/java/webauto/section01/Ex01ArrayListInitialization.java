// File: com/coherentsolutions/java/webauto/section01/Ex01ArrayListInitialization.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * This class demonstrates the initialization of an ArrayList using different constructors.
 */
public class Ex01ArrayListInitialization {
    public static void main(String[] args) {
        // Creating an empty ArrayList
        List<String> list1 = new ArrayList<>();
        System.out.println("Empty ArrayList: " + list1);

        // Creating an ArrayList with initial capacity
        List<String> list2 = new ArrayList<>(1000);
        System.out.println("ArrayList with initial capacity 1000: " + list2);

        // Creating an ArrayList from another collection
        Collection<String> collection = java.util.Arrays.asList("Element1", "Element2", "Element3");
        List<String> list3 = new ArrayList<>(collection);
        System.out.println("ArrayList from another collection: " + list3);
    }
}
