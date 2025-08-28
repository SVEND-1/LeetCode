package org.example.Easy;

public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }

    public static int scoreOfString(String s) {
        int result = 0;
        int temp;
        for(int i = 0; i < s.length() - 1;i++){
            temp = s.charAt(i) - s.charAt(i + 1);
            if(temp < 0) {
                temp *= -1;
            }
            result += temp;
        }
        return result;
    }
}
