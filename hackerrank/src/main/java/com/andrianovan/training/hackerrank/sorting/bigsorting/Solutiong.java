package java.com.andrianovan.training.hackerrank.sorting.bigsorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by natal on 05-Jun-17.
 */
public class Solutiong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        Arrays.sort(unsorted, Solutiong::compareStrings);
        StringBuilder sb = new StringBuilder();
        for (String s : unsorted) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int compareStrings(String s1, String s2) {
        if (s1.length() > s2.length()) return 1;
        if (s1.length() < s2.length()) return -1;
        for (int i = 0; i < s1.length(); i++) {
            if (((int) s1.charAt(i)) > ((int) s2.charAt(i))) return 1;
            if (((int) s1.charAt(i)) < ((int) s2.charAt(i))) return -1;
        }
        return 0;
    }
}
