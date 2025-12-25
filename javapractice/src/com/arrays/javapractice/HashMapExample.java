package com.arrays.javapractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        /*
         * HashMap:
         * - HashMap is a part of Java Collections Framework.
         * - It stores data in key-value pairs.
         * - Keys are unique; values can be duplicate.
         * - Order of insertion is NOT maintained.
         * - It allows one null key and multiple null values.
         */

        Map<String, String> loginCredentials = new HashMap<>();
        // Map is an interface, HashMap is its implementation
        // Using Map reference is a best practice

        loginCredentials.put("username", "admin");
        // Stores the key "username" with value "admin"

        loginCredentials.put("password", "admin123");
        // Stores the key "password" with value "admin123"

        System.out.println(loginCredentials.get("username"));
        // Retrieves and prints the value associated with key "username"

        System.out.println(loginCredentials.get("password"));
        // Retrieves and prints the value associated with key "password"
    }
}
