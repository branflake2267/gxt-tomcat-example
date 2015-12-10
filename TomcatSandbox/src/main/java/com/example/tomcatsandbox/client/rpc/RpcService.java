package com.example.tomcatsandbox.client.rpc;

import com.example.core.client.models.Person;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("rpcService")
public interface RpcService extends RemoteService {
  String testCallServer(String name) throws IllegalArgumentException;

  Person getPerson();
}
