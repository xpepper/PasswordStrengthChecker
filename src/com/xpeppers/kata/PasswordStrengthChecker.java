package com.xpeppers.kata;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class PasswordStrengthChecker {
    
    private static final List<Rule> BASIC_RULES = asList(
            new ContainsDigits(),
            new ContainsAlphabeticChars(),
            new LongerThan(7),
            new ContainsUpperCaseChars());
    private static final List<Rule> ADMIN_RULES = asList(
            new LongerThan(10),
            new ContainsSpecialChars());
    private List<Rule> rules;

    public PasswordStrengthChecker(List<Rule> rules) {
        this.rules = new ArrayList<Rule>(rules);
    }
    public static PasswordStrengthChecker createForBasicPassword() {
        return buildPasswordStrengthChecker(false);
    }

    public static PasswordStrengthChecker createForAdminPassword() {
        return buildPasswordStrengthChecker(true);
    }

    private static PasswordStrengthChecker buildPasswordStrengthChecker(boolean isAdmin) {
        List<Rule> allRules = new ArrayList<Rule>(BASIC_RULES);
        if (isAdmin) {
            allRules.addAll(ADMIN_RULES);
        }
        return new PasswordStrengthChecker(allRules);
    }

    public boolean accepts(String password) {
        return rules.stream().allMatch(rule -> {
            if (!rule.isSatisfiedOn(password)) {
                System.out.println(rule.getFailedReasonMessage());
                return false;
            }
                return true;            
            });
    }

}
