package com.llnqdx.demo.jdk8;

import java.util.function.Consumer;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/10/16
 */
public class ConsumerMain {

    public static void main(String[] args) {
        String xm = "mic";
//        validate(xm, (String name) -> System.out.println(name.isEmpty() ? "name is not empty" : name));
        validate(xm, name -> System.out.println(name.isEmpty() ? "name is not empty" : name));
    }

    private static void validate(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }
}