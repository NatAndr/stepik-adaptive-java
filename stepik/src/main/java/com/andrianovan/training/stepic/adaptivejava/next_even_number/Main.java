package com.andrianovan.training.stepic.adaptivejava.next_even_number;

import java.util.Scanner;

/**
 * Created by natal on 03-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        i++;
        while (i % 2 != 0) {
            i++;
        }
        System.out.println(i);
    }
}
