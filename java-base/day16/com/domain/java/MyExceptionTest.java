package com.domain.java;

public class MyExceptionTest extends RuntimeException {
  @java.io.Serial
  static final long serialVersionUID = -7034897190745766939L;

  public MyExceptionTest() {
  }

  public MyExceptionTest(String msg) {
    super(msg);
  }
}
