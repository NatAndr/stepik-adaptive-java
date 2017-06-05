package com.andrianovan.training.stepic.java.Snail;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
        int days = 0;
        while (sum < h) {
            sum += a;
            days++;
            if (sum >= h) {
                break;
            }
            sum -= b;
        }
        System.out.println(days);
    }
}
