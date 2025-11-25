package com.github.adibabanu.datatypes;

/**
 * Demonstrates how Java Strings work: literals, new keyword,
 * String Constant Pool, and reference comparison.
 */

public class StringsDemo {
    public static void main(String[] args) {

        // Two ways of creating string
        String name = "Adiba";                       // 1. String literal (stored in String Constant Pool (SCP))
        String place = new String("London");  // 2. new String() creates a separate object in heap

        System.out.println("Name: " + name);
        System.out.println("Place: " + place);

        // Reference comparison
        System.out.println(name == place); // false - SCP vs Heap (different objects)


        String name1 = "Adiba";
        System.out.println(name == name1);   // true - same literal reused from SCP

    }
}
