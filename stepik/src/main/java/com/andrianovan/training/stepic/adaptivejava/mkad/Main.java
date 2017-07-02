package com.andrianovan.training.stepic.adaptivejava.mkad;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by natal on 31-May-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int t = in.nextInt();
        int mark = new Main().getMark(v, t);
        System.out.println(mark);
    }

    public int getMark(int v, int t) {
        int res = (v > 0) ? v * t % 109 : (109 - abs(v * t % 109));
        return res % 109 == 0 ? 0 : res;
    }
}
