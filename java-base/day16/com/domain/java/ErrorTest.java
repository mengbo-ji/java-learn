package com.domain.java;

/**
 * @author jimengbo
 */
public class ErrorTest {
  public static void main(String[] args) {
     // 栈溢出 java.lang.StackOverflowError
//     main(args);

    // 堆溢出 java.lang.OutOfMemoryError
    Integer[] integer = new Integer[1024 * 1024 * 1024];
  }
}
