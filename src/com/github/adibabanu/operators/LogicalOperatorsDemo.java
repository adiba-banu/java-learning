package com.github.adibabanu.operators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        /*
         Logical Operators in Java:
         1. Logical AND (&&)
         2. Logical OR  (||)
         3. Logical NOT (!)
        */

        // 1. Logical AND (&&) – both conditions must be true
        String name = "Priya";
        int marks = 35;
        System.out.println("If marks >= 50 and name is Priya, qualified for the exam: " + ((marks >= 50) && (name.equals("Priya"))));

        // 2. Logical OR (||) – at least one condition must be true
        boolean tea = true;
        boolean coffee = false;
        System.out.println("Either Tea or Coffee is available: " + (tea || coffee));

        // 3. Logical NOT (!) – reverses the boolean value
        boolean lightOn = true;
        System.out.println("Light Off: " + !(lightOn));

    }
}
