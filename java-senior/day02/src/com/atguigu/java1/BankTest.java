package com.atguigu.java1;

/**
 * @author jimengbo
 * @create 2022-08-27-2:11 PM
 */
public class BankTest {
}

class Bank {
  private Bank() {}
  private static Bank instance = null;

  public static synchronized Bank getInstance() {
    if (instance != null) {
      instance = new Bank();
    }
    return instance;
  }
}
