package tast;

import exercise.StringUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilitiesTest {

    private StringUtilities stringUtilities;

    @BeforeEach
    void setup() {
        stringUtilities = new StringUtilities();
    }

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