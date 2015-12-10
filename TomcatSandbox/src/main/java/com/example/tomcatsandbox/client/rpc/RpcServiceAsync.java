package com.example.tomcatsandbox.client.rpc;

import com.example.core.client.models.Person;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>RpcService</code>.
 */
public interface RpcServiceAsync {
  void testCallServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
  
  void getPerson(AsyncCallback<Person> callback) throws Exception;
}
