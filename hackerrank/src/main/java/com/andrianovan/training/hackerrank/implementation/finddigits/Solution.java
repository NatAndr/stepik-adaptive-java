package com.andrianovan.training.hackerrank.implementation.finddigits;

import java.util.Scanner;

/**
 * Created by natal on 07-Jun-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter(" ");
        int n = in.nextInt();
        int count = 0;
        String test = in.next();
        for (int i = 0; i < n; i++) {
            count = count(in.nextInt());
            System.out.println(count);
        }
    }

    public static int count(int number) {
        int count = 0;
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (!"0".equals(s) && number % Integer.valueOf(s) == 0) {
                count++;
            }
        }
        return count;
    }
}
