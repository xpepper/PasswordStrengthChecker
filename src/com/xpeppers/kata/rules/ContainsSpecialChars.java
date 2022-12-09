package com.xpeppers.kata.rules;
import java.util.function.IntPredicate;

public class ContainsSpecialChars implements IRule {
    @Override
    public boolean isSatisfiedOn(String password) {
        return password.chars().anyMatch(new IsSpecialChar());
    } 

    @Override
    public String getFailedReasonMessage() {
        return "Your password contains no special characters";
    } 
}