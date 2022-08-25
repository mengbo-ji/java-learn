package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-24-7:38 PM
 */
public class WindowTest {
  public static void main(String[] args) {
    Window w = new Window();

    Thread t1 = new Thread(w);
    Thread t2 = new Thread(w);
    Thread t3 = new Thread(w);
    t1.start();
    t2.start();
    t3.start();
  }
}

class Window implements Runnable {
  private int ticket = 100;

  Object o = new Object();

  @Override
  public void run() {
    while (true) {
      synchronized(this) {
        if (ticket > 0) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
          ticket--;
        } else {
          break;
        }
      }
    }
  }
}
