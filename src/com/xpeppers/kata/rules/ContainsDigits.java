package com.xpeppers.kata.rules;
import java.util.function.IntPredicate;

final class ContainsDigits implements IRule {
    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(new IsDigit());
    }

    @Override
    public String getFailedReasonMessage() {
        return "Your password contains no numbers";
    }

}