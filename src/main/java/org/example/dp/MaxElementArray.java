package org.example.dp;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //[3, 3, 4, 4, 5, 9, 9]
        int[] dp = new int[n];
        int current = arr[0];
        dp[0] = current;//Всегда делать базу
        for (int i = 1; i < arr.length; i++) {
            //Легче понять когда напишешь что надо реализовать,а потом пойдешь это делать
            //текущий = максимум из (максимального который есть и текущего)
            current = Math.max(arr[i],current);
            dp[i] = current;
        }
        Arrays.stream(dp).forEach(System.out::println);
    }
}
