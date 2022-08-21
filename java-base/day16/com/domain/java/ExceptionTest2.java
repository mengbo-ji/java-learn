package com.domain.java;

import org.junit.Test;

public class ExceptionTest2 {

  public static void main(String[] args) throws Exception {
//    try {
//      test2();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
    test2();
  }

  @Test
  public static void test1() throws Exception {
    String str = "abc";
    int num = Integer.parseInt(str);
  }

  @Test
  public static void test2() throws Exception {
    test1();
  }
}
