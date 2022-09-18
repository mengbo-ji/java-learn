package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jimengbo
 * @create 2022-09-17 11:19 AM
 */
public class CollectionsTest {
  @Test
  public void test1() {
    List list = new ArrayList();
    list.add(123);
    list.add(678);
    list.add(345);
    list.add(567);
    list.add(567);

    Collections.reverse(list);
    Collections.sort(list);
    int frequency = Collections.frequency(list, 567);
    System.out.println(frequency);


  }
}
