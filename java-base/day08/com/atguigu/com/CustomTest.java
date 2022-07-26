package com.atguigu.com;

public class CustomTest {
}

class Custom {
  String name;
  int age;

  public void eat() {
    System.out.println("客户吃饭");
  }

  public void sleep(int hour) {
    System.out.println("客户休息了" + hour + "小时");
  }

  public String getName() {
    return name;
  }

  public String getNation(String nation) {
    String info = "我的国籍是" + nation;
    return info;
  }

}
