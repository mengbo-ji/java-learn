package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * @author jimengbo
 * @create 2022-09-07 11:01 PM
 */
public class IteratorTest {

  @Test
  public void test1() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");

    Iterator iterator = coll.iterator();
//    System.out.println(iterator.next());

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  @Test
  public void test2() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");

    Iterator iterator = coll.iterator();

    while (iterator.hasNext()) {
      Object next = iterator.next();
      if ("Tom".equals(next)) {
        iterator.remove();
      }
    }

    Iterator iterator1 = coll.iterator();
    while (iterator1.hasNext()) {
      Object next = iterator1.next();
      System.out.println(next);
    }

  }

}
