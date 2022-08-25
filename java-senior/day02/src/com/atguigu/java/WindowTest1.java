package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-24-7:16 PM
 */
public class WindowTest1 {
  public static void main(String[] args) {
    Window1 w1 = new Window1();
    Window1 w2 = new Window1();
    Window1 w3 = new Window1();
    w1.setName("窗口1");
    w2.setName("窗口2");
    w3.setName("窗口3");
    w1.start();
    w2.start();
    w3.start();
  }
}

class Window1 extends Thread {
  private static int ticket = 100;
  private static Object o = new Object();
  @Override
  public void run() {
    while (true) {
      synchronized (Window1.class) {
        if (ticket > 0) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(getName() + ": 卖票，票号为：" + ticket);
          ticket--;
        } else {
          break;
        }
      }
    }
  }
}