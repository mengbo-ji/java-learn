package com.atguigu.java;

public class InnerClassTest1 {
  public void method() {
    class AA {

    }
  }

  public Comparable getComparable() {
//    class myComparable implements Comparable {
//      @Override
//      public int compareTo(Object o) {
//        return 0;
//      }
//    }
//    return new myComparable();
    return new Comparable() {
      @Override
      public int compareTo(Object o) {
        return 0;
      }
    };
  }
}
