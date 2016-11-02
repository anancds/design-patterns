package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:37.
 */
public class ElfWeapon implements Weapon {

    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elven " + weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }
}
