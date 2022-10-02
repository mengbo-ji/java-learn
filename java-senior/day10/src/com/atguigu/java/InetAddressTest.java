package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author jimengbo
 * @create 2022-10-02 10:38 PM
 */
public class InetAddressTest {
  @Test
  public void test1() {
    try {
      InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
      System.out.println(inetAddress);
      InetAddress inetAddress1 = InetAddress.getLocalHost();
      System.out.println(inetAddress1);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
  }
}
