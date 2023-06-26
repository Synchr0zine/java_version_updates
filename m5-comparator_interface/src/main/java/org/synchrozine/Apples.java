package org.synchrozine;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Apples {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(300, Color.GREEN));
        apples.add(new Apple(100, Color.RED));
        apples.add(new Apple(200, Color.GREEN));
        apples.add(new Apple(50, Color.RED));

//        Comparator<Apple> sortApple = Comparator.comparing(Apple::getWeight);
//        apples.sort(sortApple);
//        System.out.println(apples);

        //Asc
        apples.sort(comparing(Apple::getWeight));
        System.out.println(apples);

        //Desc
        apples.sort(comparing(Apple::getWeight).reversed());
        System.out.println(apples);

        //Chaining
        apples.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(apples);
    }
}
