package org.example.testing;

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double x0 = sc.nextDouble(), y0 = sc.nextDouble();
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();

        double ax = (x1 - x0) / w;
        double bx = (x3 - x0) / h;
        double ay = (y1 - y0) / w;
        double by = (y3 - y0) / h;

        double A = 1 - ax;
        double B = -bx;
        double C = -ay;
        double D = 1 - by;

        double det = A * D - B * C;

        double u = (x0 * D - B * y0) / det;
        double v = (A * y0 - C * x0) / det;

        System.out.printf(Locale.US, "%.10f %.10f\n", u, v);
    }
}
