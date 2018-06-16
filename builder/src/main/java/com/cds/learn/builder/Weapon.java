package com.cds.learn.builder;

/**
 * Created by cds on 2018/6/16 22:30.
 */
public enum Weapon {

  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
