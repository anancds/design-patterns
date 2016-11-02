package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:39.
 */
public class App {

    private static Blacksmith blacksmith;

    public static void main(String[] args) {

        Weapon weapon;

        blacksmith = new OrcBlacksmith();


        weapon = blacksmith.manufactureweapon(WeaponType.SPEAR);

        System.out.println(weapon);

        blacksmith = new ElfBlacksmith();

        weapon = blacksmith.manufactureweapon(WeaponType.AXE);

        System.out.println(weapon);

    }
}
