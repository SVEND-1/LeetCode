package org.example.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumOperationsToMakeArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(minOperations(nums,k));
    }

    private static int minOperations(int[] nums, int k) {
        return Arrays.stream(nums).sum() % k;
    }

}
