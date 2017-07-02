package com.andrianovan.training.stepic.adaptivejava.chess;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by natal on 22-Jun-17.
 */
@RunWith(Parameterized.class)
public class ChessTest {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String result;

    public ChessTest(int x1, int y1, int x2, int y2, String result) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(
                new Object[][]{
                        {1, 1, 3, 3, "YES"},
                        {3, 3, 1, 1, "YES"},
                        {7, 8, 5, 6, "YES"},
                        {2, 3, 2, 6, "YES"},
                        {8, 6, 3, 6, "YES"},
                        {2, 1, 4, 3, "YES"},
                        {7, 2, 5, 3, "NO"},
                        {2, 6, 1, 2, "NO"}
                }
        );
    }

    @Test
    public void name() throws Exception {
        Main main = new Main();
        assertEquals(result, main.checkIfHits(x1, x2, y1, y2));
    }
}
