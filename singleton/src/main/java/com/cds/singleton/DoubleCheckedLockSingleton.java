package com.cds.singleton;

/**
 * Created by cds on 16/10/15 下午11:14.
 */

/**
 * Double-checked Locking
 */
public class DoubleCheckedLockSingleton {

    private DoubleCheckedLockSingleton() {

    }

    private volatile static DoubleCheckedLockSingleton instace;

    public static DoubleCheckedLockSingleton getInstace() {
        if (null == instace) {
            synchronized (DoubleCheckedLockSingleton.class) {
                if (null == instace) {
                    instace = new DoubleCheckedLockSingleton();
                }
            }
        }
        return instace;
    }
}
