package org.example.testing;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(a + Math.max(0, d - b) * c);
    }
}
