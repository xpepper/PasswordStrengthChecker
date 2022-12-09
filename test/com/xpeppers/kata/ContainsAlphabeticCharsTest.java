package com.xpeppers.kata;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xpeppers.kata.ContainsAlphabeticChars;

public class ContainsAlphabeticCharsTest {

    @Test
    public void password_with_alphabetic_chars() {
        assertTrue(new ContainsAlphabeticChars().isSatisfiedOn("a"));
        assertTrue(new ContainsAlphabeticChars().isSatisfiedOn("A"));
    }

    @Test
    public void password_without_alphabetic_chars() {
        assertFalse(new ContainsAlphabeticChars().isSatisfiedOn("0"));
        assertFalse(new ContainsAlphabeticChars().isSatisfiedOn("!"));
    }

}
