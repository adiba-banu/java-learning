package com.github.adibabanu.conditionalstatements;

/**
 * Demonstrates different types of conditional statements in Java:
 * 1. Simple if
 * 2. if-else
 * 3. if-else-if ladder
 */

public class IfElseDemo {
    public static void main(String[] args) {


        // 1. if
        int years = 15;
        if(years >= 15) {
            System.out.println("You are a Citizen of Karnataka");
        }

        // 2. if-else
        int yearOfExperience = 3;
        boolean tier1 = true;

        if(tier1 || yearOfExperience >= 5)
        {
            System.out.println("Congratulations!!, You'll get a promotion of worth 1 Crore Rupees");
        }
        else {
            System.out.println("Try when you have 5 years of experience");
        }


        // 3. if-else ladder (multiple if-else blocks)
        int marks = 60;
        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
