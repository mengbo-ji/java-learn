package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-09-01 10:53 PM
 */
public class IDEADebug {

  public void testStringBuffer() {
    String s1 = null;
    StringBuffer s2 = new StringBuffer();
    s2.append(s1);
    System.out.println(s2.length());
    System.out.println(s2);

    StringBuffer s3 = new StringBuffer(s1);
  }
}
