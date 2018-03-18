package com.cds.learn;

/**
 * Created by cds on 3/18/18 14:03.
 */
public class BusinessException extends Exception {

  private static final long serialVersionUID = 6235833142062144336L;

  /**
   * @param message the error message
   */
  public BusinessException(String message) {
    super(message);
  }


}
