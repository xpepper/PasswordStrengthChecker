package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDigitsTest {

    @Test
    public void password_with_digits() {
        assertTrue(new ContainsDigits().isSatisfiedOn("1"));
    }

    @Test
    public void password_without_digits() {
        assertFalse(new ContainsDigits().isSatisfiedOn("a"));
    }

}
