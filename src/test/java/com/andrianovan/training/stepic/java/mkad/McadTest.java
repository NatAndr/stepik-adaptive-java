package com.andrianovan.training.stepic.java.mkad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by natal on 31-May-17.
 */
@RunWith(Parameterized.class)
public class McadTest {

    private int v;
    private int t;
    private int result;

    public McadTest(int v, int t, int result) {
        this.v = v;
        this.t = t;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(
                new Object[][] {
                        {60, 2, 11},
                        {109, 1, 0},
                        {109, 2, 0},
                        {-1, 1, 108},
                        {-110, 1, 108},
                        {-109, 2, 0}
                }
        );
    }

    @Test
    public void test() {
        Main main = new Main();
        assertEquals(result, main.getMark(v, t));
    }
}
