package com.andrianovan.training.hackerrank.challenges.candles;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        int count = 1;
        int max = height[0];
        for(int i=1; i< height.length; i++) {
            int current = height[i];
            if (current > max) {
                count = 0;
                max = current;
            }
            if (current == max) {
                count++;
            }
        }

        System.out.println(count);
    }
}

