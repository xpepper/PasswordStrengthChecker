package com.xpeppers.kata.predicates;

import java.util.function.IntPredicate;

final class IsUpperCase implements IntPredicate {

    @Override
    public boolean test(int asciiValue) {
        return (asciiValue >= 65 && asciiValue <= 90);
    }
}