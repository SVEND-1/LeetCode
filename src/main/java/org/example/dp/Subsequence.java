package org.example.dp;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        String s1 = "abacaba";
        String s2 = "abcabc";
        System.out.println(task(s1,s2));
    }

    private static int task(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){//Количество повторов
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{//Если нету последовательности мы же не можем 0 сделать так как раньше могла она быть
                    // и нам надо продолжить логику и поставить какая последовательность то вообще была и
                    // чтобы не было 0 тут и надо взять и найти а какая максимум предыдущая была
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
