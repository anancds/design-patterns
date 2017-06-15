package com.cds.event;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class LongRunningEventException extends Exception {

  private static final long serialVersionUID = -483423544320148809L;

  public LongRunningEventException(String message) {
    super(message);
  }
}
