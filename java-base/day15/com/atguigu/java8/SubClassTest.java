package com.atguigu.java8;

public class SubClassTest {
  public static void main(String[] args) {
    SubClass s = new SubClass();
//    CompareA.method1();
//    s.method2();
//    s.method3();
    s.myMethod();
  }
}

class SubClass extends SuperClass implements CompareA {
  @Override
  public void method2() {
    System.out.println("subclass");
  }

  public void myMethod() {
    method2();
    super.method3();
    CompareA.super.method2();
  }
}