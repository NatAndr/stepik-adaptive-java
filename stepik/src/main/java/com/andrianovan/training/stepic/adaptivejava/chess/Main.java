package com.andrianovan.training.stepic.adaptivejava.chess;

import java.util.Scanner;

/**
 * Created by natal on 22-Jun-17.
 */

/**
 * You are given two coordinates on a chess board of the first queen and two of the second. Find out, whether two queens hit each other or not.
 * <p>
 * INPUT
 * Four integer numbers x1,y1,x2,y2x1,y1,x2,y2 are being typed.
 * <p>
 * OUTPUT
 * Type "YES" (uppercase) if they hit each other or "NO" if the don't.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println(new Main().checkIfHits(x1, x2, y1, y2));
    }

    public String checkIfHits(int x1, int x2, int y1, int y2) {
        if (x1 == x2 || y1 == y2 || x1 == y1 && x2 == y2 || x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) {
            return "YES";
        }
        return "NO";
    }
}
