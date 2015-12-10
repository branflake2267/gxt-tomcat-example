package com.example.tomcatsandbox.client;

import com.example.core.client.MyBusinessLogic;
import com.example.tomcatsandbox.client.rpc.RpcService;
import com.example.tomcatsandbox.client.rpc.RpcServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TomcatSandboxEntryPoint implements EntryPoint {

  /**
   * Sets up RPC
   */
  private final RpcServiceAsync rpcService = GWT.create(RpcService.class);

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(new HTML("<br/><br/><a href=\"./something\">Something Servlet</a><br/><br/><br/>"));

    RootPanel.get().add(new HTML("GWT App has loaded...<br/>"));
    
    RootPanel.get().add(new TextButton("GXT Works"));
    
    String s = "This ";
    new MyBusinessLogic().transformString(s);
    RootPanel.get().add(new HTML("tranformed:" + s));

    rpcService.testCallServer("Hello ...", new AsyncCallback<String>() {
      @Override
      public void onSuccess(String result) {
        RootPanel.get().add(new HTML(result));
      }

      @Override
      public void onFailure(Throwable caught) {
        RootPanel.get().add(new HTML("RPC Failure: We have a leak Huston!"));
        caught.printStackTrace();
      }
    });
  }

}
