package com.cds.factory.method;

/**
 * Created by cds on 16/11/2 下午7:29.
 */
public enum WeaponType {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
