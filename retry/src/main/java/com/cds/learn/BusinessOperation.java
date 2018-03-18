package com.cds.learn;

/**
 * Created by cds on 3/18/18 14:10.
 */
@FunctionalInterface
public interface BusinessOperation<T> {
  /**
   * Performs some business operation, returning a value {@code T} if successful, otherwise throwing
   * an exception if an error occurs.
   *
   * @return the return value
   * @throws BusinessException if the operation fails. Implementations are allowed to throw more
   *     specific subtypes depending on the error conditions
   */
  T perform() throws BusinessException;
}
