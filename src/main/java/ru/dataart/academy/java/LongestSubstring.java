package ru.dataart.academy.java;

import java.util.HashSet;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int x_pointer = 0;
        int y_pointer = 0;
        int maximum = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (y_pointer < checkString.length()) {
            if (!hashSet.contains(checkString.charAt(y_pointer))) {
                hashSet.add(checkString.charAt(y_pointer));
                y_pointer++;
                maximum = Math.max(hashSet.size(), maximum);
            } else {
                hashSet.remove(checkString.charAt(x_pointer));
                x_pointer++;
            }
        }
        return maximum;
    }
}
