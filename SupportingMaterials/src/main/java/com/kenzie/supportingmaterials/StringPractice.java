package com.kenzie.supportingmaterials;

public class StringPractice {
    public static void practiceOne() {
        String testString = "When you wish upon a star";

        // Return the first 8 characters using substring
        System.out.println(testString.substring(0,8));
        // Return the last 10 characters using substring
        System.out.println(testString.substring(testString.length()-10));
        // Return "wish" using substring
        System.out.println(testString.substring(9,13));
    }

    public static void practiceTwo() {
        String myString = "Cats and dogs living together!";

        // Find location of "dogs"
        int dogIndex = myString.indexOf("dogs");
        System.out.println(dogIndex);
        // Write out string after "dogs"
        System.out.println(myString.substring(dogIndex));
        // Find location of first space character
        int space = myString.indexOf(" ");
        // Write out first word
        System.out.println(myString.substring(0, space));
    }

    public static void practiceThree() {
        String myString = "Hello world!";

        // Replace world with "Hello"
        String replace = myString.replaceFirst("world", "Hello");
        System.out.println(replace);
        // Display in all Uppercase
        String caps = myString.toUpperCase();
        System.out.println(caps);
        // Replace all o with zeros
        String zero = myString.replace("o", "0");
        System.out.println(zero);
        // Remove all 'l' -- hint, use replaceAll
        String l = myString.replace("l", "");
        System.out.println(l);
    }

    public static void practiceFour() {
        String myString = "January,February,March,April,May,June,July,August,September,October,November,December";

        // Create an array
        String[] months = myString.split(",");
        // Print out third value in month
        System.out.println(months[2]);
        // Loop and print out all the months
        for(String i: months){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        practiceOne();
        practiceTwo();
        practiceThree();
        practiceFour();
    }
}
