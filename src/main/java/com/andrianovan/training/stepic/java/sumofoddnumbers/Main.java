package com.andrianovan.training.stepic.java.sumofoddnumbers;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * Created by natal on 01-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOfOddNumbersInRange(scanner.nextLong(), scanner.nextLong()));
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        // write your code here
        return LongStream
                .rangeClosed(start, end)
                .filter(n -> n % 2 != 0)
                .sum();
    }
}