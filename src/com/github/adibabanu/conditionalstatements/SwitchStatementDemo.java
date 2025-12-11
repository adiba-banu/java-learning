package com.github.adibabanu.conditionalstatements;

/**
 * Demonstrates the use of switch statement in Java
 * to print the day of the week based on a number.
 */

public class SwitchStatementDemo {
    public static void main(String[] args) {

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day!!");
        }

    }
}
