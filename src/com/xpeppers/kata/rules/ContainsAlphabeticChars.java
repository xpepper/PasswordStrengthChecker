package com.xpeppers.kata.rules;

import static com.xpeppers.kata.Predicates.isLowerCase;
import static com.xpeppers.kata.Predicates.isUpperCase;

public class ContainsAlphabeticCharsRule implements IRule {
    @Override
    public boolean isSatisfiedOn(String password) {
        return password.chars().anyMatch(isUpperCase().or(isLowerCase()));
    }

    @Override
    public String getFailedReasonMessage() {
        return "Your password contains no alphabetic letters";
    }
}