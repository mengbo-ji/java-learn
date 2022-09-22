package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author jimengbo
 * @create 2022-09-22 10:58 PM
 */
public class FileInputOutputStreamTest {
  @Test
  public void test1() {
    File file = new File("hello.txt");

    try {
      FileInputStream fs = new FileInputStream(file);

      byte[] buffer = new byte[5];
      int len;
      while ((len = fs.read(buffer)) != 1) {
        String str = new String(buffer, 0, len);
        System.out.println(str);
      }

      fs.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test2() {
    File srcFile = new File("img.png");
    File destFile = new File("img1.png");
    FileInputStream fs = null;
    FileOutputStream fo = null;
    try {
      fs = new FileInputStream(srcFile);fo = new FileOutputStream(destFile);

      byte[] buffer = new byte[5];
      int len;
      while ((len = fs.read(buffer)) != 1) {
        fo.write(buffer, 0, len);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fs != null) {
        try {
          fs.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fo != null) {
        try {
          fo.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }


}
