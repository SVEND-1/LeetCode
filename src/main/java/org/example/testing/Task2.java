package org.example.testing;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        if(n == 1){
            answer = 0;
        }else {
            int count = 1;
            while (count < n) {
                count *= 2;
                answer++;
            }
        }
        System.out.println("Количество разрезов: " + answer);
    }
}
