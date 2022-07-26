package com.atguigi.java;

import java.util.Arrays;

public class MethodArgsTest {
  public static void main(String[] args) {
     MethodArgsTest test = new MethodArgsTest();
     test.show(12);
     test.show("Hello");
     test.show("hello", "world");
  }

  public void show(int i) {

  }

  public void show(String s) {

  }

  public void show(String ... str) {
    System.out.println(Arrays.toString(str));
  }

}
