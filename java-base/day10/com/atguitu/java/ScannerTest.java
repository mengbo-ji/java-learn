package com.atguitu.java;

import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // next方式接收字符串
//    System.out.println("next方式接收：");
//    if (scan.hasNext()) {
//      String str1 = scan.next();
//      System.out.println("输入的数据为：" + str1);
//    }
//    scan.close();

    // nextLine方式接收字符串
//    System.out.println("nextLine方式接收：");
//    if (scan.hasNextLine()) {
//      String str1 = scan.nextLine();
//      System.out.println("输入的数据为：" + str1);
//    }

    // 验证输入整数
    int i;
    System.out.println("输入整数：");
    if (scan.hasNextInt()) {
      i = scan.nextInt();
      System.out.println(i);
    } else {
      System.out.println("请输入整数");
    }

    scan.close();
  }
}
