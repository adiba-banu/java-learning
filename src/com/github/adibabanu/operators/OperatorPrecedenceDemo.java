package com.github.adibabanu.operators;

/**
 * Demonstrates operator precedence in Java.
 * Shows how expressions are evaluated based on priority
 * of arithmetic operators.
 */

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {

        System.out.println("-----------Operator Precedence-------------");

        // Java follows operator precedence rules
        int a = 5, b = 3, c = 2;
        int result1 = a + b * c;
        /* '*' has higher precedence than '+'
         => 3 * 2 = 6 => 5 + 6 = 11
         */
        System.out.println("result 1 = " + result1);

        int result2 = 10 / 5 + 4;
        /* '/' has higher precedence than '+'
            => 10 / 5 = 2 => 2 + 4 = 6
        */
        System.out.println("result 2 = " + result2);

        int result3 = 10 / 4 * 2;
         /* '/' and '*' have same precedence
           so evaluated left to right:
           => (10 / 4) = 2 => 2 * 2 = 4
        */
        System.out.println("result 3 = " + result3);

        int result4 = 10 / 2 + 3 * 4 - 1;
        /* 1) 10 / 2 = 5
           2) 3 * 4 = 12
           3) 5 + 12 - 1 = 16
         */
        System.out.println("result 4 = " + result4);
    }
}
