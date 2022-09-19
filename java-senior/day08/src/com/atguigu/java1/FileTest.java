package com.atguigu.java1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author jimengbo
 * @create 2022-09-19 10:07 PM
 */
public class FileTest {
  @Test
  public void test1() {
    File file = new File("hello.txt");
    File file1 = new File("/Users/jimengbo/Desktop/java/java-senior/day08/hello.txt");

    System.out.println(file.getAbsolutePath());
    System.out.println(file.getParent());
    System.out.println(file.getPath());
    System.out.println(file.getName());
    System.out.println(file.length());
    System.out.println(file.lastModified());

    System.out.println("*******************");
    System.out.println(file1.getAbsolutePath());
    System.out.println(file1.getParent());
    System.out.println(file1.getPath());
    System.out.println(file1.getName());
    System.out.println(file1.length());
    System.out.println(file1.lastModified());

  }

  @Test
  public void test2() {
    File file = new File("/Users/jimengbo/Desktop/java/java-senior");
    String[] list = file.list();
    Arrays.sort(list);

    for (String s : list) {
      System.out.println(s);
    }

    File[] files = file.listFiles();
    Arrays.sort(files);
    for (File f : files) {
      System.out.println(f.toString());
    }
  }

  @Test
  public void test3() {
    File file = new File("hello.txt");
    System.out.println(file.isDirectory());
    System.out.println(file.isFile());
    System.out.println(file.exists());
    System.out.println(file.canWrite());
    System.out.println(file.canRead());
    System.out.println(file.isHidden());
  }

  @Test
  public void test4() {
    File file = new File("hi.txt");
    try {
      file.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
    File file1 = new File("hhhh");
//    file1.mkdir();
//    file1.delete();

    File file2 = new File("/Users/jimengbo/Desktop/java/java-senior/day08/abc/ddd/aaa");
    file2.mkdirs();
  }
}
