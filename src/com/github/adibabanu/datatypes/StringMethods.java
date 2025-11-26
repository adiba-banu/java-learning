package com.github.adibabanu.datatypes;

/**
 * Demonstrates commonly used String methods in Java:
 * length, charAt, equals, compareTo, substring, case conversion,
 * trim, replace, contains, startsWith, endsWith, isEmpty, isBlank,
 * indexOf, lastIndexOf, valueOf, and format.
 */

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("-----------String methods in Java---------------");

        // 1. length()
        String language = "Java Programming";
        int length = language.length();
        System.out.println("Length: " + length);  // length of the string

        // 2. charAt(int index)
        char c = language.charAt(6);
        System.out.println("CharAt: " + c);    // character at specific index position

        // 3. equals()
        String name1 = "Diya";
        String name2 = "Riya";
        boolean equals = name1.equals(name2);    // NOTE: In strings '==' operator checks the references not equality
        System.out.println("Equals: " + equals);

        // 4. equalsIgnoreCase()
        String name3 = "Priya";
        String name4 = "PriYa";
        boolean b = name3.equalsIgnoreCase(name4); //Ignores the case and checks each character
        System.out.println("Equals Ignore case: " + b);

        // 5. compareTo()
        String str1 = "Key";
        String str2 = "House";
        int i1 = str1.compareTo(str2); // checks each character, if it finds different characters in both the strings, the difference of ascii values is taken and result is written positive if first character ascii is higher
        int i2 = str1.compareTo(str1); // if two strings are same then result is 0
        int i3= str2.compareTo(str1); // checks each character, if it finds different characters in both the strings, the difference of ascii values is taken and result is written negative if first character ascii is lower

        System.out.println("Compare To: " + i1);
        System.out.println("Compare To: " + i2);
        System.out.println("Compare To: " + i3);

        // 6. substring(int beginIndex) & substring(int beginIndex, int endIndex)
        String fullName = "Adiba Banu";
        String substring1 = fullName.substring(7);  // from index 7 to end
        System.out.println("Substring with begin index 7: " + substring1);

        String substring2 = fullName.substring(0, 5);  // from index 0 to 4
        System.out.println("Substring with begin index 0 and end index 5: " + substring2);

        // 7. toUpperCase() and toLowerCase()
        System.out.println("Upper Case: " + fullName.toUpperCase());
        System.out.println("Lower Case: " + fullName.toLowerCase());

        // 8. trim()
        String breakfast = "   Masala Dosa  ";
        String trim = breakfast.trim();
        System.out.println("Trim: " + trim);

        // 9. replace() (String is immutable)
        String fruit = "Mango";
        String replacedFruit = fruit.replace("Mango", "Orange");
        System.out.println("Original string: " + fruit);
        System.out.println("Replace: " + replacedFruit);

        // 10. contains()
        String name = "Monika";
        boolean nameCheck = name.contains("nik");
        System.out.println("Contains: " + nameCheck);

        // 11. startsWith() and endsWith()
        boolean namePrefix = name.startsWith("M");
        System.out.println("Starts with: " + namePrefix);
        boolean nameSuffix = name.endsWith("k");
        System.out.println("Ends with: " + nameSuffix);

        // 12. isEmpty() and isBlank()
        String string1 = "";
        System.out.println("Empty String: " + string1.isEmpty());

        String string2 = " ";
        System.out.println("Blank String: " + string2.isBlank());

        // 13. indexOf() and lastIndexOf()
        String state = "Karnataka";
        int aIndex = state.indexOf("a");
        System.out.println("Index of a: " + aIndex);

        int aLastIndex = state.lastIndexOf("a");

        System.out.println("Last Index of a: " + aLastIndex);

        // 14. valueOf()
        int a = 40;
        String intToStringConv = String.valueOf(a);
        System.out.println("Int to String Conversion: " + intToStringConv);

        // 15. format()
        String myName = "Adiba";
        System.out.println(String.format("My name is %s and I am %d years old", myName, 23));


    }
}
