package com.cds.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chendongsheng5 on 2017/6/17.
 */
public class SimpleTask extends Task {

  private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTask.class);

  @Override
  public void execute() {
    LOGGER.info("Perform some important activity and after call the callback method.");
  }
}
