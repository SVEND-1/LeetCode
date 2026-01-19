package org.example.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        System.out.println(a + Math.max(0, d - b) * c);
//    }

//    public static void main(String[] args) {TODO Подумать

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int answer = 0;
//        if(n == 1){
//            answer = 0;
//        }else {
//            int count = 1;
//            while (count < n) {
//                count *= 2;
//                answer++;
//            }
//        }
//        System.out.println("Количество разрезов: " + answer);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int t = sc.nextInt();
//        int[] floors = new int[n];
//        for (int i = 0; i < n; i++) {
//            floors[i] = sc.nextInt();
//        }
//        int k = sc.nextInt() - 1;//-1 чтобы индекс найти
//
//        System.out.println(calculate(n,t,floors,k));
//    }
//
//    private static int calculate(int n, int t, int[] floors, int k) {
//        int leaveEmployee = floors[k];
//        int minFloor = floors[0];
//        int maxFloor = floors[n - 1];
//
//        if (t >= (leaveEmployee - minFloor) &&
//                t >= (maxFloor - leaveEmployee)) {
//            return maxFloor - minFloor;
//        }
//
//        int answer1 = 9999999;//Чтобы точно не был коротким путем по умолчанию
//        if (t >= (leaveEmployee - minFloor)) {
//            answer1 = maxFloor - minFloor;
//        }
//
//        int answer2 = 9999999;
//        if (t >= (maxFloor - leaveEmployee)) {
//            answer2 = maxFloor - minFloor;
//        }
//
//        int answer3;//тут так и так будет какое то значение
//        if (leaveEmployee - minFloor <= maxFloor - leaveEmployee) {
//            answer3 = (leaveEmployee - minFloor) + (maxFloor - minFloor);
//        } else {
//            answer3 = (maxFloor - leaveEmployee) + (maxFloor - minFloor);
//        }
//
//        return Math.min(Math.min(answer1, answer2), answer3);
//    }
}
