package com.atguigu.java2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author jimengbo
 * @create 2022-08-28 5:45 PM
 */
public class ThreadPool {
  public static void main(String[] args) {
    NumberThread n = new NumberThread();
    ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

//    service.setCorePoolSize();
    System.out.println(service.getClass());

    service.execute(n); // Runnable
    service.shutdown();
//    service.submit(); // Callable
  }
}

class NumberThread implements Runnable {
  @Override
  public void run() {
    System.out.println("哈哈哈...");
  }
}
