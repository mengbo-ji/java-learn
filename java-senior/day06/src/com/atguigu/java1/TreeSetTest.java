package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

/**
 * @author jimengbo
 * @create 2022-09-11 12:59 PM
 */
public class TreeSetTest {
  @Test
  public void test1() {
    TreeSet set = new TreeSet();

    set.add(123);
    set.add(456);
    set.add(234);
//    set.add("abc");
//    set.add(new String("Tom"));
//    set.add(true);

    System.out.println(set);

  }
}
