package com.atguigu.com;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {
  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat moment = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");

    System.out.println(date.toString());
    System.out.println(moment.format(date));
    System.out.printf("全部日期和时间信息：%tc%n", date);

    System.out.println(new Date().toString());
    try {
      Thread.sleep(3000);
    } catch (Exception e) {
    }
    System.out.println(new Date().toString());

  }
}
