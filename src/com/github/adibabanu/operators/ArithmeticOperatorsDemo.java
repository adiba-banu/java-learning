package com.github.adibabanu.operators;

/**
 * Demonstrates the use of arithmetic operators in Java.
 * Includes examples for addition, subtraction, multiplication,
 * division, and modulus operator.
 */

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {

        // Arithmetic Operators + - * / %
        System.out.println("--------Arithmetic Operators in Java--------");

        // 1. using + operator
        int penCost = 25;
        float bookCost = 35.69f;
        float totalCost=penCost + bookCost;
        System.out.println("Total Stationary Cost is Rs." + totalCost);

        // 2. using - operator
        double salary = 28000.8788;
        float expenses = 500.78f;
        double inHandSalary = salary - expenses;
        System.out.println("In Hand Salary = Rs. " + inHandSalary);

        // 3. using * operator
        double yearlySalary=inHandSalary * 12;
        System.out.println("Yearly Salary = Rs. " + yearlySalary);

        // 4. using / operator
        double salaryPerTwo = inHandSalary / 2;
        System.out.println("Salary shared between 2 persons on monthly basis: " + salaryPerTwo);

        // 5. using % operator
        int num1 = 13;
        int num2 = 2;
        int rem=num1 % num2;
        System.out.println("Remainder = " + rem);

        System.out.println("--------------------------------------------");
    }
}
