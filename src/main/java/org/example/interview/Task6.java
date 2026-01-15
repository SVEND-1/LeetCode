package org.example.interview;

import java.util.List;

public class Task6 {
    //Поиск максимального элемента в массиве:
    //   – Задание: Напишите метод, который находит максимальный элемент в массиве целых чисел.
    public static void main(String[] args) {
        maxNum(List.of(1,5,3,5,6,12,6));
        System.out.println(maxStream(List.of(1,5,3,5,6,12,6)));
    }

    private static int maxNum(List<Integer> list){
        int max = -1;
        for (int el : list) {
            if(max < el) max = el;
        }
        System.out.println(max);
        return max;
    }

    private static int maxStream(List<Integer> list){
        return list
                .stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Список не должен быть пустым"));
    }
}
