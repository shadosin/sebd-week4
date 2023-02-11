package com.kenzie.practicingmanipulatingstrings;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static void exerciseOne(String inputString){
        System.out.println("Exercise 1");
        // Write code that uses "substring" to find the 14 characters from inputString.
        // Display your result using System.out.println(str);
        // Write Your Code Here

    }

    public static void exerciseTwo(String inputString){
        System.out.println("Exercise 2");
        // Write code that uses "substring" to find the last 12 characters from inputString
        // Display your result using System.out.println(str);
        // Write Your Code Here

    }

    public static void exerciseThree(String inputString){
        System.out.println("Exercise 3");
        // Write code that uses "substring" to find the characters between the 3rd and 5th position of inputString
        // (i.e., " b").
        // Display your result using System.out.println(str);
        // Write Your Code Here

    }

    public static void exerciseFour(String inputString){
        System.out.println("Exercise 4");
        // Write code that uses "substring" to find the characters between the 23rd and 38th position of inputString
        // (i.e., "boolean is even").
        // Display your result using System.out.println(str);
        // Write Your Code Here

    }

    public static void exerciseFive(String inputString){
        System.out.println("Exercise 5");
        // Write code that returns an array of each word in inputString
        // Display your result using the call: Arrays.toString(wordArray);
        // Write Your Code Here

    }

    public static void exerciseSix(String inputString){
        System.out.println("Exercise 6");
        // Write code that finds and returns the index of "only" in inputString
        // Display your result using System.out.println(index);
        // Write Your Code Here

    }

    public static void exerciseSeven(String inputString){
        System.out.println("Exercise 7");
        // Write code that converts the inputString string variable to an array
        // Next, find and return the index of the last word in inputString.
        // Display your result using System.out.println(index);
        // Write Your Code Here

    }

    public static void exerciseEight(String inputString){
        System.out.println("Exercise 8");
        // Write code that finds and returns an array with all the words in inputString that start with "b".
        // Display your result using the call: Arrays.toString(bWordArray);
        // Hint: You will need two loops to do this without hard-coding
        // Write Your Code Here

    }

    public static void exerciseNine(String inputString){
        System.out.println("Exercise 9");
        // Write code converts the String variable inputString above into an array of characters.
        // Do not include spaces.
        // Display your result using the call: Arrays.toString(lettersArray);
        // Write Your Code Here

    }

    public static void exerciseTen(String inputString){
        System.out.println("Exercise 10");
        // Write code converts the String variable inputString above into an array of characters with spaces removed
        // Use for-each to loop through the array and count the number of times the letter "a" appears.
        // Display your result using: System.out.println(count);
        // Write Your Code Here

    }

    public static void exerciseEleven(String inputString){
        System.out.println("Exercise 11");
        // Write code converts the String variable inputString above into an array of characters
        // Use for-each to loop through the array and count the number of times the letter "t" appears.
        // Count both upper and lower case
        // Display your result using: System.out.println(count);
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
