package com.arrays.javapractice;

public class MethodsDemo {

    public static void main(String[] args) {

        /*
         * Creating object to call NON-STATIC methods
         */
        MethodsDemo methodsDemo = new MethodsDemo();

        // Calling non-static void method
        methodsDemo.printGreeting();

        // Calling non-static method with return value
        String returnedName = methodsDemo.getPersonName();
        System.out.println("Hello " + returnedName);

        /*
         * Calling STATIC method
         * Static methods can be called without creating an object
         */
        System.out.println(getStaticFullName());

        /*
         * Calling method from another class
         */
        MethodsDemo2 methodsDemo2 = new MethodsDemo2();
        System.out.println("From another class: " + methodsDemo2.getPersonName());
    }

    /**
     * Non-static method
     * Prints a greeting message
     */
    public void printGreeting() {
        System.out.println("Hello Rajesh");
    }

    /**
     * Non-static method
     * Returns a String value
     */
    public String getPersonName() {
        return "Asha Jyothi";
    }

    /**
     * Static method
     * Can be called directly using class name
     */
    public static String getStaticFullName() {
        System.out.println("Duryodhanula Rajesh");
        return "Duryodhanula Asha Jyothi";
    }

    /*
     * ===============================
     * Useful Commented Examples
     * ===============================
     */

    // Static method call using class name
    /*
    String name = MethodsDemo.getStaticFullName();
    System.out.println(name);
    */

    // Method with parameters example
    /*
    public String getGreeting(String name) {
        return "Hello " + name;
    }
    */
}
