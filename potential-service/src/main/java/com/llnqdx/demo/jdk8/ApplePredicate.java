package com.llnqdx.demo.jdk8;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/10/15
 */
@FunctionalInterface
public interface ApplePredicate<T> {

    boolean test(T t);
}
