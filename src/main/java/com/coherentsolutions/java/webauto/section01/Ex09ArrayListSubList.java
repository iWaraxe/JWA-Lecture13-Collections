// File: com/coherentsolutions/java/webauto/section01/Ex09ArrayListSubList.java
package com.coherentsolutions.java.webauto.section01;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates the subList method of an ArrayList.
 */
public class Ex09ArrayListSubList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList("Element1", "Element2", "Element3", "Element4", "Element5"));

        // Creating a sublist from the ArrayList
        List<String> subList = list.subList(1, 4);
        System.out.println("Sublist from index 1 to 3: " + subList);
    }
}
