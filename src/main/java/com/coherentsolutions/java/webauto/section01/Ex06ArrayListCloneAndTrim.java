// File: com/coherentsolutions/java/webauto/section01/Ex06ArrayListCloneAndTrim.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;

/**
 * This class demonstrates the clone and trimToSize methods of an ArrayList.
 */
public class Ex06ArrayListCloneAndTrim {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Cloning the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned ArrayList: " + clonedList);

        // Trimming the capacity of the ArrayList to the current size
        list.trimToSize();
        System.out.println("ArrayList after trimToSize: " + list);
    }
}
