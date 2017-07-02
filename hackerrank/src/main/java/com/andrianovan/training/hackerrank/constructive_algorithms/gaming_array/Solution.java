package com.andrianovan.training.hackerrank.constructive_algorithms.gaming_array;

import java.util.Scanner;

/**
 * Created by natal on 07-Jun-17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            int count = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int number = in.nextInt();
                if (max < number) {
                    max = number;
                    count++;
                }
            }
            System.out.println(count % 2 == 0 ? "ANDY" : "BOB");
        }
    }
}
