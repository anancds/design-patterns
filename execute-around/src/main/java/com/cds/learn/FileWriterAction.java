package com.cds.learn;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public interface FileWriterAction {

  void writeFile(FileWriter writer) throws IOException;

}
