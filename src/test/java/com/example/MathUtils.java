package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        MathUtils math = new MathUtils();
        assertEquals(5, math.add(2, 3));
    }
}
