package com.exercise4;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {

    private final StringUtilities stringUtilities = new StringUtilities();

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtilities.isPalindrome("racecar"));
        assertTrue(stringUtilities.isPalindrome("madam"));
        assertFalse(stringUtilities.isPalindrome("hello"));
    }

    @Test
    void testSplitCommaSeparatedLine() {
        assertEquals(Arrays.asList("a", "b", "c"), stringUtilities.splitCommaSeparatedLine("a,b,c"));
        assertEquals(Arrays.asList("hello", "world"), stringUtilities.splitCommaSeparatedLine("hello,world"));
    }
}
