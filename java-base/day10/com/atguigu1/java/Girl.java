package com.atguigu1.java;

public class Girl {
  private String name;
  private int age;

  public Girl(String name, int age) {
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

  public void marry(Boy boy) {
    System.out.println("我想嫁给" + boy.getName());
    boy.marry(this);
  }

  /**
   * @Description 比较两个对象大小
   * @author mengbo
   * @date 2022-07-28
   * @param girl
   * @return 正数：当前对象大，负数：当前对象小，0：二者一样（当前对象和形参对象）
   * */
  public int compare(Girl girl) {
    return this.age - girl.age;
  }

}
