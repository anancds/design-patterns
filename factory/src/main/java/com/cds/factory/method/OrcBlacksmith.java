package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:36.
 */
public class OrcBlacksmith implements Blacksmith{
    public Weapon manufactureweapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
