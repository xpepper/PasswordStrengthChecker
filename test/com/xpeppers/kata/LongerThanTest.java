package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xpeppers.kata.LongerThan;

public class LongerThanTest {

    @Test
    public void long_enough_password() {
        assertTrue(new LongerThan(1).isSatisfiedOn("12"));
    }

    @Test
    public void too_short_password() {
        assertFalse(new LongerThan(1).isSatisfiedOn("1"));
    }

}
