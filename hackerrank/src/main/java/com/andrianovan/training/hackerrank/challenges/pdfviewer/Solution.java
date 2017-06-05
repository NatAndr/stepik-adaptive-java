package com.andrianovan.training.hackerrank.challenges.pdfviewer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by natal on 23-May-17.
 */
public class Solution {
    public static void main(String[] args) {
        String al = "abcdefghijklmnopqrstuvwxyz";
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        Map<Character, Integer> map = new HashMap<>(26);
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
            map.put(al.charAt(h_i), h[h_i]);
        }
        String word = in.next();

        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            if (max < map.get(word.charAt(i))) {
                max = map.get(word.charAt(i));
            }
        }
        int result = word.length() * max;
        System.out.println(result);
    }

}
