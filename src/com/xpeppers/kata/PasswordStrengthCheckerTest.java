package com.xpeppers.kata;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PasswordStrengthCheckerTest {

    @Test
    public void with_no_rules_every_password_will_be_fine() {
        PasswordStrengthChecker checker = new PasswordStrengthChecker(new ArrayList<Rule>());
        assertTrue(checker.isAcceptable("everything_will_be_just_fine"));
    }

    @Test
    public void with_always_failing_rule_every_password_will_be_rejected() {
        PasswordStrengthChecker checker = new PasswordStrengthChecker(asList(string -> false));
        assertFalse(checker.isAcceptable("everything_will_be_rejected"));
    }

    @Test
    public void with_always_failing_rule_every_password_will_be_fine() {
        PasswordStrengthChecker checker = new PasswordStrengthChecker(asList(string -> true));
        assertTrue(checker.isAcceptable("everything_will_be_fine"));
    }

    @Test
    public void rule_is_evaluated() throws Exception {
        SpyRule rule = new SpyRule();
        PasswordStrengthChecker checker = new PasswordStrengthChecker(asList(rule));
        assertFalse(rule.hasBeenCalled);
        checker.isAcceptable("anything");
        assertTrue(rule.hasBeenCalled);
    }

    private final class SpyRule implements Rule {
        public boolean hasBeenCalled = false;

        @Override
        public boolean isSatisfiedOn(String string) {
            this.hasBeenCalled = true;
            return true;
        }
    }


}
