package com.atguitu.java;

import java.io.*;

public class DirTest {
  public static void main(String[] args) {
    String patnname = "./a";
    File f = new File(patnname);

    // 创建目录
//    f.mkdirs();

    // 删除目录
    f.delete();
  }
}
