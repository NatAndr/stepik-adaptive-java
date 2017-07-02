package com.andrianovan.training.hacking_the_code_interview.chapter_1.Task_1_2;

/**
 * Created by natal on 28-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "success";
        String s2 = "scucses";
        System.out.println(String.format("%s is permutation of %s %s", s1, s2, isAnagram(s1, s2)));

        String s3 = "good";
        String s4 = "gogd";
        System.out.println(String.format("%s is permutation of %s %s", s3, s4, isAnagram(s3, s4)));

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();

        int[] counts = new int[26];

        for (int i = 0; i < ar1.length; i++) {
            counts[ar1[i] - 97]++;
            counts[ar2[i] - 97]--;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
