package com.arrays.javapractice;

public class StringConcept {

    public static void main(String[] args) {

        /*
         * What is String?
         * - String is a class in Java that represents a sequence of characters.
         * - Strings are immutable (once created, they cannot be modified).
         * - Strings can be created in two ways:
         *   1) Using String literal
         *   2) Using new keyword
         */

        String firstName = "Rajesh";
        String duplicateName = "Rajesh";
        // Java does NOT create a new String object here.
        // Both variables refer to the SAME object in the String Constant Pool.

        String anotherName = "Asha";
        // A new String object is created in the String Constant Pool
        // because this value did not exist earlier.

        String newStringObject = new String("Rajesh");
        // A NEW String object is created in heap memory.
        // Using 'new' forces creation of a separate object
        // even if the same value exists in the String Constant Pool.

        String companyName = "Achala IT Solutions";
        // String literal stored in the String Constant Pool.

        String[] wordsBySpace = companyName.split(" ");
        // Splits the string based on spaces and stores each word in an array.

        System.out.println(wordsBySpace[0]); // Achala
        System.out.println(wordsBySpace[1]); // IT
        System.out.println(wordsBySpace[2]); // Solutions

        String[] wordsByIT = companyName.split("IT");
        // Splits the string wherever "IT" occurs.

        System.out.println(wordsByIT[0].trim()); // Achala
        System.out.println(wordsByIT[1].trim()); // Solutions

        printCharactersForward(companyName);	
        printCharactersReverse(companyName);

        demonstrateStringBuilderOperations(companyName);
    }

    /**
     * Prints characters of a string in forward order
     */
    static void printCharactersForward(String input) {
        for (int index = 0; index < input.length(); index++) {
            System.out.println(input.charAt(index));
        }
    }

    /**
     * Prints characters of a string in reverse order
     */
    static void printCharactersReverse(String input) {
        for (int index = input.length() - 1; index >= 0; index--) {
            System.out.println(input.charAt(index));
        }
    }

    /**
     * Demonstrates StringBuilder operations and common string problems
     */
    static void demonstrateStringBuilderOperations(String companyName) {

        // Reverse the complete string without using loops
        String reversedCompanyName =
                new StringBuilder(companyName).reverse().toString();
        System.out.println(reversedCompanyName);

        // Split the string into words
        String[] words = companyName.split(" ");

        // Count number of words
        System.out.println("Word count: " + words.length);

        // Count characters including spaces
        System.out.println(
                "Character count including spaces: " + companyName.length());

        // Count characters excluding spaces
        int characterCountWithoutSpaces =
				companyName.replace(" ", "").length();
        System.out.println(
                "Character count excluding spaces: " + characterCountWithoutSpaces);

        // Reverse each word individually
        for (String word : words) {
            String reversedWord =
                    new StringBuilder(word).reverse().toString();
            System.out.println(reversedWord);
        }
    }
}
