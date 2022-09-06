package com.atguigu.java2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author jimengbo
 * @create 2022-09-06 10:33 PM
 */
public class CollectionTest {

  @Test
  public void test1() {
    Collection list = new ArrayList();

    list.add("aaa");
    list.add("bbb");
    list.add(123);
    list.add(true);
    list.add(LocalDateTime.now());

    System.out.println(list.size());

    Collection list1 = new ArrayList();

    list1.add("ccc");
    list.addAll(list1);

    System.out.println(list.toString());

  }
}
