package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author jimengbo
 * @create 2022-10-01 10:07 AM
 */
public class ObjectInputOutputStreamTest {
  @Test
  public void test1() throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"));

    oos.writeObject(new String("你好"));
    oos.flush();
    oos.close();
  }
  @Test
  public void test2() throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"));

    Object obj = ois.readObject();
    System.out.println(obj);
    ois.close();
  }
}
