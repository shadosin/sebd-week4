package com.kenzie.supportingmaterials;

public class MethodPractice {
    // Practice One
    // Write a method here to hold the following code -
        public static void countCharacter(String inputString) {

        int count = 0;
        char[] letterArray = inputString.toCharArray();

        for (int i = 0; i < letterArray.length; i++) {
            // Match lower and upper case
            if (letterArray[i]=='L' || letterArray[i]=='l') {
                count++;
            }
        }

        System.out.println(count);

        }
    // Practice Two
    // Write a method that will take two numbers, multiply them together, and return the product of the two numbers
    public static int multiplyNumbers(int number1, int number2){
          int product = number1 * number2;
          return product;
    }
    // Practice Three
    // Write a method that will take an array of Strings and return the value of the longest String.
    // Use practiceThreeTest to verify
    public static String findLongestString(String[] wordArray){
            String longestWord = " ";
            for(int i = 0; i < wordArray.length; i++){
                if (wordArray[i].length() > longestWord.length()){
                    longestWord = wordArray[i];
                }
            }
            return longestWord;
    }
    // Practice Four
    // Write a method that will take a String and count how many times the letter "A" or "a" appears.
    // Both uppercase and lowercase A should be counted.

   // @Override
    public static int countLetterA(String inputString){
            int count = 0;
            char[] letterArray = inputString.toCharArray();

            for(int i = 0;i < letterArray.length; i++){
                if(letterArray[i]=='A' || letterArray[i] == 'a'){
                    count++;
                }
        }
            return count;
    }
}
