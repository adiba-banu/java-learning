package com.github.adibabanu.operators;

/**
 * Demonstrates relational operators in Java:
 * <, >, <=, >=, ==, != applied on int, char, and String references.
 */

public class RelationalOperatorsDemo {
    public static void main(String[] args) {

        System.out.println("--Relational Operators in Java--");

        // 1. Relational operators with int
        int a = 5;
        int b = 6;

        System.out.println("a < b  = " + (a < b));
        System.out.println("a > b  = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("-------------");

        // 2. Relational operators with char
        char c = 'D';
        char d = 'K';

        System.out.println("c < d  = " + (c < d));
        System.out.println("c > d  = " + (c > d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c <= d = " + (c <= d));
        System.out.println("c == d = " + (c == d));
        System.out.println("c != d = " + (c != d));

        System.out.println("-------------");

        // 3. Relational comparison with String references
        // NOTE: '==' compares references, NOT string values.
        String s1 = "Cool";
        String s2 = "Cool";
        String s3 = new String("Cool");
        System.out.println("(s1 == s2) = " + (s1 == s2));  // true → both point to the same string from the String Constant Pool
        System.out.println("(s2 == s3) = " + (s2 == s3)); // false → s3 is a different object in heap

        System.out.println("-------------");

        // NOTE '==' here compares values in case of int
        int e = 10;
        int f = 12;
        System.out.println("e == f = " + (e == f));
        System.out.println("e != f = " + (e != f));
    }
}
