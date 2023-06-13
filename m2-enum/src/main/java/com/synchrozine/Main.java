package com.synchrozine;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access constants?");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constants");

        Currency[] currencies = Currency.values();
        System.out.println(Arrays.toString(currencies));

        System.out.println("How to use switch case with enums");

        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("It is a 1 cent");
                break;
            case NICKEL:
                System.out.println("It is a 5 cent");
                break;
            case DIME:
                System.out.println("It is a 10 cent");
                break;
            case QUARTER:
                System.out.println("It is a 25 cent");
                break;
        }

    }
}
