package com.atguitu.java;

public class AnimalTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.name = "花花";
    animal.age = 4;
//    animal.legs;

    animal.eat();
    animal.show();
    animal.setLegs(2);
    animal.show();
  }
}

class Animal {
  String name;
  int age;
  private int legs;

  public void setLegs(int l) {
    if (l >= 0 && l % 2 == 0) {
      legs = l;
    }
  }

  public void eat() {
    System.out.println("吃");
  }

  public void show() {
    System.out.println("name: " + name + '\n' + "age: " + age + '\n' + "legs: " + legs);
  }
}
