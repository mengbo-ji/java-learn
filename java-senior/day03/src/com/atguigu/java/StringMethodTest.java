package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jimengbo
 * @create 2022-08-30 10:51 PM
 */
public class StringMethodTest {

  @Test
  public void test1() {
    String s1 = "hello-world";
    System.out.println(s1.length());
    System.out.println(s1.charAt(0));

    String s2 = s1.toUpperCase();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(Arrays.toString(s1.split("-")));
  }

  @Test
  public void test2() {
    String s1 = "HelloWorld";
    String s2 = "helloworld";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
  }

  @Test
  public void test3() {
    String s1 = "123";
    int n = Integer.parseInt(s1);
    System.out.println(n);

    String s2 = String.valueOf(n);
    System.out.println(s2 instanceof String);
    boolean b = Boolean.parseBoolean("false");
    System.out.println(b);

    System.out.println(Arrays.toString(s1.toCharArray()));
  }
}
