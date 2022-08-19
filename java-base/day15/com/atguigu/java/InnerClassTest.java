package com.atguigu.java;

public class InnerClassTest {
  public static void main(String[] args) {
    InnerClass.Dog d = new InnerClass.Dog();
    InnerClass innerClass  = new InnerClass();
    InnerClass.Bird b = innerClass.new Bird();
  }
}

class InnerClass {
  int age = 10;
  static class Dog {

  }

  class Bird {
    int age = 10;
    public void method() {
      System.out.println(age);
      System.out.println(InnerClass.this.age);
    }
  }

  public void method() {
    class AA {

    }
  }
  {
    class BB {

    }
  }
}
