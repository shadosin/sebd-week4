package com.kenzie.practicingmanipulatingstrings;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApplicationTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream ORIGINAL_OUT = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(ORIGINAL_OUT);
    }

    @BeforeEach
    public void setTestInput() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    private final String INPUT_STRING_ONE = "The best thing about a boolean is even if you are wrong you are only off by a bit";
    private final String INPUT_STRING_TWO = "Some things Man was never meant to know for everything else there is only Google";
    private final String INPUT_STRING_THREE = "I only love the fifth function key because it is just so refreshing";

    @Test
    public void test_exerciseOne_firstFourteenCharacters_Test1() {
        Application.exerciseOne(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("|The best thing|"));
    }

    @Test
    public void test_exerciseOne_firstFourteenCharacters_Test2() {
        Application.exerciseOne(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("|Some things Ma|"));
    }

    @Test
    public void test_exerciseOne_firstFourteenCharacters_Test3() {
        Application.exerciseOne(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("|I only love th|"));
    }

    @Test
    public void test_exerciseTwo_lastTwelveCharacters_Test1() {
        Application.exerciseTwo(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("|off by a bit|"));
    }

    @Test
    public void test_exerciseTwo_lastTwelveCharacters_Test2() {
        Application.exerciseTwo(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("| only Google|"));
    }

    @Test
    public void test_exerciseTwo_lastTwelveCharacters_Test3() {
        Application.exerciseTwo(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("|o refreshing|"));
    }

    @Test
    public void test_exerciseThree_betweenThreeAndNine_Test1() {
        Application.exerciseThree(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("|best |"));
    }

    @Test
    public void test_exerciseThree_betweenThreeAndNine_Test2() {
        Application.exerciseThree(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("| thin|"));
    }

    @Test
    public void test_exerciseThree_betweenThreeAndNine_Test3() {
        Application.exerciseThree(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("|ly lo|"));
    }

    @Test
    public void test_exerciseFour_betweenTwentyThirdAndThirtyEighthPosition_Test1() {
        Application.exerciseFour(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("|oolean is even|"));
    }

    @Test
    public void test_exerciseFour_betweenTwentyThirdAndThirtyEighthPosition_Test2() {
        Application.exerciseFour(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("|r meant to kno|"));
    }

    @Test
    public void test_exerciseFour_betweenTwentyThirdAndThirtyEighthPosition_Test3() {
        Application.exerciseFour(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("|nction key bec|"));
    }

    @Test
    public void test_exerciseFive_arrayOfEachWord_Test1() {
        Application.exerciseFive(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("[The, best, thing, about, a, boolean, is, even, if, you, are, wrong, you, are, only, off, by, a, bit]"));
    }

    @Test
    public void test_exerciseFive_arrayOfEachWord_Test2() {
        Application.exerciseFive(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("[Some, things, Man, was, never, meant, to, know, for, everything, else, there, is, only, Google]"));
    }

    @Test
    public void test_exerciseFive_arrayOfEachWord_Test3() {
        Application.exerciseFive(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("[I, only, love, the, fifth, function, key, because, it, is, just, so, refreshing]"));
    }

    @Test
    public void test_exerciseSix_indexOfSpecificWord_Test1() {
        Application.exerciseSix(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("14"));
    }

    @Test
    public void test_exerciseSix_indexOfSpecificWord_Test2() {
        Application.exerciseSix(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("13"));
    }

    @Test
    public void test_exerciseSix_indexOfSpecificWord_Test3() {
        Application.exerciseSix(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("1"));
    }

    @Test
    public void test_exerciseSeven_indexOfLastWord_Test1() {
        Application.exerciseSeven(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("18"));
    }

    @Test
    public void test_exerciseSeven_indexOfLastWord_Test2() {
        Application.exerciseSeven(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("14"));
    }

    @Test
    public void test_exerciseSeven_indexOfLastWord_Test3() {
        Application.exerciseSeven(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("12"));
    }

    @Test
    public void test_exerciseEight_allWordsStartingWithLetter_B_Returned_Test1() {
        Application.exerciseEight(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("[best, boolean, by, bit]"));
    }

    @Test
    public void test_exerciseEight_allWordsStartingWithLetter_B_Returned_Test2() {
        Application.exerciseEight(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("[]"));
    }

    @Test
    public void test_exerciseEight_allWordsStartingWithLetter_B_Returned_Test3() {
        Application.exerciseEight(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("[because]"));
    }

    @Test
    public void test_exerciseNine_convertWordToArrayOfCharactersNoSpaces_Test1() {
        Application.exerciseNine(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("[T, h, e, b, e, s, t, t, h, i, n, g, a, b, o, u, t, a, b, o, o, l, e, a, n, i, s, e, v, e, n, i, f, y, o, u, a, r, e, w, r, o, n, g, y, o, u, a, r, e, o, n, l, y, o, f, f, b, y, a, b, i, t]"));
    }

    @Test
    public void test_exerciseNine_convertWordToArrayOfCharactersNoSpaces_Test2() {
        Application.exerciseNine(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("[S, o, m, e, t, h, i, n, g, s, M, a, n, w, a, s, n, e, v, e, r, m, e, a, n, t, t, o, k, n, o, w, f, o, r, e, v, e, r, y, t, h, i, n, g, e, l, s, e, t, h, e, r, e, i, s, o, n, l, y, G, o, o, g, l, e]"));
    }

    @Test
    public void test_exerciseNine_convertWordToArrayOfCharactersNoSpaces_Test3() {
        Application.exerciseNine(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("[I, o, n, l, y, l, o, v, e, t, h, e, f, i, f, t, h, f, u, n, c, t, i, o, n, k, e, y, b, e, c, a, u, s, e, i, t, i, s, j, u, s, t, s, o, r, e, f, r, e, s, h, i, n, g]"));
    }

    @Test
    public void test_exerciseTen_countNumberThatLetter_A_Appears_Test1() {
        Application.exerciseTen(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("6"));
    }

    @Test
    public void test_exerciseTen_countNumberThatLetter_A_Appears_Test2() {
        Application.exerciseTen(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("3"));
    }

    @Test
    public void test_exerciseTen_countNumberThatLetter_A_Appears_Test3() {
        Application.exerciseTen(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("0"));
    }

    @Test
    public void test_exerciseEleven_countNumberThatLetter_T_Test1() {
        Application.exerciseEleven(INPUT_STRING_ONE);
        assertThat(outContent.toString(), containsString("5"));
    }

    @Test
    public void test_exerciseEleven_countNumberThatLetter_T_Test2() {
        Application.exerciseEleven(INPUT_STRING_TWO);
        assertThat(outContent.toString(), containsString("5"));
    }

    @Test
    public void test_exerciseEleven_countNumberThatLetter_T_Test3() {
        Application.exerciseEleven(INPUT_STRING_THREE);
        assertThat(outContent.toString(), containsString("5"));
    }

    @Test
    public void runMainWithoutCrashing() {
        boolean crashed = false;
        try {
            Application.main(new String[]{});
        } catch (Exception e) {
            crashed = true;
        }

        assertEquals(false, crashed, "App can run without crashing") ;
    }
}
