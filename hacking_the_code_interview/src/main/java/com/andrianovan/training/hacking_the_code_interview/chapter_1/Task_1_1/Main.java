package com.andrianovan.training.hacking_the_code_interview.chapter_1.Task_1_1;

/**
 * Created by natal on 28-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "qwerty";
        System.out.println(String.format("%s %s", s1, isUniqueSymbols2(s1)));
        String s2 = "abracatabra";
        System.out.println(String.format("%s %s", s2, isUniqueSymbols2(s2)));
    }

    public static boolean isUniqueSymbols(String s) {
        if (s.length() > 128) {
            return false;
        }
        boolean chars[] = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i);
            if (chars[code]) return false;
            chars[code] = true;
        }
        return true;
    }

    public static boolean isUniqueSymbols2(String s) {
        if (s.length() > 128) {
            return false;
        }
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            int code = s.charAt(i) - 'a';
            if ((flag & (1 << code)) > 0) return false;
            flag |= 1 << code;
        }
        return true;
    }
}
