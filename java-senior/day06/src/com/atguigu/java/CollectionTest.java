package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author jimengbo
 * @create 2022-09-07 10:31 PM
 */
public class CollectionTest {
  @Test
  public void test1() {
    ArrayList coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");

    System.out.println(coll.toString());
    System.out.println(coll.contains(123));
    System.out.println(coll.contains(new String("Tom")));

    Collection coll1 = Arrays.asList(123, 456);

    System.out.println(coll.containsAll(coll1));

  }

  @Test
  public void test2() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");

    Collection coll1 = Arrays.asList(123, 456, 444);
    coll.retainAll(coll1);
//    coll1.retainAll(coll);
    System.out.println(coll);
    System.out.println(coll1);
  }

  @Test
  public void test3() {
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Date());
    coll.add(new String("Tom"));
    coll.add("abc");

    Collection coll1 = Arrays.asList(123, 456, 444);
    System.out.println(coll.hashCode());

    Object[] objects = coll.toArray();
    System.out.println(Arrays.toString(objects));

    List<String> strings = Arrays.asList(new String[]{"AA", "BB", "CC"});
    System.out.println(strings);

    List<int[]> ints = Arrays.asList(new int[]{11, 22, 33});
    System.out.println(ints);
  }

}
