package com.cds.learn.chain;

/**
 * Created by cds on 2018/6/16 22:54.
 */
public class OrcKing {

  RequestHandler chain;

  public OrcKing() {
    buildChain();
  }

  private void buildChain() {
    chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
  }

  public void makeRequest(Request req) {
    chain.handleRequest(req);
  }

}
