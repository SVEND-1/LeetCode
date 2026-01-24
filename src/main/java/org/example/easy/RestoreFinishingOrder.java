package org.example.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(friends).forEach(el -> set.add(el));
        int[] answer = new int[friends.length];
        int j = 0;
        for(int i = 0;i < order.length;i++){
            if(set.contains(order[i])){
                answer[j] = order[i];
                j++;
            }
        }
        return answer;
    }
}
