package org.example.interview;

public class Task5 {
    //Переворот строки:
    //   – Задание: Напишите метод, который переворачивает строку (например, "hello" -> "olleh").
    public static void main(String[] args) {
        task("hello");
        System.out.println(new StringBuilder("hello").reverse());
    }

    private static void task(String s){
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < s.length() + 1; i++) {
            answer.append(s.charAt(s.length() - i));
        }

        System.out.println(answer);
    }
}
