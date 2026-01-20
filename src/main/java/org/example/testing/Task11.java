package org.example.testing;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int p = sc.nextInt();

        int totalProd = 1;
        for (int k = l; k <= r; k++) {
            totalProd = (totalProd * (k % p)) % p;
        }

        int invTotal = powMod(totalProd, p - 2, p);

        int n = r - l + 1;
        int[] suffixProd = new int[n + 1];
        suffixProd[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            int k = (l + i) % p;
            suffixProd[i] = (suffixProd[i + 1] * k) % p;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int prefProd = 1;
            if (i > 0) {
                prefProd = (totalProd * powMod(suffixProd[i], p - 2, p)) % p;
            }

            int invK = (prefProd * invTotal) % p;
            invK = (invK * suffixProd[i + 1]) % p;
            sum = (sum + invK) % p;
        }

        System.out.println(sum);
    }

    private static int powMod(int a, int b, int m) {
        int res = 1;
        a %= m;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }
}