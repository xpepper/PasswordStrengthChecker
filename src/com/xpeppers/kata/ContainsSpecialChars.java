package com.xpeppers.kata;
import java.util.function.IntPredicate;

final class ContainsSpecialChars implements Rule {
    @Override
    public boolean isSatisfiedOn(String string) {
        return string.chars().anyMatch(new IsSpecialChar());
    }

    private final class IsSpecialChar implements IntPredicate {
        @Override
        public boolean test(int asciiValue) {
            return (asciiValue >= 33 && asciiValue <= 47) ||
                    (asciiValue >= 58 && asciiValue <= 64) ||
                    (asciiValue >= 91 && asciiValue <= 96) ||
                    (asciiValue >= 123 && asciiValue <= 126);
        }
    }
}