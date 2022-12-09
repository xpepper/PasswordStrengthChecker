package com.xpeppers.kata;

public class ContainsUpperCaseChars implements IRule {

    @Override
    public boolean isSatisfiedOn(String password) {
        return password.chars().anyMatch(new IsUpperCase());
    }

    @Override
    public String getFailedReasonMessage() {
        return "Your password has no uppercase letters";
    }
}
