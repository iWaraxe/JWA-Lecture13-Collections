// File: com/coherentsolutions/java/webauto/section01/advanced/Ex12ArrayListSynchronization.java
package com.coherentsolutions.java.webauto.section01.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates how to synchronize an ArrayList.
 */
public class Ex12ArrayListSynchronization {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(java.util.Arrays.asList("Element1", "Element2", "Element3"));

        // Synchronizing the ArrayList
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Iterating over the synchronized list
        synchronized (synchronizedList) {
            for (String element : synchronizedList) {
                System.out.println(element);
            }
        }
    }
}
