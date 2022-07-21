package com.atguigu.java;

public class StringTest {
  public static void main(String[] args) {
    String fs;
    fs = String.format(
            "浮点型变量的值为 " +
                    "整型变量的值为 " +
                    "字符串变量的值为"
    );
    String str1 = "abc";
    String str2 = "abc";
    System.out.println(str1.compareTo(str2));
    System.out.println(fs);
    System.out.println(fs.charAt(0));
  }
}
