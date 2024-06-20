// File: com/coherentsolutions/java/webauto/section01/Ex04ArrayListOtherMethods.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class demonstrates other useful methods of an ArrayList.
 */
public class Ex04ArrayListOtherMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Element1", "Element2", "Element3"));

        // Checking if the list contains a specific element
        boolean contains = list.contains("Element2");
        System.out.println("List contains 'Element2': " + contains);

        // Getting the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Getting an element at a specific index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Getting the index of a specific element
        int index = list.indexOf("Element3");
        System.out.println("Index of 'Element3': " + index);

        // Converting the list to an array
        Object[] array = list.toArray();
        System.out.println("ArrayList converted to array: " + Arrays.toString(array));

        // Converting the list to a typed array
        String[] typedArray = list.toArray(new String[0]);
        System.out.println("ArrayList converted to typed array: " + Arrays.toString(typedArray));
    }
}
