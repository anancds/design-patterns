package com.cds.learn.builder;

/**
 * Created by cds on 2018/6/16 22:28.
 */
public enum HairColor {

  WHITE, BLOND, RED, BROWN, BLACK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
