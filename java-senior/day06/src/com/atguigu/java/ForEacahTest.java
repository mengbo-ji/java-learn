package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author jimengbo
 * @create 2022-09-08 10:19 PM
 */
public class ForEacahTest {
  @Test
  public void test1() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");
//    for (Object item : coll) {
//      System.out.println(item);
//    }
    coll.forEach(item -> System.out.println(item));
  }
}
