package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:31.
 */
public class OrcWeapon implements Weapon{

    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }


    public WeaponType getWeaponType() {
        return null;
    }
}
