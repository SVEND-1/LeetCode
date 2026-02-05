package org.example.easy;

import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        int len = strX.length();

        int left = 0;
        int right = len - 1;

        while (left <= right){
            if(strX.charAt(left) != strX.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}
