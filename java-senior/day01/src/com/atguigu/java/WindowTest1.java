package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-24-7:38 PM
 */
public class WindowTest1 {
  public static void main(String[] args) {
    Window1 w = new Window1();

    Thread t1 = new Thread(w);
    Thread t2 = new Thread(w);
    Thread t3 = new Thread(w);
    t1.start();
    t2.start();
    t3.start();
  }
}

class Window1 implements Runnable {
  private int ticket = 100;
  @Override
  public void run() {
    while (true) {
      if (ticket > 0) {
        System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
        ticket--;
      } else {
        break;
      }
    }
  }
}
