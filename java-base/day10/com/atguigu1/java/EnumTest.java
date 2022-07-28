package com.atguigu1.java;

import java.util.Arrays;

enum Color {
  RED,
  BLUE,
  GREEN;
  // 构造函数
  private Color()
  {
    System.out.println("Constructor called for : " + this.toString());
  }

  public void colorInfo()
  {
    System.out.println("Universal Color");
  }
}
public class EnumTest {
  public static void main(String[] args) {
//    System.out.println(Color.RED);
//    Color[] colors = Color.values();
//    System.out.println(Arrays.toString(colors));
//    System.out.println(Color.valueOf("RED"));

//    for (Color color : Color.values()) {
//      System.out.println(color);
//      System.out.println(color.ordinal());
//    }

    Color red = Color.RED;
    System.out.println(red);
    red.colorInfo();
  }
}
