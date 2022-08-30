package com.atguigu.exer;

import org.junit.Test;

/**
 * @author jimengbo
 * @create 2022-08-30 10:35 PM
 */
public class StringTest {
  String s1 = "hello";
  char[] ch = {'t', 'e', 's', 't'};

  public void change(String s1, char[] ch) {
    s1 = "abc";
    ch[0] = 'a';
  }

  @Test
  public static void main(String[] args) {
    StringTest stringTest = new StringTest();
    stringTest.change(stringTest.s1, stringTest.ch);

    System.out.println(stringTest.s1);
    System.out.println(stringTest.ch);
  }

}
