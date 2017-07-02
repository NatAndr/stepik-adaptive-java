package com.andrianovan.training.hacking_the_code_interview.chapter_1.Task_1_3;

/**
 * Created by natal on 28-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        char[] s = new char[]{'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        replaceSpaces(s, 13);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void replaceSpaces(char[] s, int lettersCount) {
        int index = s.length - 1;
        for (int i = lettersCount - 1; i >= 0; i--) {
                if (s[i] == ' ') {
                    s[index] = '0';
                    s[index - 1] = '2';
                    s[index - 2] = '%';
                    index -= 3;
                } else {
                    s[index] = s[i];
                    index--;
                }
        }
    }
}
