package com.atguigu.java;

public class Person {
  String name;
  int age;
  Person() {

  }
  
  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("吃饭");
  }

  public void sleep() {
    System.out.println("睡觉");
  }

}
