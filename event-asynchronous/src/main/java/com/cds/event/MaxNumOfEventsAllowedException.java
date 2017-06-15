package com.cds.event;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class MaxNumOfEventsAllowedException extends Exception {

  private static final long serialVersionUID = -8430876973516292695L;

  public MaxNumOfEventsAllowedException(String message) {
    super(message);
  }
}
