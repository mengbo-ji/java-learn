package com.atguitu.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRRead {
  public static void main(String[] args) {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("输入字符，按下q退出");
    try {
      do {
        c = (char) br.read();
        System.out.println(c);
      } while (c != 'q');
    } catch (Exception e) {}
  }
}
