package com.xpeppers.kata;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class PasswordStrengthChecker {

    private List<Rule> rules;
    private static List<Rule> BASIC_RULES = asList(
            new ContainsDigits(),
            new ContainsAlphabeticChars(),
            new LongerThan(7),
            new ContainsUpperCaseChars());

    public static PasswordStrengthChecker basic() {
        return build(false);
    }

    public static PasswordStrengthChecker forAdmin() {
        return build(true);
    }

    public PasswordStrengthChecker(List<Rule> rules) {
        this.rules = new ArrayList<Rule>(rules);
    }

    public boolean isAcceptable(String password) {
        return rules.stream().allMatch(rule -> rule.isSatisfiedOn(password));
    }

    private static PasswordStrengthChecker build(boolean isAdmin) {
        List<Rule> rules = new ArrayList<Rule>(BASIC_RULES);
        if (isAdmin) {
            rules.addAll(asList(new LongerThan(10), new ContainsSpecialChars()));
        }
        return new PasswordStrengthChecker(rules);
    }

}
