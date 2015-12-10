package com.example.tomcatsandbox.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.example.tomcatsandbox.TomcatSandbox";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
