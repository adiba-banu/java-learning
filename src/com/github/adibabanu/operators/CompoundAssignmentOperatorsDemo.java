package com.github.adibabanu.operators;

/**
 * Demonstrates basic compound assignment operators in Java.
 * Shows how shorthand operators like +=, -=, *=, /=, and %= modify a variable.
 */
public class CompoundAssignmentOperatorsDemo {
    public static void main(String[] args) {

        int a = 6;
        a += 1;                                 // same as a = a + 1
        System.out.println("a += 1: " + a);

        a -= 2;                                 // same as a = a - 2
        System.out.println("a -= 2: " + a);

        a *= 3;                                 // same as a = a * 3
        System.out.println("a *= 3: " + a);

        a /= 2;                                 // same as a = a / 2
        System.out.println("a /= 2: " + a);

        a %= 2;                                 // same as a = a % 2
        System.out.println("a %= 2: " + a);
    }
}
