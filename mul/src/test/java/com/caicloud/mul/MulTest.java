package com.caicloud.mul;

import org.junit.Test;

import static org.junit.Assert.*;

public class MulTest {

    @Test
    public void mul() {
        Mul m = new Mul();
        assertEquals(4, m.mul(2, 2));
    }
}