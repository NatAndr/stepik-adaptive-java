package com.andrianovan.training.stepic.adaptivejava.reversing;

import java.util.Scanner;

/**
 * Created by natal on 03-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.next());
        System.out.println(sb.reverse());
    }
}
