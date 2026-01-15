package org.example.interview;

public class Task4 {
    //Фибоначчи:
    //   – Задание: Напишите метод, который возвращает n-е число Фибоначчи. Объясните разницу между рекурсивным и итеративным подходами.

    public static void main(String[] args) {
        System.out.println(task(3));
    }

    private static int task(int n){
        if(n == 0) return 0;
        if (n == 1) return 1;

        int answer = 0;
        for (int i = 0; i < n + 1; i++) {
            answer+= i;
        }
        return answer;
    }

}
