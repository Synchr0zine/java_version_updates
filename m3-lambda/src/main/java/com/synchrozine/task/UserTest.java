package com.synchrozine.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Emma", "Gok", 21));
        users.add(new User("Said", "Eugene", 30));
        users.add(new User("Ilhan", "Polat", 42));

//        users.forEach(user -> System.out.println(user));
//
//        for (User user : users) {
//            if (user.getLastName().startsWith("E")) {
//                System.out.println(user);
//            }
//        }

        printName(users, p -> true);
        printName(users, p -> p.getLastName().startsWith("E"));
    }

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}
