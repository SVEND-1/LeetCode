package org.example.testing;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int even = 0;
        int notEven = 0;

        int evenIndex = -1;
        int notEvenIndex = -1;

        for (int i = 0; i < n; i++) {//в нечетной позиции должны быть нечетный рост
            boolean isEvenPosition = (i % 2 == 1);
            boolean isEvenHeight = (heights[i] % 2 == 0);

            if (isEvenPosition) {
                if (!isEvenHeight) {
                    notEven++;
                    if (notEvenIndex == -1) {
                        notEvenIndex = i;
                    }
                }
            } else {
                if (isEvenHeight) {
                    even++;
                    if (evenIndex == -1) {
                        evenIndex = i;
                    }
                }
            }

            if (even > 1 || notEven > 1) {
                System.out.println("-1 -1");
                return;
            }
        }

        if (even == 1 && notEven == 1) {
            System.out.println((evenIndex + 1) + " " + (notEvenIndex + 1));
        } else {
            System.out.println("-1 -1");
        }
    }
}
