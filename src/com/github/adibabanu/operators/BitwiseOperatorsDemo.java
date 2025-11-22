package com.github.adibabanu.operators;

/**
 * Demonstrates Java bitwise operators using binary examples.
 * Covers AND, OR, XOR, NOT, left shift, right shift, and unsigned right shift.
 */

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {

        System.out.println("Bit-wise Operators - &, |, ^, ~, <<, >>, >>>");
        System.out.println("-----------------------------------");

        // 1. AND operator (&)
        int a = 2 & 6;
        System.out.println("2 in binary representation: " + Integer.toBinaryString(2));
        System.out.println("6 in binary representation: " + Integer.toBinaryString(6));
        System.out.println("AND Operator result = " + a);
        System.out.println("-------------------");

        // 2. OR operator (|)
        int b = 9 | 7;
        System.out.println("9 in binary representation: " + Integer.toBinaryString(9));
        System.out.println("7 in binary representation: " + Integer.toBinaryString(7));
        System.out.println("OR Operator result = " + b);
        System.out.println("-------------------");

        // 3. XOR operator (^)
        int c = 8 ^ 3;
        System.out.println("8 in binary representation: " + Integer.toBinaryString(8));
        System.out.println("3 in binary representation: " + Integer.toBinaryString(3));
        System.out.println("XOR Operator result = " + c);
        System.out.println("-------------------");

        // 4. NOT operator (~)
        int d = 6;
        System.out.println("6 in binary representation: " + Integer.toBinaryString(d));
        int e = ~d;
        System.out.println("~6 in binary representation: " + Integer.toBinaryString(e));
        System.out.println("NOT Operator result = " + e);
        System.out.println("-------------------");

        // 5. Left Shift operator (<<)
        int f = 8;
        System.out.println("8 in binary representation: " + Integer.toBinaryString(f));
        int g = f << 1;    // means we need to left shift the bits of 8 by 1 time
        System.out.println("8 << 1 in binary representation: " + Integer.toBinaryString(g));
        System.out.println("Left Shift Operator result = " + g);
        System.out.println("-------------------");

        // 6. Right Shift operator (>>)
        int h = 6;
        System.out.println("6 in binary representation: " + Integer.toBinaryString(h));
        int i = h >> 2;    // means we need to right shift the bits of 6 by 2 times
        System.out.println("6 >> 2 in binary representation: " + Integer.toBinaryString(i));
        System.out.println("Right Shift Operator result = " + i);
        System.out.println("-------------------");

        // 7. Unsigned Right Shift operator (>>>)
        int j = -7;
        System.out.println("-7 in binary representation: " + Integer.toBinaryString(j));
        int k = j >>> 1;    // right shift the bits of -7 by 1 time
        System.out.println("-7 >>> 1 in binary representation: " + Integer.toBinaryString(k));
        System.out.println("Unsigned Right Shift Operator result = " + k);
        System.out.println("-------------------");

        // Compare >> and >>>
        int l = -7;
        System.out.println("-7 in binary representation: " + Integer.toBinaryString(l));
        int m = l >> 1;    // right shift the bits of -7 by 1 time
        System.out.println("-7 >> 1 in binary representation: " + Integer.toBinaryString(m));
        System.out.println(" Right Shift Operator result = " + m);

       /* NOTE:
        1) Right Shift (>>) fills blank bits with sign bit (0 for +ve, 1 for -ve).
        2) Unsigned Right Shift (>>>) always fills blank bits with 0.
         */
    }
}
