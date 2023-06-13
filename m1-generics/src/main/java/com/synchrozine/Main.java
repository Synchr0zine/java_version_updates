package com.synchrozine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //  items.add("Apple");

        printDoubled(items);

        System.out.println("----------------------------------");

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team liverpool = new Team("Liverpool");
        liverpool.addPlayer(joe);
        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer each : items) {
            System.out.println(each * 2);
        }
    }


}
