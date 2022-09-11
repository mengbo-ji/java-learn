package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jimengbo
 * @create 2022-09-11 12:02 PM
 */
public class SetTest {

  @Test
  public void test1() {
    Set set = new HashSet();
    set.add(123);
    set.add(456);
    set.add("abc");
    set.add(new String("Tom"));
    set.add(true);
    set.add(true);
    set.add(123);

    System.out.println(set);
  }
}
