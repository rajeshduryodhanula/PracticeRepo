package com.arrays.javapractice;

public class ArrayWithConditions {

    public static void main(String[] args) {

        // Check whether the array contains at least one number
        // that is a multiple of 2 (even number)

        int[] numbers = { 1, 3, 5, 7, 9, 10, 11 };

        boolean isEvenNumberFound = false;

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] % 2 == 0) {
                System.out.println(numbers[index] + " is a multiple of 2");
                isEvenNumberFound = true;
                break; // stop loop after finding the first even number
            }
        }

        if (!isEvenNumberFound) {
            System.out.println("No number divisible by 2 found in the array");
        }
    }
}
