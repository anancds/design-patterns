package com.cds.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class SimpleFileWriter {

  /**
   * Constructor
   */
  public SimpleFileWriter(String filename, FileWriterAction action) throws IOException {
    FileWriter writer = new FileWriter(filename);
    try {
      action.writeFile(writer);
    } finally {
      writer.close();
    }
  }
}
