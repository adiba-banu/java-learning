package com.github.adibabanu.operators;

/**
 * Demonstrates the use of Java increment and decrement operators.
 * Includes examples of pre-increment (++a), post-increment (a++),
 * pre-decrement (--b), and post-decrement (b--), along with a combined
 * expression to illustrate operator precedence.
 */
public class IncrementAndDecrementOperatorsDemo {
    public static void main(String[] args) {

        // Increment Operators
        int a = 10;
        System.out.println("Pre Increment Operator: "+ ++a);
        /*
           ++a => Pre-increment
           Steps:
           1) a = 10
           2) ++a (value becomes 11)
           3) Print 11
        */
        System.out.println("Post Increment Operator: "+ a++);
        /*
           a++ => Post-increment
           Steps:
           1) a = 11
           2) a++ (prints 11 first, then increments to 12)
           3) After this line, a = 12
        */

        // Decrement Operators
        int b = 20;
        System.out.println("Pre Decrement Operator: "+ --b);
         /*
           --b => Pre-decrement
           Steps:
           1) b = 20
           2) --b (value becomes 19)
           3) Print 19
        */

        System.out.println("Post Decrement Operator: "+ b--);
         /*
           b-- => Post-decrement
           Steps:
           1) b = 19
           2) b-- (prints 19 first, then decrements to 18)
           3) After this line, b = 18
        */


        // Combination of pre-increment and post-increment operators
        int x = 40;
        System.out.println(x++ + --x);
         /*
           Steps:
           1) x = 40
           2) x++ (post-increment) → returns 40, then x becomes 41
           3) --x (pre-decrement) → x becomes 40, then returns 40
           4) Expression: 40 + 40 = 80

           NOTE: ++ and -- have higher priority than +, -, *, /, %
        */
    }
}
