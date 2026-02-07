package org.example.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String str = String.copyValueOf(haystack.toCharArray(),i,needle.length());
            if(needle.contains(
                    str
            )){
                return i;
            }
        }
        return -1;
    }
}
