package com.atguigu.java1;

import java.util.Arrays;

public class AnimalTest {
  public static void main(String[] args) {
    AnimalTest animalTest = new AnimalTest();
    animalTest.fn(new Dog());
    animalTest.fn(new Cat());

    int[] arr = new int[]{1,2,3,4};
    for (int item : arr) {
      System.out.println(item);
    }

  }
  public void fn(Animal animal) {
    animal.eat();
    animal.shout();
  }

  public void fn(Dog dog) {
    dog.eat();
    dog.shout();
  }

  public void fn(Cat cat) {
    cat.eat();
    cat.shout();
  }
}

class Animal {
  public void eat() {
    System.out.println("动物：进食");
  }

  public void shout() {
    System.out.println("动物：叫");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("狗吃骨头");
  }

  public void shout() {
    System.out.println("汪汪汪");
  }
}

class Cat extends Animal {
  public void eat() {
    System.out.println("猫吃鱼");
  }

  public void shout() {
    System.out.println("喵喵喵");
  }
}