package com.atguigu.com;

public class UserTest {

}

class User {
  String name;
  int age;

  public void eat() {
    String foot = "烩面";
    System.out.println("北方人喜欢吃" + foot);
  }

  public void talk(String language) {
    System.out.println("我们用" + language + "交流");
  }
}