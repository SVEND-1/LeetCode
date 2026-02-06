package org.example.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String minStr = strs[0];
        for (String s : strs) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
        }

        for (int i = 0; i < minStr.length(); i++) {
            char currentChar = minStr.charAt(i);

            for (String s : strs) {
                if (s.charAt(i) != currentChar) {
                    return minStr.substring(0, i);
                }
            }
        }

        return minStr;
    }
}
