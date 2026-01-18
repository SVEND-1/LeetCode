package org.example.interview;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    //– Напишите метод, который принимает строку и возвращает карту (Map), где ключом является символ, а значением — количество его вхождений в строку.
    public static void main(String[] args) {
        String task = "Тест Задания Кооторый БУДЕТ dddddddd";
        task(task);
    }
    private static Map<Character,Integer> task(String message){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < message.length(); i++) {
            Character current = message.charAt(i);
            if(map.containsKey(current)){
                map.put(message.charAt(i),map.get(current) + 1);
            }
            else {
                map.put(message.charAt(i),1);
            }
        }
        System.out.println(map);
        return map;
    }
}
