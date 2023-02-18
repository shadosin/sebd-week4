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

    public static String findLongestWord(String inputString){
        // First convert the inputString String variable to an array of words
        // Loop through the words and find the longest word
        // Store the longest word in a variable
        // Return the longest word stored in that variable
        // HINT: if the multiple words have the same length return the first longest
        String longestWord = "";
        String[] longWord = inputString.split(" ");

        for(int i = 0; i < longWord.length; i++){
            if(longWord[i].length() > longestWord.length()){
                longestWord = longWord[i];
            }
        }
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

        String[] shortWords = inputString.split(" ");

        // initialize a variable to store the shortest word
        String shortestWord = shortWords[0];

        // loop through the array of words and find the shortest word
        for (int i = 1; i < shortWords.length; i++) {
            if (shortWords[i].length() < shortestWord.length()){
                shortestWord = shortWords[i];
            }
        }

        // return the shortest word
        return shortestWord;
    }

    public static void exerciseTwo(String inputString){
        System.out.println("Exercise 2");
        // Call findShortestWord() to print out the shortest word
        // Print out the shortest word in a message:  "The shortest word is: {shortest word}"
        // Do not include the braces {} in the output
        // Write your code below
        String shortestWord = findShortestWord(inputString);
        System.out.println("The shortest word is: " + shortestWord);
    }

    /*******************************
     * EXERCISE THREE
     ******************************/
    // Write a method that returns the length of the longest word.
    // HINT:  You will need to return an int!

    // Write your method here
    public static int longestLength(String inputString){
        int longestLength = 0;
        String [] length = inputString.split(" ");
        for(int i = 0; i < length.length; i++){
            if(length[i].length() > longestLength){
                longestLength = length[i].length();
            }
        }



        return longestLength;
    }


    // Call your method in exerciseThree()
    public static void exerciseThree(String inputString){
        System.out.println("Exercise 3");
        // Print the length of the longest word to the console like this "The length of the longest word is: {length}"
        // Do not include curly braces in your output
        // Write your code below
        int longest= longestLength(inputString);
        System.out.println("The length of the longest word is: " + longest);
    }

    /*******************************
     * EXERCISE FOUR
     ******************************/

    // Write a static countLetter() method that takes two arguments.
    // The method will count how many times the letter appears in the string.
    // Count both upper and lower case versions of the letter
    // Write your method here
    public static int countLetter(String inputString, char letter){
        inputString =  inputString.toLowerCase();
        int count = 0;
        for (int i=0; i < inputString.length(); i++){
           if(inputString.charAt(i) == Character.toLowerCase(letter)){
               count++;
           }
        }
        return count;
    }
    // Call your method inside the exerciseFour
    public static void exerciseFour(String inputString){
        System.out.println("Exercise 4");
        //  Call the same countLetter() method for each vowel "a", "e", "i", "o" and "u" on the inputString String variable, upper or lower case
        //  Print out the total number of each vowel
        //  Then add all the totals together and display the total vowel count
        int letterA = countLetter(inputString,'a');
        int letterE = countLetter(inputString, 'e');
        int letterI = countLetter(inputString, 'i');
        int letterO = countLetter(inputString, 'o');
        int letterU = countLetter(inputString, 'u');
        int sum = letterA+letterE+letterI+letterO+letterU;
        System.out.println("Number of a's: "+ letterA);
        System.out.println("Number of e's: " + letterE);
        System.out.println("Number of i's: " + letterI);
        System.out.println("Number of o's: " + letterO);
        System.out.println("Number of u's: " + letterU);
        System.out.println("Total number of vowels: " + sum);

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