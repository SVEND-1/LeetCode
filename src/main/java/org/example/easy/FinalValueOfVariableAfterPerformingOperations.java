package org.example.easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String str : operations) {
            if(str.equals("--X") || str.equals("X--")){
                X--;
            }
            else {
                X++;
            }
        }
        return X;
    }
}
