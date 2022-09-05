package com.atguigu.java;

import org.testng.annotations.Test;

/**
 * @author jimengbo
 * @create 2022-09-04 9:42 PM
 */
public class SystemTest {
  @Test
  public void test1() {
  String javaVersion = System.getProperty("java.version");
  String javaHome = System.getProperty("java.home");
  String osVersion = System.getProperty("os.version");
  String osName = System.getProperty("os.name");
  String userName = System.getProperty("user.name");
  String userHome = System.getProperty("user.home");
  String userDir = System.getProperty("user.dir");
    System.out.println("javaVersion:" + javaVersion);
    System.out.println("javaHome：" + javaHome);
    System.out.println("osName：" + osName);
    System.out.println("osVersion： " + osVersion);
    System.out.println("userName：" + userName);
    System.out.println("userHome：" + userHome);
    System.out.println("userDir：" + userDir);
  }
}
