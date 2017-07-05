package com.andrianovan.training.stepic.adaptivejava.partitioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by natal on 03-Jul-17.
 */
public class Main {
    public static void main(String[] args) {
        String[] words = {"abc", "abba", "mama", "try"};
        Map<Boolean, List<String>> palindromeOrNoMap =
                Arrays.stream(words)
                        .collect(Collectors.partitioningBy(i -> i.equals(new StringBuilder(i).reverse().toString())));

        System.out.println(palindromeOrNoMap);
    }
}
