package com.kenzie.supportingmaterials;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MethodPracticeTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    // Practice One
    // Write a method to hold the code System.out.println("***" + msg + "***");
    // Call that method here in practiceOneTest

    @Test
    public void practiceOneTest() {
         //Uncomment me
         MethodPractice.countCharacter("hello pal");
        assertThat(outContent.toString(), containsString("3"));
    }

    @Test
    public void practiceTwoTest() {
        int numberOne = 3;
        int numberTwo = 5;
        int correctAnswer = 15;

        // Uncomment These -
         int result=MethodPractice.multiplyNumbers(numberOne,numberTwo);
         assertEquals(correctAnswer, result);
    }

    @Test
    public void practiceThreeTest() {
        //String[] testEmptyArray = {};
        String[] testArray1 = {"Twinkle", "Twinkle", "Little", "Star" };
        String[] testArray2 = {"The", "Bear", "Went", "Over", "The", "Mountain" };
        //String[] testArray3 = {"Along", "Came", "A", "Spider", "Who", "Sat", "Down", "Beside", "Her"};

         //assertEquals(MethodPractice.findLongestString(testEmptyArray), "");
         assertEquals(MethodPractice.findLongestString(testArray1), "Twinkle");
         assertEquals(MethodPractice.findLongestString(testArray2), "Mountain");
         //assertEquals(MethodPractice.findLongestString(testArray3), "Beside");
    }

    @Test
    public void practiceFourTest() {
        // Write your practice four test here
        //String testEmptyString = "";
        String testString1 = "AA AA AA";
        String testString2 = "AAaa";
        String testString3 = "A is for Apple and Astronaut!";
//Call method here
       // assertEquals(MethodPractice.countLetterA(testEmptyString), "");
        assertEquals(MethodPractice.countLetterA(testString1), 6);
        assertEquals(MethodPractice.countLetterA(testString2), 4);
        assertEquals(MethodPractice.countLetterA(testString3), 5);
    }
}