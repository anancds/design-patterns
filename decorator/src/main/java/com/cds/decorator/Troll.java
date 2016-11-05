package com.cds.decorator;

/**
 * Created by cds on 16/11/2 下午8:09.
 */
public class Troll implements Hostile{
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }

    public int getAttackPower() {
        return 10;
    }

    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
