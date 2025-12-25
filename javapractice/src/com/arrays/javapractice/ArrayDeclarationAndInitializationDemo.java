package com.arrays.javapractice;

public class ArrayDeclarationAndInitializationDemo {

    // Entry point of the program
    public static void main(String[] args) {

        /*
         * =========================================
         * Integer Array – Declaration & Initialization
         * =========================================
         */

        int[] employeeIds = new int[6];
        employeeIds[0] = 121;
        employeeIds[1] = 131;
        employeeIds[2] = 141;
        employeeIds[3] = 151;
        employeeIds[4] = 161;
        employeeIds[5] = 171;

        System.out.println("\nInteger Array:");
        System.out.println("Array length = " + employeeIds.length);

        for (int index = 0; index < employeeIds.length; index++) {
            System.out.println("Employee ID: " + employeeIds[index]);
        }

        // Enhanced for loop (read-only iteration)
        System.out.println("Using Enhanced For Loop:");
        for (int id : employeeIds) {
            System.out.println(id);
        }

        /*
         * =========================================
         * String Array
         * =========================================
         */

        String[] employeeNames = {
                "Rajesh", "Ganesh", "Maruthi", "Nandhan", "Thulasi", "Linghai"
        };

        System.out.println("\nString Array:");
        for (int index = 0; index < employeeNames.length; index++) {
            System.out.println("Employee Name: " + employeeNames[index]);
        }

        /*
         * =========================================
         * Double Array
         * =========================================
         */

        double[] employeeSalaries = { 5.25, 8.3, 7.5, 8.5, 9.0, 11.2 };

        System.out.println("\nDouble Array:");
        for (int index = 0; index < employeeSalaries.length; index++) {
            System.out.println("Salary = " + employeeSalaries[index]);
        }

        /*
         * =========================================
         * Boolean Array (Wrapper Class)
         * =========================================
         */

        Boolean[] statusFlags = { true, false };

        System.out.println("\nBoolean Array:");
        for (int index = 0; index < statusFlags.length; index++) {
            System.out.println("Condition = " + statusFlags[index]);
        }

        /*
         * =========================================
         * Character Array
         * =========================================
         */

        char[] alphabetLetters = { 'A', 'B', 'C', 'D' };

        System.out.println("\nCharacter Array:");
        for (int index = 0; index < alphabetLetters.length; index++) {
            System.out.println("Letter: " + alphabetLetters[index]);
        }

        /*
         * Converting String to Character Array
         */

        char[] nameCharacters = "Rajesh".toCharArray();

        System.out.println("\nCharacter Array from String:");
        for (int index = 0; index < nameCharacters.length; index++) {
            System.out.println("Letter: " + nameCharacters[index]);
        }

        /*
         * =========================================
         * Object Array (Heterogeneous Data)
         * =========================================
         */

        Object[] testData = { 10.5, "Rajesh", 'A', true };

        System.out.println("\nObject Array:");
        for (int index = 0; index < testData.length; index++) {
            System.out.println(testData[index]);
        }

        System.out.println("Using Enhanced For Loop:");
        for (Object data : testData) {
            System.out.println(data);
        }

        /*
         * =========================================
         * Enhanced For Loop Example
         * =========================================
         */

        String[] supportedBrowsers = { "Chrome", "Edge", "Firefox" };

        System.out.println("\nSupported Browsers:");
        for (String browser : supportedBrowsers) {
            System.out.println(browser);
        }
    }
}
