package com.arrays.javapractice;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        /*
         * =========================================
         * Example 1: Two-Dimensional Integer Array
         * =========================================
         * Each row represents a separate array.
         * Useful for matrix-like data.
         */

        int[][] numberMatrix = { { 1, 2 }, { 3, 4 } };

        for (int row = 0; row < numberMatrix.length; row++) {
            for (int column = 0; column < numberMatrix[row].length; column++) {
                System.out.println(numberMatrix[row][column]);
            }
        }

        /*
         * =========================================
         * Example 2: 2D String Array – Credentials
         * =========================================
         * Each row represents one login test case:
         * [username, password]
         * Very common in automation testing.
         */

        String[][] loginCredentials = {
                { "admin", "admin123" },
                { "invalid", "wrongpass" }
        };

        /*
         * -------------------------------
         * Using NORMAL for loop
         * -------------------------------
         * Preferred when index-based access is needed
         */

        for (int index = 0; index < loginCredentials.length; index++) {

            String username = loginCredentials[index][0];
            String password = loginCredentials[index][1];

            System.out.println("Testing login with: " + username + " / " + password);
        }

        /*
         * -------------------------------
         * Using ENHANCED for loop
         * -------------------------------
         * Cleaner syntax
         * Best for read-only iteration
         */

        for (String[] credential : loginCredentials) {
            for (String value : credential) {
                System.out.println(value);
            }
        }

        /*
         * -------------------------------
         * Real-time Automation Example
         * -------------------------------
         * Simulates data-driven login testing
         */

        for (String[] credential : loginCredentials) {

            String username = credential[0];
            String password = credential[1];

            System.out.println("Login with " + username + " / " + password);
        }

        /*
         * =========================================
         * Useful Commented Examples (For Learning)
         * =========================================
         */

        // Example: Printing all elements of a 2D array (Generic approach)
        /*
        for (int i = 0; i < loginCredentials.length; i++) {
            for (int j = 0; j < loginCredentials[i].length; j++) {
                System.out.println(loginCredentials[i][j]);
            }
        }
        */

        // Example: Another credentials set
        /*
        String[][] credentials = {
                { "Rajesh", "Rajesh123" },
                { "Asha", "Asha123" }
        };

        for (int i = 0; i < credentials.length; i++) {
            for (int j = 0; j < credentials[i].length; j++) {
                System.out.println(credentials[i][j]);
            }
        }
        */
    }
}
