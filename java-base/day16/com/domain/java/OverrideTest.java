package com.domain.java;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTest {

}

class SupperClass {
  public void method() throws IOException {};
}

class SubClass extends SupperClass {

  @Override
  public void method() throws IOException {
    super.method();
  }
}
