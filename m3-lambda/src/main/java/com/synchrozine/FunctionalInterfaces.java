package com.synchrozine;

import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return false;
            }
        };

        ////////////////////PREDICATE//////////////////////

        Predicate<Integer> lesserThan = i -> i < 18;

        System.out.println(lesserThan.test(20));

        ////////////////////CONSUMER///////////////////////

        Consumer<Integer> display = i -> System.out.println();
        display.accept(10);

        ////////////////////BI-CONSUMER///////////////////////

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(10, 12);

        ////////////////////FUNCTION///////////////////////

        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Baturay"));

        ////////////////////BI-FUNCTION///////////////////////

        BiFunction<Integer, Integer, Integer> func = (a, b) -> a * b;
        System.out.println(func.apply(3, 4));

        ////////////////////SUPPLIER///////////////////////

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
