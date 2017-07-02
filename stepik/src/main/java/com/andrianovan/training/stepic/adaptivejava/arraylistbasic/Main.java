package com.andrianovan.training.stepic.adaptivejava.arraylistbasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by natal on 01-Jun-17.
 */
public class Main {

    public static void main(String[] args) {

    }

    static List<String> changeList(List<String> list){
        //paste your code here
        String max = Collections.max(list, (s1, s2) -> s1.length() - s2.length());
        list.replaceAll(x -> max);
        Iterator<String> iterator = list.iterator();

        return list;
    }
}
