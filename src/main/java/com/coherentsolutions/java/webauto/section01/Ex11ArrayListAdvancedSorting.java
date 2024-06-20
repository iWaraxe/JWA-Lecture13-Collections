// File: com/coherentsolutions/java/webauto/section01/advanced/Ex11ArrayListAdvancedSorting.java
package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Callable;

/**
 * This class demonstrates advanced sorting of an ArrayList using a custom comparator.
 */
public class Ex11ArrayListAdvancedSorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Banana", "apple", "Cherry", "Date"));

        // Sorting the ArrayList in reverse order using a custom comparator
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        System.out.println("Reverse sorted ArrayList: " + list);

        Collections.sort(list, Comparator.comparing(String::valueOf, String::compareToIgnoreCase).reversed());
        System.out.println("Reverse sorted ArrayList: " + list);
    }
}
