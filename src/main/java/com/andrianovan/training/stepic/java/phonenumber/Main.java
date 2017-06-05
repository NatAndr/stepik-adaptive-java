package com.andrianovan.training.stepic.java.phonenumber;

import java.util.Scanner;

/**
 * Created by natal on 05-Jun-17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(new Main().isPhone(string));
    }

    public String isPhone(String str) {
        return str.matches("19[0-9]{9}") ? "Yes" : "No";
    }
}
