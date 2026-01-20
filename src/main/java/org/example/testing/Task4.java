package org.example.testing;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {//Оптимизировать
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        // максимум массивов которых надо будет создать
        int maxDigits = 0;
        for (int number : list) {
            int digits = String.valueOf(number).length();
            if (digits > maxDigits) {
                maxDigits = digits;
            }
        }

        // создания этих массивов
        List<List<Integer>> placeLists = getPlaceLists(maxDigits,n,list);
        int answer = 0;
        for (int i = 0; i < k;) {
            int index = placeLists.size() - 1 - (i % placeLists.size());
            List<Integer> currentList = placeLists.get(index);
            int min = Collections.min(currentList);

            for (int j = 0; j < n; j++) {
                if (currentList.get(j) == min) {
                    int test = 10 * index;
                    answer += (9 - currentList.get(j)) * (test == 0 ? 1 : test);
                    currentList.set(j, 9);
                    i++;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    //Будет создавать массивы и возвращать их
    public static List<List<Integer>> getPlaceLists(int maxDigits,int n, int[] list){
        List<List<Integer>> placeLists = new ArrayList<>();
        for (int place = 0; place < maxDigits; place++) {
            placeLists.add(new ArrayList<>());
        }

        // заполнения моих массивов чтобы потом я смог сперва изменять значения от самых больших чисел

        for (int i = 0;i < n;i++){
            int numbers = list[i];
            String str = String.valueOf(numbers);
            int len = str.length();

            for(int j = 0;j < len;j++){
                int digit = Character.getNumericValue(str.charAt(len - 1 - j));
                placeLists.get(j).add(digit);
            }
        }

        return placeLists;
    }
}
