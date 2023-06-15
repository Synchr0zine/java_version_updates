package com.synchrozine;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(300, Color.GREEN));
        apples.add(new Apple(100, Color.RED));
        apples.add(new Apple(200, Color.GREEN));
        apples.add(new Apple(50, Color.RED));

        List<Apple> heavyApples = filterApples(apples, new AppleHeavyPredicate());
        System.out.println(heavyApples);
        List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());
        System.out.println(greenApples);

        ApplePredicate weightApple = apple -> apple.getWeight() > 200;
        filterApples(apples, weightApple);
        ApplePredicate colorApple = apple -> apple.getColor().equals(Color.GREEN);
        filterApples(apples, colorApple);


    }

    private static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
