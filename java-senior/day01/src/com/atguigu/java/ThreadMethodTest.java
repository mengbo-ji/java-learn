package com.atguigu.java;

/**
 * @author jimengbo
 * @create 2022-08-23-10:43 PM
 */
public class ThreadMethodTest {
  public static void main(String[] args) {
    HelloThread helloThread = new HelloThread("线程一");
//    helloThread.setName("线程二");
    helloThread.start();

    Thread.currentThread().setName("主线程");
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i + ": " + Thread.currentThread().getName());
      }

      if (i == 20) {
        try {
          helloThread.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

class HelloThread extends Thread {


  public HelloThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        try {
          sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println(i + ": " + Thread.currentThread().getName());
      }
      if (i % 20 == 0) {
        HelloThread.yield();
      }
    }
  }
}