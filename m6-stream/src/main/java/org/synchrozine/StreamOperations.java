package org.synchrozine;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10);
        //list1.forEach(System.out::println);

        //FILTER
        System.out.println("Filter");
        list1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        //Distinct
        System.out.println("Distinct");
        list1.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        //Limit
        System.out.println("Limit");
        list1.stream().filter(i -> i % 2 == 0).limit(2).forEach(System.out::println);

        //Skip
        System.out.println("Skip");
        list1.stream().filter(i -> i % 2 == 0).skip(2).forEach(System.out::println);

        //Map(applies a function,do an action)
        System.out.println("Map");
        list1.stream().filter(i -> i % 2 == 0).distinct().map(m -> m * 3).forEach(System.out::println);


    }
}
