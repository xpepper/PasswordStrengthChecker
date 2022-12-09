package com.xpeppers.kata.predicates;

public class IsDigit implements IntPredicate {
    @Override
    public boolean test(int asciiValue) {
        return asciiValue >= 48 && asciiValue <= 57;
    }
}