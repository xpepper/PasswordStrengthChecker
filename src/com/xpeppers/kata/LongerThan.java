package com.xpeppers.kata;

final class LongerThan implements Rule {
    private int size;

    public LongerThan(int size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfiedOn(String string) {
        return string.length() > size;
    }
}