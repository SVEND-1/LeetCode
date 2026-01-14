package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {

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
