package com.cds.decorator;

/**
 * Created by cds on 16/11/2 下午8:11.
 */
public class App {

    public static void main(String[] args) {
        // simple troll
        System.out.println("A simple looking troll approaches.");
        Hostile troll = new Troll();
        troll.attack();
        troll.fleeBattle();
        System.out.printf("Simple troll power %d.\n", troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        System.out.println("\nA smart looking troll surprises you.");
        Hostile smart = new SmartHostile(troll);
        smart.attack();
        smart.fleeBattle();
        System.out.printf("Smart troll power %d.\n", smart.getAttackPower());
    }
}
