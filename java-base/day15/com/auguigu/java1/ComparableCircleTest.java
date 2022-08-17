package com.auguigu.java1;

/**
 * @author jimengbo
 */
public class ComparableCircleTest {
  public static void main(String[] args) {
    ComparableCircle c1 = new ComparableCircle(6);
    ComparableCircle c2 = new ComparableCircle(7);
    int flag = c1.comparTo(c2);
    if (flag > 0) {
      System.out.println("c1对象大");
    } else if (flag < 0) {
      System.out.println("c2对象大");
    } else {
      System.out.println("c1和c2一样大");
    }
  }
}
