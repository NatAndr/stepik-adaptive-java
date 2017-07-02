package com.andrianovan.training.stepic.adaptivejava.writing_closures;

/**
 * Created by natal on 08-Jun-17.
 */
public class Main {

    public static void main(String[] args) {

    }

    NumericFunc descr = (a, b, c) -> {
        double result = 0.d;
        double d = b * b - 4.0 * a * c;
        if (d == 0) {
            d = -b / 2.0*a;
        }
        return result;
    };
}
