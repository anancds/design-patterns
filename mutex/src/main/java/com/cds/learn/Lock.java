package com.cds.learn;

/**
 * Created by chendongsheng5 on 2017/6/16.
 */
public interface Lock {

  void acquire() throws InterruptedException;

  void release();

}
