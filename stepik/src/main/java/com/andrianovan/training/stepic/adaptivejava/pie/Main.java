package com.andrianovan.training.stepic.adaptivejava.pie;

import java.util.Scanner;

/**
 * Created by natal on 08-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(getLeastCommonMultiple(a, b));
    }

    private static int getLeastCommonMultiple(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b) {
                for (int i = 1; i <= b; i++) {
                    if (i * a % b == 0) {
                        return i * a;
                    }
                }
            } else {
                for (int i = 1; i <= a; i++) {
                    if (i * b % a == 0) {
                        return i * b;
                    }
                }
            }
        }
        return 0;
    }
}
