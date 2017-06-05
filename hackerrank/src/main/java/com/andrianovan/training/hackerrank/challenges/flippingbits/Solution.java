package com.andrianovan.training.hackerrank.challenges.flippingbits;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            int x = in.nextInt();
            System.out.println(count(x));
        }
    }

    private static int count(int x) {
        int a = Integer.parseInt(String.valueOf(x), 2);
        a += 1;

        return Integer.parseInt(String.valueOf(a), 10);
    }
}