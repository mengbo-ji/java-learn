package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author jimengbo
 * @create 2022-09-17 4:07 PM
 */
public class GenericTest {

  @Test
  public void test1() {
    ArrayList<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println(list);
  }
}
