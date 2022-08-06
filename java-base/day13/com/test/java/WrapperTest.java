package com.test.java;

public class WrapperTest {
  public static void main(String[] args) {
    Integer integer = new Integer("1");
    Integer integer1 = Integer.valueOf(1);
    System.out.println(integer);
    System.out.println(integer1);
  }
}


