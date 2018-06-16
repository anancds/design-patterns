package com.cds.learn.builder;

/**
 * Created by cds on 2018/6/16 22:28.
 */
public enum HairType {

  BALD("bald"), SHORT("short"), CURLY("curly"), LONG_STRAIGHT("long straight"), LONG_CURLY(
      "long curly");

  private String title;

  HairType(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
