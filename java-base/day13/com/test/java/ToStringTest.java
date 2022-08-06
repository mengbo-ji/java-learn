package com.test.java;

public class ToStringTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    System.out.println(customer);
    System.out.println(customer.toString());
  }
}

class Customer {
  int i = 10;
}
