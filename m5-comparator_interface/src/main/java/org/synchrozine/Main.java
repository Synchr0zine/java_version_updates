package org.synchrozine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1, o2) -> (o1>o2) ? -1 : (o2>o1) ? 1 : 0));

    }
}