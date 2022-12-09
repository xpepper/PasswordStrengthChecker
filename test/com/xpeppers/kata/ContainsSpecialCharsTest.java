package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsSpecialCharsTest {

    @Test
    public void password_with_special_character() {
        assertTrue(new ContainsSpecialChars().isSatisfiedOn("!"));
    }

    @Test
    public void password_without_special_character() {
        assertFalse(new ContainsSpecialChars().isSatisfiedOn("A"));
        assertFalse(new ContainsSpecialChars().isSatisfiedOn("1"));
    }
}
