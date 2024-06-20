// File: com/coherentsolutions/java/webauto/section01/Ex08ArrayListIteration.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class demonstrates different ways to iterate over an ArrayList.
 */
public class Ex08ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        // Using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using a for loop with index
        System.out.println("Iterating using for loop with index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
