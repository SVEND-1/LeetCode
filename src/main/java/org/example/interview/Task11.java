package org.example.interview;

import java.util.Scanner;

public class Task11 {
    //Дан массив целых чисел nums.
    //Найдите непрерывный подмассив с максимальной суммой
    //и верните эту сумму.
    //
    //Входные данные:
    //Первая строка содержит число N (1 ≤ N ≤ 10^5).
    //Вторая строка содержит N целых чисел через пробел.
    //
    //Ограничения:
    //-10^4 ≤ числа ≤ 10^4
    //
    //Выходные данные:
    //Выведите максимальную сумму подмассива.
    // Вход:
    //9
    //-2 1 -3 4 -1 2 1 -5 4
    //
    //Выход:
    //6
    //Найти не только сумму, но и начальный/конечный индексы максимального подмассива.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int currentSum = nums[0];
        int maxSum = nums[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum == nums[i]){
                startIndex = i;
            } else if (maxSum == currentSum) {
                endIndex = i;
            }
        }
        System.out.println("StartIndex: " + startIndex + "\nEndIndex: " + endIndex + "\nMaxSum: " + maxSum);
    }
}
