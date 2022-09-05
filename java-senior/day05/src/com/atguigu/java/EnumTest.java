package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-09-04 10:29 PM
 */
public class EnumTest {
  public static void main(String[] args) {
    Season spring = Season.SPRING;
    System.out.println(spring.getSeasonDesc());
  }
}

class Season {
  private final String seasonName;
  private final String seasonDesc;

  private Season(String seasonName, String seasonDesc) {
    this.seasonName = seasonName;
    this.seasonDesc = seasonDesc;
  }

  public static final Season SPRING = new Season("春天", "春暖花开");
  public static final Season SUMMER = new Season("夏天", "夏日炎炎");
  public static final Season AUTUMN = new Season("秋天", "秋高气爽");
  public static final Season WINTER = new Season("冬天", "冬日萧瑟");

  public String getSeasonName() {
    return seasonName;
  }

  public String getSeasonDesc() {
    return seasonDesc;
  }
}
