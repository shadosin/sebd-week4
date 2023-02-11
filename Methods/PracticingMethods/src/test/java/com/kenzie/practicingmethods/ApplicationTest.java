package com.kenzie.practicingmethods;

import com.kenzie.practicingmethods.Application;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {
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

    private String InputStringOne = "The best thing about a boolean is even if you are wrong you are only off by a bit";
    private String InputStringTwo = "Some things Man was never meant to know for everything else there is only Google";
    private String InputStringThree = "I only love the fifth function key because it is just so refreshing";

    @Test
    public void test_exerciseOne_longestWord_Test1(){
        Application.exerciseOne(InputStringOne);
        assertThat(outContent.toString(), containsString("The longest word is: boolean"));
    }

    @Test
    public void test_exerciseOne_longestWord_Test2(){
        Application.exerciseOne(InputStringTwo);
        assertThat(outContent.toString(), containsString("The longest word is: everything"));
    }

    @Test
    public void test_exerciseOne_longestWord_Test3(){
        Application.exerciseOne(InputStringThree);
        assertThat(outContent.toString(), containsString("The longest word is: refreshing"));
    }


    @Test
    public void test_exerciseTwo_shortestWord_Test1(){
        Application.exerciseTwo(InputStringOne);
        assertThat(outContent.toString(), containsString("The shortest word is: a"));
    }

    @Test
    public void test_exerciseTwo_shortestWord_Test2(){
        Application.exerciseTwo(InputStringTwo);
        assertThat(outContent.toString(), containsString("The shortest word is: to"));
    }

    @Test
    public void test_exerciseTwo_shortestWord_Test3(){
        Application.exerciseTwo(InputStringThree);
        assertThat(outContent.toString(), containsString("The shortest word is: I"));
    }

    @Test
    public void test_exerciseThree_longestWordByLength_Test1(){
        Application.exerciseThree(InputStringOne);
        assertThat(outContent.toString(), containsString("The length of the longest word is: 7"));
    }

    @Test
    public void test_exerciseThree_longestWordByLength_Test2(){
        Application.exerciseThree(InputStringTwo);
        assertThat(outContent.toString(), containsString("The length of the longest word is: 10"));
    }

    @Test
    public void test_exerciseThree_longestWordByLength_Test3(){
        Application.exerciseThree(InputStringThree);
        assertThat(outContent.toString(), containsString("The length of the longest word is: 10"));
    }

    @Test
    public void test_exerciseFour_numberOfVowels_Test1(){
        Application.exerciseFour(InputStringOne);
        assertThat("Incorrect number of a's", outContent.toString(), containsString("Number of a's: 6"));
        assertThat("Incorrect number of e's", outContent.toString(), containsString("Number of e's: 7"));
        assertThat("Incorrect number of i's", outContent.toString(), containsString("Number of i's: 4"));
        assertThat("Incorrect number of o's", outContent.toString(), containsString("Number of o's: 8"));
        assertThat("Incorrect number of u's",outContent.toString(), containsString("Number of u's: 3"));
        assertThat("Incorrect total number vowels", outContent.toString(), containsString("Total number of vowels: 28"));
    }

    @Test
    public void test_exerciseFour_numberOfVowels_Test2(){
        Application.exerciseFour(InputStringTwo);
        assertThat("Incorrect number of a's", outContent.toString(), containsString("Number of a's: 3"));
        assertThat("Incorrect number of e's", outContent.toString(), containsString("Number of e's: 11"));
        assertThat("Incorrect number of i's", outContent.toString(), containsString("Number of i's: 3"));
        assertThat("Incorrect number of o's", outContent.toString(), containsString("Number of o's: 7"));
        assertThat("Incorrect number of u's",outContent.toString(), containsString("Number of u's: 0"));
        assertThat("Incorrect total number vowels", outContent.toString(), containsString("Total number of vowels: 24"));
    }

    @Test
    public void test_exerciseFour_numberOfVowels_Test3(){
        Application.exerciseFour(InputStringThree);
        assertThat("Incorrect number of a's", outContent.toString(), containsString("Number of a's: 1"));
        assertThat("Incorrect number of e's", outContent.toString(), containsString("Number of e's: 7"));
        assertThat("Incorrect number of i's", outContent.toString(), containsString("Number of i's: 6"));
        assertThat("Incorrect number of o's", outContent.toString(), containsString("Number of o's: 4"));
        assertThat("Incorrect number of u's",outContent.toString(), containsString("Number of u's: 3"));
        assertThat("Incorrect total number vowels", outContent.toString(), containsString("Total number of vowels: 21"));
    }

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Application.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "Application can run without crashing") ;
    }
}
