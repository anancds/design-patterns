package com.cds.learn;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public interface Node {

  String getName();

  int getTreeSize();

  Node getLeft();

  Node getRight();

  void walk();
}
