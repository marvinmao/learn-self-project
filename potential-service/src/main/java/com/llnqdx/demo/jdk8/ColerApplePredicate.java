package com.llnqdx.demo.jdk8;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/10/15
 */
public class ColerApplePredicate implements ApplePredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }

}
