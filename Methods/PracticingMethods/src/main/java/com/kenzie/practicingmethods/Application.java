package com.kenzie.practicingmethods;

import java.util.Arrays;

public class Application {

    /********************************
    * Writing and Calling Methods
    /*******************************/

    //  Create helper methods to complete each exercise
    //  Your methods should all be public static methods

    /*******************************
     * EXERCISE ONE
     ******************************/

    // Write a method and call it to find the longest word in inputString.
    // Complete  findLongestWord()

    public static String findLongestWord(String inputString){
        // First convert the inputString String variable to an array of words
        // Loop through the words and find the longest word
        // Store the longest word in a variable
        // Return the longest word stored in that variable
        // HINT: if the multiple words have the same length return the first longest
        String longestWord = "";

        // Write your code below

        return longestWord;
    }

    public static void exerciseOne(String inputString){
        System.out.println("Exercise 1");
        // Now we call findLongestWord inside the method exerciseOne.
        String longestWord = findLongestWord(inputString);
        System.out.println("The longest word is: " + longestWord);

    }

    /*******************************
     * EXERCISE TWO
     ******************************/

    // Write a method to find the shortest word. It will be very similar to findLongestWord
    // HINT: if the multiple words have the same length, return the first shortest word

    public static String findShortestWord(String inputString){
        // Fill out a method for finding the shortest word

        return "";
    }

    public static void exerciseTwo(String inputString){
        System.out.println("Exercise 2");
        // Call findShortestWord() to print out the shortest word
        // Print out the shortest word in a message:  "The shortest word is: {shortest word}"
        // Do not include the braces {} in the output
        // Write your code below

    }

    /*******************************
     * EXERCISE THREE
     ******************************/
    // Write a method that returns the length of the longest word.
    // HINT:  You will need to return an int!

    // Write your method here



    // Call your method in exerciseThree()
    public static void exerciseThree(String inputString){
        System.out.println("Exercise 3");
        // Print the length of the longest word to the console like this "The length of the longest word is: {length}"
        // Do not include curly braces in your output
        // Write your code below
    }

    /*******************************
     * EXERCISE FOUR
     ******************************/

    // Write a static countLetter() method that takes two arguments.
    // The method will count how many times the letter appears in the string.
    // Count both upper and lower case versions of the letter
    // Write your method here


    // Call your method inside the exerciseFour
    public static void exerciseFour(String inputString){
        System.out.println("Exercise 4");
        //  Call the same countLetter() method for each vowel "a", "e", "i", "o" and "u" on the inputString String variable, upper or lower case
        //  Print out the total number of each vowel
        //  Then add all the totals together and display the total vowel count

        // It should look something like this:
        //  "Number of a's: 6"
        //  ...
        //  ... {other vowels}
        //  ...
        //  Total number of vowels: 28

    }

    public static void main(String[] args) {
        String inputString = "The best thing about a boolean is even if you are wrong you are only off by a bit";

        exerciseOne(inputString);
        exerciseTwo(inputString);
        exerciseThree(inputString);
        exerciseFour(inputString);
    }

}