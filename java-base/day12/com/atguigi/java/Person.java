package com.atguigi.java;

public class Person {
  String name;
  int age;
  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("吃饭");
  }

  public void walk(int distance) {
    System.out.println("走路走的距离是 :" + distance);
  }

  public static void sleep() {
    System.out.println("人必须睡觉");
  }

}
