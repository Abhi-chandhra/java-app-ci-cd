package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void additionShouldBeCorrect() {
        MathUtils mathUtils = new MathUtils();
        int expected = 5;
        int actual = mathUtils.add(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void additionOfNegativesShouldWork() {
        MathUtils mathUtils = new MathUtils();
        int expected = -5;
        int actual = mathUtils.add(-2, -3);
        assertEquals(expected, actual);
    }

    @Test
    public void additionWithZeroShouldWork() {
        MathUtils mathUtils = new MathUtils();
        int expected = 7;
        int actual = mathUtils.add(0, 7);
        assertEquals(expected, actual);
    }
}

