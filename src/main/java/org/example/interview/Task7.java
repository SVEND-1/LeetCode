package org.example.interview;


import java.util.Arrays;
import java.util.Collection;

public class Task7 {
    //Слияние двух отсортированных массивов:
    //   – Задание: Реализуйте метод, который сливает два отсортированных массива в один отсортированный массив.
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Слитый отсортированный массив: " + Arrays.toString(mergedArray));
        System.out.println("das das " + Arrays.toString(mergeSortedArraysStream(array1,array2)));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
    public static int[] mergeSortedArraysStream(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return Arrays.stream(mergedArray).sorted().toArray();
    }

}
