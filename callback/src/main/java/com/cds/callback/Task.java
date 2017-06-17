package com.cds.callback;

/**
 * Created by chendongsheng5 on 2017/6/17.
 */
public abstract class Task {

  /**
   * Execute with Callback
   */
  public final void executeWith(Callback callback) {
    execute();
    if (callback != null) {
      callback.call();
    }
  }

  public abstract void execute();
}
