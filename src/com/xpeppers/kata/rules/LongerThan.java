package com.xpeppers.kata.rules;

public class LongerThan implements IRule {
    private int size;

    public LongerThan(int size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfiedOn(String password) {
        return password.length() > size;
    }

    @Override
    public String getFailedReasonMessage() {
        return "Your password is to short";
    }
}