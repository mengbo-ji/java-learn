package com.atguigu.java;

import java.util.Arrays;

/**
 * @author jimengbo
 * @create 2022-09-05 9:57 PM
 */
public class EnumTest1 {
  public static void main(String[] args) {
    Season1 spring = Season1.SPRING;
    spring.show();
    System.out.println(Season1.class.getSuperclass());
    Season1[] values = Season1.values();
    System.out.println(Arrays.toString(values));

    Thread.State[] values1 = Thread.State.values();
    System.out.println(Arrays.toString(values1));

    Season1 winter = Season1.valueOf("WINTER");
    System.out.println(winter);
  }
}

interface Info {
  void show();
}

enum Season1 implements Info {
  SPRING("春天", "春暖花开") {
    @Override
    public void show() {
      System.out.println("hello world");
    }
  },
  SUMMER("夏天", "夏日炎炎") {
    @Override
    public void show() {
      System.out.println("hello world");
    }
  },
  AUTUMN("秋天", "秋高气爽") {
    @Override
    public void show() {
      System.out.println("hello world");
    }
  },
  WINTER("冬天", "冬日萧瑟") {
    @Override
    public void show() {
      System.out.println("hello world");
    }
  };

  private final String seasonName1;
  private final String seasonDesc1;

  private Season1(String seasonName, String seasonDesc) {
    this.seasonName1 = seasonName;
    this.seasonDesc1 = seasonDesc;
  }


  public String getSeasonName1() {
    return seasonName1;
  }

  public String getSeasonDesc1() {
    return seasonDesc1;
  }

  @Override
  public void show() {

  }
}
