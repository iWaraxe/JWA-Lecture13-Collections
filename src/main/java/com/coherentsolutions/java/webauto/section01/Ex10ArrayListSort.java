// File: com/coherentsolutions/java/webauto/section01/Ex10ArrayListSort.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class demonstrates sorting an ArrayList.
 */
public class Ex10ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Banana", "apple", "Cherry", "Date"));

        // Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);
    }
}
