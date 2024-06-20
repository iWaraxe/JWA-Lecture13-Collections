// File: com/coherentsolutions/java/webauto/section01/Ex02ArrayListAddMethods.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class demonstrates different add methods of an ArrayList.
 */
public class Ex02ArrayListAddMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Element1");
        list.add("Element2");
        System.out.println("After adding elements: " + list);

        // Adding element at a specific index
        list.add(1, "InsertedElement");
        System.out.println("After inserting element at index 1: " + list);

        // Adding a collection of elements to the ArrayList
        Collection<String> collection = java.util.Arrays.asList("Element3", "Element4");
        list.addAll(collection);
        System.out.println("After adding collection of elements: " + list);

        // Adding a collection of elements at a specific index
        list.addAll(2, collection);
        System.out.println("After adding collection at index 2: " + list);
    }
}
