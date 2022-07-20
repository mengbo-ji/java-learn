package com.atguigu.java;

/**
 * 数组的默认值
   * 数组元素是整型：0
   * 数组元素是short型：0
   * 数组元素是浮点型：0.0
   * 数组元素是double型：0.0
   * 数组元素是char型：0或'\u0000' 而非'0'
   * 数组元素是boolean型：false
   * 数组元素是引用类型：null
 * 数组的内存解析
   *
 */

public class ArrayTest1 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]); // 0 0 0 0 0
    }

    System.out.println("***********************");
    short[] shortArr = new short[5];
    for (int i = 0; i < shortArr.length; i++) {
      System.out.println("int: " + shortArr[i]); // 0 0 0 0 0
    }

    System.out.println("***********************");
    char[] charArr = new char[5];
    for (int i = 0; i < charArr.length; i++) {
      System.out.println("char: " + charArr[i]); // 0 或者 '\u0000' 而非'0'
    }

    System.out.println("***********************");
    float[] floatArr = new float[5];
    for (int i = 0; i < floatArr.length; i++) {
      System.out.println("float: " + floatArr[i]); // 0.0 0.0 0.0 0.0 0.0
    }

    System.out.println("***********************");
    double[] doubleArr = new double[5];
    for (int i = 0; i < doubleArr.length; i++) {
      System.out.println("double: " + doubleArr[i]); // 0.0 0.0 0.0 0.0 0.0
    }

    System.out.println("***********************");
    boolean[] booleanArr = new boolean[5];
    for (int i = 0; i < booleanArr.length; i++) {
      System.out.println("boolean: " + booleanArr[i]); // false false false false false
    }

    System.out.println("***********************");
    String[] stringArr = new String[5];
    for (int i = 0; i < stringArr.length; i++) {
      System.out.println("String: " + stringArr[i]); // false false false false false
    }
  }
}
