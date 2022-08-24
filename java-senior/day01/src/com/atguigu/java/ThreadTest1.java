package com.atguigu.java;
import java.lang.*;

/**
 * @author jimengbo
 * @create 2022-08-24-7:26 PM
 */
public class ThreadTest1 {
  public static void main(String[] args) {
    SubThead subThead = new SubThead();
    Thread t1 = new Thread(subThead);
    Thread t2 = new Thread(subThead);
    t1.start();
    t2.start();
  }
}

class SubThead implements Runnable {

  @Override
  public void run() {
    System.out.println("run" + ": " + Thread.currentThread().getName());
  }
}
