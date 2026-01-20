package org.example.testing;

import java.util.*;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] list = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            list[a[i]]++;
        }

        List<Integer> zeroList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (list[i] == 0) {
                zeroList.add(i);
            }
        }

        if (zeroList.size() != 1) {
            System.out.println("-1 -1");
            return;
        }

        int zeroVertex = zeroList.get(0);

        int twoVertex = -1;
        for (int i = 1; i <= n; i++) {
            if (list[i] == 2) {
                twoVertex = i;
                break;
            }
        }

        if (twoVertex == -1) {
            System.out.println("-1 -1");
            return;
        }

        List<Integer> pointingToTwo = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (a[i] == twoVertex) {
                pointingToTwo.add(i);
            }
        }

        boolean found = false;
        int changeFrom = -1;
        int changeTo = zeroVertex;

        for (int candidate : pointingToTwo) {
            int[] testA = a.clone();
            testA[candidate] = zeroVertex;

            if (isOneCycle(testA, n)) {
                changeFrom = candidate;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(changeFrom + " " + changeTo);
        } else {
            System.out.println(-1);
        }
    }

    static boolean isOneCycle(int[] a, int n) {
        boolean[] visited = new boolean[n + 1];
        int start = 1;
        int cur = start;
        int count = 0;

        while (!visited[cur]) {
            visited[cur] = true;
            cur = a[cur];
            count++;
        }

        if (count == n && cur == start) {
            return true;
        }
        return false;
    }

}
