package com.cds.learn;

/**
 * Created by chendongsheng5 on 2017/6/17.
 */
public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    Captain captain = new Captain(new BattleFishingBoat());
    captain.move();
    captain.fire();
  }
}
