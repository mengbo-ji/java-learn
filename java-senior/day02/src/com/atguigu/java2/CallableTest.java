package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author jimengbo
 * @create 2022-08-28 1:45 PM
 */
public class CallableTest {
  public static void main(String[] args) {
    Thread1 t = new Thread1();
    FutureTask futureTask = new FutureTask(t);
    new Thread(futureTask).start();
    try {
      // get方法返回值为 FutureTask 构造器参数 Callable实现类重写的run方法的返回值
      Object sum = futureTask.get();
      System.out.println("sum: " + sum);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}

class Thread1 implements Callable {
  @Override
  public Object call() throws Exception {
    Integer sum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        sum += i;
      }
    }
    return sum;
  }
}
