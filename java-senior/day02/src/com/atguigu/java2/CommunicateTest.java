package com.atguigu.java2;

/**
 * @author jimengbo
 * @create 2022-08-28 12:58 PM
 */
public class CommunicateTest {
  public static void main(String[] args) {
    Number n = new Number();
    Thread t1 =  new Thread(n);
    Thread t2 =  new Thread(n);
    t1.setName("线程一");
    t2.setName("线程二");
    t1.start();
    t2.start();
  }
}

class Number implements Runnable {
  private int num = 1;
  @Override
  public void run() {
    while (true) {
      synchronized (this) {
        notify();
        if (num <= 100) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + ":" + num);
          num++;
          try {
            // 调用wait方法的线程会进入阻塞状态
            // 调用wait方法会释放锁
            wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else {
          break;
        }
      }
    }
  }
}
