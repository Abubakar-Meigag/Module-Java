package com.exercise4;

import java.util.Arrays;
import java.util.List;

public class StringUtilities {

    public boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public List<String> splitCommaSeparatedLine(String s) {
        return Arrays.asList(s.split(","));
    }
}
