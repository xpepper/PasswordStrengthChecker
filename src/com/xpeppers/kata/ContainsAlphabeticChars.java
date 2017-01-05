package com.xpeppers.kata;

import static com.xpeppers.kata.Predicates.isLowerCase;
import static com.xpeppers.kata.Predicates.isUpperCase;

final class ContainsAlphabeticChars implements Rule {
    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(isUpperCase().or(isLowerCase()));
    }
}