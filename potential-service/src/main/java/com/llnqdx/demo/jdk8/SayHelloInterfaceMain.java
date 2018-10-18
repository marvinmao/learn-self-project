package com.llnqdx.demo.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/10/18
 */
public class SayHelloInterfaceMain {

    public static void main(String[] args) {
//        SayHelloInterface sayHelloInterface = new SayHelloInterface() {
//            @Override
//            public void sayHello(String message) {
//                System.out.println("message[" + message + "]");
//            }
//        };
        SayHelloInterface sayHelloInterface = (message -> System.out.println("message[" + message + "]"));
        sayHelloInterface.sayHello("hello");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        });

        new Thread(() -> System.out.println("bbb"));

    }
}
