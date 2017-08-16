package com.workshop;

public class QuadraticJ {
    public static double[] square(double a, double b, double c) {
        double squareUrav[];
        double d;

        d = b * b - 4 * a * c;

        if (d > 0) {
            squareUrav = new double[2];
            squareUrav[0] = (-b - Math.sqrt(d)) / (2 * a);
            squareUrav[1] = (-b + Math.sqrt(d)) / (2 * a);
            return squareUrav;

        } else if (d == 0) {
            squareUrav = new double[1];
            squareUrav[0] = -b / (2 * a);
            return squareUrav;

        } else {
            squareUrav = new double[0];
            return squareUrav;

        }
    }
}

