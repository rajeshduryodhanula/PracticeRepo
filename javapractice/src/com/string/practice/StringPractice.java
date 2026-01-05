package com.string.practice;

public class StringPractice {

    public static void main(String[] args) {

        // BASIC STRING METHODS
        substringExample();
        charAtExample();
        containsExample();
        splitExample();

        // STRING COMPARISON & MEMORY
        equalsIgnoreCaseExample();
        stringPoolVsHeap();
        stringImmutabilityExample();

        // STRING MANIPULATION
        reverseUsingLoop();
        reverseUsingStringBuilder();
        indexOfExample();
        replaceExamples();

        // STRING PROGRAMS (INTERVIEW FAVORITES)
        duplicateCharactersExample();
        palindromeExample();

        // REAL-TIME / PROJECT SCENARIOS
        nullEmptyBlankExample();
        stringBuilderExample();
    }

    /*
     * INTERVIEW QUESTION:
     * What is substring()?
     *
     * EXPLANATION:
     * substring() is used to extract a portion of a String.
     * It takes two parameters:
     *  - beginIndex (inclusive)
     *  - endIndex (exclusive)
     *
     * WHY INTERVIEWERS ASK:
     * To test your understanding of indexing and String immutability.
     */
    static void substringExample() {
        String input = "Selenium";
        System.out.println("\n--- substring() Example ---");
        System.out.println("Original String: " + input);
        System.out.println("Substring (2,6): " + input.substring(2, 6));
    }

    /*
     * INTERVIEW QUESTION:
     * What does charAt() do?
     *
     * EXPLANATION:
     * charAt() returns a single character present at the given index.
     * Indexing always starts from 0.
     *
     * REAL-TIME USE:
     * Used to validate characters like digits, symbols, or alphabets
     * in usernames and passwords.
     */
    static void charAtExample() {
        String input = "Selenium";
        System.out.println("\n--- charAt() Example ---");
        System.out.println("Character at index 5: " + input.charAt(5));
    }

    /*
     * INTERVIEW QUESTION:
     * What does contains() return?
     *
     * EXPLANATION:
     * contains() checks whether a given substring exists in a String.
     * It returns a boolean value (true/false).
     *
     * AUTOMATION USE:
     * Very commonly used to validate error messages or success messages in UI.
     */
    static void containsExample() {
        String input = "Java Selenium";
        System.out.println("\n--- contains() Example ---");
        System.out.println("Does string contain 'Java'? " + input.contains("Java"));
    }

    /*
     * INTERVIEW QUESTION:
     * How does split() work?
     *
     * EXPLANATION:
     * split() divides a String into multiple parts based on a delimiter.
     * It returns a String array.
     *
     * WHY IMPORTANT:
     * Used heavily in automation to parse UI text, CSV data, logs, etc.
     */
    static void splitExample() {
        String text = "Selenium Java Automation";
        System.out.println("\n--- split() Example ---");
        System.out.println("Original String: " + text);

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }

    /*
     * INTERVIEW QUESTION:
     * What is the difference between equals() and equalsIgnoreCase()?
     *
     * EXPLANATION:
     * equals() → compares content with case sensitivity
     * equalsIgnoreCase() → compares content ignoring case
     *
     * REAL PROJECT RULE:
     * Prefer equalsIgnoreCase() when UI text case may vary.
     */
    static void equalsIgnoreCaseExample() {
        String a = "Selenium Java";
        String b = "SELENIUM JAVA";

        System.out.println("\n--- equalsIgnoreCase() Example ---");
        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
    }

