// File: com/coherentsolutions/java/webauto/section01/Ex05ArrayListConversion.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class demonstrates converting an ArrayList to an array.
 */
public class Ex05ArrayListConversion {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Element1", "Element2", "Element3"));

        // Converting the list to an array
        Object[] array = list.toArray();
        System.out.println("ArrayList converted to array: " + Arrays.toString(array));

        // Converting the list to a typed array
        String[] typedArray = list.toArray(new String[0]);
        System.out.println("ArrayList converted to typed array: " + Arrays.toString(typedArray));
    }
}
