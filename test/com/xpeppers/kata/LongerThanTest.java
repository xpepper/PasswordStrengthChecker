package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xpeppers.kata.LongerThan;

public class LongerThanTest {

    @Test
    public void test() {
        assertTrue(new LongerThan(1).isSatisfiedOn("12"));
        assertFalse(new LongerThan(1).isSatisfiedOn("1"));
    }

}
