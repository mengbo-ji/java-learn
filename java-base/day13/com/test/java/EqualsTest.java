package com.test.java;

import java.util.Objects;

public class EqualsTest {
  public static void main(String[] args) {
    int i = 10;
    int j = 10;

    Order order1 = new Order(100, "A");
    Order order2 = new Order(101, "A");
    System.out.println(order1.equals(order2));
  }
}

class Order {
  private int id;
  private String name;

  public Order(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order order = (Order) o;
    return id == order.id && Objects.equals(name, order.name);
  }

}
