package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-24-7:16 PM
 */
public class WindowTest3 {
  public static void main(String[] args) {
    Window3 w1 = new Window3();
    Window3 w2 = new Window3();
    Window3 w3 = new Window3();
    w1.setName("窗口1");
    w2.setName("窗口2");
    w3.setName("窗口3");
    w1.start();
    w2.start();
    w3.start();
  }
}

class Window3 extends Thread {
  private static int ticket = 100;
  private static Object o = new Object();

  @Override
  public void run() {
    while (true) {
      show();
    }
  }

  private static synchronized void show() {
    if (ticket > 0) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
      ticket--;
    }
  }

}