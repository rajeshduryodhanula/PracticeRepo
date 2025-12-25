package com.arrays.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    /*
     * Important Note:
     * Arrays.asList() returns a fixed-size list.
     * - You CANNOT add or remove elements.
     * - You CAN modify existing elements.
     * To make it fully modifiable, wrap it inside an ArrayList.
     */

    public static void main(String[] args) {

        // Example 1: List of browsers (Automation Testing use case)
        List<String> supportedBrowsers = new ArrayList<>();
        supportedBrowsers.add("Chrome");
        supportedBrowsers.add("Firefox");
        supportedBrowsers.add("Edge");

        for (String browser : supportedBrowsers) {
            System.out.println("Running tests on " + browser);
        }

        // Example 2: Family members list
        List<String> familyMembers = new ArrayList<>();

        familyMembers.add("Apparao Duryodhanula");
        familyMembers.add("Satyaveni Duryodhanula");
        familyMembers.add("Rajesh Duryodhanula");
        familyMembers.add("Mahesh Duryodhanula");

        // Size of ArrayList
        System.out.println("Family size: " + familyMembers.size());

        for (String member : familyMembers) {
            System.out.println("Family member: " + member);
        }

        // Access element by index
        System.out.println("Father name: " + familyMembers.get(0));

        // Adding new members
        familyMembers.add("Asha Jyothi");
        familyMembers.add("Temporary Entry");

        System.out.println("Updated family size: " + familyMembers.size());

        // Traditional for loop
        for (int index = 0; index < familyMembers.size(); index++) {
            System.out.println("Family member: " + familyMembers.get(index));
        }

        // Enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String member : familyMembers) {
            System.out.println("Family details: " + member);
        }

        // Remove element by index
        familyMembers.remove(5);

        // Add & remove element by value
        familyMembers.add("TestUser");
        System.out.println("Added element: " + familyMembers.get(5));

        familyMembers.remove("TestUser");

        // Check if element exists
        if (familyMembers.contains("Asha Jyothi")) {
            System.out.println("Name exists: " + familyMembers.get(4));
        }

        // Clear the list
        familyMembers.clear();
        System.out.println("Family list size after clear: " + familyMembers.size());
        System.out.println("ArrayList cleared successfully");

        // Convert Array → ArrayList
        String[] namesArray = { "Rajesh", "Asha" };

        /*
         * Arrays.asList():
         * - Returns a fixed-size list backed by the array.
         * - Add / Remove operations are NOT allowed.
         */
        List<String> fixedSizeList = Arrays.asList(namesArray);
        System.out.println("Fixed-size list: " + fixedSizeList);

        /*
         * Creating a resizable ArrayList using constructor:
         * - Fully modifiable
         * - Not linked to the original array
         */
        List<String> resizableList = new ArrayList<>(Arrays.asList(namesArray));
        resizableList.add("Mahesh");
        resizableList.add("Satyaveni");
        resizableList.add("Apparao");

        System.out.println("Contains 'Asha': " + resizableList.contains("Asha"));

        for (String name : resizableList) {
            System.out.println(name);
        }

        // Convert ArrayList → Array
        convertListToArray(resizableList);
    }

    /**
     * Converts an ArrayList to an Array and prints its elements
     */
    public static void convertListToArray(List<String> familyList) {

        String[] familyArray = familyList.toArray(new String[0]);

        for (String name : familyArray) {
            System.out.println(name);
        }
    }
}
