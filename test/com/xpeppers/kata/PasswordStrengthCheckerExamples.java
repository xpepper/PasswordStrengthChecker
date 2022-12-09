package com.xpeppers.kata;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordStrengthCheckerExamples {

    private PasswordStrengthChecker checker = PasswordStrengthChecker.createForBasicPassword();

    @Test
    public void at_least_one_uppercase_character() {
        assertTrue(checker.isAcceptable("1aaaaaaA"));
        assertFalse(checker.isAcceptable("1aaaaaaa"));
    }

    @Test
    public void longer_than_7_characters() {
        assertTrue(checker.isAcceptable("1234567A"));
        assertFalse(checker.isAcceptable(""));
        assertFalse(checker.isAcceptable("1234567"));
    }

    @Test
    public void at_least_one_alphabetic_character() {
        assertTrue(checker.isAcceptable("1234567A"));
        assertFalse(checker.isAcceptable("12345678"));
    }

    @Test
    public void at_least_one_digit() {
        assertTrue(checker.isAcceptable("AAAAAAA1"));
        assertFalse(checker.isAcceptable("AAAAAAAAAAAAAA"));
    }

    @Test
    public void longer_than_10_characters_for_admins() throws Exception {
        PasswordStrengthChecker checker = PasswordStrengthChecker.createForAdminPassword();
        assertTrue(checker.isAcceptable("123456789!A"));
        assertFalse(checker.isAcceptable("1234567A"));
    }

    @Test
    public void at_least_one_special_character_for_admins() throws Exception {
        PasswordStrengthChecker checker = PasswordStrengthChecker.createForAdminPassword();
        assertTrue(checker.isAcceptable("123456789A!"));
        assertFalse(checker.isAcceptable("1234567890A"));
    }
}
