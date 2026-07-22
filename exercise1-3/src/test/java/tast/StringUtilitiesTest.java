package tast;

import exercise.StringUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link StringUtilities}.
 * <p>
 * Verifies correct behaviour of palindrome checking
 * and comma-separated string splitting.
 * </p>
 */
class StringUtilitiesTest {

    private StringUtilities stringUtilities;

    @BeforeEach
    void setup() {
        stringUtilities = new StringUtilities();
    }

    /**
     * Tests that {@link StringUtilities#isPalindrome(String)} correctly
     * identifies palindromes and non-palindromes.
     */
    @Test
    void testIsPalindrome() {
        assertTrue(stringUtilities.isPalindrome("racecar"));
        assertTrue(stringUtilities.isPalindrome("madam"));
        assertFalse(stringUtilities.isPalindrome("hello"));
    }

    /**
     * Tests that {@link StringUtilities#splitCommaSeparatedLine(String)}
     * correctly splits a comma-separated string into a list.
     */
    @Test
    void testSplitCommaSeparatedLine() {
        assertEquals(Arrays.asList("a", "b", "c"), stringUtilities.splitCommaSeparatedLine("a,b,c"));
        assertEquals(Arrays.asList("hello", "world"), stringUtilities.splitCommaSeparatedLine("hello,world"));
    }

}