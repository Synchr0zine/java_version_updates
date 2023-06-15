package com.synchrozine.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Baturay", 25, Gender.MALE);
        Person p2 = new Person("Jenny", 35, Gender.FEMALE);
        Person p3 = new Person("Ilhan", 30, Gender.MALE);
        Person p4 = new Person("Sultan", 10, Gender.FEMALE);

        print(new ArrayList<>(Arrays.asList(p1, p2, p3, p4)), p -> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }

    private static void print(List<Person> personList, CheckMember checkMember) {

        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (checkMember.test(person)) {
                result.add(person);
            }
        }
        System.out.println(result);

    }
}
