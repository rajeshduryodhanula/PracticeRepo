package com.string.practice;

import java.util.Arrays;
import java.util.List;

public class StringPractice {

	public static void main(String[] args) {

		System.out.println("========= JAVA STRING COMPLETE PRACTICE =========");

		substringExample();
		charAtExample();
		containsExample();
		splitExample();

		equalsAndEqualsIgnoreCaseExample();
		compareToExample();
		stringPoolVsHeapExample();
		stringImmutabilityExample();

		startsWithEndsWithExample();
		indexOfExample();
		nullEmptyBlankExample();

		reverseUsingLoopExample();
		reverseUsingStringBuilderExample();
		replaceExamples();

		duplicateCharactersExample();
		palindromeExample();

		stringJoinExample();
		valueOfExample();
		matchesRegexExample();
		internExample();

		stringBuilderVsStringBufferExample();

		System.out.println("========= END OF STRING PRACTICE =========");
	}

	/*
	 * INTERVIEW QUESTION: What is substring()?
	 *
	 * EXPLANATION: substring() extracts part of a string. beginIndex → inclusive
	 * endIndex → exclusive
	 *
	 * WHY IMPORTANT: Used while parsing UI text, logs, API responses.
	 */
	static void substringExample() {
		String input = "Selenium";
		System.out.println("\n--- substring() Example ---");
		System.out.println("Original String: " + input);
		System.out.println("Substring from index 2 to 6: " + input.substring(2, 6));
	}

	/*
	 * INTERVIEW QUESTION: What does charAt() do?
	 *
	 * EXPLANATION: Returns character at given index.
	 *
	 * REAL-TIME USE: Password / validation checks.
	 */
	static void charAtExample() {
		String input = "Selenium";
		System.out.println("\n--- charAt() Example ---");
		System.out.println("Character at index 5: " + input.charAt(5));
	}

	/*
	 * INTERVIEW QUESTION: What does contains() return?
	 *
	 * EXPLANATION: Returns true if substring exists, otherwise false.
	 *
	 * AUTOMATION: Validate error / success messages.
	 */
	static void containsExample() {
		String input = "Java Selenium Automation";
		System.out.println("\n--- contains() Example ---");
		System.out.println("Does string contain 'Selenium'? " + input.contains("Selenium"));
	}

	/*
	 * INTERVIEW QUESTION: How does split() work?
	 *
	 * EXPLANATION: Splits string based on delimiter and returns String array.
	 */
	static void splitExample() {
		String text = "Selenium Java Automation";
		System.out.println("\n--- split() Example ---");
		System.out.println("Original String: " + text);

		String[] words = text.split(" ");
		for (String word : words) {
			System.out.println("Split word: " + word);
		}
	}

	/*
	 * INTERVIEW QUESTION: equals() vs equalsIgnoreCase()?
	 *
	 * EXPLANATION: equals() → case sensitive equalsIgnoreCase() → ignores case
	 */
	static void equalsAndEqualsIgnoreCaseExample() {
		String a = "Java";
		String b = "JAVA";

		System.out.println("\n--- equals() vs equalsIgnoreCase() ---");
		System.out.println("equals(): " + a.equals(b));
		System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
	}

	/*
	 * INTERVIEW QUESTION: What is compareTo()?
	 *
	 * EXPLANATION: Compares strings lexicographically. 0 → equal negative → first
	 * is smaller positive → first is larger
	 */
	static void compareToExample() {
		String s1 = "apple";
		String s2 = "banana";

		System.out.println("\n--- compareTo() Example ---");
		int result = s1.compareTo(s2);
		System.out.println("Comparing '" + s1 + "' with '" + s2 + "': " + result);
	}

	/*
	 * INTERVIEW QUESTION: What is String Pool?
	 *
	 * EXPLANATION: Special memory area inside heap where string literals are
	 * stored. '==' compares reference. equals() compares content.
	 */
	static void stringPoolVsHeapExample() {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");

		System.out.println("\n--- String Pool vs Heap ---");
		System.out.println("s1 == s2 (same pool): " + (s1 == s2));
		System.out.println("s1 == s3 (different memory): " + (s1 == s3));
		System.out.println("s1.equals(s3): " + s1.equals(s3));
	}

	/*
	 * INTERVIEW QUESTION: What is String immutability?
	 *
	 * EXPLANATION: String cannot be modified once created. concat() creates a new
	 * object.
	 */
	static void stringImmutabilityExample() {
		String s = "Java";

		System.out.println("\n--- String Immutability ---");
		s.concat(" Selenium");
		System.out.println("After concat without reassignment: " + s);

		s = s.concat(" Selenium");
		System.out.println("After concat with reassignment: " + s);
	}

