package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:38.
 */
public class ElfBlacksmith implements Blacksmith{
    public Weapon manufactureweapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
