package com.cds.learn;

/**
 * Created by cds on 3/18/18 14:11.
 */
public final class CustomerNotFoundException extends BusinessException {
  private static final long serialVersionUID = -6972888602621778664L;

  /**
   * Ctor.
   *
   * @param message the error message
   */
  public CustomerNotFoundException(String message) {
    super(message);
  }
}
