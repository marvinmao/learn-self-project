package com.llnqdx.demo.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 * User: maofujiang
 * Date: 2018/10/15
 */
public class AppleFilterDemo {

    //泛型数据
    static List<Apple> inventory = Arrays.asList(
            new Apple("green", 50),
            new Apple("green", 100),
            new Apple("red", 150)
    );

    private static List<Apple> filterColorApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterWeightApples(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean isColor) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (isColor) {
                if (color.equals(apple.getColor())) {
                    result.add(apple);
                }
            } else {
                if (apple.getWeight() > weight) {
                    result.add(apple);
                }
            }
        }
        return result;
    }

    /**
     * strange 修改关闭，扩展开放
     * 泛型
     */
//    private static<T> List<T> filterStrangeApples(List<T> inventory, ApplePredicate<T> strange) {
//        List<T> result = new ArrayList<>();
//        for (T t : inventory) {
//            if (strange.test(t)) {
//                result.add(t);
//            }
//        }
//        return result;
//    }
    private static<T> List<T> filterStrangeApples(List<T> inventory, Predicate<T> strange) {
        List<T> result = new ArrayList<>();
        for (T t : inventory) {
            if (strange.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> colorApples = filterColorApples(inventory, "green");
        System.out.println("colorApples[" + colorApples + "]");

        List<Apple> weightApples = filterWeightApples(inventory, 100);
        System.out.println("weightApples[" + weightApples + "]");

        List<Apple> filterApples = filterApples(inventory, "green", 80, false);
        System.out.println("filterApples[" + filterApples + "]");

//        System.out.println("filterStrangeApples[" + filterStrangeApples(inventory, ApplePredicate) + "]");

//        List<Apple> apples = filterStrangeApples(inventory, new ApplePredicate<Apple>() {
//            public boolean check(Apple apple) {
//                return apple.getWeight() > 80;
//            }
//        });
//        System.out.println("filterStrangeApples[" + apples + "]");

        //lamda表达式
//        List<Apple> lamdaApples = filterStrangeApples(inventory, (Apple apple) -> {
//            return apple.getWeight() > 80;
//        });
        List<Apple> lamdaApples = filterStrangeApples(inventory, apple -> apple.getWeight() > 80);
        System.out.println("lamdaApples[" + lamdaApples + "]");


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 执行了");
            }
        }).start();

        //lamda表达式
        new Thread(()->{
            System.out.println("Thread 改造后 执行了");
        }).start();
    }
}
