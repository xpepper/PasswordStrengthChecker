package com.xpeppers.kata;

public class ContainsUpperCaseChars implements Rule {

    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(new IsUpperCase());
    }
}
