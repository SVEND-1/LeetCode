package org.example.interview;

import java.util.*;

public class Task1 {
    //Поиск дубликатов в массиве:
    //   – Задание: Напишите метод, который принимает массив целых чисел и возвращает список дубликатов.
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,3,3,4,5,6,6);
        var answer = task(list);
        answer.stream().forEach(System.out::println);
    }

    private static List<Integer> task(List<Integer> list){
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (Integer i : list) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }

        return duplicates;
    }
}
