package com.atguigi.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList(10);
    System.out.println(arrayList.size());

    arrayList.add("我");
    arrayList.add("开");
    arrayList.add("始");
    arrayList.add("学");
    arrayList.add("java");
    arrayList.add("JAVA");
    System.out.println(arrayList);

    System.out.println(arrayList.get(0));
    arrayList.set(0, "我要");
    arrayList.set(5, "JAVA1");
    arrayList.remove(5);
    System.out.println(arrayList);
    for (String item : arrayList) {
      System.out.println(item);
    }

    ArrayList<String> arrayList1 = new ArrayList(Arrays.asList("one", "two"));
    System.out.println(arrayList1);

    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
    arrayList2.add(1);
    arrayList2.add(3);
    arrayList2.add(4);
    arrayList2.add(2);
    arrayList2.add(7);
    System.out.println(arrayList2);
//    Collections.sort(arrayList2);
    arrayList2.sort(Comparator.naturalOrder());
    arrayList2.sort(Comparator.reverseOrder());
    System.out.println(arrayList2);
    System.out.println(arrayList2.contains(2));
    System.out.println(arrayList2.indexOf(2));
    arrayList2.forEach(e -> {
      System.out.println(e);
    });
  }
}
