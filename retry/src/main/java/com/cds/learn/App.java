package com.cds.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cds on 3/18/18 14:16.
 */
public final class App {
  private static final Logger LOG = LoggerFactory.getLogger(App.class);
  private static BusinessOperation<String> op;

  /**
   * Entry point.
   *
   * @param args not used
   * @throws Exception not expected
   */
  public static void main(String[] args) throws Exception {
//    noErrors();
//    errorNoRetry();
    errorWithRetry();
  }

  private static void noErrors() throws Exception {
    op = new FindCustomer("123");
    op.perform();
    LOG.info("Sometimes the operation executes with no errors.");
  }

  private static void errorNoRetry() throws Exception {
    op = new FindCustomer("123", new CustomerNotFoundException("not found"));
    try {
      op.perform();
    } catch (CustomerNotFoundException e) {
      LOG.info("Yet the operation will throw an error every once in a while.");
    }
  }

  private static void errorWithRetry() throws Exception {
    final Retry<String> retry = new Retry<>(
        new FindCustomer("123", new CustomerNotFoundException("not found")),
        3,  //3 attempts
        100, //100 ms delay between attempts
        e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass())
    );
    op = retry;
    final String customerId = op.perform();
    LOG.info(String.format(
        "However, retrying the operation while ignoring a recoverable error will eventually yield "
            + "the result %s after a number of attempts %s", customerId, retry.attempts()
    ));
  }
}
