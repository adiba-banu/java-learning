package com.datatypes;

/**
 * Demonstrates all primitive data types in Java with examples,
 *      ranges, Unicode characters, and type conversions.
 */

public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {

    System.out.println("-------Primitive Data Types in Java-------");

    // 1. Whole numbers
    System.out.println("1. Whole numbers- byte,short,int,long");

    byte byteAge=80;
    short shortAge=90;
    int intAge=100;
    long longAge=2147483649l;

    System.out.println("age="+byteAge);
    System.out.println("age1="+shortAge);
    System.out.println("age2="+intAge);
    System.out.println("age3="+longAge);
    System.out.println("-------Range of Whole numbers-------");
    System.out.println("1. Whole or Integral Numbers");
    System.out.println("byte\t Min Value: "+ Byte.MIN_VALUE +" and Max value: "+Byte.MAX_VALUE);
    System.out.println("short\t Min Value: "+ Short.MIN_VALUE +" and Max value: "+Short.MAX_VALUE);
    System.out.println("int\t\t Min Value: "+ Integer.MIN_VALUE +" and Max value: "+Integer.MAX_VALUE);
    System.out.println("long\t Min Value: "+ Long.MIN_VALUE +" and Max value: "+Long.MAX_VALUE);
    System.out.println("-------------");


    // 2. Decimal numbers
    System.out.println("2. Decimal Numbers- float, double");
    float salary=54786.598788878877f;    // float precision ~7 digits
    double savings=8947.58858899988898;  // double precision ~15 digits
    System.out.println("Salary: "+salary);
    System.out.println("Savings: "+savings);

    System.out.println("---------");

    // Scientific Notation- If the value crosses the range limit
    salary=10555555555555555555555555500.111123221222f;
    savings=10555555555555555555555555500.111123221222;
    System.out.println("Salary: "+salary);
    System.out.println("Savings: "+savings);

    System.out.println("-------Range of Decimal Numbers-------");
    System.out.println("float\t Min Value: "+ Float.MIN_VALUE +" and Max value: "+Float.MAX_VALUE);
    System.out.println("Double\t Min Value: "+ Double.MIN_VALUE +" and Max value: "+Double.MAX_VALUE);
    System.out.println("-------------");


    // 3. Characters
    System.out.println("3. Characters - char");
    char myChar='Z';  //We can store a single character/number/symbol enclosed with an ''
    System.out.println("Value of Z:"+(int) myChar); // typecasting-char is converted into int and internally stored as numeric value in memory
    char heartSymbol= 10084;
    System.out.println("Character at 10084 position: "+heartSymbol);
    char hindiCharacter=2309;
    System.out.println("Hindi character at 2309 position: "+hindiCharacter);
    char forwardSymbol='\u27A4'; //unicode representation
    System.out.println("Forward Symbol: "+forwardSymbol);

    System.out.println("-------Range of Characters-------");
    System.out.println("char\t Min Value: "+ (int) Character.MIN_VALUE +" and Max value: "+ (int) Character.MAX_VALUE);
    System.out.println("--------------");

    // 4. Booleans
    System.out.println("4. Booleans - boolean (true/false)");
    boolean isActive=true;  //size of boolean is 1 bit
    System.out.println("Active status: "+isActive);


    // Type Conversions
    System.out.println("\n------- Type Conversions -------");

    // Widening Conversion (implicit)
    System.out.println("1. Widening (Implicit) Conversion");
    int num1=10;
    long num2=num1;
    System.out.println("int → long: " + num2);

    // Narrowing Conversion (explicit)
    System.out.println("\n2. Narrowing (Explicit) Conversion");
    double num3=156.255;
    System.out.println("Original value: " + num3);
    float num4= (float) num3;
    System.out.println("After narrowing (double → float) : " + num4);

    }
}
