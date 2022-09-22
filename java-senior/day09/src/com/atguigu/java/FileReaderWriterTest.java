package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author jimengbo
 * @create 2022-09-20 11:14 PM
 */
public class FileReaderWriterTest {
  @Test
  public void test1() throws IOException {
    File file = new File("hello.txt");
    FileReader fs = new FileReader(file);

    char[] c = new char[5];
    int len;
    while ((len = fs.read(c)) != -1){
      for (int i = 0; i < len; i++) {
        System.out.println(c[i]);
      }
    }
  }

  @Test
  public void test2() {
    File file = new File("hello1.txt");
    try {
      FileWriter fw = new FileWriter(file);

      fw.write("hello java");
      fw.write("八格牙路");
      fw.write("死辣死了");

      fw.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test3() {
    File srcFile = new File("hello.txt");
    File destFile = new File("hello2.txt");

    try {
      FileReader fr = new FileReader(srcFile);
      try {
        FileWriter fw = new FileWriter(destFile);

        char[] c = new char[5];
        int len;
        while ((len = fr.read(c)) != -1) {
          fw.write(c, 0, len);
        }

        fr.close();
        fw.close();

      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}


