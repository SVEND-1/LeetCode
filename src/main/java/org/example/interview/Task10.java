package org.example.interview;

public class Task10 {
    //Напишите метод, который проверяет, является ли строка палиндромом (читается одинаково слева направо и справа налево). Например, "level" — палиндром, а "hello" — нет.
    public static void main(String[] args) {
        String pal = "level";
        String notPal = "hello";
        System.out.println(task(pal) ? "Палиндром" : "Не палиндром");
        System.out.println(task(notPal) ? "Палиндром" : "Не палиндром");
        System.out.println(task2(pal) ? "Палиндром" : "Не палиндром");
        System.out.println(task2(notPal) ? "Палиндром" : "Не палиндром");
    }

    private static boolean task(String message){
        StringBuilder stringBuilder = new StringBuilder(message);
        stringBuilder.reverse();
        return message.contains(stringBuilder);
    }
    private static boolean task2(String message){
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < message.length() + 1; i++) {
            builder.append(message.charAt(message.length() - i));
        }
        return message.contains(builder);
    }
}
