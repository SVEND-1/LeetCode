package org.example.interview;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    //Сортировка массива:
    //   – Задание: Реализуйте алгоритм сортировки (например, сортировку пузырьком или выбором) для сортировки массива целых чисел.
    public static void main(String[] args) {//On^2
        List<Integer> list = List.of(1,15,4,5,6,4,16);
        List<Integer> sort = new ArrayList<>(list);
        showArray(bubbleSort(sort));
    }

    private static List<Integer> bubbleSort(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        return list;
    }

    private static void showArray(List<Integer> list){
        list.stream().forEach(System.out::println);
    }
}
