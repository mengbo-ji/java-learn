package com.atguigu.java;

public class ArrayTest2 {
  public static void main(String[] args) {
    // 静态初始化
    int[][] arr = new int[][]{{1, 2}, {3, 4}};
    // 动态初始化
    String[][] arr1 = new String[2][2];
    String[][] arr2 = new String[2][];
    int[][] arr3 = new int[2][2];
    arr1 = new String[][]{{"name", "age"}, {"foo", "bar"}};

    int[] arr4 = {1};

    int[] arr5 = {};

    System.out.println(arr[0][1]);
    System.out.println(arr1[0][1]);
    System.out.println(arr1[0].length);
    System.out.println(arr2[0]); // null

    System.out.println(arr3); // [[I@4617c264
    System.out.println(arr3[0]); // [I@4617c264
    System.out.println(arr3[0][0]); // 0
    System.out.println(arr5[0]); // 0
  }
}
