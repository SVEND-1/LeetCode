package org.example.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubstringsWithDistinctStart {
    public int maxDistinct(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                result++;
            }
        }

        return result;
    }
}
