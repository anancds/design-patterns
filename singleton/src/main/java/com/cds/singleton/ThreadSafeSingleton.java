package com.cds.singleton;

/**
 * Created by cds on 16/10/15 下午11:04.
 */

/**
 * thread safe lazy initialize
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == instance) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
}
