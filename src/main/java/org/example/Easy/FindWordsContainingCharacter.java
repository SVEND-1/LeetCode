package org.example.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = new String[]{"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(words,'a'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }
        return result;
    }
}
