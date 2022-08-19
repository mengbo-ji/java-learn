package com.atguigu.java8;

public interface CompareA {
  public static void method1() {
    System.out.println("1");
  }
  public default void method2() {
    System.out.println("2");
  }
  default void method3() {
    System.out.println("3");
  }
}
