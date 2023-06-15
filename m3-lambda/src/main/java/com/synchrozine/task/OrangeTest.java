package com.synchrozine.task;

import com.synchrozine.Apple;
import com.synchrozine.ApplePredicate;
import com.synchrozine.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory, orangeLambda);

        OrangeFormatter colorAndWeightLambda = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return "A " + ch + " " + orange.getColor() + " orange";
        };
        prettyPrintOrange(inventory, colorAndWeightLambda);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter formatter) {

        for (Orange orange : inventory) {
            String output = formatter.accept(orange);
            System.out.println(output);
        }

    }
}
