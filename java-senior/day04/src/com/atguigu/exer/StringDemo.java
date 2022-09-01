package com.atguigu.exer;

import org.testng.annotations.Test;

/**
 * @author jimengbo
 * @create 2022-09-01 7:51 PM
 */
public class StringDemo {
  /**
   * 将字符串中指定的部分翻转，abcdefg -> abgfedc
   * */
  public String reverse(String str, int startIndex, int endIndex) {
    char[] chars = str.toCharArray();
    for (int x = startIndex, y = endIndex; x < y; x++, y--) {
      char temp = chars[x];
      chars[x] = chars[y];
      chars[y] = temp;
    }
    return new String(chars);
  }

  @Test
  public void test1() {
    String s1 = reverse("abcdefg", 2, 6);
    System.out.println(s1);
  }

}
