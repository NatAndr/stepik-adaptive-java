package com.andrianovan.training.stepic.java.prime;

import java.util.stream.LongStream;

/**
 * Created by natal on 01-Jun-17.
 */
public class Main {
    public static void main(String[] args) {



    }

    public static boolean isPrime(final long number) {
        // write your code here
        return LongStream.rangeClosed(2, (long)Math.sqrt(number))
        .allMatch(n -> number % n != 0);
    }
}
