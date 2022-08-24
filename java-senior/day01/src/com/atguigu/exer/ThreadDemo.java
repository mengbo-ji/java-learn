package com.atguigu.exer;

/**
 * @author jimengbo
 * @create 2022-08-23-10:36 PM
 */
public class ThreadDemo {
  public static void main(String[] args) {
//    MyThread1 m1 = new MyThread1();
//    m1.start();
//    MyThread2 m2 = new MyThread2();
//    m2.start();

    //创建 Thread匿名子类的方式
    new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          if (i % 2 == 0) {
            System.out.println(i + ": " + Thread.currentThread().getName());
          }
        }
      }
    }.start();

    new Thread(){
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          if (i % 2 != 0) {
            System.out.println(i + ": " + Thread.currentThread().getName());
          }
        }
      }
    }.start();
  }
}

class MyThread1 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i + ": " + Thread.currentThread().getName());
      }
    }
  }
}

class MyThread2 extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 2 != 0) {
        System.out.println(i + ": " + Thread.currentThread().getName());
      }
    }
  }
}
