package com.arrays.javapractice;

public class StringArrayConversionDemo {

    public static void main(String[] args) {

        convertStringToCharArray();
        convertCharArrayToString();
        validateStringUsingConditions();
    }

    /**
     * Converts a String into a character array
     * and demonstrates iteration
     */
    public static void convertStringToCharArray() {

        String name = "Rajesh";

        // Convert String to char array
        char[] characters = name.toCharArray();

        // Enhanced for loop
        for (char ch : characters) {
            System.out.println("Character: " + ch);
        }

        // Normal for loop
        for (int index = 0; index < characters.length; index++) {
            System.out.println(characters[index]);
        }
    }

    /**
     * Converts a character array into a String
     * using different approaches
     */
    public static void convertCharArrayToString() {

        char[] nameCharacters = { 'R', 'A', 'J', 'E', 'S', 'H' };

        // Using String constructor
        String name1 = new String(nameCharacters);
        System.out.println("Using constructor: " + name1);

        // Using String.valueOf
        String name2 = String.valueOf(nameCharacters);
        System.out.println("Using valueOf: " + name2);

        // Partial conversion
        String partialName = new String(nameCharacters, 0, 4);
        System.out.println("Partial name: " + partialName);

        // Using StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append(nameCharacters);
        System.out.println("Using StringBuilder: " + builder.toString());
    }

    /**
     * Validates a String using different character conditions
     * (Very important for interviews & automation)
     */
    public static void validateStringUsingConditions() {

        String input = "Test@123";

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        char[] inputCharacters = input.toCharArray();

        for (char ch : inputCharacters) {

            if (Character.isLetter(ch)) {
                hasLetter = true;
            }
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            else {
                hasSpecialCharacter = true;
            }
        }

        System.out.println("\nValidation Results for: " + input);
        System.out.println("Contains Letter: " + hasLetter);
        System.out.println("Contains Digit: " + hasDigit);
        System.out.println("Contains Special Character: " + hasSpecialCharacter);

        /*
         * Example Conditions:
         * - Only alphabets
         * - Alphanumeric
         * - Password validation
         */

        if (hasLetter && !hasDigit && !hasSpecialCharacter) {
            System.out.println("String contains ONLY letters");
        }

        if (hasLetter && hasDigit && !hasSpecialCharacter) {
            System.out.println("String is ALPHANUMERIC");
        }

        if (hasLetter && hasDigit && hasSpecialCharacter) {
            System.out.println("String is a STRONG password");
        }
    }
}
