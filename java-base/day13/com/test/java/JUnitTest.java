package com.test.java;

import org.junit.Test;

import java.util.Date;

public class JUnitTest {
  public static void main(String[] args) {

  }

  @Test
  public void test() {
    System.out.println("开始测试...");
    Object str = new String("gg");
    Date data = (Date) str;
  }
}
