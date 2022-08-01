package com.atguigi.java;

import java.util.LinkedList;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList();
    linkedList.add("0");
    linkedList.add("1");
    linkedList.add("2");
    System.out.println(linkedList);
    linkedList.addFirst("-1");
    System.out.println(linkedList);
    linkedList.addLast("3");
    System.out.println(linkedList);
    System.out.println(linkedList.removeFirst());
    System.out.println(linkedList.getFirst());

    for(String item : linkedList) {
      System.out.println(item);
    }

    linkedList.forEach(item -> System.out.println(item));
  }
}
