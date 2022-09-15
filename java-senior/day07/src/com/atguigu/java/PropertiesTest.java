package com.atguigu.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author jimengbo
 * @create 2022-09-15 10:58 PM
 */
public class PropertiesTest {
  public static void main(String[] args) {
    Properties config = null;
    try {
      config = new Properties();

      FileInputStream fs = new FileInputStream("jdbc.properties");

      config.load(fs);
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println(config.getProperty("name"));
  }
}
