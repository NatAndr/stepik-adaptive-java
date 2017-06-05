package java.com.andrianovan.training.hackerrank.challenges.catsandmouse;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by natal on 23-May-17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if (abs(x - z) < abs(y - z)) {
                System.out.println("Cat A");
            } else {
                if (abs(x - z) > abs(y - z)) {
                    System.out.println("Cat B");

                } else {
                    System.out.println("Mouse C");
                }
            }
        }
    }
}
