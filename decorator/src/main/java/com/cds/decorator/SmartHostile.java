package com.cds.decorator;

/**
 * Created by cds on 16/11/2 下午8:05.
 */
public class SmartHostile implements Hostile{

    private Hostile decorated;

    public SmartHostile(Hostile decorated) {
        this.decorated = decorated;
    }

    public void attack() {
        System.out.println("It throws a rock at you!");
        decorated.attack();
    }

    public int getAttackPower() {
        // decorated hostile's power + 20 because it is smart
        return decorated.getAttackPower() + 20;
    }

    public void fleeBattle() {
        System.out.println("It calls for help!");
        decorated.fleeBattle();
    }
}
