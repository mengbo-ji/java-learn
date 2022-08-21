package com.domain.java;

import org.junit.Test;

public class ExceptionTest1 {
  @Test
  public void test1() {
    try {
      String str = "abc";
      int num = Integer.parseInt(str);
    } catch (NumberFormatException e) {
      e.printStackTrace();
      System.out.println("e: " + e);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("e: " + e);
    }
  }
  @Test
  public void test2() {
    try {
      String str = "abc";
      int num = Integer.parseInt(str);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } finally {
    }
  }
}