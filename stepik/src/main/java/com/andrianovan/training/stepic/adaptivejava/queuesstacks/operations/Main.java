package com.andrianovan.training.stepic.adaptivejava.queuesstacks.operations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by natal on 06-Jun-17.
 */
public class Main {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));

        //write your code here
        queue.add(5);
        queue.poll();
        queue.poll();

        System.out.println(queue);

    }
}
