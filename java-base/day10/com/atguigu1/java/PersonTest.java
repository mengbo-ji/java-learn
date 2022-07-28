package com.atguigu1.java;

public class PersonTest {
  public static void main(String[] args) {
    Person person = new Person();
  }
}

class Person {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
