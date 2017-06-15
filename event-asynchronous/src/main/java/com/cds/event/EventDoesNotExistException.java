package com.cds.event;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class EventDoesNotExistException extends Exception {

  private static final long serialVersionUID = -3398463738273811509L;

  public EventDoesNotExistException(String message) {
    super(message);
  }
}
