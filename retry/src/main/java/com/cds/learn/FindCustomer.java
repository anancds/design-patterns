package com.cds.learn;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by cds on 3/18/18 14:13.
 */
public final class FindCustomer implements BusinessOperation<String> {
  private final String customerId;
  private final Deque<BusinessException> errors;

  /**
   * Ctor.
   *
   * @param customerId the final result of the remote operation
   * @param errors the errors to throw before returning {@code customerId}
   */
  public FindCustomer(String customerId, BusinessException... errors) {
    this.customerId = customerId;
    this.errors = new ArrayDeque<>(Arrays.asList(errors));
  }

  @Override
  public String perform() throws BusinessException {
    if (!this.errors.isEmpty()) {
      throw this.errors.pop();
    }

    return this.customerId;
  }
}
