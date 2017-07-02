package com.andrianovan.training.stepic.adaptivejava.leap;

import java.util.Scanner;

/**
 * Created by natal on 27-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "Leap" : "Regular");
    }
}
