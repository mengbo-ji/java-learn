package com.atguigu.com;

public class VarargsDemo {
  public static void main(String[] args) {
    printMax(1,2);
  }

  public static void printMax(int... ints) {
    System.out.println(ints[1]);
  }
}
