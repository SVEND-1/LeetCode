package org.example.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
