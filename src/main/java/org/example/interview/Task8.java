package org.example.interview;

public class Task8 {
    //Удаление пробелов из строки:
    //   – Задание: Напишите метод, который удаляет все пробелы из строки.
    //   – Подсказка: Используйте методы класса String.

    public static void main(String[] args) {
        task("Hello    Worl d");
        orTask("Hello    Wor ld");
    }

    private static void task(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }

    private static void orTask(String s){
        System.out.println(s.replaceAll(" ", ""));
    }
}
