package org.example.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {//Оптимизировать
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = l; i < r + 1; i++) {
            list.add(i);
        }

        int maxDigits = 0;
        for (int i = 0; i < list.size(); i++) {
            String str =String.valueOf(list.get(i));
            if(maxDigits < str.length()){
                maxDigits = str.length();
            }
        }
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            lists.add(new ArrayList<>());
        }

        for (int i = 0; i < list.size(); i++) {
            String str = String.valueOf(list.get(i));
            int len = str.length();
            for (int j = 0; j < len; j++) {
                int d = Character.getNumericValue(str.charAt(len - j - 1));
                lists.get(i).add(d);
            }
        }

        System.out.println(countReplay(lists));
    }

    private static int countReplay(List<List<Integer>> list){//Можно ещё сделать легче взял 1 элемент массива и сверять с ним
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> currentList = list.get(i);
            if(currentList.size() == 1) {
                answer++;
                continue;
            }

            if(check(currentList)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean check(List<Integer> currentList){
        for (int j = 0; j < currentList.size() - 1; j++) {
            if(!currentList.get(j).equals(currentList.get(j + 1))){
                return false;
            }
        }
        return true;
    }
}
