package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author jimengbo
 * @create 2022-09-01 7:03 PM
 */
public class DateTest {

  @Test
  public void test1() {
    long time = System.currentTimeMillis();
    System.out.println(time);
  }

  @Test
  public void test2() {
    Date d1 = new Date();
    System.out.println(d1.toString());
    System.out.println(d1.getTime());


  }
}
