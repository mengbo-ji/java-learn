package com.atguigu.exer;

/**
 * @author jimengbo
 * @create 2022-08-27 2:56 PM
 */
public class AccountTest {
  public static void main(String[] args) {
    Account account = new Account(0);
    Customer c1 = new Customer(account);
    Customer c2 = new Customer(account);
    c1.setName("甲");
    c2.setName("乙");
    c1.start();
    c2.start();
  }
}

class Account {
  private double balance;
  public Account(double balance) {
    this.balance = balance;
  }

  public synchronized void deposit(double amt){
    if (amt > 0) {
      this.balance += amt;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + ": " + "存钱成功, 当前余额为：" + this.balance);
    }
  }
}

class Customer extends Thread {
  private Account account = null;

  public Customer(Account account) {
    this.account = account;
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      account.deposit(1000);
    }
  }
}
