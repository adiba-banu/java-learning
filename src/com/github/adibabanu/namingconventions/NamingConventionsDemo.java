package com.github.adibabanu.namingconventions;

/**
  * Demonstrates Java variable naming conventions.
 */
public class NamingConventionsDemo {
    public static void main(String[] args) {

        // 1. Variable names are case-sensitive
        int num = 10;       // here num and Num are two different variables
        int Num = 20;

        // 2. Variable names can contain letters, digits, underscore '_' and  dollar sign '$'
        int total = 4;
        String city1 = "Bangalore";
        String first_name = "Adiba";
        double my$ = 100000.00;

        // 3. It cannot start with a digit, but it can start with a letter, underscore or dollar sign
        // int 2count = 9;    // Invalid ❌

        // 4. We can't use Java keywords to name a variable
        String name = "Priya";    // Valid ✅
        //String int = 6;         // Invalid ❌  int is a reserved keyword in java

        // 5. Follow camel case for naming the variables to make it easy readable
        String fullName = "Adiba Banu";

        // 6. Make the variable names meaningful for professional use
        int productCount = 15;
    }
}
