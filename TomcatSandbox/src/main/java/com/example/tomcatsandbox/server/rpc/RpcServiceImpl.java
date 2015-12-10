package com.example.tomcatsandbox.server.rpc;

import com.example.core.client.models.Person;
import com.example.tomcatsandbox.client.rpc.RpcService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class RpcServiceImpl extends RemoteServiceServlet implements RpcService {

  public RpcServiceImpl() {
  }

  public String testCallServer(String input) throws IllegalArgumentException {
    return input + " server call works";
  }

  @Override
  public Person getPerson() {
    return new Person("1", "Brandon");
  }

}
