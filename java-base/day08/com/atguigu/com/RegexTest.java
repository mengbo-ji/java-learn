package com.atguigu.com;

import java.util.regex.Pattern;

public class RegexTest {
  public static void main(String[] args) {
    String content = "I am noob " +
            "from runoob.com.";
    String pattern = ".*runoob.*";

    boolean isMatch = Pattern.matches(pattern, content);
    System.out.println(isMatch);
  }
}
