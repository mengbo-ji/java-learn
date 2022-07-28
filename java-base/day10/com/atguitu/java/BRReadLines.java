package com.atguitu.java;

import java.io.*;

public class BRReadLines {
  public static void main(String[] args) {
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'end' to quit.");
    try {
      do {
        str = br.readLine();
      } while (!str.equals("end"));
    } catch (Exception e) {}
  }
}
