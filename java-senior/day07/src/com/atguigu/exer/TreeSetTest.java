package com.atguigu.exer;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author jimengbo
 * @create 2022-09-11 3:57 PM
 */
public class TreeSetTest {
  @Test
  public void test1() {
    TreeSet treeSet = new TreeSet();
    Employee foo = new Employee("Foo", 26, new MyDate(1996, 5, 13));
    Employee bar = new Employee("Bar", 25, new MyDate(1997, 6, 24));
    Employee tom = new Employee("Tom", 15, new MyDate(2005, 5, 13));
    Employee jack = new Employee("Jack", 26, new MyDate(1996, 5, 13));

    treeSet.add(foo);
    treeSet.add(bar);
    treeSet.add(tom);
    treeSet.add(jack);

    treeSet.forEach(System.out::println);
  }

  @Test
  public void test2() {
    TreeSet treeSet = new TreeSet(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee && o2 instanceof Employee) {
          Employee e1 = (Employee) o1;
          Employee e2 = (Employee) o2;
          MyDate b1 = e1.getBirthDay();
          MyDate b2 = e2.getBirthDay();

          return b1.compareTo(b2);
        }
        throw new RuntimeException("Error");
      }
    });
    Employee foo = new Employee("Foo", 26, new MyDate(1996, 5, 13));
    Employee bar = new Employee("Bar", 25, new MyDate(1997, 6, 24));
    Employee tom = new Employee("Tom", 15, new MyDate(2005, 5, 13));
    Employee jack = new Employee("Jack", 26, new MyDate(1996, 5, 13));

    treeSet.add(foo);
    treeSet.add(bar);
    treeSet.add(tom);
    treeSet.add(jack);

    treeSet.forEach(System.out::println);
  }
}
