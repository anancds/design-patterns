package com.cds.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class App {

  /**
   * Program entry point
   */
  public static void main(String[] args) throws IOException {

    new SimpleFileWriter("testfile.txt", writer -> {
      writer.write("Hello");
      writer.append(" ");
      writer.append("there!");
    });
  }
}
