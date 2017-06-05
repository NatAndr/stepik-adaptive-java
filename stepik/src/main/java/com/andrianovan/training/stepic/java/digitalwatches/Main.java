package com.andrianovan.training.stepic.java.digitalwatches;

import java.util.Scanner;

/**
 * Created by natal on 05-Jun-17.
 */
public class Main {

    private static final int SEC_IN_MIN = 60;
    private static final int MIN_IN_HOUR = 60;
    private static final int SEC_IN_HOUR = 60 * 60;
    private static final int HOUR_IN_DAY = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int hours = N / SEC_IN_HOUR;
        int mins = (N - hours * SEC_IN_HOUR) / SEC_IN_MIN;
        int secs = N - hours * SEC_IN_HOUR - mins * SEC_IN_MIN;

        System.out.println(String.format("%s:%02d:%02d", hours % HOUR_IN_DAY, mins, secs));
    }
}
