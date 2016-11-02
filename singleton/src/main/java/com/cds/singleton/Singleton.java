package com.cds.singleton;

/**
 * Created by cds on 16/10/15 下午11:03.
 */

/**
 * Eagerly initialized
 */
public class Singleton {

    //
    private Singleton() {
    }

    private static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
