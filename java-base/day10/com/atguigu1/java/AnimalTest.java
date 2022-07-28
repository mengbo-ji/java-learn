package com.atguigu1.java;


class Animal {
  public void move() {
    System.out.println("动物可以移动");
  }
}

class Dog extends Animal {
  public void move() {
    super.move();
    System.out.println("狗可以走和跑");
  }

  public void eat() {
    System.out.println("狗要吃饭");
  }
}

public class AnimalTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    animal.move();
    dog.move();
    dog.eat();
  }
}
