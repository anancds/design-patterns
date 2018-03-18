package com.cds.learn;

/**
 * Created by cds on 3/18/18 14:13.
 */
public final class DatabaseNotAvailableException extends BusinessException {
  private static final long serialVersionUID = -3750769625095997799L;

  /**
   * Ctor.
   *
   * @param message the error message
   */
  public DatabaseNotAvailableException(String message) {
    super(message);
  }
}
