package com.xpeppers.kata.rules;

public interface IRule {

    boolean isSatisfiedOn(String password);

    String getFailedReasonMessage();

}
