// File: com/coherentsolutions/java/webauto/section01/Ex03ArrayListRemoveMethods.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;

/**
 * This class demonstrates different remove methods of an ArrayList.
 */
public class Ex03ArrayListRemoveMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Element1", "Element2", "Element3", "Element4"));

        // Removing an element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // Removing an element by value
        boolean isDeleted = list.remove("Element5");
        System.out.println("After removing element 'Element5': " + list + ", isDeleted: " + isDeleted);

        // Clearing the ArrayList
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
