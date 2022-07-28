package com.atguigu1.java;

public class Boy {
  private String name;
  private int age;

  public Boy(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void marry(Girl girl) {
    System.out.println("我想娶" + girl.getName());
  }

  public void shout() {
    if (this.age >= 22) {
      System.out.println("你可以去登记结婚了");
    } else {
      System.out.println("先谈谈恋爱吧");
    }
  }

}
