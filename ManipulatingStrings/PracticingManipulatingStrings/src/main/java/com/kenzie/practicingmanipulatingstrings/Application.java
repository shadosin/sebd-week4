package com.kenzie.practicingmanipulatingstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Application {
    /***********************
     * Manipulating Strings
    /***********************/

    // Each one should be displayed in this manner:
    // System.out.println("Exercise 0");
    // System.out.println(answer);
    // Result:
    // Exercise 0
    // {this,is,the,answer}

    public static void exerciseOne(String inputString) {
        System.out.println("Exercise 1");
        // Write code that uses "substring" to find the first 14 characters from inputString.
        // Print your result between two pipe characters using System.out.println("|" + str + "|");
        // Write Your Code Here


    }

    public static void exerciseTwo(String inputString) {
        System.out.println("Exercise 2");
        // Write code that uses "substring" to find the last 12 characters from inputString
        // Print your result between two pipe characters using System.out.println("|" + str + "|");
        // Write Your Code Here

    }

    public static void exerciseThree(String inputString) {
        System.out.println("Exercise 3");
        // Write code that uses "substring" to find the characters between index 3 and 9 of inputString

        // Example
        // "Waffles and Blueberries"
        // Between index 3 and index 9 are the following 5 characters
        // les a

        // Hint - in substring(int start, int end), "start" is inclusive, and "end" is exclusive
        // Print your result between two pipe characters using System.out.println("|" + str + "|");
        // Write Your Code Here

    }

    public static void exerciseFour(String inputString) {
        System.out.println("Exercise 4");
        // Write code that uses "substring" to find the characters between the index 23 and 38 of inputString
        // (i.e., "boolean is even").
        // Print your result between two pipe characters using System.out.println("|" + str + "|");
        // Write Your Code Here

    }

    public static void exerciseFive(String inputString) {
        System.out.println("Exercise 5");
        // Create a new array that contains each word in inputString
        // Words are separated by spaces
        // Display your result using the call: Arrays.toString(wordArray);
        // Write Your Code Here

    }

    public static void exerciseSix(String inputString) {
        System.out.println("Exercise 6");
        // Create a new array that contains each word in inputString
        // Words are separated by spaces
        // Using a loop, write code that finds the index of "only" in the new array
        // Display your result using System.out.println(index);
        // Write Your Code Here

    }

    public static void exerciseSeven(String inputString) {
        System.out.println("Exercise 7");
        // Create a new array that contains each word in inputString
        // Words are separated by spaces
        // Print the index of the last word in your new array
        // Display your result using System.out.println(index);
        // Write Your Code Here

    }

    public static void exerciseEight(String inputString) {
        System.out.println("Exercise 8");
        // Write code that creates a new array that contains only the words in inputString that start with "b".
        // Display your result using the call: Arrays.toString(bWordArray);
        // Hint: You will need two loops to do this without hard-coding
        // Write Your Code Here

    }

    public static void exerciseNine(String inputString) {
        System.out.println("Exercise 9");
        // Create a character array that contains all the characters in inputString
        // Do not include spaces.
        // Display your result using the call: Arrays.toString(lettersArray);
        // Write Your Code Here

    }

    public static void exerciseTen(String inputString) {
        System.out.println("Exercise 10");
        // Create a character array of all the characters in inputString EXCEPT spaces
        // Use for-each to loop through the array and count the number of times the letter "a" appears.
        // Display your result using: System.out.println(count);
        // Write Your Code Here

    }

    public static void exerciseEleven(String inputString) {
        System.out.println("Exercise 11");
        // Create a character array that contains all the characters in inputString
        // Use for-each to loop through the array and count the number of times the letter "t" or "T" appears.
        // Count both upper and lower case
        // Display your result using: System.out.println(count);
        // Write Your Code Here

    }

    public static void main(String[] args) {
        String inputString = "The best thing about a boolean is even if you are wrong you are only off by a bit";

        exerciseOne(inputString);
        exerciseTwo(inputString);
        exerciseThree(inputString);
        exerciseFour(inputString);
        exerciseFive(inputString);
        exerciseSix(inputString);
        exerciseSeven(inputString);
        exerciseEight(inputString);
        exerciseNine(inputString);
        exerciseTen(inputString);
        exerciseEleven(inputString);
    }

}
