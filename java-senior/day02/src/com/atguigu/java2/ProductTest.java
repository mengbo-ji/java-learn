package com.atguigu.java2;

/**
 * @author jimengbo
 * @create 2022-08-28 1:18 PM
 */
public class ProductTest {
  public static void main(String[] args) {
    Clerk clerk = new Clerk();
    Producer p1 = new Producer(clerk);
    Customer c1 = new Customer(clerk);
    p1.setName("生产者");
    c1.setName("消费者");
    p1.start();
    c1.start();
  }
}

class Clerk {
  private int productCount = 0;
  public static final int MAX_PRODUCT_COUNT = 20;
  public static final int MIN_PRODUCT_COUNT = 0;


  /**
   * @deprecated 生产产品
   * */
  public synchronized void produceProduct() {
    if (productCount < MAX_PRODUCT_COUNT) {
      productCount++;
      System.out.println(Thread.currentThread().getName() + ": 开始生产第" + productCount + "个产品");
      notify();
    } else {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * @deprecated 消费产品
   * */
  public synchronized void consumeProduct() {
    if (productCount > MIN_PRODUCT_COUNT) {
      System.out.println(Thread.currentThread().getName() + ": 开始消费第" + productCount + "个产品");
      productCount--;

      notify();
    } else {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

/**
 * @deprecated  生产者
 * */
class Producer extends Thread {
  private Clerk clerk;
  public Producer(Clerk clerk) {
    this.clerk = clerk;
  }

  @Override
  public void run() {
    System.out.println(getName() + ": 开始生产产品...");
    while (true) {
      try {
        sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.produceProduct();
    }
  }
}

/**
 * @deprecated  消费者
 * */
class Customer extends Thread {
  private Clerk clerk;
  public Customer(Clerk clerk) {
    this.clerk = clerk;
  }

  @Override
  public void run() {
    System.out.println(getName() + ": 开始消费产品...");
    while (true) {
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.consumeProduct();
    }
  }
}
