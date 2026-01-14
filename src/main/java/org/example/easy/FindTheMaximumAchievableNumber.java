package org.example.easy;

public class FindTheMaximumAchievableNumber {

    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(3,2));
    }

    public static int theMaximumAchievableX(int num, int t) {
        int x = 0;
        x += num + t;
        x += t;
        return x;
    }
}
