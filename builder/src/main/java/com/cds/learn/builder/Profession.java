package com.cds.learn.builder;

/**
 * Created by cds on 2018/6/16 22:29.
 */
public enum Profession {

  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
