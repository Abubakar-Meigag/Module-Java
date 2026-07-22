package exercise;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class providing common string operations.
 * <p>
 * Contains methods for checking palindromes and parsing
 * comma-separated strings.
 * </p>
 */
public class StringUtilities {

    /**
     * Checks whether the given string is a palindrome.
     * <p>
     * A palindrome reads the same forwards and backwards,
     * for example {"racecar"} or {"madam"}.
     * </p>
     *
     * @param s the string to check
     * @return {true} if {s} is a palindrome, {false} otherwise
     * @see #splitCommaSeparatedLine(String)
     */
    public boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    /**
     * Splits a comma-separated string into a list of substrings.
     * <p>
     * For example, {"a,b,c"} returns a list containing
     * {"a"}, {"b"}, and {"c"}.
     * </p>
     *
     * @param s the comma-separated string to split
     * @return a {List} of substrings split by { , }
     * @see #isPalindrome(String)
     */
    public List<String> splitCommaSeparatedLine(String s) {
        return Arrays.asList(s.split(","));
    }
}
