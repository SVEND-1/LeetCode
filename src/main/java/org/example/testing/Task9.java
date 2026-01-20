package org.example.testing;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (dp[i][j] == Long.MAX_VALUE / 2) continue;

                int newJ = j + (prices[i] > 100 ? 1 : 0);
                if (newJ <= n) {//выдает купон
                    dp[i + 1][newJ] = Math.min(dp[i + 1][newJ], dp[i][j] + prices[i]);
                }

                if (j > 0 && prices[i] > 0) {//забирает купон
                    dp[i + 1][j - 1] = Math.min(dp[i + 1][j - 1], dp[i][j]);
                }
            }
        }


        int minCost = 99999;
        for (int j = 0; j <= n; j++) {
            minCost = Math.min(minCost, dp[n][j]);
        }

        System.out.println(minCost);
    }
}