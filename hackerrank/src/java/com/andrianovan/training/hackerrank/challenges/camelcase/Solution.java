package java.com.andrianovan.training.hackerrank.challenges.camelcase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(countWords(s));
    }

    public static long countWords(String str) {
        return str.split("(?=[A-Z])").length;
    }
}