package org.example.testing;

import java.util.Scanner;

public class Task12 {

    //У Артемия есть бесконечное число монет, каждая из которых одного из трех номиналов. Его интересует, какие суммы от  до  рублей он может набрать в свой кошелек, если там заранее лежала монета величиной в  рубль.
    //
    //Формат входных данных
    //Первая строка содержит число  — ограничение на сумарную стоимость монет в кошельке
    //Вторая строка содержит три числа  задающие достоинства типов монет
    //
    //Формат выходных данных
    //Выведите единственное число — количество сумм, которые можно набрать в кошельке. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        boolean[] dp = new boolean[N + 1];
        dp[1] = true;

        int[] moneys = {a1, a2, a3};

        for (int money : moneys) {
            for (int sum = 1; sum <= N; sum++) {
                if (sum >= money && dp[sum - money]) {
                    dp[sum] = true;
                }
            }
        }

        int count = 0;
        for (int sum = 1; sum <= N; sum++) {
            if (dp[sum]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
