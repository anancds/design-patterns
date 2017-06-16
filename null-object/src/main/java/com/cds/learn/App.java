package com.cds.learn;

/**
 * Created by chendongsheng5 on 2017/6/15.
 */
public class App {
  /**
   * Program entry point
   *
   * @param args command line args
   */
  public static void main(String[] args) {

    Node root =
        new NodeImpl("1", new NodeImpl("11", new NodeImpl("111", NullNode.getInstance(),
            NullNode.getInstance()), NullNode.getInstance()), new NodeImpl("12",
            NullNode.getInstance(), new NodeImpl("122", NullNode.getInstance(),
            NullNode.getInstance())));

    root.walk();
  }
}
