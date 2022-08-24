package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-23-10:14 PM
 */
public class ThreadTest {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.setPriority(Thread.MAX_PRIORITY);
    myThread.start();
    Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
    System.out.println("hello" + ": " + Thread.currentThread().getName() + "优先级: " + Thread.currentThread().getPriority());

    MyThread myThread1 = new MyThread();
    myThread1.start();
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i + ": " + Thread.currentThread().getName() + "优先级：" + Thread.currentThread().getPriority());
      }
    }
  }
}
