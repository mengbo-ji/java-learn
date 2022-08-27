package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jimengbo
 * @create 2022-08-27 2:43 PM
 */
public class LockTest {
  public static void main(String[] args) {
    Window w = new Window();
    Thread t1 =  new Thread(w);
    Thread t2 =  new Thread(w);
    Thread t3 =  new Thread(w);
    t1.start();
    t2.start();
    t3.start();
  }
}

class Window implements Runnable {
  private int ticket = 100;
  private ReentrantLock lock = new ReentrantLock();
  @Override
  public void run() {
    while (true) {
      lock.lock();
      try {
        if (ticket > 0) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + "售票：票号为：" + ticket);
          ticket--;
        }
      } finally {
        lock.unlock();
      }
    }
  }
}
