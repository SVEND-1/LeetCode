package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(i - 1 >= 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I'){
                res += 4;
                i--;
                continue;
            }
            if(i - 1 >= 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X'){
                res += 90;
                i--;
                continue;
            }
            if(i - 1 >= 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C'){
                res += 900;
                i--;
                continue;
            }
            if(i - 1 >= 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I'){
                res += 9;
                i--;
                continue;
            }
            if(i - 1 >= 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X'){
                res += 40;
                i--;
                continue;
            }
            if(i - 1 >= 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C'){
                res += 400;
                i--;
                continue;
            }
            switch (s.charAt(i)){
                case 'I' -> res += 1;
                case 'V' -> res += 5;
                case 'X' -> res += 10;
                case 'L' -> res += 50;
                case 'C' -> res += 100;
                case 'D' -> res += 500;
                case 'M' -> res += 1000;
            }
        }

        return res;
    }
}
