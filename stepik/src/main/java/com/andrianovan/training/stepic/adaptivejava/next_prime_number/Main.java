package com.andrianovan.training.stepic.adaptivejava.next_prime_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by natal on 03-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();
        System.out.println(nextPrime(i));
    }

    static long nextPrime(long n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }
}
