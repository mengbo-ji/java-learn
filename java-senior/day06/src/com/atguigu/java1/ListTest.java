package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jimengbo
 * @create 2022-09-08 10:31 PM
 */
public class ListTest {
  @Test
  public void test1() {
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(456);
    list.add(new Date());
    list.add(new String("Tom"));
    list.add("abc");

    System.out.println(list);

    System.out.println(list.get(1));


    System.out.println(list.subList(1, 2));

  }

  @Test
  public void test2() {
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(456);
    list.add(new Date());
    list.add(new String("Tom"));
    list.add("abc");

    updateList(list);

    System.out.println(list);
  }

  public void updateList(List list) {
//    list.remove(2);
    list.remove(new Integer(123));
  }

}