	/*
	 * INTERVIEW QUESTION: startsWith() and endsWith()?
	 *
	 * EXPLANATION: Used for prefix/suffix validation.
	 */
	static void startsWithEndsWithExample() {
		String url = "https://google.com";

		System.out.println("\n--- startsWith() & endsWith() ---");
		System.out.println("Starts with https: " + url.startsWith("https"));
		System.out.println("Ends with .com: " + url.endsWith(".com"));
	}

	/*
	 * INTERVIEW QUESTION: indexOf() usage?
	 *
	 * EXPLANATION: Returns index or -1 if not found.
	 */
	static void indexOfExample() {
		String text = "Selenium Automation";

		System.out.println("\n--- indexOf() Example ---");
		System.out.println("First index of 'e': " + text.indexOf("e"));
		System.out.println("Last index of 'e': " + text.lastIndexOf("e"));
	}

	/*
	 * INTERVIEW QUESTION: Difference between null, empty, blank?
	 */
	static void nullEmptyBlankExample() {
		String empty = "";
		String blank = " ";

		System.out.println("\n--- null vs empty vs blank ---");
		System.out.println("empty.isEmpty(): " + empty.isEmpty());
		System.out.println("blank.isBlank(): " + blank.isBlank());
	}

	/*
	 * INTERVIEW QUESTION: Reverse string using logic?
	 */
	static void reverseUsingLoopExample() {
		String input = "Selenium";
		String reverse = "";

		System.out.println("\n--- Reverse using for loop ---");
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reverse);
	}

	/*
	 * INTERVIEW QUESTION: Best way to reverse a String?
	 */
	static void reverseUsingStringBuilderExample() {
		String input = "Automation";

		System.out.println("\n--- Reverse using StringBuilder ---");
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + new StringBuilder(input).reverse());
	}

	/*
	 * INTERVIEW QUESTION: replace vs replaceAll vs replaceFirst?
	 */
	static void replaceExamples() {
		System.out.println("\n--- replace() Methods ---");
		System.out.println("replace(): " + "Java123".replace("1", "X"));
		System.out.println("replaceAll(): " + "Java123".replaceAll("\\d", ""));
		System.out.println("replaceFirst(): " + "Java123".replaceFirst("\\d", ""));
	}

	/*
	 * INTERVIEW QUESTION: How to find duplicate characters?
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
	}

	/*
	 * INTERVIEW QUESTION: What is a palindrome?
	 */
	static void palindromeExample() {
		String word = "madam";
		String reversed = new StringBuilder(word).reverse().toString();

		System.out.println("\n--- Palindrome Example ---");
		System.out.println("Original: " + word);
		System.out.println("Reversed: " + reversed);
		System.out.println("Is Palindrome? " + word.equals(reversed));
	}

	/*
	 * INTERVIEW QUESTION: What is String.join()?
	 */
	static void stringJoinExample() {
		System.out.println("\n--- String.join() Example ---");

		String date = String.join("-", "2025", "12", "01");
		System.out.println("Joined date: " + date);

		List<String> list = Arrays.asList("Java", "Selenium", "TestNG");
		System.out.println("Joined list: " + String.join(" | ", list));
	}

	/*
	 * INTERVIEW QUESTION: What is String.valueOf()?
	 */
	static void valueOfExample() {
		int hrs = 10;
		System.out.println("\n--- String.valueOf() Example ---");
		System.out.println("Converted int to String: " + String.valueOf(hrs));
	}

	/*
	 * INTERVIEW QUESTION: What does matches() do?
	 */
	static void matchesRegexExample() {
		String email = "test@gmail.com";

		System.out.println("\n--- matches() Regex Example ---");
		System.out.println("Valid email? " + email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.com"));
	}

	/*
	 * INTERVIEW QUESTION: What is intern()?
	 */
	static void internExample() {
		String s1 = new String("Java").intern();
		String s2 = "Java";

		System.out.println("\n--- intern() Example ---");
		System.out.println("s1 == s2 after intern(): " + (s1 == s2));
	}

	/*
	 * INTERVIEW QUESTION: StringBuilder vs StringBuffer?
	 */
	static void stringBuilderVsStringBufferExample() {
		System.out.println("\n--- StringBuilder vs StringBuffer ---");

		StringBuilder sb = new StringBuilder("Fast");
		sb.append(" Execution");
		System.out.println("StringBuilder result: " + sb);

		StringBuffer sbf = new StringBuffer("Thread");
		sbf.append(" Safe");
		System.out.println("StringBuffer result: " + sbf);
	}
}
