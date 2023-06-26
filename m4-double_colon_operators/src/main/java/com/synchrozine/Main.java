package com.synchrozine;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Predicate<Integer> predicate = (p) -> p % 2 == 0;

        Calculate sum = (x, y) -> System.out.println(x + y);
        Calculate sum1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to a static method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10, 20);

        //Reference to instance method
        Calculator obj = new Calculator();
        Calculate sum3 = obj::findMultiply;
        sum3.calculate(10, 5);


    }
}