    /*
     * INTERVIEW QUESTION:
     * What is String Pool?
     *
     * EXPLANATION:
     * String Pool is a special memory area inside the heap where
     * String literals are stored.
     * It helps in memory optimization and faster comparison.
     *
     * IMPORTANT:
     * '==' compares memory reference, not content.
     */
    static void stringPoolVsHeap() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\n--- String Pool vs Heap ---");
        System.out.println("s1 == s2 (same pool reference): " + (s1 == s2));
        System.out.println("s1 == s3 (different memory): " + (s1 == s3));
        System.out.println("s1.equals(s3) (content): " + s1.equals(s3));
    }

    /*
     * INTERVIEW QUESTION:
     * What is String immutability?
     *
     * EXPLANATION:
     * Once a String object is created, it cannot be modified.
     * Any operation like concat() creates a new String object.
     *
     * WHY JAVA MADE STRING IMMUTABLE:
     * - Security
     * - Thread safety
     * - Memory optimization
     */
    static void stringImmutabilityExample() {
        String s = "Java";

        System.out.println("\n--- String Immutability ---");
        s.concat(" Selenium");
        System.out.println("Without reassignment: " + s);

        s = s.concat(" Selenium");
        System.out.println("With reassignment: " + s);
    }

    /*
     * INTERVIEW QUESTION:
     * How do you reverse a String using logic?
     *
     * EXPLANATION:
     * Use a for loop and charAt().
     * This method tests your understanding of loops and immutability.
     */
    static void reverseUsingLoop() {
        String input = "Selenium";
        String reversed = "";

        System.out.println("\n--- Reverse Using Loop ---");
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    /*
     * INTERVIEW QUESTION:
     * What is the best way to reverse a String?
     *
     * EXPLANATION:
     * Using StringBuilder.reverse() because it is faster
     * and does not create multiple objects.
     */
    static void reverseUsingStringBuilder() {
        String input = "Automation";

        System.out.println("\n--- Reverse Using StringBuilder ---");
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + new StringBuilder(input).reverse());
    }

    /*
     * INTERVIEW QUESTION:
     * What is indexOf() used for?
     *
     * EXPLANATION:
     * It returns the position of a character or substring.
     * If not found, it returns -1.
     */
    static void indexOfExample() {
        String text = "Selenium Automation";

        System.out.println("\n--- indexOf() Example ---");
        System.out.println("First index of 'e': " + text.indexOf("e"));
        System.out.println("Last index of 'e': " + text.lastIndexOf("e"));
    }

    /*
     * INTERVIEW QUESTION:
     * Difference between replace(), replaceAll(), replaceFirst()?
     *
     * EXPLANATION:
     * replace() → simple text replacement
     * replaceAll() → uses regex
     * replaceFirst() → replaces first match only
     */
    static void replaceExamples() {
        System.out.println("\n--- replace() Methods ---");
        System.out.println("replace(): " + "Java123".replace("1", "X"));
        System.out.println("replaceAll(): " + "Java123".replaceAll("\\d", ""));
        System.out.println("replaceFirst(): " + "Java123".replaceFirst("\\d", ""));
    }

    /*
     * INTERVIEW QUESTION:
     * How do you find duplicate characters in a String?
     *
     * EXPLANATION:
     * Convert string to char array and compare characters.
     */
    static void duplicateCharactersExample() {
        String text = "automation";
        char[] chars = text.toCharArray();

        System.out.println("\n--- Duplicate Characters ---");
        System.out.print("Duplicates: ");

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    /*
     * INTERVIEW QUESTION:
     * What is a palindrome?
     *
     * EXPLANATION:
     * A string is palindrome if it remains the same
     * when reversed.
     */
    static void palindromeExample() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("\n--- Palindrome Check ---");
        System.out.println("Is Palindrome? " + word.equals(reversed));
    }

    /*
     * INTERVIEW QUESTION:
     * Difference between null, empty and blank?
     *
     * EXPLANATION:
     * null  → no object
     * ""    → empty string
     * " "   → blank (contains whitespace)
     *
     * REAL PROJECT:
     * Always check null before calling methods.
     */
    static void nullEmptyBlankExample() {

        String empty = "";
        String blank = " ";

        System.out.println("\n--- null vs empty vs blank ---");
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("blank.isBlank(): " + blank.isBlank());
    }

    /*
     * INTERVIEW QUESTION:
     * Why StringBuilder is preferred over String?
     *
     * EXPLANATION:
     * StringBuilder is mutable and faster for multiple changes.
     * String is immutable and creates multiple objects.
     */
    static void stringBuilderExample() {
        StringBuilder sb = new StringBuilder("Selenium");

        System.out.println("\n--- StringBuilder Example ---");
        sb.append(" Java");
        System.out.println("After append: " + sb);
    }
}
